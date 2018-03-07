package learnReporter;

import java.io.File;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LearnExtent {
	@Test
	public void learnExtent() {		
		ExtentReports report = new ExtentReports("./reports/result.html", true);
		report.loadConfig(new File("./extent_config.xml"));
		ExtentTest test = report.startTest("TC001_CreateLead", "Create a new Lead in LeafTaps");
		test.assignCategory("Sanity Testing");
		test.assignAuthor("Raxaul ka shaan");
		test.log(LogStatus.PASS, "DemoSalesManager is entered successFully"
				+test.addScreenCapture("./../screenshots/Snap2017-12-24 11-58-22.jpeg"));
		test.log(LogStatus.PASS, "crmsfa is entered successFully "
				+test.addScreenCapture("./../screenshots/Snap2017-12-27 00-07-35.jpeg"));
		test.log(LogStatus.FAIL, "Login button could not be clicked"
		+test.addScreenCapture("./../screenshots/Snap2017-12-24 12-26-30.jpeg"));
		report.endTest(test);
		report.flush();
		
	}
	

}