package sk;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

@RunWith(io.cucumber.junit.Cucumber.class)
@CucumberOptions(plugin= {"pretty","html:src/cucumber-reports"},features="src/test/resources/sk/dd.feature"
/*tags= {"~@tag1","@tag2"}*/)
public class basic {

}
