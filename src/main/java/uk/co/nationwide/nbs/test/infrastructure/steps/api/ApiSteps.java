package uk.co.nationwide.nbs.test.infrastructure.steps.api;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
//import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;

import org.apache.commons.lang3.math.NumberUtils;
import org.apache.log4j.Logger;
import org.hamcrest.MatcherAssert;
import org.hamcrest.MatcherAssert.*;
import org.hamcrest.Matchers;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import java.util.List;

import uk.co.nationwide.nbs.test.infrastructure.enums.DataTypes;
import uk.co.nationwide.nbs.test.infrastructure.enums.HttpRequestNames;
import uk.co.nationwide.nbs.test.infrastructure.steps.AbstractStep;
import uk.co.nationwide.nbs.test.infrastructure.utils.DateTimeUtils;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;



public class ApiSteps extends AbstractStep {

    private Response response;
    private String jsonString;
    private JsonPath jsonResponse;
    JSONObject jsonObjectGlobal;
    final static Logger logger = Logger.getLogger(ApiSteps.class);

    JSONObject jsonObject = new JSONObject();

    @Given("^a request to \"([^\"]*)\" api on service \"([^\"]*)\"$")
    public void a_get_request_on_api_on_service(String api, String application) throws Throwable {
        System.out.println("================================");
        declareApplicationAndSectionUnderTest(application, api);
        this.configureHttpClient();
    }

    @And("\"([^\"]*)\" parameter is \"([^\"]*)\"")
    public void andTheParameterIs(String name, Object value) {
        this.defineHttpParameter(name, value);
    }
    
    @And("^\"([^\"]*)\" header is \"([^\"]*)\"$")
    public void something_header_is_something(String name, String value) throws Throwable {
    	 this.defineHttpHeader(name, value);
    }

//    @And("^the payload is$")
//    public void thePayloadIs(String payload) {
//        this.defineHttpParameter(null, "payload-json", payload);
//    }

    @When("^the \"([^\"]*)\" request is sent$")
    public void theRequestIsSent(String method) {
        requestSpecification().log().everything();
        switch (method.toLowerCase()) {
            case "post":
                this.setResponseSpecification(requestSpecification().body(this.getHttpRequestBodyPayload()).when()
                        .post(this.getHttpUrl()).then().using().defaultParser(Parser.JSON));
                break;
            case "get":
                this.setResponseSpecification(
                        requestSpecification().when().get(this.getHttpUrl()).then().using().defaultParser(Parser.JSON));
                break;
            case "put":
                this.setResponseSpecification(requestSpecification().body(this.getHttpRequestBodyPayload()).when()
                        .put(this.getHttpUrl()).then().using().defaultParser(Parser.JSON));
                break;
            case "delete":
                this.setResponseSpecification(
                        requestSpecification().when().delete(this.getHttpUrl()).then().using().defaultParser(Parser.JSON));
                break;
        }
        responseSpecification().log().everything();
    }

    @When("^\"([^\"]*)\" request is sent$")
    public void theRequestIsSentJsonArray(HttpRequestNames name) {
        JSONArray arrayObject = new JSONArray();
        arrayObject.add(this.getHttpRequestBodyPayloadJson());
        logger.info(arrayObject);
        switch (name) {
            case POST:
                this.response = given().relaxedHTTPSValidation().contentType("application/json; charset=UTF-16").body(arrayObject)
                        .when().post(this.getHttpUrl())
                        .then().extract().response();
                this.jsonString = response.asString();
                this.jsonResponse = response.jsonPath();
                break;
            case GET:
                this.response = requestSpecification().when().get(this.getHttpUrl()).then().extract().response();
                this.jsonResponse = this.response.jsonPath();
                break;
            case DELETE:
                this.response = requestSpecification().when().delete(this.getHttpUrl()).then().extract().response();
                this.jsonResponse = this.response.jsonPath();
                break;
            default:
                throw new IllegalArgumentException("HTTP Request name is incorrect");
        }
    }
    
    /*
     *Added this method so we can pass body request an array
     */
    
    @When("^\"([^\"]*)\" request is sent as$")
    public void request_is_sent(String method, DataTable type)  {
        JSONArray arrayObject = new JSONArray();
        arrayObject.add(this.getHttpRequestBodyPayloadJson());
        logger.info(arrayObject);
        List<String> list = type.asList(String.class);
        String call = list.get(0);
        switch (method) {
            case "POST":
            	logger.info("The header value is "+this.getHeader().toString());
            	if(call.equalsIgnoreCase("JSON")) {
            		this.response = given().relaxedHTTPSValidation().header(this.getHeader()).contentType("application/json;charset=UTF-16").body(this.getHttpRequestBodyPayloadJson())
            				.when().post(this.getHttpUrl())
                            .then().extract().response();
            	}else {
            		 this.response = given().relaxedHTTPSValidation().contentType("application/json;charset=UTF-16").body(arrayObject)
                        .when().post(this.getHttpUrl())
                        .then().extract().response();
                this.jsonString = response.asString();
                this.jsonResponse = response.jsonPath();
            	}
                break;
            case "GET":
                this.response = requestSpecification().when().get(this.getHttpUrl()).then().extract().response();
                this.jsonResponse = this.response.jsonPath();
                break;
            case "DELETE":
                this.response = requestSpecification().when().delete(this.getHttpUrl()).then().extract().response();
                this.jsonResponse = this.response.jsonPath();
                break;
            default:
                throw new IllegalArgumentException("HTTP Request name is incorrect");
        }
    }
    

    @Then("^the status code will be \"([^\"]*)\"$")
    public void the_status_code_will_be(int statusCode) {
        assertThat(response.getStatusCode(), is(equalTo(statusCode)));
    }

    @Then("^error validation message is \"([^\"]*)\"$")
    public void checkValidationMessageOnFailure(String errorMessage) {
        assertThat(jsonResponse.get("message"), is(equalTo(errorMessage)));
    }

    @Then("^the \"([^\"]*)\" will be present on response \"([^\"]*)\"")
    public void the_field_will_be_present(String name, String placement) throws Throwable {
        switch (placement.toLowerCase()) {
            case "payload":
                responseSpecification().assertThat().body(name, Matchers.notNullValue());
                break;
        }
    }

    @Then("^the \"([^\"]*)\" will be present on the response \"([^\"]*)\" with value \"([^\"]*)\"")
    public void the_field_will_be_present_with_value(String name, String placement, Object value) throws Throwable {
        switch (placement.toLowerCase()) {
            case "payload":
                try {
                    responseSpecification().assertThat().body(name, Matchers.equalTo(value));
                } catch (AssertionError e) {
                    if (String.class.isAssignableFrom(value.getClass()) && NumberUtils.isNumber((String) value)) {
                        responseSpecification().assertThat().body(name, Matchers.equalTo(Integer.parseInt((String) value)));
                    } else {
                        throw e;
                    }
                }
                break;
            case "header":
                responseSpecification().assertThat().header(name, Matchers.equalTo(value));
                break;
        }
    }

    @Then("^the response \"([^\"]*)\" is \"([^\"]*)\"$")
    public void theResponseIs(String placement, Object value) {
        switch (placement.toLowerCase()) {
            case "payload":
                responseSpecification().assertThat().body(Matchers.equalTo(value));
                break;
        }
    }

    @Then("wait (\\d+) minute\\(s\\)$")
    public void wait_minutes(int value) throws Throwable {
        System.out.println("Now waiting minute(s):" + value);
        try {
            Thread.sleep(value * 60000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @And("^successful validation message is \"([^\"]*)\"$")
    public void checkValidationMessageOnSuccess(String message) {
        assertThat(jsonResponse.get("message"), is(equalTo(message)));
    }

    @Then("^\"([^\"]*)\" is \"([^\"]*)\" as ([^\"]*)")
    public void passingParametersForJsonObject(String property, String value, DataTypes dataType) {
        switch (dataType) {
            case STRING:
                if (property.equalsIgnoreCase("dateTime") && value.equalsIgnoreCase("actualDate")) {
                    this.jsonObject.put(property, DateTimeUtils.getCurrentDateTimeNow().toString());
                } else {
                    this.jsonObject.put(property, value);
                }
                break;
            case INTEGER:
                if (property.equalsIgnoreCase("dateTime") && value.equalsIgnoreCase("actualDate")) {
                    this.jsonObject.put(property, Integer.valueOf(DateTimeUtils.getCurrentDateTimeNow().toString()));
                } else {
                    this.jsonObject.put(property, Integer.valueOf(value));
                }
                break;
        }
        this.jsonObjectGlobal = this.jsonObject;
    }

    @Then("package prepared data")
    public void saveForSendingPreparedData() {
        this.defineHttpParameterJson(jsonObjectGlobal);
    }

    @When("^check if \"([^\"]*)\" is \"([^\"]*)\" from response at \"([^\"]*)\" array$")
    public void checkDataFromResponseArray(String param, String value, Integer  arrayNumber) {
        if(arrayNumber.equals(0)) {
            assertThat(this.jsonResponse.get(param), is(equalTo(value)));
        } else
        assertThat(this.jsonResponse.get("[" + (String.valueOf(arrayNumber - 1)) + "]" + "." + param), is(equalTo(value)));
    }
    
    //Step to verify that schema validation is correct
    @And("^schema successfully validated against \"([^\"]*)\"$")
    public void schema_successfully_validated_against_something(String schema) {
    	MatcherAssert.assertThat(this.jsonString, JsonSchemaValidator.matchesJsonSchemaInClasspath(schema));
    }
    
   
}