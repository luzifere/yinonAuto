package WishiTests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestNGLitener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("TestCasees started and detailed are" + result.getName());
		//Reporter.log("About to begin executing Suite " + result.getName(), true);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TestCasees succes and detailed are" + result.getName());
		//Reporter.log("About to begin executing Suite " + result.getName(), true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("TestCasees failed and detailed are" + result.getName());
		//BasePage.log("About to begin executing Suite " + result.getName(), true);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("TestCasees skiped and detailed are" + result.getName());
		//Reporter.log("About to begin executing Suite " + result.getName(), true);
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
