package com.loop.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/html-reports/cucumber-report.html",
                "json:target/json-report/json-report.json"},
        features = "src/test/resources/features",
        glue = "com/loop/step_definition",
        dryRun = false,
        tags = "@DucuportValidation"

)
public class CucksRunner {

}
