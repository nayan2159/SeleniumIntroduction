import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// Invoking a Browser In chrome
		//Chrome -> ChromeDriver ext -> Close get
		//Firefox-> FirefoxDriver ext -> close get
		//Safari-> safari Driver ext -> close get
		//WebDriver close get
		//WebDriver method + class Methods
		
		//ChromeDriver.exe -> chrome browser selenium manager 
		//step to invoke chromebrowser

		
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\nayan\\OneDrive\\Documents\\chromedriver-win64\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();

		//Step to invoke edgebrowser
		System.setProperty("webdriver.edge.driver","C:\\Users\\nayan\\OneDrive\\Documents\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();

		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();
		
		

	}

}
