import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstClass {
	WebDriver driver;

	public void launchBrowser() {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\SoftWareEngineering\\chromedriver.exe");
		 */
		/* WebDriver driver = new ChromeDriver(); */
		System.setProperty("webdriver.edge.driver", "D:\\SoftWareEngineering\\msedgedriver.exe");

		driver = new EdgeDriver();
		driver.get("https://www.amazon.com");
	}

	public void serchProduct() throws InterruptedException {
		driver.findElement(By.id("twotabserchtextbox")).sendKeys("iphone");
		Thread.sleep(1000);
		driver.findElement(By.id("nav-search-submit-button")).click();
	}

	public void navigate() {
		driver.navigate().to("https://www.flipkart.com/");
		System.out.println("This is the title of the website" + driver.getTitle());
		//driver.navigate().back();
	}

	public static void main(String[] args) throws InterruptedException {
		FirstClass ob = new FirstClass();
		ob.launchBrowser();

		ob.serchProduct();
		ob.navigate();

	}
}
