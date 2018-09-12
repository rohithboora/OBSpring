package uk.co.nationwide.nbs.test.infrastructure.utils;

import com.saucelabs.saucerest.SauceREST;
import org.json.JSONException;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

public class SauceUtils {

    private static SauceREST sauceRESTClient;


    private static SauceREST getSauceRestClient(String username, String accessKey) {
        if (sauceRESTClient == null) {
            sauceRESTClient = new SauceREST(username, accessKey);
        }
        return sauceRESTClient;
    }

    public static void UpdateResults(String username, String accessKey, boolean testResults, String sessionId)
            throws JSONException, IOException {
        SauceREST client = getSauceRestClient(username, accessKey);
        Map<String, Object> updates = new HashMap<String, Object>();
        updates.put("passed", testResults);
        client.updateJobInfo(sessionId, updates);
    }

    /**
     * Populates the <code>updates</code> map with the value of the system property/environment variable
     * with the following name:
     * <ol>
     * <li>SAUCE_BAMBOO_BUILDNUMBER</li>
     * <li>JENKINS_BUILD_NUMBER</li>
     * <li>BUILD_TAG</li>
     * <li>BUILD_NUMBER</li>
     * <li>TRAVIS_BUILD_NUMBER</li>
     * <li>CIRCLE_BUILD_NUM</li>
     * </ol>
     */
    public static String getBuildName() {
        List<String> variables = Arrays.asList("SAUCE_BAMBOO_BUILDNUMBER",
                "JENKINS_BUILD_NUMBER",
                "CIRCLE_BUILD_NUM",
                "BUILD_TAG",
                "BUILD_NUMBER",
                "TRAVIS_BUILD_NUMBER");

        for (String variable : variables) {
            String buildName = readPropertyOrEnv(variable);
            if (buildName != null && !buildName.equals("")) {
                return buildName;
            }
        }
        return new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss").format(new Date());
    }

    private static String readPropertyOrEnv(String key) {
        String v = System.getProperty(key);
        if (v == null) {
            return System.getenv(key);
        } else {
            return v;

        }

    }

}
