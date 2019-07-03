package com.covalense.jdbcapp.connectionpool;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyUtil {
	private static PropertyUtil util = null;
	Properties properties = null;

	public static PropertyUtil getPropertyUtil() throws Exception {

		if (util == null) {
			util = new PropertyUtil();
		}
		return util;
	}

	private PropertyUtil() throws Exception {
		properties = new Properties();
		properties.load(new FileInputStream("jdbcProp.properties"));
	}

	public String getProperty(String key) {
		return properties.getProperty(key);

	}

}
