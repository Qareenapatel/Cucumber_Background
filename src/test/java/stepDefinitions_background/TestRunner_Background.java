package stepDefinitions_background;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/patel/eclipse-workspace/CucumberProject/src/test/resources/Feature/Beckgrounds.feature",
glue= {"stepDefinitions_background"},
monochrome = true)


public class TestRunner_Background {

}
