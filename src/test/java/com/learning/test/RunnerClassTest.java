package com.learning.test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(
//		plugin={"pretty","html:target/cucumber-html-report","json:target/cucumber.json"},
//		features="src/test/resources")
@CucumberOptions(
		plugin={"pretty","html:target/site/cucumber-pretty","json:target/cucumber.json"}, tags={"~@ignore,@login"},
		features="src/test/resources")
public class RunnerClassTest {

}
