package dataProviders;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import javax.management.RuntimeErrorException;

public class ConfigFileReader {

	private Properties properties;
	private final String propertyFilePath= "configs//Configuration.properties";
	
	
	public ConfigFileReader() throws FileNotFoundException {
		BufferedReader reader;
		reader = new BufferedReader(new FileReader(propertyFilePath));
		properties = new Properties();
		try {
			properties.load(reader);
			reader.close();
		}
		catch (IOException e) {
			 e.printStackTrace();
			 throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
			 }
	}
	
	
	public String getDriverPath() {
		String driverPath = properties.getProperty("driverpath");
		if(driverPath!=null)return driverPath;
		else throw new RuntimeException("Driver not found");
}
	
	public String getApplicationUrl() {
		 String url = properties.getProperty("url");
		 if(url != null) return url;
		 else throw new RuntimeException("url not specified in the Configuration.properties file.");
		 }
	
	public String getImplicitWait() {
		String implicitWait = properties.getProperty("implicitwati");
		if(implicitWait != null) return implicitWait;
		 else throw new RuntimeException("Implicit wait not specified in the Configuration.properties file.");
		 }
	
	public String getReportConfigPath(){
		 String reportConfigPath = properties.getProperty("reportConfigPath");
		 if(reportConfigPath!= null) return reportConfigPath;
		 else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath"); 
		}
		
	}

