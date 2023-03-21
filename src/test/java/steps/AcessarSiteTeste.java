package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AcessarSiteTeste {

	String title;
	WebDriver driver;

	@Given("que acesse {string}")
	public void que_acesse(String site) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();
	}

	@When("capturar o title")
	public void capturar_o_title() {
		title = driver.getTitle();

	}

	@Then("valido o title {string}")
	public void valido_o_title(String title) {
		assertEquals(title, this.title);
		driver.quit();
	}
}
