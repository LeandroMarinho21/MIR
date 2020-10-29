package filtros.extracao;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteLikeTodosMinuto extends ExtracaoMetodos {
	/// TesteLikeTodos
	@Test
	public void Testtodoslikeminuto() {
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
		// Preencher Período
		waitingtoclick(driver, "date_start_input");
		escreverperiodo1(driver, "date_start_input");
		click(driver, "date_end_input");
		escreverperiodo2(driver, "date_end_input");
		click(driver, "schkMinByMin");
		// Preencher novos campos
		escreverpan(driver, "input_panWeb");
		escrevercvv(driver, "input_cvv");
		escreverdesc(driver, "input_descriptor");
		escreverport(driver, "input_portador");
		// Buscar
		click(driver, "btnGenReport");
		waitingtoclick(driver, "btnDownload");
		click(driver, "btnDownload");
	}
}
