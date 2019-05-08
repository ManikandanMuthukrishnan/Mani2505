package runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="Telecom", glue ={"stepDefinition"})

public class TestRunner {

 
	
}
	