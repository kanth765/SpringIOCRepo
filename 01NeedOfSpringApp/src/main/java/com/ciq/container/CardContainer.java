package com.ciq.container;

import java.io.IOException;
import java.util.Properties;

public class CardContainer {

	public Object getContainer(String name) {
		Properties properties = new Properties();

		try {
			properties.load(CardContainer.class.getClassLoader().getResourceAsStream("com/ciq/config/card.properties"));
			return Class.forName(properties.getProperty(name)).newInstance();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return name;

	}

}
