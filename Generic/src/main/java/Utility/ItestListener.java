package utility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import base.CommonAPI;

public class ItestListener implements ITestListener {

@Override
public void onFinish(ITestContext contextFinish) {
System.out.println("onFinish method finished");
}

@Override
public void onStart(ITestContext contextStart) {
System.out.println("onStart method started");
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
System.out.println("Method failed with certain success percentage"+ result.getName());
}

@Override
public void onTestFailure(ITestResult result) {
System.out.println("Test failed"+ result.getName());
try {
    CommonAPI.takeScreenShot("Failure_testAddToCart_");
} catch (IOException e) {
    e.printStackTrace();
}
}

@Override
public void onTestSkipped(ITestResult result) {
System.out.println("Method skipped"+ result.getName());
}

@Override
public void onTestStart(ITestResult result) {
System.out.println("Method started"+ result.getName());
}

@Override
public void onTestSuccess(ITestResult result) {
System.out.println("Method passed"+ result.getName());
}
}
