package StepDotFile;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class background {
	@Given("enter username2 {string}")
	public void enter_username2(String username) {
		 driver.findElement(By.name("user_name")).sendKeys(username);
	}

	@Then("enter password2 {string}")
	public void enter_password2(String password) {
		 driver.findElement(By.name("user_password")).sendKeys(password);
	}

	@Then("click on login button")
	public void click_on_login_button() {
		 driver.findElement(By.id("submitButton")).click();
	}

	@Then("enter user name and browser2")
	public void enter_user_name_and_browser2(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps();
		String value1 = data.get(0).get("username");
		String value2 = data.get(0).get("password");
		driver.findElement(By.name("user_name")).sendKeys(value1);
		 driver.findElement(By.name("user_password")).sendKeys(value2);
	}

	@Then("click on login button2")
	public void click_on_login_button2() {
		driver.findElement(By.id("submitButton")).click();
	}
}
