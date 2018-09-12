/**
 * 
 */
package uk.co.nationwide.nbs.test.infrastructure.steps;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * Execute the acceptance test framework starting from Gherkin based feature
 * definition
 * 
 * @author quirino
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(
		glue = { "uk.co.nationwide.nbs.test.infrastructure.steps" },
		plugin = {"html:target/nationwide-report/", "json:target/cucumber.json", "rerun:target/rerun.txt", "io.qameta.allure.cucumberjvm.AllureCucumberJvm"},
		monochrome = true,
		features = "."
		//tags = { "@APIUnique" }
		)
public class CukeRunnerTest {

}