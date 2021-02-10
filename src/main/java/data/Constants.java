package data;

public class Constants {
	public static final Constants PLATFORM_NAME = new Constants("PLATFORM_NAME");
	public static final Constants PLATFORM_VERSION = new Constants("PLATFORM_VERSION");
	public static final Constants DEVICE_NAME = new Constants("DEVICE_NAME");
	public static final Constants UD_ID = new Constants("UD_ID");
	public static final Constants BROWSER_NAME = new Constants("BROWSER_NAME");
	public static final Constants NEW_COMMAND_TIMEOUT = new Constants("NEW_COMMAND_TIMEOUT");
	public static final Constants APPIUM_URL = new Constants("APPIUM_URL");
	
	
	private String name;
	
	public Constants (String name) {
		this.name=name;
	}
	
	public String toString() {
		return name;
	}
}
