package ChanuTraining.Appium;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Practice1  {

	@Test
	public void WifiSettingsName() throws MalformedURLException {
		
		AppiumDriverLocalService service =new AppiumServiceBuilder().withAppiumJS(new File("C://Users//003MWK744//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("SurajPhone");
		options.setApp("C://Users//003MWK744//eclipse-workspace//Appium//src//test//java//Resources//ApiDemos-debug.apk");	
		
		
		AndroidDriver  driver =new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		String alertTitle=driver.findElement(By.id("android:id/alertTitle")).getText();
	
		Assert.assertEquals(alertTitle,"WiFi settings");
		driver.findElement(By.id("android:id/edit")).sendKeys("Rahul Wifi");
		driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
		
		driver.quit();
		service.stop();	
	
	}
}