package com.demoqa.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/form_demoqa.feature",
        glue = "",
        tags = "",
        snippets = SnippetType.CAMELCASE
)

public class DemoqaHomeRunner extends PageObject {
}
