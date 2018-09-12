package uk.co.nationwide.nbs.test.infrastructure.steps.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.restassured.response.Response;
import org.apache.log4j.Logger;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class BalancesHooks {

    final static Logger logger = Logger.getLogger(BalancesHooks.class);

    private String balanceURL = "https://balances.dev.nationwidemoney.co.uk";
    private String accountId = "balanceTestId";

    @Before(value = "@deleteAccFromBalancesBefore", order = 0)
    public void deleteAccountIdFromBalancesBefore() {
        Response response = given().param("accountId", accountId).relaxedHTTPSValidation().when().delete(balanceURL + "/api/balances/").then().body(equalTo("OK")).statusCode(200).extract().response();
    }

    @After(value = "@deleteAccFromBalancesAfter", order = 0)
    public void deleteAccountIdFromBalancesAfter() {
        Response response = given().param("accountId", accountId).relaxedHTTPSValidation().when().delete(balanceURL + "/api/balances/").then().body(equalTo("OK")).statusCode(200).extract().response();
    }
}