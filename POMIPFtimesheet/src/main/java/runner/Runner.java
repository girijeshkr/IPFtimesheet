package runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features="C:/Users/deepak13862/eclipse-workspace/POMIPFtimesheet/src/main/java/feature/time.feature",
			glue= {"stepdeffile"},
			plugin = {"pretty", "html:test-output"},
			tags= {"@SmokeTest1"}
			/*tags= {"@SmokeTest1 or @SmokeTest2 or @SmokeTest3 or @SmokeTest4 or @SmokeTest5"}*/
			)
			


	public class Runner {}





		
		


	
	

