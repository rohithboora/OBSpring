/**
 *
 */
package uk.co.nationwide.nbs.test.infrastructure.utils;

import org.mockito.Mockito;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.springframework.beans.factory.annotation.Autowired;
import uk.co.nationwide.nbs.test.infrastructure.steps.TestExecutionContext;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

/**
 * @author simoniptatkuen
 */
public enum WebDriverPicker {

    SAFARI(Arrays.asList("safari", "Safari")) {
        @Override
        public WebDriver getDriver(String driverPath) {
            if (isRemoteDriver(driverPath)) {
                return createDriver("safari", null, null, driverPath);
            } else {
                // System.setProperty("webdriver.safari.driver", "");
                return new SafariDriver();

            }
        }
    },
    FIREFOX(Arrays.asList("firefox", "Firefox")) {
        @Override
        public WebDriver getDriver(String driverPath) {
            if (isRemoteDriver(driverPath)) {
                return createDriver("firefox", null, null, driverPath);
            } else {
                System.setProperty("webdriver.gecko.driver", driverPath);
                return new FirefoxDriver();
            }
        }
    },
    CHROME(Arrays.asList("chrome", "Chrome")) {
        @Override
        public WebDriver getDriver(String driverPath) {
            if (isRemoteDriver(driverPath)) {
                return createDriver("chrome", "latest", null, driverPath);
            } else {
                System.setProperty("webdriver.chrome.driver", driverPath);
                return new ChromeDriver();
            }
        }
    },
    SAUCE(Arrays.asList("sauce", "Sauce")) {
        @Override
        public WebDriver getDriver(String driverPath) {
            if (isRemoteDriver(driverPath)) {
                return createDriver("sauce", null, null, driverPath);
            } else {
                System.out.println("cannot set the sauce browser");
                return null;
            }
        }
    },
    TEST(Arrays.asList("test")) {
        @Override
        public WebDriver getDriver(String driverPath) {
            WebDriver answer = Mockito.mock(WebDriver.class);
            WebDriver.Options options = Mockito.mock(WebDriver.Options.class);
            Mockito.when(answer.manage()).thenReturn(options);
            WebDriver.Timeouts timeouts = Mockito.mock(WebDriver.Timeouts.class);
            Mockito.when(options.timeouts()).thenReturn(timeouts);
            return answer;
        }
    };

    private List<String> aliases;
    @Autowired
    private static TestExecutionContext testExecutionContext;

    WebDriverPicker(List<String> aliases) {
        this.aliases = aliases;
    }

    public static WebDriverPicker fromAlias(String alias) {
        for (WebDriverPicker webDriverPicker : values()) {
            if (webDriverPicker.aliases.contains(alias)) {
                return webDriverPicker;
            }
        }
        throw new IllegalArgumentException(String.format("unable to find definition for alias %s", alias));
    }

    private static boolean isRemoteDriver(String driverPath) {
        return null != driverPath && (driverPath.startsWith("http") || driverPath.startsWith("https"));
    }

    private static WebDriver createDriver(String browser, String version, String os, String driverPath) {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        // set desired capabilities to launch appropriate browser
        if ("safari".equals(browser)) {
            DesiredCapabilities caps = DesiredCapabilities.safari();
            caps.setCapability("platform", "OS X 10.10");
            caps.setCapability("version", "8.0");
            try {
                return new RemoteWebDriver(new URL(driverPath), caps);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        } else if ("internet explorer".equals(browser)) {

            capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
            capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        } else if ("sauce".equals(browser)) {

            System.out.println(testExecutionContext.getCapabilities());
            capabilities = testExecutionContext.getCapabilities();

        }
        try {

            return new RemoteWebDriver(new URL(driverPath), capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public abstract WebDriver getDriver(String driverPath);
}
