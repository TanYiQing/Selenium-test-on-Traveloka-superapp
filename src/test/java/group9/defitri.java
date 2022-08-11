package group9;

import java.time.Duration;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class defitri {
	@Test
	public void ta02_10_loginwithValidAccount() { //DONE //TA02.10
		String URL = "https://www.traveloka.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\chromedriver\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.get(URL);
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		cd.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div[2]/div[3]/div[1]/div/img[2]")).click(); // Click Log In button
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		cd.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("yiqingtan9991@gmail.com"); //Input email
		cd.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("softwaretesting1"); // password
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		cd.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div[2]/div[3]/div[2]/div/div/div/div[1]/div[3]/div[1]")).click(); // Click Log In button
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		cd.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div[2]/div/a/div")).click(); // Click email
		WebDriverWait wait = new WebDriverWait(cd, 60); //wait for user to input TAC code manually
		WebElement submit = wait .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[8]/div/div[2]/div/div[2]/div/a/div/div[1]/img")));
		cd.findElement(By.xpath("/html/body/div[8]/div/div[2]/div/div[2]/div/a/div/div[1]/img")).click(); // Click submit button
		WebDriverWait wait1 = new WebDriverWait(cd, 60);
		WebElement verify = wait .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[8]/div/div[2]/div/div/div[3]/div[2]")));
		
	}
	
	@Test
	public void ta02_20_loginwithInvalidEmail() { //DONE //TA02.20
		String URL = "https://www.traveloka.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\chromedriver\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.get(URL);
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		cd.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div[2]/div[3]/div[1]/div/img[2]")).click(); // Click Log in button
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		cd.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("123456"); // Input username
		cd.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("softwaretesting"); // Input password
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		cd.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div[2]/div[3]/div[2]/div/div/div/div[1]/div[3]/div[1]")).click(); //Click Log In button

	}
	
	@Test
	public void ta02_30_loginwithInvalidHP() { //DONE //TA02.30
		String URL = "https://www.traveloka.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\chromedriver\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.get(URL);
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		cd.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div[2]/div[3]/div[1]/div/img[2]")).click(); // Click Login button
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		cd.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("0134201251112"); //Input invalid Phone number
		cd.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("softwaretesting"); //Input password
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(60)); 
		cd.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div[2]/div[3]/div[2]/div/div/div/div[1]/div[3]/div[1]")).click(); //Click login button
	}
	
	@Test
	public void ta02_40_loginwithInvalidPassword() { //DONE //TA02.40
		String URL = "https://www.traveloka.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\chromedriver\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.get(URL);
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		cd.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div[2]/div[3]/div[1]/div/img[2]")).click(); // Click Login button
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		cd.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("yiqingtan9991@gmail.com"); // Input email
		cd.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("1234"); //Input invalid password
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		cd.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div[2]/div[3]/div[2]/div/div/div/div[1]/div[3]/div[1]")).click(); // Click login button
	}
	
	@Test
	public void ta02_50_resetPasswordUsingValidEmail() { //DONE //TA02.50
		String URL = "https://www.traveloka.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\chromedriver\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.get(URL);
		cd.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div[3]/div[1]/div/div")).click(); // Click Login button
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		cd.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div[3]/div[2]/div/div/div/div[1]/div[2]/a")).click(); //Click forgot password
		cd.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div/div[2]/div/div[3]/div[1]/div[2]/div[1]/div[1]/input")).sendKeys("yiqingtan9991@gmail.com"); //Input email
		cd.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div/div[2]/div/div[3]/div[1]/div[2]/div[2]/div[2]")).click(); //Click Submit button
		WebDriverWait wait = new WebDriverWait(cd, 60); //wait user to input TAC code manually
		WebElement submit = wait .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"__next\"]/div[4]/div/div[2]/div/div[3]/div[1]/div[2]/div/div[1]/div[2]")));
		cd.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div/div[2]/div/div[3]/div[1]/div[2]/div/div[1]/div[2]")).click(); // Click submit button
		cd.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div/div[2]/div/div[3]/div[1]/div/div/div[3]/div[1]/input")).sendKeys("softwaretesting1"); //Input password
		cd.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div/div[2]/div/div[3]/div[1]/div/div/div[5]/div[1]/input")).sendKeys("softwaretesting1"); //Input confirm password
		cd.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div/div[2]/div/div[3]/div[1]/div/div/div[9]")).click();	// Click done button
		
		WebElement errormessage = wait .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__next\"]/div[4]/div/div[2]/div/div[3]/div[1]/div/div/div[1]/span[1]")));
		String str = errormessage.getText();
		Assert.assertTrue(str.contains("Enter new password to access your account"));
		System.out.print("ta02_50_resetPasswordUsingValidEmail is complete");
	}
	
	@Test
	public void ta02_60_resetPasswordUsingInvalidEmail() { //DONE //TA02.60
		String URL = "https://www.traveloka.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\chromedriver\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.get(URL);
		cd.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div[3]/div[1]/div/div")).click(); // Click Login button
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		cd.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div[3]/div[2]/div/div/div/div[1]/div[2]/a")).click(); // Click forgot password
		cd.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div/div[2]/div/div[3]/div[1]/div[2]/div[1]/div[1]/input")).sendKeys("1234"); //Input Invalid email
		cd.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div/div[2]/div/div[3]/div[1]/div[2]/div[2]/div[2]")).click(); // Click Submit button
	
		WebDriverWait wait = new WebDriverWait(cd, 60);
		WebElement errormessage = wait .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div[3]/div[1]/div[2]/div[1]/div[2]/div/div")));
		String str = errormessage.getText();
		Assert.assertTrue(str.contains("Invalid email."));
		System.out.print("ta02_60_resetPasswordUsingInvalidEmail is complete");
	}
	
	@Test
	public void ta02_70_loginUsingGoogle() { //DONE //TA02.70
		String URL = "https://www.traveloka.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\chromedriver\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.get(URL);
		cd.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div[3]/div[1]/div/div")).click(); // Click login button 
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		cd.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div[2]/div[3]/div[2]/div/div/div/div[2]/div[2]/div/div[2]")).click(); // Click Google button
	}
	
	@Test
	public void ta02_80_loginUsingFacebook() { //DONE //TA02.80
		String URL = "https://www.traveloka.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\chromedriver\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.get(URL);
		cd.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div[3]/div[1]/div/div")).click(); // Click log in button
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		cd.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div[2]/div[3]/div[2]/div/div/div/div[2]/div[2]/div/div[1]")).click(); // Click facebook button
		for (String winHandle : cd.getWindowHandles()) {
		    cd.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
		}
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		cd.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("testing@gmail.com"); //Input email
		cd.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("testpassword"); //Input password
	}
	
	@Test
	public void ta03_10_saveHotel() throws InterruptedException { //DONE //TA03.10
		String URL = "https://www.traveloka.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\chromedriver\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get(URL);
		
		Thread.sleep(100000); //100 seconds for user to login
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(180));
		Actions ac = new Actions(cd);
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String oldTab = cd.getWindowHandle();
		ArrayList<String> newTab = new ArrayList<String>(cd.getWindowHandles());
		WebElement accommodationButton = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]"));
		accommodationButton.click(); // Click accommodation button

		WebElement hotelButton = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[4]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]"));
		hotelButton.click(); // Click hotel button
		
		((JavascriptExecutor)(cd)).executeScript("window.scroll(0,400)");
		WebElement destination = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		ac.moveToElement(destination).click().perform(); //Click destination textfield
		destination.sendKeys("Penang"); // Input penang

		Thread.sleep(2000);
		WebElement selectDestination = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]"));
		selectDestination.click(); // Choose Destination

		WebElement checkIn = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		checkIn.click(); //Click Check in date

		Thread.sleep(2000);
		WebElement checkInDay = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[16]/div[1]/div[2]/div[2]/div[1]"));
		checkInDay.click();  //Select day
		if (checkInDay.isEnabled() == false) {
			checkInDay = cd.findElement(By.xpath("div#__next > div:nth-of-type(4) > div:nth-of-type(2) > div > div:nth-of-type(2) > div > div:nth-of-type(3) > div > div > div:nth-of-type(2) > div > div > div > div > div > div:nth-of-type(2) > div > div > div:nth-of-type(3) > div:nth-of-type(16) > div > div:nth-of-type(2) > div:nth-of-type(2) > div"));
			checkInDay.click(); //Select day
		}

		WebElement duration = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		duration.click(); // Select duration button

		Thread.sleep(1000);
		WebElement selectDuration = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]"));
		selectDuration.click(); // Click number of duration

		WebElement room = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		room.click(); // Click room

		Thread.sleep(1000);
		WebElement confirmRoom = cd.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]"));
		confirmRoom.click(); //Click confirm room

		WebElement searchHotel = cd.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div/div[5]/div[2]/div/div[2]/div[2]"));
		searchHotel.click(); // Click Search hotel button
		((JavascriptExecutor) (cd)).executeScript("window.scroll(0,400)");
		WebElement firstHotel = cd.findElement(By.xpath("//*[@id=\"desktopContentV3\"]/div/div[1]/div[2]/div[3]/div[2]/div[3]/div[1]/div/div[1]/div[1]/div/div/div[1]/div/div[1]/div"));
		firstHotel.click(); // Click first hotel button
		String currentTab = cd.getWindowHandle();
		for (String tab : cd.getWindowHandles()) {
		    if (!tab.equals(currentTab)) {
		        cd.switchTo().window(tab); // Change tab
		    }       
		}

		((JavascriptExecutor) (cd)).executeScript("window.scroll(0,2000)");
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		cd.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/div[8]/div[2]/div/div[1]/div[2]/div[3]/div/div/img")).click(); //Click bookmark
		cd.findElement(By.xpath("/html/body/div[39]/div/div[2]/div/div[2]/div[2]/div/div")).click(); //Click Create Collection
		WebDriverWait wait = new WebDriverWait(cd, 60);
		WebElement collectionname = wait .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[40]/div/div[2]/div/div/div[1]/div[3]/div/div[2]/input")));
		collectionname.sendKeys("Holiday");
		cd.findElement(By.xpath("/html/body/div[40]/div/div[2]/div/div/div[2]/div/div[2]")).click();
	}
	
	@Test
	public void ta03_20_saveThingstoDo() throws InterruptedException { //*
		String URL = "https://www.traveloka.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\chromedriver\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get(URL);
		Actions a = new Actions(cd);
		
		Thread.sleep(100000); //100 seconds for user to login
		WebElement mainmenu = cd.findElement(By.xpath("/html/body/div[1]/div[2]/div[4]/div/div[3]/div[1]/div/div"));
		a.moveToElement(mainmenu).click().perform();// Click things to do button
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement submenu = cd.findElement(By.xpath("/html/body/div[1]/div[2]/div[4]/div/div[3]/div[2]/div/div/div/a/div"));
		submenu.click(); // Click Xperience button
		cd.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/div/div[3]/div/div[2]/div/div/div/div[1]/input")).click(); // Click search bar
		cd.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/div/div[3]/div/div[2]/div[2]/div[1]/div/div[1]/input")).sendKeys("Kuala Lumpur"); // Input Kuala Lumpur word
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement resultmenu = cd.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div/div[2]/h4/h4"));
		resultmenu.click(); //Click result
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		((JavascriptExecutor) (cd)).executeScript("window.scroll(0,1000)");
		cd.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div/div[1]/div/div[1]/a/div[1]/div/div/img")).click();//Click Mini Zoo
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		((JavascriptExecutor) (cd)).executeScript("window.scroll(0,400)");
		cd.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/div[2]/div/div[3]/div/div[2]/div[1]/div[2]/div/div/img")).click(); //Click book mark
		WebDriverWait wait = new WebDriverWait(cd, 60);
		WebElement collection = wait .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[10]/div/div[2]/div/div[2]/div[3]/div[1]/div/div/div[3]/div[1]")));
		collection.click();
	}
	
	@Test
	public void ta03_30_saveThingsTodoWithoutLogin() {
		String URL = "https://www.traveloka.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\chromedriver\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get(URL);
		Actions a = new Actions(cd);
		
		WebElement mainmenu = cd.findElement(By.xpath("/html/body/div[1]/div[2]/div[4]/div/div[3]/div[1]/div/div"));
		a.moveToElement(mainmenu).click().perform(); //Click Things to do button
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement submenu = cd.findElement(By.xpath("/html/body/div[1]/div[2]/div[4]/div/div[3]/div[2]/div/div/div/a/div"));
		submenu.click(); // Click Xperience button
		cd.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/div/div[3]/div/div[2]/div/div/div/div[1]/input")).click(); // Click search bar
		cd.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/div/div[3]/div/div[2]/div[2]/div[1]/div/div[1]/input")).sendKeys("Kuala Lumpur"); //Input Kuala Lumpur word
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement resultmenu = cd.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div/div[2]/h4/h4"));
		resultmenu.click(); //Click result
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		((JavascriptExecutor) (cd)).executeScript("window.scroll(0,1000)");
		cd.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div/div[1]/div/div[1]/a/div[1]/div/div/img")).click(); //Click mini zoo
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		((JavascriptExecutor) (cd)).executeScript("window.scroll(0,400)");
		cd.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/div[2]/div/div[3]/div/div[2]/div[1]/div[2]/div/div/img")).click(); //Click bookmark button
	
		WebDriverWait wait = new WebDriverWait(cd, 60);
		WebElement errormessage = wait .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[11]/div/div[2]/div/h2")));
		String str = errormessage.getText();
		Assert.assertTrue(str.contains("Login Required"));
		System.out.print("ta03_30_saveThingsTodoWithoutLogin is complete");
	}

}
