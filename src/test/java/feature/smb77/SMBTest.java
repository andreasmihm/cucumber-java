package feature.smb77;
 
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty","json:target/cucumber_smb76.json"})
public class SMBTest {
}