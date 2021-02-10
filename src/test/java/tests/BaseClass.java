package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import data.Constants;
import data.PropertyLoader;


import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	
	static IOSDriver<IOSElement>driver;
	
	
	@BeforeTest
	public void setup() {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, PropertyLoader.getProperty(Constants.PLATFORM_NAME));
		caps.setCapability(MobileCapabilityType.VERSION, PropertyLoader.getProperty(Constants.PLATFORM_VERSION));
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, PropertyLoader.getProperty(Constants.DEVICE_NAME));
		caps.setCapability(MobileCapabilityType.UDID, PropertyLoader.getProperty(Constants.UD_ID));
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
		caps.setCapability(MobileCapabilityType.BROWSER_NAME, PropertyLoader.getProperty(Constants.BROWSER_NAME));
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, PropertyLoader.getProperty(Constants.NEW_COMMAND_TIMEOUT));
		

		try {
			driver=new IOSDriver<>(new URL(PropertyLoader.getProperty(Constants.APPIUM_URL)),caps);
			driver.get("https://google.com");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void test() {
		System.out.println("TEST");
	}
	
	@AfterTest
	public void teardown() {
		System.out.println("FINISHED");
		driver.quit();
	}
	
}
