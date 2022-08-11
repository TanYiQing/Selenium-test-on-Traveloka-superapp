package group9;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class yungcheekai {
	@Test
	public void ta05_70_bookingCarWithInvalidEmail() throws InterruptedException { //DONE //TA05.70
		String URL = "https://www.traveloka.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\chromedriver\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get(URL);
		
		Actions ac = new Actions(cd);
		WebDriverWait wait = new WebDriverWait(cd, 60);
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement transportButton = cd.findElement(By.xpath("/html/body/div[1]/div[2]/div[4]/div/div[1]/div[1]/div/div")); //Click transport button
		transportButton.click();
		
		WebElement carRental = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[4]/div[1]")); 
		wait.until(ExpectedConditions.elementToBeClickable(carRental));
		carRental.click();//Click car button
		
		((JavascriptExecutor)(cd)).executeScript("window.scroll(0,430)");
		
		{
			WebElement element = cd.findElement(By.cssSelector("div:nth-child(1) > .css-1dbjc4n > .css-4rbku5 > img"));
		    Actions builder = new Actions(cd);
		    builder.moveToElement(element).perform();
		}
		
		{
		   WebElement element = cd.findElement(By.tagName("body"));
		   Actions builder = new Actions(cd);
		   builder.moveToElement(element, 0, 0).perform();
		}
		
		cd.findElement(By.cssSelector(".css-1dbjc4n:nth-child(2) > .css-1dbjc4n > .css-1dbjc4n > .css-11aywtz")).click();
		cd.findElement(By.cssSelector(".css-1dbjc4n:nth-child(2) > .css-1dbjc4n > .css-1dbjc4n > .css-11aywtz")).sendKeys("Jakarta");
		cd.findElement(By.cssSelector(".css-1dbjc4n:nth-child(1) > .css-1dbjc4n:nth-child(2) > .css-1dbjc4n > .css-4rbku5 > span")).click();
		 
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		WebElement startDate = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[6]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]"));
		ac.moveToElement(startDate).click().perform();
		startDate.click();
		Thread.sleep(1000);
		WebElement selectDate =  cd.findElement(By.xpath("//*[@id=\"__next\"]/div[6]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[15]/div[1]/div[1]/div[2]/div[2]/div[1]"));
		selectDate.click();
		if (selectDate.isEnabled() == false) {
			selectDate = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[15]/div[1]/div[2]/div[2]/div[1]"));
			selectDate.click();
		}
		
		WebElement endDate = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[6]/div[1]/div[2]/div[1]/div[1]/div[3]/div[5]/div[1]/div[1]/input[1]"));
		ac.moveToElement(endDate).click().perform();
		endDate.click();
		Thread.sleep(1000);
		cd.findElement(By.xpath("//*[@id=\"__next\"]/div[6]/div[1]/div[2]/div[1]/div[1]/div[3]/div[5]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[15]/div[1]/div[1]/div[2]/div[2]/div[1]")).click();
		
		WebElement endTime = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[6]/div[1]/div[2]/div[1]/div[1]/div[3]/div[7]/div[1]/div[1]/input[1]"));
		ac.moveToElement(endTime).click().perform();
		endTime.sendKeys(Keys.ENTER);
		
		WebElement minit = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[6]/div[1]/div[2]/div[1]/div[1]/div[3]/div[7]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]"));
		ac.moveToElement(minit).click().perform();
		minit.click();
		
		((JavascriptExecutor)(cd)).executeScript("window.scroll(0,510)");
		WebElement hour = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[6]/div[1]/div[2]/div[1]/div[1]/div[3]/div[7]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[20]/div[1]"));
		Thread.sleep(1000);
		hour.click();
		
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement done = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[6]/div[1]/div[2]/div[1]/div[1]/div[3]/div[7]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]"));
		done.click();
		
		Thread.sleep(1000);
		((JavascriptExecutor)(cd)).executeScript("window.scroll(0,400)");
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement searchCar = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[6]/div/div[2]/div/div/div[3]/div[9]/div"));
		searchCar.click();
		
		((JavascriptExecutor)(cd)).executeScript("window.scroll(0,100)");
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement selectCar = cd.findElement(By.xpath("//*[@id=\"rental-search-content\"]/div/div[2]/div[1]/div/div[5]/div[4]/div"));
		selectCar.click();
		
		WebElement continueBtn = cd.findElement(By.xpath("//*[@id=\"rental-search-content\"]/div/div[2]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[4]"));
		continueBtn.click();
		
		Thread.sleep(2000);
		WebElement rentalOffice = cd.findElement(By.xpath("//*[@id=\"rental-search-content\"]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]"));
		rentalOffice.click();
		
		
		((JavascriptExecutor)(cd)).executeScript("window.scroll(0,330)");
		WebElement selectPickupLoc = cd.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[2]/div/div/div[1]/div[1]/div/div[1]/div"));
		
		selectPickupLoc.click();
		
		cd.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[1]/div/div[1]/div[2]/div/div/div[2]")).click(); //Click first item
		
		Thread.sleep(1000);
		WebElement dropoffOffice = cd.findElement(By.xpath("//*[@id=\"rental-search-content\"]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]"));
		dropoffOffice.click();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement dropLoc = cd.findElement(By.xpath("//*[@id=\"rental-search-content\"]/div[2]/div[1]/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div[1]/div/div[1]/div"));
		dropLoc.click();
		
		cd.findElement(By.xpath("//*[@id=\"rental-search-content\"]/div[2]/div[1]/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div/div/div[1]/div[2]/div/div/div[2]")).click();
		
		cd.findElement(By.xpath("//*[@id=\"rental-search-content\"]/div[2]/div[1]/div[4]/div[2]/div[2]/div[1]")).click();
		cd.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Test Name");
		cd.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")).sendKeys("123456789");
		cd.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/input[1]")).sendKeys("testmailgmail.com");
		
		Select title = new Select(cd.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/select[1]")));
		title.selectByVisibleText("Mr.");
		cd.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")).sendKeys("Test Name");
		cd.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/input[1]")).sendKeys("123456789");
		Thread.sleep(1000);
		cd.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]")).click();

		WebElement errormessage = wait .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[2]/div[2]/div[1]/div[2]/div/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div")));
		String str = errormessage.getText();
		Assert.assertTrue(str.contains("Invalid format"));
		System.out.print("ta05_70_bookingCarWithInvalidEmail is complete");
		
		
	}
	
	@Test
	public void ta05_60_bookingCar() throws InterruptedException { //DONE //TA 05.60
		String URL = "https://www.traveloka.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\chromedriver\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get(URL);
		
		Actions ac = new Actions(cd);
		WebDriverWait wait = new WebDriverWait(cd, 60);
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement transportButton = cd.findElement(By.xpath("/html/body/div[1]/div[2]/div[4]/div/div[1]/div[1]/div/div"));
		transportButton.click();
		
		WebElement carRental = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[4]/div[1]"));
		wait.until(ExpectedConditions.elementToBeClickable(carRental));
		carRental.click();
		
		((JavascriptExecutor)(cd)).executeScript("window.scroll(0,430)");
		
		{
			WebElement element = cd.findElement(By.cssSelector("div:nth-child(1) > .css-1dbjc4n > .css-4rbku5 > img"));
		    Actions builder = new Actions(cd);
		    builder.moveToElement(element).perform();
		}
		
		{
		   WebElement element = cd.findElement(By.tagName("body"));
		   Actions builder = new Actions(cd);
		   builder.moveToElement(element, 0, 0).perform();
		}
		
		cd.findElement(By.cssSelector(".css-1dbjc4n:nth-child(2) > .css-1dbjc4n > .css-1dbjc4n > .css-11aywtz")).click();
		cd.findElement(By.cssSelector(".css-1dbjc4n:nth-child(2) > .css-1dbjc4n > .css-1dbjc4n > .css-11aywtz")).sendKeys("Jakarta");
		cd.findElement(By.cssSelector(".css-1dbjc4n:nth-child(1) > .css-1dbjc4n:nth-child(2) > .css-1dbjc4n > .css-4rbku5 > span")).click();
		 
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		WebElement startDate = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[6]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]"));
		ac.moveToElement(startDate).click().perform();
		startDate.click();
		Thread.sleep(1000);
		WebElement selectDate =  cd.findElement(By.xpath("//*[@id=\"__next\"]/div[6]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[15]/div[1]/div[1]/div[2]/div[2]/div[1]"));
		selectDate.click();
		if (selectDate.isEnabled() == false) {
			selectDate = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[15]/div[1]/div[2]/div[2]/div[1]"));
			selectDate.click();
		}
		
		WebElement endDate = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[6]/div[1]/div[2]/div[1]/div[1]/div[3]/div[5]/div[1]/div[1]/input[1]"));
		ac.moveToElement(endDate).click().perform();
		endDate.click();
		Thread.sleep(1000);
		cd.findElement(By.xpath("//*[@id=\"__next\"]/div[6]/div[1]/div[2]/div[1]/div[1]/div[3]/div[5]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[15]/div[1]/div[1]/div[2]/div[2]/div[1]")).click();
		
		WebElement endTime = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[6]/div[1]/div[2]/div[1]/div[1]/div[3]/div[7]/div[1]/div[1]/input[1]"));
		ac.moveToElement(endTime).click().perform();
		endTime.sendKeys(Keys.ENTER);
		
		WebElement minit = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[6]/div[1]/div[2]/div[1]/div[1]/div[3]/div[7]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]"));
		ac.moveToElement(minit).click().perform();
		minit.click();
		
		((JavascriptExecutor)(cd)).executeScript("window.scroll(0,510)");
		WebElement hour = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[6]/div[1]/div[2]/div[1]/div[1]/div[3]/div[7]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[20]/div[1]"));
		Thread.sleep(1000);
		hour.click();
		
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement done = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[6]/div[1]/div[2]/div[1]/div[1]/div[3]/div[7]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]"));
		done.click();
		
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement searchCar = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[6]/div[1]/div[2]/div[1]/div[1]/div[3]/div[9]/div[1]/div[2]/div[2]"));
		searchCar.click();
		
		((JavascriptExecutor)(cd)).executeScript("window.scroll(0,100)");
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement selectCar = cd.findElement(By.xpath("//*[@id=\"rental-search-content\"]/div[1]/div[2]/div[1]/div[1]/div[5]/div[4]/div[1]/div[2]/div[1]"));
		selectCar.click();
		
		WebElement continueBtn = cd.findElement(By.xpath("//*[@id=\"rental-search-content\"]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[4]/div[2]/div[1]"));
		continueBtn.click();
		
		Thread.sleep(2000);
		WebElement rentalOffice = cd.findElement(By.xpath("//*[@id=\"rental-search-content\"]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]"));
		rentalOffice.click();
		
		((JavascriptExecutor)(cd)).executeScript("window.scroll(0,330)");
		WebElement selectPickupLoc = cd.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[2]/div/div/div[1]/div[1]/div/div[1]/div"));
		selectPickupLoc.click();
		cd.findElement(By.xpath("//*[@id=\"rental-search-content\"]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]")).click();
		
		Thread.sleep(1000);
		WebElement dropoffOffice = cd.findElement(By.xpath("//*[@id=\"rental-search-content\"]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]"));
		dropoffOffice.click();
		
		WebElement dropLoc = cd.findElement(By.xpath("//*[@id=\"rental-search-content\"]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
		dropLoc.click();
		cd.findElement(By.xpath("//*[@id=\"rental-search-content\"]/div[2]/div[1]/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div[2]/div/div[1]/div/div[1]/div[2]/div/div/div[2]")).click();
		
		cd.findElement(By.xpath("//*[@id=\"rental-search-content\"]/div[2]/div[1]/div[4]/div[2]/div[2]/div[1]")).click();
		cd.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Test Name");
		cd.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")).sendKeys("123456789");
		cd.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/input[1]")).sendKeys("testmail@gmail.com");
		
		Select title = new Select(cd.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/select[1]")));
		title.selectByVisibleText("Mr.");
		cd.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")).sendKeys("Test Name");
		cd.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/input[1]")).sendKeys("123456789");
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		cd.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]")).click();

		WebElement errormessage = wait .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[2]/div[2]/div[1]/div[3]/h2")));
		String str = errormessage.getText();
		Assert.assertTrue(str.contains("Driver Details"));
		System.out.print("ta05_60_bookingCar is complete");
		
	}
	
	@Test
	public void ta05_50_bookingFlightWithInvalidDestination() { //DONE //TA05.50
		String URL = "https://www.traveloka.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\chromedriver\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get(URL);
		
		Actions ac = new Actions(cd);
		String firstName = "Test Name";
		String familyName = "Test Family Name";
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement transportButton = cd.findElement(By.xpath("/html/body/div[1]/div[2]/div[4]/div/div[1]/div[1]/div/div"));
		transportButton.click();
		
		WebElement flightButton = cd.findElement(By.xpath("/html/body/div[1]/div[2]/div[4]/div/div[1]/div[2]/div/div/div/a[1]/div"));
		flightButton.click();
		
		((JavascriptExecutor)(cd)).executeScript("window.scroll(0,280)");
		WebElement oneWayButton = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div[2]/div[4]/div/div/div[1]/div[1]/div[1]/div"));
		oneWayButton.click();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement toDestination = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div[1]/div[1]/div[3]/div/div/div[1]/input"));
		ac.moveToElement(toDestination).click().perform();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement arriveDestination = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div[1]/div[1]/div[3]/div[2]/div/div/div[2]/div/div/div[1]/span/span"));
		arriveDestination.click();
		
		WebElement date = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div[1]/div[3]/div[1]/div/div[1]/div[1]/input"));
		date.click();
		
		WebElement dateSelect = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div[1]/div[3]/div[1]/div/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div[3]/div[16]/div/div/div[2]/div[2]/div"));
		dateSelect.click();
		
		WebElement searchFlight = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div[2]/div[2]"));
		searchFlight.click();
		
	}
	
	@Test
	public void ta05_40_bookingFlight() throws InterruptedException { //DONE //TA05.40
		String URL = "https://www.traveloka.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\chromedriver\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get(URL);
		
		Actions ac = new Actions(cd);
		String firstName = "Test Name";
		String familyName = "Test Family Name";
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement transportButton = cd.findElement(By.xpath("/html/body/div[1]/div[2]/div[4]/div/div[1]/div[1]/div/div"));
		transportButton.click();
		
		WebElement flightButton = cd.findElement(By.xpath("/html/body/div[1]/div[2]/div[4]/div/div[1]/div[2]/div/div/div/a[1]/div"));
		flightButton.click();
		
		((JavascriptExecutor)(cd)).executeScript("window.scroll(0,280)");
		WebElement oneWayButton = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div[2]/div[4]/div/div/div[1]/div[1]/div[1]/div"));
		oneWayButton.click();
		
		WebElement fromDestination = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div[1]/div[1]/div[1]/div/div/div[1]/input"));
		//fromDestination.sendKeys("Kuala Lumpur");
		
		WebElement date = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div[1]/div[3]/div[1]/div/div[1]/div[1]/input"));
		date.click();
		
		WebElement dateSelect = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div[1]/div[3]/div[1]/div/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div[3]/div[16]/div/div/div[2]/div[2]/div"));
		dateSelect.click();
		
		WebElement searchFlight = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div[2]/div[2]"));
		searchFlight.click();
		
		WebElement chooseFlight = cd.findElement(By.xpath("//*[@id=\"desktopContentV3\"]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]"));
		chooseFlight.click();
		
		Thread.sleep(2000);
		((JavascriptExecutor)(cd)).executeScript("window.scroll(0,280)");
		WebElement continueBooking = cd.findElement(By.xpath("//*[@id=\"desktopContentV3\"]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/button[1]"));
		continueBooking.click();
		
		WebElement inputFirstName = cd.findElement(By.xpath("//*[@id=\"desktopContentV3\"]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		inputFirstName.sendKeys(firstName);
		
		WebElement inputFamilyName = cd.findElement(By.xpath("//*[@id=\"desktopContentV3\"]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		inputFamilyName.sendKeys(familyName);
		
		WebElement phone = cd.findElement(By.xpath("//*[@id=\"desktopContentV3\"]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/label[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		phone.sendKeys("123456789");
		
		WebElement email = cd.findElement(By.xpath("//*[@id=\"desktopContentV3\"]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/label[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		email.sendKeys("testmail@gmail.com");
		
		WebElement title = cd.findElement(By.xpath("//*[@id=\"desktopContentV3\"]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/label[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		title.click();
		
		WebElement selectTitle = cd.findElement(By.xpath("//*[@id=\"desktopContentV3\"]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]"));
		selectTitle.click();
		
		WebElement travelorFirstName = cd.findElement(By.xpath("//*[@id=\"desktopContentV3\"]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		travelorFirstName.sendKeys(firstName);
		
		WebElement travelorFamilyName = cd.findElement(By.xpath("//*[@id=\"desktopContentV3\"]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		travelorFamilyName.sendKeys(familyName);
		
		WebElement day = cd.findElement(By.xpath("//*[@id=\"desktopContentV3\"]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		//ac.moveToElement(day).click().perform();
		day.sendKeys("14");
		
		WebElement month = cd.findElement(By.xpath("//*[@id=\"desktopContentV3\"]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		month.click();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		cd.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div/div[3]/div/div/div/div/div/div/div[2]/div/div/div/div/div[5]/div/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div/div/span")).click(); //Select February
		
		WebElement year = cd.findElement(By.xpath("//*[@id=\"desktopContentV3\"]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[3]/div[1]/div[1]/label[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		year.sendKeys("1999");
		
		Thread.sleep(2000);
		WebElement continueButton = cd.findElement(By.xpath("//*[@id=\"desktopContentV3\"]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/button[1]"));
		continueButton.click();
		
		WebDriverWait wait = new WebDriverWait(cd, 60);
		WebElement message = wait .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[1]/div/div/div/div/div/div/div[1]/div[2]/div[1]")));
		String str = message.getText();
		Assert.assertTrue(str.contains("Please check your details"));
		System.out.print("ta05_40_bookingFlight is complete");
	}
	
	@Test
	public void ta05_30_bookingHotelWithInvalidPrice() throws InterruptedException {
		String URL = "https://www.traveloka.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\chromedriver\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get(URL);
		
		Actions ac = new Actions(cd);
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement accommodationButton = cd.findElement(By.xpath("/html/body/div[1]/div[2]/div[4]/div/div[2]/div[1]/div/div"));
		accommodationButton.click();

		WebElement hotelButton = cd.findElement(By.xpath("/html/body/div[1]/div[2]/div[4]/div/div[2]/div[2]/div/div/div/a[1]/div"));
		hotelButton.click();

		((JavascriptExecutor)(cd)).executeScript("window.scroll(0,400)");
		WebElement destination = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div/div/div[2]/div/div[1]/div[1]/div/div[1]/input"));
		ac.moveToElement(destination).click().perform();
		destination.sendKeys("Penang");

		Thread.sleep(2000);
		WebElement selectDestination = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div/div[2]/div/div[1]/div[2]/div/div/div/div[1]/div[2]/div/div/div[1]/div[1]/span"));
		selectDestination.click();

		WebElement checkIn = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div/div[2]/div/div[3]/div[1]/div/div[1]/div/div[1]/input"));
		checkIn.click();

		Thread.sleep(2000);
		WebElement checkInDay = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div/div[2]/div/div[3]/div[1]/div/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div[3]/div[16]/div/div[2]/div[2]/div"));
		checkInDay.click();
		if (checkInDay.isEnabled() == false) {
			checkInDay = cd.findElement(By.xpath("div#__next > div:nth-of-type(4) > div:nth-of-type(2) > div > div:nth-of-type(2) > div > div:nth-of-type(3) > div > div > div:nth-of-type(2) > div > div > div > div > div > div:nth-of-type(2) > div > div > div:nth-of-type(3) > div:nth-of-type(16) > div > div:nth-of-type(2) > div:nth-of-type(2) > div"));
			checkInDay.click();
		}

		WebElement duration = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div/div[2]/div/div[3]/div[2]/div/div[1]/div/div[1]/input"));
		duration.click();

		WebElement selectDuration = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div/div[2]/div/div[3]/div[2]/div/div[2]/div/div/div/div[1]/div/div[2]/div[1]"));
		selectDuration.click();

		WebElement room = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div/div[2]/div/div[5]/div[1]/div/div[1]/div[1]/div/div[1]/input"));
		room.click();

		WebElement confirmRoom = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div/div[2]/div/div[5]/div[1]/div/div[1]/div[2]/div/div/div[3]/div/div"));
		confirmRoom.click();

		WebElement searchHotel = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div/div[2]/div/div[5]/div[2]/div"));
		searchHotel.click();
		
		((JavascriptExecutor)(cd)).executeScript("window.scroll(0,540)");
		WebElement filter = cd.findElement(By.xpath("//*[@id=\"desktopContentV3\"]/div/div[2]/div[2]/div[3]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[2]/div/div/div[1]/div[2]/div/div/label/div/div/div[2]/div/input"));
		Thread.sleep(2000);
		ac.moveToElement(filter).click().perform();
		filter.sendKeys(Keys.CONTROL+"a");
		filter.sendKeys("20");
		Thread.sleep(5000);
	}
	
	@Test
	public void ta05_20_bookingHotelWithInvalidDestination() throws InterruptedException {
		String URL = "https://www.traveloka.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\chromedriver\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get(URL);
		
		Actions ac = new Actions(cd);
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement accommodationButton = cd.findElement(By.xpath("/html/body/div[1]/div[2]/div[4]/div/div[2]/div[1]/div/div"));
		accommodationButton.click();

		WebElement hotelButton = cd.findElement(By.xpath("/html/body/div[1]/div[2]/div[4]/div/div[2]/div[2]/div/div/div/a[1]/div"));
		hotelButton.click();

		((JavascriptExecutor)(cd)).executeScript("window.scroll(0,400)");
		WebElement destination = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div/div/div[2]/div/div[1]/div[1]/div/div[1]/input"));
		ac.moveToElement(destination).click().perform();
		destination.sendKeys("sjkdf");
	
	}
	
	@Test
	public void ta05_10_bookingHotel() throws InterruptedException {
		String URL = "https://www.traveloka.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\chromedriver\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get(URL);
		
		Actions ac = new Actions(cd);
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement accommodationButton = cd.findElement(By.xpath("/html/body/div[1]/div[2]/div[4]/div/div[2]/div[1]/div/div"));
		accommodationButton.click();

		WebElement hotelButton = cd.findElement(By.xpath("/html/body/div[1]/div[2]/div[4]/div/div[2]/div[2]/div/div/div/a[1]/div"));
		hotelButton.click();

		((JavascriptExecutor)(cd)).executeScript("window.scroll(0,400)");
		WebElement destination = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div/div/div[2]/div/div[1]/div[1]/div/div[1]/input"));
		ac.moveToElement(destination).click().perform();
		destination.sendKeys("Penang");

		Thread.sleep(2000);
		WebElement selectDestination = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div/div[2]/div/div[1]/div[2]/div/div/div/div[1]/div[2]/div/div/div[1]/div[1]/span"));
		selectDestination.click();

		WebElement checkIn = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div/div[2]/div/div[3]/div[1]/div/div[1]/div/div[1]/input"));
		checkIn.click();

		Thread.sleep(2000);
		WebElement checkInDay = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div/div[2]/div/div[3]/div[1]/div/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div[3]/div[16]/div/div[2]/div[2]/div"));
		checkInDay.click();
		if (checkInDay.isEnabled() == false) {
			checkInDay = cd.findElement(By.xpath("div#__next > div:nth-of-type(4) > div:nth-of-type(2) > div > div:nth-of-type(2) > div > div:nth-of-type(3) > div > div > div:nth-of-type(2) > div > div > div > div > div > div:nth-of-type(2) > div > div > div:nth-of-type(3) > div:nth-of-type(16) > div > div:nth-of-type(2) > div:nth-of-type(2) > div"));
			checkInDay.click();
		}

		WebElement duration = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div/div[2]/div/div[3]/div[2]/div/div[1]/div/div[1]/input"));
		duration.click();

		WebElement selectDuration = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div/div[2]/div/div[3]/div[2]/div/div[2]/div/div/div/div[1]/div/div[2]/div[1]"));
		selectDuration.click();

		WebElement room = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div/div[2]/div/div[5]/div[1]/div/div[1]/div[1]/div/div[1]/input"));
		room.click();

		WebElement confirmRoom = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div/div[2]/div/div[5]/div[1]/div/div[1]/div[2]/div/div/div[3]/div/div"));
		confirmRoom.click();

		WebElement searchHotel = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[2]/div/div[2]/div/div[5]/div[2]/div"));
		searchHotel.click();

		((JavascriptExecutor) (cd)).executeScript("window.scroll(0,400)");
		WebElement firstHotel = cd.findElement(By.xpath("//*[@id=\"desktopContentV3\"]/div[1]/div[2]/div[2]/div[3]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
		firstHotel.click();

		Set<String> windowHandles = cd.getWindowHandles();
		WebDriver.TargetLocator targetLocator = cd.switchTo();
		String handle = "";
		for (String windowHandle : windowHandles) {
			handle = windowHandle;
		}
		targetLocator.window(handle);
//		fd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		((JavascriptExecutor)(cd)).executeScript("window.scroll(0,600)");
		WebElement selectRoom = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[1]/div/div[3]/div/div[1]/div/div[7]/div[5]/div[5]"));
		selectRoom.click();
		
		WebElement bookNow = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/div[1]/div/div[8]/div[3]/div[1]/div/div[2]/div/div[3]/div/div/div/div/div/div/div[2]/div[2]/div[2]"));
		bookNow.click();
		
		Thread.sleep(1000);
		((JavascriptExecutor)(cd)).executeScript("window.scroll(0,850)");
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement inputContactName = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")); 
		inputContactName.sendKeys("Test Name");
		
		((JavascriptExecutor)(cd)).executeScript("window.scroll(0,350)");
		
		WebElement phone = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]")); 
		ac.moveToElement(phone).click().perform();
		phone.sendKeys("123456789");
		
		WebElement email = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")); 
		ac.moveToElement(email).click().perform();
		email.sendKeys("testmail@gmail.com");
		
		WebElement selectGuest = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]")); 
		selectGuest.click();
		
		Thread.sleep(2000);
		WebElement continueToReview = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div[1]/div[3]/div[1]/div[7]/div[1]/div[2]/div[1]/div[2]/div[1]")); 
		continueToReview.click();
		
		WebDriverWait wait = new WebDriverWait(cd, 60);
		WebElement message = wait .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/div[2]/div")));
		String str = message.getText();
		Assert.assertTrue(str.contains("Yes, all is correct."));
		System.out.print("ta05_10_bookingHotel is complete");
	}
	
	@Test
	public void ta04_30_undoRemoveCollection() throws InterruptedException {
		String URL = "https://www.traveloka.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\chromedriver\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get(URL);
		Thread.sleep(100000); //100 seconds for user to login
		
		WebElement saveButton = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div[2]/div[1]/a[3]/div[2]"));
		saveButton.click();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement collection = cd.findElement(
				By.xpath("/html/body/div[1]/div[3]/div/div[1]/div[2]/div/div[5]/div/div/div[1]/div/div/div[2]/h3"));
		collection.click();

		WebElement filledBookmarkButton = cd.findElement(By.xpath(
				"/html/body/div[1]/div[3]/div/div[1]/div/div[2]/div/div/div/div/div/div[1]/div/div[3]/div/div/img"));
		filledBookmarkButton.click();
		
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement removeFromCollection = cd
				.findElement(By.xpath("/html/body/div[9]/div/div[2]/div/div[2]/div[2]/div[2]/div"));
		removeFromCollection.click();
		
		WebDriverWait wait = new WebDriverWait(cd, 60);
		WebElement undo = wait .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div/div/div")));
		undo.click();

	}
	
	@Test
	public void ta04_20_removeFromCollection() throws InterruptedException {
		String URL = "https://www.traveloka.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\chromedriver\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get(URL);
		Thread.sleep(100000); //100 seconds for user to login
		
		WebElement saveButton = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div[2]/div[1]/a[3]/div[2]"));
		saveButton.click();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement collection = cd.findElement(
				By.xpath("/html/body/div[1]/div[3]/div/div[1]/div[2]/div/div[5]/div/div/div[1]/div/div/div[2]/h3"));
		collection.click();

		WebElement filledBookmarkButton = cd.findElement(By.xpath(
				"/html/body/div[1]/div[3]/div/div[1]/div/div[2]/div/div/div/div/div/div[1]/div/div[3]/div/div/img"));
		filledBookmarkButton.click();
		
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement removeFromCollection = cd
				.findElement(By.xpath("/html/body/div[9]/div/div[2]/div/div[2]/div[3]/div[2]/div"));
		removeFromCollection.click();

	}

	@Test
	public void ta04_10_removeCollectionFromEntireList() throws InterruptedException {
		String URL = "https://www.traveloka.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\chromedriver\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get(URL);
		Thread.sleep(100000); //100 seconds for user to login
		
		WebElement saveButton = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div[2]/div[1]/a[3]/div[2]"));
		saveButton.click();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement collection = cd.findElement(
				By.xpath("/html/body/div[1]/div[3]/div/div[1]/div[2]/div/div[5]/div/div/div[1]/div/div/div[2]/h3"));
		collection.click();

		WebElement filledBookmarkButton = cd.findElement(By.xpath(
				"/html/body/div[1]/div[3]/div/div[1]/div/div[2]/div/div/div/div/div/div[1]/div/div[3]/div/div/img"));
		filledBookmarkButton.click();
		
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement removeFromEntireList = cd
				.findElement(By.xpath("/html/body/div[9]/div/div[2]/div/div[2]/div[2]/div[2]/div"));
		removeFromEntireList.click();
	}

	@Test
	public void ta08_10_logout() throws InterruptedException {
		String URL = "https://www.traveloka.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\chromedriver\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get(URL);
		
		Thread.sleep(100000); //100 seconds for user to login
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		cd.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div[2]/div[3]/div[1]/div[1]/div[1]")).click();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		cd.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/a[9]/div[1]")).click();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		cd.findElement(By.xpath("//*[@id=\"tvat-myacc-logout\"]/div[1]/div")).click();

		WebDriverWait wait = new WebDriverWait(cd, 60);
		WebElement yesbutton = wait .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div[3]/div[2]/div")));
		yesbutton.click();

	}
	
	public ChromeOptions driverSetting() {
		// browser setting to disable image
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.managed_default_content_settings.images", 2);
		// adding capabilities to browser
		ChromeOptions op = new ChromeOptions();
		op.setExperimentalOption("prefs", prefs);
		return op;
	}

	
}
