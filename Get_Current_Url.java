package SeleniumPratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Current_Url {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.get("https://demowebshop.tricentis.com/");
		String url1=driver.getCurrentUrl();
		System.out.println(url1);
		
	}

}
