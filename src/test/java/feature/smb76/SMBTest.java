package feature.smb76;
 
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty","json:target/cucumber.json"})
public class SMBTest {
}