package SeleniumPratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	String expectedUrl="https://www.instagram.com/";
	driver.get("https://www.instagram.com/");
	System.out.println(driver.getCurrentUrl());
	String ActualUrl=driver.getCurrentUrl();
	System.out.println(ActualUrl);
	if(expectedUrl.contentEquals(ActualUrl)) {
		System.out.println("Test case pass");
		
	}
	else {
		System.out.println("Test case fail");
	}
	
}
}
