package mystepdefenitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\training_h2a.06.15\\Desktop\\seliniumworkspace\\Cucumber\\Myfeatures\\newme.feature",glue="mystepdefinitions",tags= {"@Smoke"}),plugin= {"json:target/cucumber.json"})
public class MyRunners {

}
