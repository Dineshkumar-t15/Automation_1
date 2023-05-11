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
	@Test
	public void test1() {
		getDriver("chrome");
		enterURL("https://adactinhotelapp.com/");
	    maximizewindow();
		WebElement element = findLocatorById("username");
		elementSendkeys(element, "dinesh1596");
		WebElement element1 = findLocatorById("password");
		elementSendkeys(element1, "dinesh159");
		WebElement element3 = findLocatorById("login");
		elementClick(element3);
	}

}
