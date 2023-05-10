package com.sample;

import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Sample extends BaseClass{
	@Test
	public void test() {
		getDriver("chrome");
		enterURL("https://adactinhotelapp.com/");
		maximizewindow();
		WebElement element = findLocatorById("username");
		elementSendkeys(element, "dinesh1596");
		WebElement element1 = findLocatorById("password");
		elementSendkeys(element1, "dinesh1596");
		WebElement element3 = findLocatorById("login");
		elementClick(element3);
		
		
		
	}

}
