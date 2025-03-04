package automationframeworksfdcjan25;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import constants.FileConstants;

public class SeleniumDemo {
	
	
	public static void main(String[] args) {
		
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(FileConstants.REPORT_PATH);
		
		ExtentReports report = new ExtentReports();
		
		report.attachReporter(sparkReporter);
		
		ExtentTest test = report.createTest("LoginErrorTC01");
		
		ExtentTest tes2t = report.createTest("LoginErrorTC02");
		
		ExtentTest tes3 = report.createTest("LoginErrorTC02");
		
		report.flush();
	}

}