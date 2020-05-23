package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:/bench/frame-10-11/CucumberFramework/src/test/resources/",tags= {"@QATest"},
				glue= {"stepDefinitions"},
				//plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
				 monochrome = true
				 )
				 
				 
				public class TestRunner {
//				 @AfterClass
//				 public static void writeExtentReport() {
//				 try {
//					Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
//				} catch (FileNotFoundException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				 }
				}

