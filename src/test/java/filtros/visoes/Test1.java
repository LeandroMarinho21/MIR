package filtros.visoes;


import java.util.List;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import filtros.metodos.Filtros;
import filtros.todos.ViewBTDTO;

public class Test1 extends Filtros {
	
	@Test
	public void TestBandeiraIpTerminal() {
		WebDriver driver = new ChromeDriver();
		/// Login
		List<ViewBTDTO> links = getViews();
		login2(driver, links.get(0).getUrl());
		// Filtro
		System.out.println("Fiz Login");
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		System.out.println("Entrei no Filtro");
		/// Preencher Periodo
		waitingtoclickx(driver, "//input[contains(@id,'dt_transaction_ini_input')]");
		writeperiod1x(driver, "//input[contains(@id,'dt_transaction_ini_input')]");
		waitingtoclickx(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		clickx(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		writeperiod2x(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
		System.out.println("Preenchi Períodos");
		// Preencher Combobox
		writeipterminal(driver, "//input[contains(@class,'entity_ipTerm')]");
		System.out.println("Preenchi Campo");
		// Consultar
		click(driver, "btnConsult");
		System.out.println("Consultei");
		waiting(driver, "dialogLoadbar");
		// Verificar se possui dados
		wait3(driver, "");
		notequals(driver, "//*[contains(@class, 'ui-treetable-data ui-widget-content')]");
		System.out.println("Verifiquei1");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Verifiquei2");
		System.out.println("Sucess");
		driver.quit();
	}

}
