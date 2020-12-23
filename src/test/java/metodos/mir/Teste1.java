package metodos.mir;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import com.google.common.annotations.VisibleForTesting;
import org.junit.Test;
import org.junit.internal.runners.statements.Fail;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teste1 extends Filtros {

	/// Objetivo: preencher todos os novos campos Pan Web,Cvv,Descriptor,Portador
	/// com parte do nome.
	/// Resultado Esperado: Verificar se esta retornando dados e nao ocorrer nenhum
	/// erro administrativo.

	String view = "";

	@Test
	public void Test() throws Exception {
		boolean erro = false;
		String btnFilter = "/html/body/center/div[3]/form[1]/div[3]/div[1]/div/button[4]";
		String btnApply = "/html/body/center/div[3]/form[1]/div[3]/div[2]/div[1]/div/div[1]/div/button[2]";
		System.setProperty("webdriver.chrome.driver", "src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		List<ViewBTDTO> links = getViews();
		login(driver, links.get(0).getUrl());
		for (ViewBTDTO obj : links) {
			try {
				TestDiego(driver, obj.getUrl(), obj.getTable(), btnFilter, btnApply);
			} catch (Exception | AssertionError e) {
				erro = true;
				System.err.println("Erro na tela: " + view);
				e.printStackTrace();
			}
		}
		if (erro)
			throw new Exception();
	}

	public void TestDiego(WebDriver driver, String link, String table, String btnFilter, String btnApply) {
		if (driver.getCurrentUrl() != link)
			driver.get(link);
		try {
			view = driver.findElement(By.xpath("/html/body/center/div[3]/form[1]/div[3]/div[1]/span")).getText();
		} catch (NoSuchElementException e) {
			view = driver.findElement(By.xpath(
					"/html/body/center/div[3]/form[1]/div[3]/div[2]/div[2]/table/tbody/tr/td[1]/div/div[1]/span"))
					.getText();
		}
		// Filtro
		waitingtoclickx(driver, "/html/body/center/div[3]/form[1]/div[3]/div[1]/div/button[1]");
		clickx(driver, btnFilter);
		// Preencher Periodo
		waitingtoclickx(driver,
				"/html/body/center/div[3]/form[1]/div[3]/div[2]/div[1]/div/div[2]/div/div[1]/div[1]/div/span[1]/input");
		// Desflaga o Agrupamento por bandeiras quando é tela de visão emissor
		if (link == "https://192.168.80.18:8081/mir.console/pages/view/viewissuer.jsf") {
			clickx(driver, "/html/body/center/div[3]/form[1]/div[3]/div[2]/div[1]/div/div[2]/div/div[1]/div[2]/div");
		}
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
		clickx(driver, btnApply);
		waiting(driver, "dialogLoadbar");
		// Verificar se possui dados
		notequalsid(driver, table);
		// Verificar se ocorre erro
		erroDesc(driver, "/html/body/div[8]/div/div/div[2]/span");
	}
}
