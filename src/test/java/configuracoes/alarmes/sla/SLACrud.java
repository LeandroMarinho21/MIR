package configuracoes.alarmes.sla;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
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
		login2(driver, links.get(9).getUrl());
		// Entrar na tela
		waitingtoclick(driver, "frmList:dataTableSlaMilestone:0:deleteButton");
		//Verificar Errro ao entrar
		erroDesc(driver, "//span[text()='Ocorreu um erro desconhecido, consulte o administrador.']");
		}

	@After
	public void Encerramento() {
		erroDesc(driver, "//span[text()='Ocorreu um erro desconhecido, consulte o administrador.']");
		System.out.println("Sucess");
		driver.quit();
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
	// Atualizar
	click(driver , "frmCadastro:btnUpdate");
	waiting(driver, "dialogLoadbar");
	// Verificar se exibe mensagem
	waitingelementxpath(driver, "//span[text()='SLA alterado com sucesso']");
	}
	
	@Test
	public void SalvarRegras() {
	// Clicar no elemento
	click(driver, "frmCadastro:j_idt79");
	write(driver, "frmCadastro:j_idt79", "Teste");
	obteinValue(driver, "frmCadastro:j_idt79");
	// Salvar
	click(driver, "frmCadastro:btnSave");
	waiting(driver, "dialogLoadbar");
	// Verificar se exibe mensagem
	waitingelementxpath(driver, "//span[text()='O campo Prioridade é obrigatório.']");
	click(driver, "frmCadastro:j_idt84");
	write(driver, "frmCadastro:j_idt84", "4");
	obteinValue(driver, "frmCadastro:j_idt84");
	click(driver, "frmCadastro:j_idt89");
	// Salvar
	click(driver, "frmCadastro:btnSave");
	waiting(driver, "dialogLoadbar");
	// Verificar se exibe mensagem
	waitingelementxpath(driver, "//span[text()='O campo Cor é obrigatório.']");
	}
}