package Project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.IOException;
import java.time.Duration;


public class Gtplbanking1 {


	public static void main(String[] args) throws InterruptedException , IOException{

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/V1/html/deleteAccountInput.php#google_vignette");
		driver.manage().window().maximize();


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


		//MANAGER MODULE
		WebElement Mgr = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[1]/a"));
		Mgr.click();





		//NEW CUSTOMER MODULE
		WebElement newcust = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a"));
		newcust.click();

		WebElement Custnme = driver.findElement(By.xpath("//input[@maxlength='25']"));
		Custnme.sendKeys("Prathik RB");	
		driver.findElement(By.xpath("//input[@type='radio']")).click(); 
		WebElement DoB = driver.findElement(By.xpath("//input[@id='dob']"));
		DoB.sendKeys("09/11/2001");
		WebElement Adrss = driver.findElement(By.xpath("//textarea[@cols='20']"));
		Adrss.sendKeys(" BTM 1st Stage AXA Building Banglore ");
		WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
		city.sendKeys("Banglore");
		WebElement State = driver.findElement(By.xpath("//input[@name='state']"));
		State.sendKeys("Karnataka");
		WebElement pincde = driver.findElement(By.xpath("//input[@name='pinno']"));
		pincde.sendKeys("577001");
		WebElement telphn = driver.findElement(By.xpath("//input[@name='telephoneno']"));
		telphn.sendKeys("123456789");
		WebElement Email = driver.findElement(By.xpath("//input[@name='emailid']"));
		Email.sendKeys("prathikprince15@gmail.com");
		driver.findElement(By.xpath("//input[@value='Submit']")).click(); 
		Thread.sleep(1000);

		Alert alert = driver.switchTo().alert();
		alert.accept(); 
		Thread.sleep(1000);

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,-300)"); 





		// New Account Module

		WebElement NewAcc = driver.findElement(By.cssSelector("body > div:nth-child(3) > div > ul > li:nth-child(5) > a"));
		NewAcc.click();

		WebElement Custid = driver.findElement(By.xpath("//input[@onblur='validatecustomerid();']"));
		Custid.sendKeys("12345");
		WebElement Acctype = driver.findElement(By.xpath("//select[@style='width:175px']"));
		Acctype.click();
		Select S1 = new Select(Acctype);
		S1.selectByValue("savings");
		WebElement intidespt =driver.findElement(By.xpath("//input[@name='inideposit']"));
		intidespt.sendKeys("25000");
		WebElement Sbmt = driver.findElement(By.xpath("//input[@value='submit']"));
		Sbmt.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement error = driver.findElement(By.xpath("//div[@class='error-code']"));
		String Text = error.getText();
		System.out.println(Text);
		driver.navigate().back();
		Thread.sleep(1000);





		//Edit Customer  Module

		WebElement EdtCust = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[3]/a"));
		EdtCust.click();

		WebElement Cusmtid  =driver.findElement(By.xpath("//input[@maxlength='10']"));
		Cusmtid.sendKeys("12345");
		driver.findElement(By.xpath("//input[@name='AccSubmit']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);





		//Edit Account Module

		WebElement EdtAcc = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[6]/a"));
		EdtAcc.click();

		WebElement Accn01 = driver.findElement(By.xpath("//input[@type='text']"));
		Accn01.sendKeys("12345");
		driver.findElement(By.xpath("//input[@name='AccSubmit']")).click();
		Thread.sleep(1000);
		driver.navigate().back();





		//Delete Customer

		WebElement Deltid = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[4]/a"));
		Deltid.click();

		WebElement Accn0 = driver.findElement(By.xpath("//input[@name='cusid']"));
		Accn0.sendKeys("12345");
		driver.findElement(By.xpath("//input[@style='margin-left:5px;']")).click();
		Thread.sleep(1000);
		driver.navigate().back();





		//Delete Account

		WebElement DelAcc = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[7]/a"));
		DelAcc.click();

		WebElement Accn012 = driver.findElement(By.xpath("//input[@onkeyup='validateaccountno();']"));
		Accn012.sendKeys("12345");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		Thread.sleep(1000);
		driver.navigate().back();





		//Mine Statement

		WebElement MiniAcc = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[8]/a"));
		MiniAcc.click();

		WebElement Accn12 = driver.findElement(By.xpath("//input[@maxlength='10']"));
		Accn12.sendKeys("12345");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
		driver.navigate().back();





		//Customized Statement

		WebElement  CustStmt = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[9]/a"));
		CustStmt.click();	

		WebElement Accoo1 = driver.findElement(By.xpath("//input[@name='accountno']"));
		Accoo1.sendKeys("12345");
		WebElement date1 = driver.findElement(By.xpath("//input[@name='fdate']"));
		date1.sendKeys("15/03/2001");
		WebElement date2 = driver.findElement(By.xpath("//input[@name='tdate']"));
		date2.sendKeys("15/03/2025");
		WebElement Acclwmt = driver.findElement(By.xpath("//input[@name='loweramt']"));
		Acclwmt.sendKeys("1000");
		WebElement Notrans = driver.findElement(By.xpath("//input[@name='tranno']"));
		Notrans.sendKeys("25");
		driver.findElement(By.xpath("//input[@name='AccSubmit']")).click();
		Thread.sleep(1000);
		driver.navigate().back();


		
		
		
		//Logout

		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[10]/a")).click();
	}
}























