package runnerPackage;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
			tags = "",
			features = {"src\\test\\resources\\Features\\NewOrder.feature"},
			glue = {"steps"},
			dryRun = false,
			monochrome = true,
			plugin = {"pretty", "html:target/PlacingOrder.html"}
		)
public class testOrder extends AbstractTestNGCucumberTests{

}
