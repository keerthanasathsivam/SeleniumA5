package WebElement.java;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Size {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	 Thread.sleep(15000);
	 driver.get("https://demowebshop.tricentis.com/");
		 Dimension size =driver.findElement(By.xpath("//input[@id='small-searchterms']")).getSize();
		System.out.println(size);
		int height=size.getHeight();
		
		int width=size.getWidth();
		System.out.println(height);
		System.out.println(width); 
	}

}
