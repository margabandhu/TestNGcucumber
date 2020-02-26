package com.runner;

import org.testng.annotations.DataProvider;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src\\test\\resources" }, glue = { "com.stepdefinition" }, monochrome = true,dryRun=false)

public class TestRunnerClass extends AbstractTestNGCucumberTests {

	@DataProvider(parallel=true)
	@Override
	public Object[][] scenarios() {

		return super.scenarios();
	}
}


