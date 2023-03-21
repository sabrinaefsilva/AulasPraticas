package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class schemaTeste {

	WebDriver driver;

	@Given("que acesse site {string}")
	public void que_acesse_site(String site) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();
	}

	@When("informar o usuario {string}")
	public void informar_o_usuario(String usuario) {
		WebElement WebElement = driver.findElement(By.id("user-name"));
		WebElement.sendKeys(usuario);
	}

	@When("informar a senha {string}")
	public void informar_a_senha(String string) {
		WebElement senhaEl = driver.findElement(By.id("Password"));
		senhaEl.sendKeys(null);
		WebElement btn = driver.findElement(By.id("login-button"));
		btn.click();
	}

	@Then("valido mensagem {string}")
	public void valido_mensagem(String string) {
		String msgErro = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
		Object mensagem = null;
		assertEquals(mensagem, msgErro);
		// fazer um if para validar 3 mensagens diferentes
		driver.quit();
	}
}
