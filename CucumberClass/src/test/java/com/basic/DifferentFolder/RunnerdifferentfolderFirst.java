package com.basic.DifferentFolder;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		features={"src/test/resources/com/basic/differentfolderfeaturefile/"},
		glue={"com/basic/DifferentFolder"}
		)
public class RunnerdifferentfolderFirst {

}
