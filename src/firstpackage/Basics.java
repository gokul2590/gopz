package firstpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;   

public class Basics {
	
	public static void main(String[] args) throws Exception{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.myntra.com/");
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("the tille of the page is =" +title);
		
		Thread.sleep(3000);
		String url = driver.getCurrentUrl();
		System.out.println("the url of the page is =" +url);
		
		Thread.sleep(4000);
		driver.close();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
