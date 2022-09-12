package com.merve.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "json:target/cucumber.json"
        },
        features = "src/test/resources/features",
        glue = "com/merve/step_definitions",
        tags = "@merve"
)

public class CukesRunner {

}
