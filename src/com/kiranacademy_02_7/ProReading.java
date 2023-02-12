package com.kiranacademy_02_7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ProReading {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("data.properties");
		
		Properties properties=new Properties();
		properties.load(fis);
		
		String val=properties.getProperty("url");
		System.out.println("Value >>>>"+val);
		String path=properties.getProperty("chromepath");
		System.out.println("Value >>>>"+path);
		
		
		
		
	}
}
