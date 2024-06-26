package MySecondPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySecondClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println ("Launching Facebook");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sudha\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://www.facebook.com");
	
	}
	
}
