package group9;

import java.time.Duration;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tanyiqing {
	@Test
	public void ta01_10_testRegisterUsingHP() { //DONE //TA01.10      
		String URL = "https://www.traveloka.com";
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Documents\\geckodriver\\geckodriver.exe");
		FirefoxDriver fd = new FirefoxDriver();
		fd.get(URL);
		fd.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div[4]")).click(); //Click Register button
		Select dropdown = new Select(fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[5]/div[1]/div/select"))); //Click dropdown button
		dropdown.selectByVisibleText("Malaysia (+60)"); //Select Malaysia Number
		fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[5]/div[1]/div/div[2]/input")).sendKeys("103373137"); //Input Number
		fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[5]/div[2]/div/div[2]")).click(); //Click Join

		fd.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[2]/div/div[1]/div[1]/input")).sendKeys("test"); //Input Name
		fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[2]/div/div[3]/div[1]/input")).sendKeys("testpassword"); //Input Password
		fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[2]/div/div[5]/div[1]/input")).sendKeys("testpassword"); //Input Confirm Password
		
		WebDriverWait wait = new WebDriverWait(fd, 60);
		WebElement message = wait .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[1]")));
		String str = message.getText();
		Assert.assertTrue(str.contains("One more step to become a Traveloka member. Please enter your full name and password to log in."));
		System.out.print("ta01_10_testRegisterUsingHP is complete");
	}
	
	@Test
	public void ta01_20_testRegisterUsingInvalidHP(){ //DONE //TA01.20
		String URL = "https://www.traveloka.com";
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Documents\\geckodriver\\geckodriver.exe");
		FirefoxDriver fd = new FirefoxDriver();
		fd.manage().window().maximize();
		fd.get(URL);
		fd.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div[4]")).click(); //Click Register button
		fd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		Select dropdown = new Select(fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[5]/div[1]/div/select"))); //Click dropdown button
		dropdown.selectByVisibleText("Malaysia (+60)"); //Select Malaysia Number
		fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[5]/div[1]/div/div[2]/input")).sendKeys("test"); //Input wrong phone number format
		fd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[5]/div[2]/div")).click(); //Click Join
	}
	
	@Test
	public void ta01_30_testRegisterUsingEmail(){ //DONE //TA01.30
		String URL = "https://www.traveloka.com";
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Documents\\geckodriver\\geckodriver.exe");
		FirefoxDriver fd = new FirefoxDriver();
		fd.get(URL);
		fd.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div[4]")).click(); //Click Register button
		fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[3]/div/div/div")).click(); //Click Use Email Button
		fd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[5]/div[1]/div/input")).sendKeys("softwaretesting1999@gmail.com"); //Input email
		fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[5]/div[2]/div")).click(); //Click Join button
		WebDriverWait wait = new WebDriverWait(fd, 60);
		fd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));  // Time waiting to key in TAC code manually
		WebElement submit = wait .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[2]/div/div[1]/div[2]/div"))); 
		fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[2]/div/div[1]/div[2]/div")).click();//Click submit button
		fd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[2]/div/div[1]/div[1]/input")).sendKeys("test"); //Input Name
		fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[2]/div/div[3]/div[1]/input")).sendKeys("testpassword"); //Input Password
		fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[2]/div/div[5]/div[1]/input")).sendKeys("testpassword"); //Input Confirm Password
//		fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[2]/div/div[7]")).click(); //Click Done button
		
		WebElement errormessage = wait .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[2]/div/div[1]/label/div")));
		String str = errormessage.getText();
		Assert.assertTrue(str.contains("Full Name"));
		System.out.print("ta01_30_testRegisterUsingEmail is complete");
	}
	
	@Test
	public void ta01_40_testRegisterUsingInvalidEmail() { //DONE //TA01.40 
		String URL = "https://www.traveloka.com";
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Documents\\geckodriver\\geckodriver.exe");
		FirefoxDriver fd = new FirefoxDriver();
		fd.get(URL);
		fd.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div[4]")).click(); // Click Register
		fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[3]/div/div/div")).click(); //Click use email button
		fd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[5]/div[1]/div/input")).sendKeys("0123456789"); //Input invalid email format
		fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[5]/div[2]/div")).click(); // Click join
	}
	
	@Test
	public void ta01_50_testRegisterWithoutInsertFullName() { //DONE //TA01.50
		String URL = "https://www.traveloka.com";
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Documents\\geckodriver\\geckodriver.exe");
		FirefoxDriver fd = new FirefoxDriver();
		fd.get(URL);
		fd.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div[4]")).click();// Click Register button
		fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[3]/div/div/div")).click(); //Click use email button
		fd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[5]/div[1]/div/input")).sendKeys("softwaretesting1999@gmail.com"); //Input email
		fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[5]/div[2]/div")).click(); //Click Join button
		WebDriverWait wait = new WebDriverWait(fd, 60);
		fd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // Wait user to input TAC code manually
		WebElement submit = wait .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[2]/div/div[1]/div[2]/div")));
		fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[2]/div/div[1]/div[2]/div")).click(); // Click submit button
		fd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[2]/div/div[3]/div[1]/input")).sendKeys("testpassword"); // Input password
		fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[2]/div/div[5]/div[1]/input")).sendKeys("testpassword"); // Input conform password
		fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[2]/div/div[7]")).click(); // Click Done button
	
		WebElement errormessage = wait .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[2]/div/div[1]/div[2]/div/div")));
		String str = errormessage.getText();
		Assert.assertTrue(str.contains("This section must be filled."));
		System.out.print("ta01_50_testRegisterWithoutInsertFullName is complete");
	}
	
	@Test
	public void ta01_60_testRegisterWithoutInsertPassword() { //DONE //TA01.60
		String URL = "https://www.traveloka.com";
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Documents\\geckodriver\\geckodriver.exe");
		FirefoxDriver fd = new FirefoxDriver();
		fd.get(URL);
		fd.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div[4]")).click(); // Click Register button
		fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[3]/div/div/div")).click(); // Click use email button
		fd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[5]/div[1]/div/input")).sendKeys("softwaretesting1999@gmail.com"); // Input email
		fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[1]/div/div[5]/div[2]/div")).click();
		WebDriverWait wait = new WebDriverWait(fd, 60);
		fd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // Wait user to input TAC code manually
		WebElement submit = wait .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[2]/div/div[1]/div[2]/div")));
		fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[2]/div/div[1]/div[2]/div")).click(); // Click submit button
		fd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[2]/div/div[1]/div[1]/input")).sendKeys("test"); // Input name
		fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[2]/div/div[7]")).click(); // Click Done button
	
		WebElement errormessage = wait .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[3]/div[1]/div[2]/div/div[3]/div[2]/div/div")));
		String str = errormessage.getText();
		Assert.assertTrue(str.contains("This section must be filled."));
		System.out.print("ta01_60_testRegisterWithoutInsertPassword is complete");
	}
	
	@Test
	public void ta06_10_testSearchActivitiesByAttraction() { //DONE //TA06.10 	
		String URL = "https://www.traveloka.com"; 
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Documents\\geckodriver\\geckodriver.exe");
		FirefoxDriver fd = new FirefoxDriver();
		Actions a = new Actions(fd);
		fd.get(URL);
		WebElement mainmenu = fd.findElement(By.xpath("/html/body/div[1]/div[2]/div[4]/div/div[3]/div[1]/div/div")); // Click Things to do button
		a.moveToElement(mainmenu).click().perform();
		fd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement submenu = fd.findElement(By.xpath("/html/body/div[1]/div[2]/div[4]/div/div[3]/div[2]/div/div/div/a/div")); 
		submenu.click();//Click Xperience button
		fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/div/div[3]/div/div[2]/div/div/div/div[1]/input")).click(); // CLick on search bar
		fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/div/div[3]/div/div[2]/div[2]/div[1]/div/div[1]/input")).sendKeys("Malaysia"); //Input Malaysia word
		fd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement resultmenu = fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div/div[2]/div/div[1]/div/div[2]/h4/h4"));
		resultmenu.click(); // Click on result
		fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[1]/div/div[2]/div/div[1]/div/div[1]/a/div[1]/div/div/img")).click(); // Click Attraction button
		
		WebDriverWait wait = new WebDriverWait(fd, 60);
		WebElement errormessage = wait .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div/div[1]/div[2]")));
		String str = errormessage.getText();
		Assert.assertTrue(str.contains("All Results for Malaysia"));
		System.out.print("ta06_10_testSearchActivitiesByAttraction is complete");
	}
	
	@Test
	public void ta06_20_testSearchActivitiesByTours() { //DONE //TA06.20 
		String URL = "https://www.traveloka.com";
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Documents\\geckodriver\\geckodriver.exe");
		FirefoxDriver fd = new FirefoxDriver();
		Actions a = new Actions(fd);
		fd.get(URL);
		WebElement mainmenu = fd.findElement(By.xpath("/html/body/div[1]/div[2]/div[4]/div/div[3]/div[1]/div/div")); // Click Things to do button
		a.moveToElement(mainmenu).click().perform();
		fd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
		WebElement submenu = fd.findElement(By.xpath("/html/body/div[1]/div[2]/div[4]/div/div[3]/div[2]/div/div/div/a/div"));
		submenu.click();// Click Xperience button
		fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/div/div[3]/div/div[2]/div/div/div/div[1]/input")).click(); // Click search bar
		fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/div/div[3]/div/div[2]/div[2]/div[1]/div/div[1]/input")).sendKeys("Malaysia"); // Input Malaysia word
		fd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement resultmenu = fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div/div[2]/div/div[1]/div/div[2]/h4/h4"));
		resultmenu.click(); // Click result
		fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[1]/div/div[2]/div/div[1]/div/div[2]/a/div[1]/div/div/img")).click(); // Click tour button
		
		WebDriverWait wait = new WebDriverWait(fd, 60);
		WebElement errormessage = wait .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div/div[1]/div[2]")));
		String str = errormessage.getText();
		Assert.assertTrue(str.contains("All Results for Malaysia"));
		System.out.print("ta06_20_testSearchActivitiesByTours is complete");
	}
	
	@Test
	public void ta06_30_testSearchActivitiesWithoutExistingItem() throws InterruptedException { //DONE //TA06.30 	
		String URL = "https://www.traveloka.com";
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Documents\\geckodriver\\geckodriver.exe");
		FirefoxDriver fd = new FirefoxDriver();
		Actions a = new Actions(fd);
		fd.get(URL);
		WebElement mainmenu = fd.findElement(By.xpath("/html/body/div[1]/div[2]/div[4]/div/div[3]/div[1]/div/div")); // Click things to do button
		fd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		a.moveToElement(mainmenu).click().perform();
		fd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement submenu = fd.findElement(By.xpath("/html/body/div[1]/div[2]/div[4]/div/div[3]/div[2]/div/div/div/a/div"));
		submenu.click(); // Click Xperience button
		fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/div/div[3]/div/div[2]/div/div/div/div[1]/input")).click(); //Click search bar
		fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/div/div[3]/div/div[2]/div[2]/div[1]/div/div[1]/input")).sendKeys("12345"); // Input non existing button
		Thread.sleep(5000);
		
		WebDriverWait wait = new WebDriverWait(fd, 60);
		WebElement errormessage = wait .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div[4]/div[1]/div/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div/div/div[2]/span[1]")));
		String str = errormessage.getText();
		Assert.assertTrue(str.contains("Welp, We Found No Results for"));
		System.out.print("ta06_30_testSearchActivitiesWithoutExistingItem is complete");
	}
	
	@Test
	public void ta06_40_testSearchActivitiesWithExistingItem() { //DONE //TA06.40 	
		String URL = "https://www.traveloka.com";
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Documents\\geckodriver\\geckodriver.exe");
		FirefoxDriver fd = new FirefoxDriver();
		Actions a = new Actions(fd);
		fd.manage().window().maximize();
		fd.get(URL);
		WebElement mainmenu = fd.findElement(By.xpath("/html/body/div[1]/div[2]/div[4]/div/div[3]/div[1]/div/div"));
		a.moveToElement(mainmenu).click().perform(); // Click things to do button
		fd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		WebElement submenu = fd.findElement(By.xpath("/html/body/div[1]/div[2]/div[4]/div/div[3]/div[2]/div/div/div/a/div"));
		submenu.click(); // Click Xperience button
		fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/div/div[3]/div/div[2]/div/div/div/div[1]/input")).click();// Click search bar
		fd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/div/div[3]/div/div[2]/div[2]/div[1]/div/div[1]/input")).sendKeys("Kuala Lumpur"); //Input Kuala Lumpur
		fd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement resultmenu = fd.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div/div[2]/h4/h4"));
		resultmenu.click(); // Click result
		
		WebDriverWait wait = new WebDriverWait(fd, 60);
		WebElement errormessage = wait .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[1]/h2")));
		String str = errormessage.getText();
		Assert.assertTrue(str.contains("About Kuala Lumpur"));
		System.out.print("ta06_40_testSearchActivitiesWithExistingItem is complete");
	}

	@Test
	public void ta07_10_testPaymentwithInvalidCard() { //DONE //TA07.10 	
		String URL = "https://www.traveloka.com/en-my/flight/fullsearch?ap=XKLA.SIN&dt=14-2-2022.NA&ps=1.0.0&sc=ECONOMY";
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Documents\\geckodriver\\geckodriver.exe");
		FirefoxDriver fd = new FirefoxDriver();
		Actions a = new Actions(fd);
		fd.manage().window().maximize();
		fd.get(URL);
		fd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		fd.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[7]/div/div/div/div[1]/div/div/div[1]/div/div[2]/div[2]")).click(); // Choose plane
		fd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		fd.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div/button")).click(); // Click continue to booking
		fd.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div/div[2]/div/div/div/div/div[2]/div/div/div/div/div[1]/div[1]/div[1]/div/div/div/div[1]/div[1]/label/div/div/div/div/input")).sendKeys("Test Name"); //Input name
		fd.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div/div[2]/div/div/div/div/div[2]/div/div/div/div/div[1]/div[1]/div[2]/div/div/div/div[1]/div[1]/label/div/div/div/div/input")).sendKeys("Test Family Name"); //Input family name
		fd.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div/div[2]/div/div/div/div/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[2]/div/label/div/div/div/div/input")).sendKeys("123456789"); // Input phone number
		fd.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div/div[2]/div/div/div/div/div[2]/div/div/div/div/div[3]/div/div[1]/div[1]/label/div/div/div/div/input")).sendKeys("testmail@gmail.com");	 // Input email
		fd.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div/div[3]/div/div/div/div/div/div/div[2]/div/div/div/div/div[3]/div/div[1]/div[1]/label/div/div/div/div/input")).click(); //Click title
		fd.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div/div[3]/div/div/div/div/div/div/div[2]/div/div/div/div/div[3]/div/div[1]/div[2]/div/div/div[1]/div/div")).click(); //Selec Mr. as title
		fd.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div/div[3]/div/div/div/div/div/div/div[2]/div/div/div/div/div[4]/div[1]/div[1]/div/div/div/div[1]/div[1]/label/div/div/div/div/input")).sendKeys("Test Name"); // Input name
		fd.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div/div[3]/div/div/div/div/div/div/div[2]/div/div/div/div/div[4]/div[1]/div[2]/div/div/div/div[1]/div[1]/label/div/div/div/div/input")).sendKeys("Test Family Name"); // Input family name
		fd.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div/div[3]/div/div/div/div/div/div/div[2]/div/div/div/div/div[5]/div/div[1]/div[1]/div/div[1]/label/div/div/div/div/input")).click(); //Click day
		fd.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div/div[3]/div/div/div/div/div/div/div[2]/div/div/div/div/div[5]/div/div[1]/div[1]/div/div[1]/label/div/div/div/div/input")).sendKeys("14"); // Input 14
		fd.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div/div[3]/div/div/div/div/div/div/div[2]/div/div/div/div/div[5]/div/div[1]/div[1]/div/div[1]/label/div/div/div/div/input")).sendKeys(Keys.RETURN); //Press enter button
		fd.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div/div[3]/div/div/div/div/div/div/div[2]/div/div/div/div/div[5]/div/div[1]/div[2]/div/div[1]/label/div/div/div/div/input")).click(); // Click month
		fd.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div/div[3]/div/div/div/div/div/div/div[2]/div/div/div/div/div[5]/div/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div/div/span")).click(); // Click February
		fd.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div/div[3]/div/div/div/div/div/div/div[2]/div/div/div/div/div[5]/div/div[1]/div[3]/div/div[1]/label/div/div/div/div/input")).sendKeys("1999"); // Input 1999 as year
		fd.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div/div[3]/div/div/div/div/div/div/div[2]/div/div/div/div/div[5]/div/div[1]/div[3]/div/div[1]/label/div/div/div/div/input")).sendKeys(Keys.RETURN); // Press enter
		fd.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div/div[4]/button")).click(); //Click continue
		fd.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[1]/div/div/div/div/div/div/div[2]/button[2]")).click(); //Click Yes
		fd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		((JavascriptExecutor)(fd)).executeScript("window.scroll(0,500)");
		WebDriverWait wait = new WebDriverWait(fd, 60);
		WebElement element = wait .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div/div[4]/div/div[4]/button")));
		fd.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[1]/div/div/div/div/div/div/div[2]/button[2]")).click(); // Click Yes,continue to payment
		fd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));		
		
		WebElement errormessage = wait .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div[1]/div[2]/div/div[2]/div/div[1]/h4")));
		String str = errormessage.getText();
		Assert.assertTrue(str.contains("Credit/Debit Card"));
		System.out.print("ta07_10_testPaymentwithInvalidCard is complete");
		
	}
}
