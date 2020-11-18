package visao.emissor;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import filtros.metodos.Filtros;
import filtros.metodos.ViewBTDTO;

public class debug extends Filtros {
	
	private WebDriver driver;

	@Before
	public void Inicializar() {
		driver = new ChromeDriver();
		List<ViewBTDTO> links = getViews();
		// Login
		login2(driver, links.get(1).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		System.out.println("Entrei Filtro");
		waiting(driver, "dialogLoadbar");
	}

	@After
	public void Encerramento() {
		// Consultar
		System.out.println("Sai Filtro");
		click(driver, "btnConsult");
		System.out.println("Consultei");
		waiting(driver, "dialogLoadbar");
		// Verificar se possui dados
		waitingElementBeClickableid(driver, "listViewBTIssuerDTO:0:tbody_desc");
		System.out.println("Verifiquei");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
	}
	
	/// Objetivo: Preencher o combo Emissores
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.

	@Test
	public void TestEmissorEmissores() {
		// Preencher Combobox
		waitingtoclickx(driver, "//div[contains(@class,'entity_Issuer')]");
		clickx(driver, "//div[contains(@class,'entity_Issuer')]");
		clickx(driver, "//div[32]/div[1]/div[1]");
		System.out.println("Selecionei");
	}

}
