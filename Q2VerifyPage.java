package Task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2VerifyPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		if (title.contains("STORE")) {
			System.out.println("Page landed on correct website");
		} else {
			System.out.println("Page not landed on correct website");
		}
		driver.quit();
	}

}

Output:
May 21, 2024 3:16:24 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
WARNING: Unable to find an exact match for CDP version 124, returning the closest version; found: 122; Please update to a Selenium version that supports CDP version 124
Page landed on correct website
