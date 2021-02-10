package data;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyLoader {
	static Properties prop= new Properties();
	static String propFileName= "config.properties";
	
	static {
		try {
			loadPropertiesFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	private static void loadPropertiesFile() throws IOException {
		FileInputStream inputStream = null;
		try {
			
			inputStream = new FileInputStream(propFileName);
			if(inputStream != null) {
				prop.load(inputStream);
			}
		} catch (Exception e) {
			System.out.println("Error after reading config.properties file \n" + e.getMessage());
		}finally {
			inputStream.close();
		}		
	}
	
	public static String getProperty(Constants key) {
		return prop.getProperty(key.toString());
	}
}
