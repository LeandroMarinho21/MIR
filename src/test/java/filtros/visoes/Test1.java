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
		waiting(driver, "dialogLoadbar");
		// Preencher Combobox
		clickx(driver, "//div[contains(@class,'entity_Issuer')]");
		clickx(driver, "//div[30]/div/ul/li/label[text()='Alelo (78)']");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar ");
		// Verificar se possui dados
		waitingtoclickx(driver, "//tr[@class='ui-widget-content ui-treetable-selectable-node default']");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		driver.quit();
	}

}
