package resources;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

public class ExtentReporterNG implements IReporter {
    private ExtentReports extent;

    public ExtentReporterNG() {
    }

    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
        this.extent = new ExtentReports(outputDirectory + File.separator + "ExtentReportsTestNG.html", true);
        Iterator<ISuite> var5 = suites.iterator();

        while(var5.hasNext()) {
            ISuite suite = (ISuite)var5.next();
            Map<String, ISuiteResult> result = suite.getResults();
            Iterator<ISuiteResult> var8 = result.values().iterator();

            while(var8.hasNext()) {
                ISuiteResult r = (ISuiteResult)var8.next();
                ITestContext context = r.getTestContext();
                this.buildTestNodes(context.getPassedTests(), LogStatus.PASS);
                this.buildTestNodes(context.getFailedTests(), LogStatus.FAIL);
                this.buildTestNodes(context.getSkippedTests(), LogStatus.SKIP);
            }
        }

        this.extent.flush();
        this.extent.close();
    }

    private void buildTestNodes(IResultMap tests, LogStatus status) {
        if (tests.size() > 0) {
            Iterator<?> var5 = tests.getAllResults().iterator();

            while(var5.hasNext()) {
                ITestResult result = (ITestResult)var5.next();
                ExtentTest test = this.extent.startTest(result.getMethod().getMethodName());
                String[] var9;
                int var8 = (var9 = result.getMethod().getGroups()).length;

                String message;
                for(int var7 = 0; var7 < var8; ++var7) {
                    message = var9[var7];
                    test.assignCategory(new String[]{message});
                }

                message = "Test " + status.toString().toLowerCase() + "ed";
                if (result.getThrowable() != null) {
                    message = result.getThrowable().getMessage();
                }

                test.log(status, message);
                this.extent.endTest(test);
            }
        }

    }

    @SuppressWarnings("unused")
	private Date getTime(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();
    }
}