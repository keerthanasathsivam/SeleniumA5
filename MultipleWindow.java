package SeleniumPratice;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.instagram.com/");
		Set<String>address=driver.getWindowHandles();
		for(String s:address) {
			driver.switchTo().window(s);
			if(driver.getCurrentUrl().contains("https://www.instagram.com/")) {
				driver.close();
				
			}
			else if(driver.getCurrentUrl().contains("https://demowebshop.tricentis.com/")) {
				driver.close();
		}
	}
}
}