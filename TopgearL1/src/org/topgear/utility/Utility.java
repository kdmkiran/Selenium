package org.topgear.utility;

import java.io.FileInputStream;
import java.util.Properties;

public class Utility {

	public static String getPropertyValue(String key) throws Exception 
	{
		FileInputStream file =new FileInputStream("./config/config.properties");
		Properties property=new Properties();
			property.load(file);
			return property.get(key).toString();
	}
}
