package ChanuTraining.Appium;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {

	AppiumDriverLocalService service;
	AndroidDriver driver;
	
	@BeforeClass
	public void ConfigureAppium() throws MalformedURLException {
		
		 service =new AppiumServiceBuilder().withAppiumJS(new File("C://Users//003MWK744//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("SurajPhone");
		options.setApp("C://Users//003MWK744//eclipse-workspace//Appium//src//test//java//Resources//General-Store.apk");	
		
		
		 driver =new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
			
	}
	
	public void swipeAction(WebElement ele, String direction) {
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
				 "elementId", ((RemoteWebElement) ele).getId(),
			    "direction", direction,
			    "percent", 0.75
			));
	}
	
	public void scrollToEndAction() {
		
		
		boolean canScrollMore;
		
		do{
			canScrollMore=(Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
		
			    "left", 100, "top", 100, "width", 200, "height", 200,
			    "direction", "down",
			    "percent", 3.0
			));
	}
	while(canScrollMore);
		
	}

	public void longPressAction(WebElement ele) {
		// Java
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
		    "elementId", ((RemoteWebElement) ele).getId(),"duration",2000));
		
	}
	
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
		service.stop();	
	}
}
