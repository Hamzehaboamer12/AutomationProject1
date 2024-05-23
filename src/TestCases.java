import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCases {

	public static void main(String[] args) {
		
		WebDriver drive = new ChromeDriver();
		drive.get("https://www.saucedemo.com/v1/"); // open website
		//drive.manage().window().maximize(); to maxmize window
		drive.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user"); // find username input and input the username
		drive.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce"); // find password input and input thr password
		drive.findElement(By.xpath("//*[@id=\"login-button\"]")).click(); // click on login button
		drive.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]")); // find items
		drive.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click(); // click to the add cart button
		drive.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]"));
		drive.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[3]/button")).click();

	}

}
