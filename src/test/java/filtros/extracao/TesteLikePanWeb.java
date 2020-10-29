package filtros.extracao;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteLikePanWeb extends ExtracaoMetodos {
	/// TesteLikePan
	@Test
	public void Testpanweb() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://192.168.80.18:8081/mir.console/pages/view/reportExtractData.jsf");
		// driver.get("https://10.59.184.60/mir.console/pages/view/viewnet.jsf");
		/// Erro de Privacidade
		click(driver, "details-button");
		click(driver, "proceed-link");
		waitingtoclick(driver, "formLogin:txtUsuario");
		/// Login
		click(driver, "formLogin:txtUsuario");
		escreverlogin(driver, "formLogin:txtUsuario");
		escreversenhaenter(driver, "formLogin:txtPassword");
		/// Preencher Período
		waitingtoclick(driver, "date_start_input");
		escreverperiodo1(driver, "date_start_input");
		click(driver, "date_end_input");
		escreverperiodo2(driver, "date_end_input");
		// Preencher novos campos
		escreverpan(driver, "input_panWeb");
		// Buscar
		click(driver, "btnGenReport");
		waitingtoclick(driver, "btnDownload");
		click(driver, "btnDownload");
	}

}
