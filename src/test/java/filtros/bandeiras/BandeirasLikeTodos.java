package filtros.bandeiras;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import filtros.metodos.Filtros;

public class BandeirasLikeTodos extends Filtros {

	/// Objetivo: preencher todos os novos campos Pan Web,Cvv,Descriptor,Portador com parte do nome.
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreunenhum erro administrativo.
	@Test
	public void Testbandeiratodos() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://192.168.80.18:8081/mir.console/pages/view/viewbtbrand.jsf");
		// driver.get("https://10.59.184.60/mir.console/pages/view/viewbtbrand.jsf");
		// Erro de Privacidade
		//click(driver, "details-button");
		//click(driver, "proceed-link");
		// Login
		waitingtoclick(driver, "formLogin:txtUsuario");
		click(driver, "formLogin:txtUsuario");
		escreverlogin(driver, "formLogin:txtUsuario");
		escreversenhaenter(driver, "formLogin:txtPassword");
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		// Preencher Periodo
		waitingtoclickx(driver,
				"/html/body/center/div[3]/form[1]/div[3]/div[2]/div[1]/div/div[2]/div/div[1]/div[1]/div/span[1]/input");
		writeperiod1x(driver,
				"/html/body/center/div[3]/form[1]/div[3]/div[2]/div[1]/div/div[2]/div/div[1]/div[1]/div/span[1]/input");
		clickx(driver,
				"/html/body/center/div[3]/form[1]/div[3]/div[2]/div[1]/div/div[2]/div/div[1]/div[1]/div/span[2]/input");
		writeperiod2x(driver,
				"/html/body/center/div[3]/form[1]/div[3]/div[2]/div[1]/div/div[2]/div/div[1]/div[1]/div/span[2]/input");
		// Preencher novos campos
		writepanx(driver,
				"/html/body/center/div[3]/form[1]/div[3]/div[2]/div[1]/div/div[2]/div/div[5]/div[1]/div/input");
		writecvvx(driver,
				"/html/body/center/div[3]/form[1]/div[3]/div[2]/div[1]/div/div[2]/div/div[5]/div[2]/div/input");
		writedescx(driver,
				"/html/body/center/div[3]/form[1]/div[3]/div[2]/div[1]/div/div[2]/div/div[5]/div[3]/div/input");
		writeportx(driver,
				"/html/body/center/div[3]/form[1]/div[3]/div[2]/div[1]/div/div[2]/div/div[5]/div[4]/div/input");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar");
		// Verificar se possui dados
		notequalsid(driver, "treeViewBTBrandDTO_data");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		driver.quit();
	}

	/// Objetivo: preencher o text area Pan Web com parte do nome.
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	@Test
	public void Testbandeirapan() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://192.168.80.18:8081/mir.console/pages/view/viewbtbrand.jsf");
		// driver.get("https://10.59.184.60/mir.console/pages/view/viewbtbrand.jsf");
		/// Erro de Privacidade
		// click(driver, "details-button");
		// click(driver, "proceed-link");
		/// Login
		waitingtoclick(driver, "formLogin:txtUsuario");
		click(driver, "formLogin:txtUsuario");
		escreverlogin(driver, "formLogin:txtUsuario");
		escreversenhaenter(driver, "formLogin:txtPassword");
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		/// Preencher Periodo
		waitingtoclickx(driver,
				"/html/body/center/div[3]/form[1]/div[3]/div[2]/div[1]/div/div[2]/div/div[1]/div[1]/div/span[1]/input");
		writeperiod1x(driver,
				"/html/body/center/div[3]/form[1]/div[3]/div[2]/div[1]/div/div[2]/div/div[1]/div[1]/div/span[1]/input");
		clickx(driver,
				"/html/body/center/div[3]/form[1]/div[3]/div[2]/div[1]/div/div[2]/div/div[1]/div[1]/div/span[2]/input");
		writeperiod2x(driver,
				"/html/body/center/div[3]/form[1]/div[3]/div[2]/div[1]/div/div[2]/div/div[1]/div[1]/div/span[2]/input");
		// Preencher novos campos
		writepanx(driver,
				"/html/body/center/div[3]/form[1]/div[3]/div[2]/div[1]/div/div[2]/div/div[5]/div[1]/div/input");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar");
		// Verificar se possui dados
		notequalsid(driver, "treeViewBTBrandDTO_data");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		driver.quit();
	}

	/// Objetivo: preencher o text area CVV com parte do nome.
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	@Test
	public void Testbandeiracvv() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://192.168.80.18:8081/mir.console/pages/view/viewbtbrand.jsf");
		// driver.get("https://10.59.184.60/mir.console/pages/view/viewbtbrand.jsf");
		/// Erro de Privacidade
		// click(driver, "details-button");
		// click(driver, "proceed-link");
		/// Login
		waitingtoclick(driver, "formLogin:txtUsuario");
		click(driver, "formLogin:txtUsuario");
		escreverlogin(driver, "formLogin:txtUsuario");
		escreversenhaenter(driver, "formLogin:txtPassword");
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		/// Preencher Periodo
		waitingtoclickx(driver,
				"/html/body/center/div[3]/form[1]/div[3]/div[2]/div[1]/div/div[2]/div/div[1]/div[1]/div/span[1]/input");
		writeperiod1x(driver,
				"/html/body/center/div[3]/form[1]/div[3]/div[2]/div[1]/div/div[2]/div/div[1]/div[1]/div/span[1]/input");
		clickx(driver,
				"/html/body/center/div[3]/form[1]/div[3]/div[2]/div[1]/div/div[2]/div/div[1]/div[1]/div/span[2]/input");
		writeperiod2x(driver,
				"/html/body/center/div[3]/form[1]/div[3]/div[2]/div[1]/div/div[2]/div/div[1]/div[1]/div/span[2]/input");
		// Preencher novos campos
		writecvvx(driver,
				"/html/body/center/div[3]/form[1]/div[3]/div[2]/div[1]/div/div[2]/div/div[5]/div[2]/div/input");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar");
		// Verificar se possui dados
		notequalsid(driver, "treeViewBTBrandDTO_data");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		driver.quit();
	}

	/// Objetivo: preencher o text area Descriptor com parte do nome.
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	@Test
	public void TestbandeiraDescriptor() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://192.168.80.18:8081/mir.console/pages/view/viewbtbrand.jsf");
		// driver.get("https://10.59.184.60/mir.console/pages/view/viewbtbrand.jsf");
		/// Erro de Privacidade
		// click(driver, "details-button");
		// click(driver, "proceed-link");
		/// Login
		waitingtoclick(driver, "formLogin:txtUsuario");
		click(driver, "formLogin:txtUsuario");
		escreverlogin(driver, "formLogin:txtUsuario");
		escreversenhaenter(driver, "formLogin:txtPassword");
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		/// Preencher Periodo
		waitingtoclickx(driver,
				"/html/body/center/div[3]/form[1]/div[3]/div[2]/div[1]/div/div[2]/div/div[1]/div[1]/div/span[1]/input");
		writeperiod1x(driver,
				"/html/body/center/div[3]/form[1]/div[3]/div[2]/div[1]/div/div[2]/div/div[1]/div[1]/div/span[1]/input");
		clickx(driver,
				"/html/body/center/div[3]/form[1]/div[3]/div[2]/div[1]/div/div[2]/div/div[1]/div[1]/div/span[2]/input");
		writeperiod2x(driver,
				"/html/body/center/div[3]/form[1]/div[3]/div[2]/div[1]/div/div[2]/div/div[1]/div[1]/div/span[2]/input");
		// Preencher novos campos
		writedescx(driver,
				"/html/body/center/div[3]/form[1]/div[3]/div[2]/div[1]/div/div[2]/div/div[5]/div[3]/div/input");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar");
		// Verificar se possui dados
		notequalsid(driver, "treeViewBTBrandDTO_data");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		driver.quit();
	}

	/// Objetivo: preencher o text area Portador com parte do nome.
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	@Test
	public void TestbandeiraPortador() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://192.168.80.18:8081/mir.console/pages/view/viewbtbrand.jsf");
		// driver.get("https://10.59.184.60/mir.console/pages/view/viewbtbrand.jsf");
		/// Erro de Privacidade
		// click(driver, "details-button");
		// click(driver, "proceed-link");
		/// Login
		waitingtoclick(driver, "formLogin:txtUsuario");
		click(driver, "formLogin:txtUsuario");
		escreverlogin(driver, "formLogin:txtUsuario");
		escreversenhaenter(driver, "formLogin:txtPassword");
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		/// Preencher Periodo
		waitingtoclickx(driver,
				"/html/body/center/div[3]/form[1]/div[3]/div[2]/div[1]/div/div[2]/div/div[1]/div[1]/div/span[1]/input");
		writeperiod1x(driver,
				"/html/body/center/div[3]/form[1]/div[3]/div[2]/div[1]/div/div[2]/div/div[1]/div[1]/div/span[1]/input");
		clickx(driver,
				"/html/body/center/div[3]/form[1]/div[3]/div[2]/div[1]/div/div[2]/div/div[1]/div[1]/div/span[2]/input");
		writeperiod2x(driver,
				"/html/body/center/div[3]/form[1]/div[3]/div[2]/div[1]/div/div[2]/div/div[1]/div[1]/div/span[2]/input");
		// Preencher novos campos
		writeportx(driver,
				"/html/body/center/div[3]/form[1]/div[3]/div[2]/div[1]/div/div[2]/div/div[5]/div[4]/div/input");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar");
		// Verificar se possui dados
		notequalsid(driver, "treeViewBTBrandDTO_data");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		driver.quit();
	}
}
