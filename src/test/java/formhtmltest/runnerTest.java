package formhtmltest;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,
		features = "C:\\Users\\ANKITHA\\Desktop\\java-selenium\\formhtml\\src\\test\\resources\\resources\\featurefile.feature",
		//tags = "@Test1",
		glue = "/formhtmltest"


		)
public class runnerTest {

}
