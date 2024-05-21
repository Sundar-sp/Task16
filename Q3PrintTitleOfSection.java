package Task16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3PrintTitleOfSection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Artificial Intelligence");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.linkText("View history")).click();
		String title = driver.getTitle();

		System.out.println(title);
		driver.quit();
	}

}

Output:
May 21, 2024 3:17:12 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
WARNING: Unable to find an exact match for CDP version 124, returning the closest version; found: 122; Please update to a Selenium version that supports CDP version 124
Artificial intelligence: Revision history - Wikipedia
