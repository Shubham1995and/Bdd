package StepDotFile;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class table {
	WebDriver driver;
	@Given("launch the browaser")
	public void launch_the_browaser() {
	   driver=new ChromeDriver();
	}

	@Then("enter url")
	public void enter_url() {
		driver.get("http://localhost:8888/");
	}

//	@Then("enter user name and browser")
//	public void enter_user_name_and_browser(DataTable dataTable) {
//	  List<List<String>> data = dataTable.asLists();
//	 String value1 = data.get(0).get(0);
//	 String value2 = data.get(0).get(1);
//	 driver.findElement(By.name("user_name")).sendKeys(value1);
//	 driver.findElement(By.name("user_password")).sendKeys(value2);
//	}
//
//	@Then("click on login button")
//	public void click_on_login_button() {
//	  System.out.println("click on login");
//	  driver.findElement(By.id("submitButton")).click();
//	}

}
