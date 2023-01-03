package StepDotFile;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;
import net.bytebuddy.asm.Advice.Enter;

//public class GOIBIBOdataProvider {
//	WebDriver driver;
//	@When("launch the browser with")
//	public void launch_the_browser_with() {
//		driver=new ChromeDriver();
//	}
//
//	@Then("enter the url")
//	public void enter_the_url() {
//		driver.get("https://www.goibibo.com");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		driver.manage().window().maximize();
//	}
//
//	@Then("enter starting point {string}")
//	public void enter_starting_point(String start) throws InterruptedException, AWTException {
//		String from=start;
//		driver.findElement(By.xpath("//p[@class='sc-jlwm9r-1 dRQhOp']")).click();
//		driver.findElement(By.xpath("(//p[text()='Enter city or airport'])[1]")).click();
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(from);
//		Thread.sleep(2000);
//		Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//	}
////	}
//	@Then("enter the dest {string}")
//	public void enter_the_dest(String dest) throws AWTException {
//		//String tocity="mumbai";
//		//driver.findElement(By.xpath("(//div[@class='sc-ksdxgE dvdvQX fswFld '])[2]")).click();
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(dest);
//		//List<WebElement> all1 = driver.findElements(By.xpath("//ul[@id='autoSuggest-list']/li//span[@class='autoCompleteTitle ']"));
//		Actions action=new Actions(driver);
//		action.sendKeys(Keys.ENTER).perform();
//		
//	}
//}
//	@Then("enter the seat {int}")
//	public void enter_the_seat(int seat) {
//		System.out.println(seat);
//	}
//}
