package Cucumber.StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="E:\\Kunal WorkSpace\\CucumberRestAPI\\resources\\features\\Home.feature",glue = {"Cucumber.StepDefinitions"})

public class Run {

}
