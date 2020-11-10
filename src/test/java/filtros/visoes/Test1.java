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
		login(driver, links.get(0).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		/// Preencher Periodo
		waitingtoclickx(driver, "//input[contains(@id,'dt_transaction_ini_input')]");
//		writeperiod1x(driver, "//input[contains(@id,'dt_transaction_ini_input')]");
//		waitingtoclickx(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
///		clickx(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
//		writeperiod2x(driver, "//input[contains(@id,'dt_transaction_fin_component_input')]");
///		System.out.println("Preenchi Períodos");
		// Preencher Combobox
///		writeipterminal(driver, "//input[contains(@class,'entity_ipTerm')]");
///		System.out.println("Preenchi Campo");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar");
		// Verificar se possui dados
		wait3(driver, "");
		notequals(driver, "//*[contains(@class, 'ui-treetable-data ui-widget-content')]");
		notequals2(driver, "//*[contains(@class, 'ui-treetable-data ui-widget-content')]");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		driver.quit();
	}

}
