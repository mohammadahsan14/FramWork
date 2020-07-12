package com.dell.BDDFrameWork.testRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.dell.BDDFrameWork.util.*;

//
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
//
////@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resource"} , format = {"json:target/cucumber.json","html:target/site/cucumber-pretty"},
glue = "stepsDef",
tags= {"@test3"})


public class TestRunner extends AbstractTestNGCucumberTests{
	
	
@BeforeTest
public void setUp(){
	TestBase test = new TestBase();
	test.initialization();
	
}


@AfterTest
public void tearDown(){
	@SuppressWarnings("unused")
	TestBase test = new TestBase();
	TestBase.driver.quit();
}
}
