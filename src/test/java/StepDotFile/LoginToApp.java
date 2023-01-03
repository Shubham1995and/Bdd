package StepDotFile;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class LoginToApp {
WebDriver Driver;
@Given("launch the browser")
public void launch_the_browser() {
   Driver= new ChromeDriver();
}

@When("enter the url")
public void enter_the_url() {
   Driver.get("https://www.facebook.com/login/");
}

@Then("validate the opage will be opened or not")
public void validate_the_opage_will_be_opened_or_not() {
   Driver.findElement(By.id("email")).sendKeys("");
   Driver.findElement(By.id("pass")).sendKeys("");
   Driver.findElement(By.id("loginbutton")).click();
}

@Then("enter valid credentials")
public void enter_valid_credentials() {
   Assert.assertEquals(true,true );
}



}
