package configuracoes.alarmes.sla;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import filtros.metodos.Filtros;
import filtros.metodos.ViewBTDTO;

public class SLACrud extends Filtros {
	
	private WebDriver driver;

	@Before
	public void Inicializar() {
		driver = new ChromeDriver();
		List<ViewBTDTO> links = getViews();
		// Login
		login(driver, links.get(9).getUrl());
		// Entrar na tela
		waitingtoclick(driver, "frmList:dataTableSlaMilestone:0:deleteButton");
		}

	@After
	public void Encerramento() {
		driver.quit();
		erroDesc(driver, "//span[text()='Ocorreu um erro desconhecido, consulte o administrador.']");
		}


	@Test
	public void Atualizar() {
	// Clicar no elemento
	clickx(driver, "//*[@id=\"frmList:dataTableSlaMilestone_data\"]/tr[1]/td[1]");
	waiting(driver, "dialogLoadbar");
	click(driver, "frmCadastro:j_idt79");
	clear(driver, "frmCadastro:j_idt79");
	write(driver, "frmCadastro:j_idt79", "Teste Auto");
	obteinValue(driver, "frmCadastro:j_idt79");
	click(driver , "frmCadastro:btnUpdate");
	waiting(driver, "dialogLoadbar");
	waitingelementxpath(driver, "//span[text()='SLA alterado com sucesso']");
	}
}