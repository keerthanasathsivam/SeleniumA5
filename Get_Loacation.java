package WebElement.java;


import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Loacation {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Point axis=driver.findElement(By.xpath("//input[@id='small-searchterms']")).getLocation();
	int xaxis=axis.getX();
	int yaxis=axis.getY();
	System.out.println(xaxis);
	System.out.println(yaxis);
}
}
