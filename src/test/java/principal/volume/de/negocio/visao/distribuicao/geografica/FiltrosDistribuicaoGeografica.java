package principal.volume.de.negocio.visao.distribuicao.geografica;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import metodos.mir.Filtros;
import metodos.mir.FiltrosPage;

public class FiltrosDistribuicaoGeografica {
	
		private WebDriver driver;
		private FiltrosPage f;

		@Before
		public void Inicializar() {
			driver = new ChromeDriver();
			new Filtros(driver);
			f = new FiltrosPage(driver);
			f.getUrl("https://192.168.80.18:8081/mir.console/pages/view/viewregion.jsf");
			// Login
			f.loginPrivate();
			// Filtro
			f.waitToClickFilter();
			// Verificar Errro ao entrar
			f.verifyError();
			f.clickFilter();
			f.loading();
			// Preencher Período
			f.waitToClickDate();
			f.clickDate();
			WebElement PeriodoIni = f.findDate();
			f.writeDate("08092020", PeriodoIni);
			}

		@After
		public void Encerramento() {
			// Consultar
			f.clickConsult();
			f.loading();
			// Verificar se possui dados
			f.verifyElementTable("transactionsDT:0:btnTransDlg");
			// Verificar se ocorre erro
			f.verifyError();
			System.out.println("Sucess");
			f.finish();
			}
		
		/********* Objetivo: Selecionar todas as opções dos Combos ************/
		/********* Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo. ************/
		
		@Test
		public void TestCombos1() {
			// Preencher primeiros combos
			f.filterComboEmissor();
			f.selectAll("//div[28]/div[1]/div[1]");
			f.waitToClickComboProduto();
			f.filterComboProduto();
			f.selectAll("//div[29]/div[1]/div[1]");
			f.waitToClickComboSubProduto();
			f.filterComboSubProduto();
			f.selectAll("//div[30]/div[1]/div[1]");
			}

		
		/********* Objetivo: Selecionar todas as opções dos Combos ************/
		/********* Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo. ************/
		
		@Test
		public void TestCombos2() {
			// Preencher primeiros combos
			f.filterComboTipoDeVenda();
			f.selectAll("//div[31]/div[1]/div[1]");
			f.waitToClickComboMeioDeCaptura();
			f.filterComboMeioDeCaptura();
			f.selectAll("//div[32]/div[1]/div[1]");
			f.waitToClickComboModoDeEntrada();
			f.filterComboModoDeEntrada();
			f.selectAll("//div[33]/div[1]/div[1]");
			f.waitToClickComboGrupoRamoAtividade();
			f.filterComboGrupoRamoAtividade();
			f.selectAll("//div[34]/div[1]/div[1]");
			}
		
		/********* Objetivo: Selecionar todas as opções dos Combos ************/
		/********* Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo. ************/
		
		@Test
		public void TestCombos3() {
			// Preencher primeiros combos
			f.filterComboTipoDeEmissor();
			f.selectAll("//div[35]/div[1]/div[1]");
			f.waitToClickComboBandeiras();
			f.filterComboBandeiras();
			f.selectAll("//div[36]/div[1]/div[1]");
			f.waitToClickComboTipoTransacao();
			f.filterComboTipoTransacao();
			f.selectAll("//div[37]/div[1]/div[1]");
			f.waitToClickComboPiloto();
			f.filterComboPiloto();
			f.selectAll("//div[38]/div[1]/div[1]");
			f.waitToClickComboOrigemTransacoesWeb();
			f.filterComboOrigemTransacoesWeb();
			f.selectAll("//div[39]/div[1]/div[1]");
			}
		
		/********* Objetivo: Selecionar todas as opções dos Combos ************/
		/********* Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo. ************/
			
		@Test
		public void TestCombos4() {
			// Preencher primeiros combos
			f.filterComboCodEmpresaAdquirente();
			f.selectAll("//div[40]/div[1]/div[1]");
			f.waitToClickComboCodMotivoRedeExterna();
			f.filterComboCodMotivoRedeExterna();
			f.selectAll("//div[41]/div[1]/div[1]");
			f.waitToClickComboSwitch();
			f.filterComboSwitch();
			f.selectAll("//div[42]/div[1]/div[1]");
			f.waitToClickComboFrontEnd();
			f.filterComboFrontEnd();
			f.selectAll("//div[43]/div[1]/div[1]");
			f.waitToClickComboCodServico();
			f.filterComboCodServico();
			f.selectAll("//div[44]/div[1]/div[1]");
			}
		
		/********* Objetivo: Selecionar todas as opções dos Combos ************/
		/********* Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo. ************/
		
		@Test
		public void TestCombos5() {
			// Preencher primeiros combos
			f.filterComboTransacoesTokenizadas();
			f.selectAll("//div[45]/div[1]/div[1]");
			f.waitToClickComboGrupoBandeira();
			f.filterComboGrupoBandeira();
			f.selectAll("//div[46]/div[1]/div[1]");
			}
}