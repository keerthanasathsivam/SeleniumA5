package SeleniumAssignment.SeleniumAft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Css_Value {
	public static void main(String[] args) {
		// opening the browser
		WebDriver driver = new ChromeDriver();
		// maximizing the web browser
		driver.manage().window().maximize();
		// navigating to the web site
		driver.get("https://demowebshop.tricentis.com/");
		// inding the elemet colour css value
		String colour = driver.findElement(By.xpath("//a[@class='ico-register']")).getCssValue("color");
		// by using the colour reerence veriable priting the css value
		System.out.println(colour);
		// new window is opening for new task by this commnent
		driver.switchTo().newWindow(WindowType.TAB);
		// launching the new site for regb site
		driver.get("https://rgbacolorpicker.com/rgba-to-hex");
		// element finding for first field
		WebElement red = driver.findElement(By.xpath(
				"(//input[@class='w-24 rounded border bg-gray-50 px-3 py-2 focus:outline-none focus:ring'])[1]"));
		// clearing the execting value inside the field
		red.clear();
		// sending the new value into the text
		red.sendKeys("175");
		// element finding for 2nd field
		WebElement blue = driver.findElement(By.xpath(
				"(//input[@class='w-24 rounded border bg-gray-50 px-3 py-2 focus:outline-none focus:ring'])[2]"));
		// clearing the execting value inside the field
		blue.clear();
		// sending the new value into the text
		blue.sendKeys("3");
		// element finding 3rd first field
		WebElement hi = driver.findElement(By.xpath(
				"(//input[@class='w-24 rounded border bg-gray-50 px-3 py-2 focus:outline-none focus:ring'])[3]"));
		// clearing the execting value inside the field
		hi.clear();
		// sending the new value into the text
		hi.sendKeys("4");
		// element finding for 4th field
		WebElement helo = driver.findElement(By.xpath(
				"(//input[@class='w-24 rounded border bg-gray-50 px-3 py-2 focus:outline-none focus:ring'])[4]"));
		// clearing the execting value inside the field
		helo.clear();
		// sending the new value into the text
		helo.sendKeys("1");
		// inding the element for css value present or not and storing into the variable
		String text = driver.findElement(By.xpath("//div[@class='cursor-pointer select-all text-xl tracking-wider']"))
				.getText();
		// this is actual css value
		String actual = "#af0304";
		// here comparing with the text and actaual text using condition
		if (text.equalsIgnoreCase(actual)) {

			System.out.println(text);
		} else {

			System.out.println("not matching");
		}

		// here finding the red colour image is loaded in the webpage or not using the
		// is displayed method
		boolean clr = driver.findElement(By.xpath("//div[@class='size-20 max-w-full rounded shadow']")).isDisplayed();
		System.out.println(clr);
		// comparing with the boolena value is element is present with if block will
		// execute
		if (clr = true) {

			System.out.println("the colur red is displayed ");
		}
		// else block execute
		else {

			System.out.println("the red colour is not displayed ");
		}
		// closing the browser
		driver.quit();

	}

}
