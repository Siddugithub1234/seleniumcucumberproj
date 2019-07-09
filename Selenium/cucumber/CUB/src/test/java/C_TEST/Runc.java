package C_TEST;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

@RunWith(io.cucumber.junit.Cucumber.class)
@io.cucumber.junit.CucumberOptions(plugin= {"pretty","html:src/cucumber-reports"},features="src/test/resources/C_TEST/Login.feature"
/*tags= {"~@tag1","@tag2"}*/)
public class Runc {

}
