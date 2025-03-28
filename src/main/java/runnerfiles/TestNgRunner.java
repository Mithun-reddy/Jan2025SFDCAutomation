package runnerfiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/main/java/features/", glue = "stepdefinitions", 
tags = "@regression", plugin = {"pretty","html:target/report.html"}
, monochrome = true )
public class TestNgRunner extends AbstractTestNGCucumberTests{

}
