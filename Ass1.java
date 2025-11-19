package SeleniumAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.instagram.com/");
		Thread.sleep(1000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.navigate().back();
		driver.navigate().back();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.navigate().forward();
		driver.navigate().forward();
		String url1=driver.getCurrentUrl();
		System.out.println(url1);
		driver.navigate().back();//facebook
		String url2=driver.getCurrentUrl();
		System.out.println(url2);
		driver.navigate().forward();
		String Title =driver.getTitle();
		System.out.println(Title);
		driver.navigate().back();
		driver.navigate().back();
		String Title1 =driver.getTitle();
		System.out.println(Title1);
		driver.navigate().forward();
		String address=driver.getWindowHandle();
		System.out.println(address);
		driver.navigate().forward();
		String address1=driver.getWindowHandle();
		System.out.println(address1);
		
		
		
		
		
		
	}

}
