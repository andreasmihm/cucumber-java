package feature.book;
 
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty","json:target/cucumber_books.json"})
public class BookSearchTest {
}