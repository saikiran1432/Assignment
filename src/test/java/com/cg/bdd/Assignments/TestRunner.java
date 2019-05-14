package com.cg.bdd.Assignments;




import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features={"src/main/java/features/login.feature"},tags="@execute",

		glue= {"com.cg.bdd"}
		)
public class TestRunner {

}
