package com.demoqa.automation.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = "com.demoqa.automation.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "@one"
)
public class UploadRunner {

}
