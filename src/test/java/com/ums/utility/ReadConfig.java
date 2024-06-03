package com.ums.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {
	
	Properties properties;
	String path="C:\\Users\\lipsa\\eclipse-workspace\\UMSAutomation\\Configuration\\config.properties";
	public ReadConfig() {
		try {
		properties=new Properties();
		
			FileInputStream fis=new FileInputStream(path);
			properties.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public String getBaseUrl() {
	String Value=  properties.getProperty("QAURL");
	if(Value!=null)
		return Value;
	else
		throw new RuntimeException("QAURL not specified at config file.");
	}
	 public String getDevUrl() {
	        String value = properties.getProperty("DevURL");
	        if (value != null)
	            return value;
	        else
	            throw new RuntimeException("DevURL not specified in config file.");
	    }
	 public String getSignupUrl() {
	        String value = properties.getProperty("SignupURL");
	        if (value != null)
	            return value;
	        else
	            throw new RuntimeException("SignupURL not specified in config file.");
	    }
	 public String getApplicantLoginUrl() {
	        String value = properties.getProperty("ApplicantLoginURL");
	        if (value != null)
	            return value;
	        else
	            throw new RuntimeException("TermsURL not specified in config file.");
	    }
	 public String getAdminLoginUrl() {
	        String value = properties.getProperty("AdminLoginURL");
	        if (value != null)
	            return value;
	        else
	            throw new RuntimeException("TermsURL not specified in config file.");
	    }
	public String getBrowser() {
		String Value=  properties.getProperty("Browser");
		if(Value!=null)
			return Value;
		else
			throw new RuntimeException("Browser not specified at config file.");
		}

}
