package filtros.privatelabel;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import filtros.metodos.Filtros;

public class PrivateLabelLikeTodos extends Filtros {
	@Test
	public void Testprivatelabeltodos() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://192.168.80.18:8081/mir.console/pages/view/viewprivatelabel.jsf");
		// driver.get("https://192.168.80.18:8081/mir.console/pages/view/viewprivatelabel.jsf");
		/// Erro de Privacidade
		click(driver, "details-button");
		click(driver, "proceed-link");
		waitingtoclick(driver, "formLogin:txtUsuario");
		/// Login
		click(driver, "formLogin:txtUsuario");
		escreverlogin(driver, "formLogin:txtUsuario");
		escreversenhaenter(driver, "formLogin:txtPassword");
		// Caminho para Private Label
		///waitingtoclickcss(driver, ".ui-mnu-bt");
		//waitemcimacss(driver, 
		//		".ui-mnu-bt");
		//clickx(driver, 
		//		"/html/body/center/div[1]/form/div/div[3]/div/div/div[1]/div/ul/li[3]/ul/li[5]/a");
		// Filtro
		waitingtoclick(driver, 
				"btnFilter1");
		click(driver, 
				"btnFilter1");
		/// Preencher Período
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
		click(driver, "btnSearch1");
		waitingtoclickx(driver,
				"/html/body/center/div[3]/form[1]/div[3]/div[2]/div[2]/table/tbody/tr/td[1]/div/div[2]/div/div/table/tbody/tr/td");
		// Verificar se possui dados
		notequals(driver,
				"/html/body/center/div[3]/form[1]/div[3]/div[2]/div[2]/table/tbody/tr/td[1]/div/div[2]/div/div/table/tbody/tr/td");
	}
}
