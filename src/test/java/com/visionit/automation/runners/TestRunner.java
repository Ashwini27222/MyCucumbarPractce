package com.visionit.automation.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( 
	  features="classpath:features",
	  glue="com.visionit.automation.stepdefs",
	  tags=" ",
	  plugin = {"pretty",
			  "html:target/html/htmlreport.html",
			  "json:target/json/jsonreport.json" 
	           },
	  monochrome = true,//remove forein charachters
	  publish=true,//generate online reporton cucumber
	  dryRun=false
		)

public class TestRunner 
{

}
