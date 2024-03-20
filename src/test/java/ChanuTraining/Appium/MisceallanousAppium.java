package ChanuTraining.Appium;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
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
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
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

public class MisceallanousAppium extends BaseTest {

	@Test
	public void MiscellanousAppium() throws MalformedURLException {
		
		
		
 //  Activity activity=new Activity("io.appium.android.apis", "io.appium.android.apis.preference.preferenceDependencies");
		// driver.startActivity(activity);
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		
		DeviceRotation landscape =new DeviceRotation(0,0,90);
		
		driver.rotate(landscape);
		
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		String alertTitle=driver.findElement(By.id("android:id/alertTitle")).getText();
	
		Assert.assertEquals(alertTitle,"WiFi settings");
		
		
		//copy paste
		// copty to clipboard- paste it to clipboard
		driver.setClipboardText("Rahul Wifi");
		
		driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());
	driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		
		driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	driver.pressKey(new KeyEvent(AndroidKey.HOME));
	
	}
}
