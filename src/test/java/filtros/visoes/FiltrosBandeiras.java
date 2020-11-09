package filtros.visoes;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import filtros.metodos.Filtros;
import filtros.todos.ViewBTDTO;

public class FiltrosBandeiras extends Filtros {

	/// Objetivo: preencher todos os novos campos Pan Web,Cvv,Descriptor,Portador com parte do nome.
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreunenhum erro administrativo.
	@Test
	public void Testbandeiratodos() {
		WebDriver driver = new ChromeDriver();
		// Login
		List<ViewBTDTO> links = getViews();
		login2(driver, links.get(0).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		// Preencher Periodo
		waitingtoclickx(driver,
				"//input[contains(@id,'dt_transaction_ini_input')]");
		writeperiod1x(driver,
				"//input[contains(@id,'dt_transaction_ini_input')]");
		clickx(driver,
				"//input[contains(@id,'dt_transaction_fin_component_input')]");
		waitingtoclickx(driver,
				"//input[contains(@id,'dt_transaction_fin_component_input')]");
		writeperiod2x(driver,
				"//input[contains(@id,'dt_transaction_fin_component_input')]");
		// Preencher novos campos
		writepanx(driver,
				"//input[contains(@class,'entity_panWeb')]");
		writecvvx(driver,
				"//input[contains(@class,'entity_cvv')]");
		writedescx(driver,
				"//input[contains(@class,'entity_descriptor')]");
		writeportx(driver,
				"//input[contains(@class,'entity_portador')]");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar");
		// Verificar se possui dados
		notequalsid(driver, "treeViewBTBrandDTO_data");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
	}

	/// Objetivo: preencher o text area Pan Web com parte do nome.
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	@Test
	public void Testbandeirapan() {
		WebDriver driver = new ChromeDriver();
		/// Login
		List<ViewBTDTO> links = getViews();
		login2(driver, links.get(0).getUrl());;
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		/// Preencher Periodo
		waitingtoclickx(driver,
				"//input[contains(@id,'dt_transaction_ini_input')]");
		writeperiod1x(driver,
				"//input[contains(@id,'dt_transaction_ini_input')]");
		waitingtoclickx(driver,
				"//input[contains(@id,'dt_transaction_fin_component_input')]");
		clickx(driver,
				"//input[contains(@id,'dt_transaction_fin_component_input')]");
		writeperiod2x(driver,
				"//input[contains(@id,'dt_transaction_fin_component_input')]");
		// Preencher novos campos
		writepanx(driver,
				"//input[contains(@class,'entity_panWeb')]");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar");
		// Verificar se possui dados
		notequalsid(driver, "treeViewBTBrandDTO_data");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
	}

	/// Objetivo: preencher o text area CVV com parte do nome.
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	@Test
	public void Testbandeiracvv() {
		WebDriver driver = new ChromeDriver();
		/// Login
		List<ViewBTDTO> links = getViews();
		login2(driver, links.get(0).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		/// Preencher Periodo
		waitingtoclickx(driver,
				"//input[contains(@id,'dt_transaction_ini_input')]");
		writeperiod1x(driver,
				"//input[contains(@id,'dt_transaction_ini_input')]");
		waitingtoclickx(driver,
				"//input[contains(@id,'dt_transaction_fin_component_input')]");
		clickx(driver,
				"//input[contains(@id,'dt_transaction_fin_component_input')]");
		writeperiod2x(driver,
				"//input[contains(@id,'dt_transaction_fin_component_input')]");
		// Preencher novos campos
		writecvvx(driver,
				"//input[contains(@class,'entity_cvv')]");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar");
		// Verificar se possui dados
		notequalsid(driver, "treeViewBTBrandDTO_data");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
	}

	/// Objetivo: preencher o text area Descriptor com parte do nome.
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	@Test
	public void TestbandeiraDescriptor() {
		WebDriver driver = new ChromeDriver();
		/// Login
		List<ViewBTDTO> links = getViews();
		login2(driver, links.get(0).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		/// Preencher Periodo
		waitingtoclickx(driver,
				"//input[contains(@id,'dt_transaction_ini_input')]");
		writeperiod1x(driver,
				"//input[contains(@id,'dt_transaction_ini_input')]");
		waitingtoclickx(driver,
				"//input[contains(@id,'dt_transaction_fin_component_input')]");
		clickx(driver,
				"//input[contains(@id,'dt_transaction_fin_component_input')]");
		writeperiod2x(driver,
				"//input[contains(@id,'dt_transaction_fin_component_input')]");
		// Preencher novos campos
		writedescx(driver,
				"//input[contains(@class,'entity_descriptor')]");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar");
		// Verificar se possui dados
		notequalsid(driver, "treeViewBTBrandDTO_data");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
	}

	/// Objetivo: preencher o text area Portador com parte do nome.
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo.
	@Test
	public void TestbandeiraPortador() {
		WebDriver driver = new ChromeDriver();
		/// Login
		List<ViewBTDTO> links = getViews();
		login2(driver, links.get(0).getUrl());
		// Filtro
		waitingtoclick(driver, "btnFilter");
		click(driver, "btnFilter");
		/// Preencher Periodo
		waitingtoclickx(driver,
				"//input[contains(@id,'dt_transaction_ini_input')]");
		writeperiod1x(driver,
				"//input[contains(@id,'dt_transaction_ini_input')]");
		waitingtoclickx(driver,
				"//input[contains(@id,'dt_transaction_fin_component_input')]");
		clickx(driver,
				"//input[contains(@id,'dt_transaction_fin_component_input')]");
		writeperiod2x(driver,
				"//input[contains(@id,'dt_transaction_fin_component_input')]");
		// Preencher novos campos
		writeportx(driver,
				"//input[contains(@class,'entity_portador')]");
		// Consultar
		click(driver, "btnConsult");
		waiting(driver, "dialogLoadbar");
		// Verificar se possui dados
		notequalsid(driver, "treeViewBTBrandDTO_data");
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
		System.out.println("Sucess");
		driver.quit();
	}
}
