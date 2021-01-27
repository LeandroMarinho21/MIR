package principal.tipo.de.captura.visao.painel.ec;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import metodos.mir.Filtros;
import metodos.mir.FiltrosPage;

public class FiltrosPainelEC {
	
	private WebDriver driver;
	private FiltrosPage f;

	@Before
	public void Inicializar() {
		driver = new ChromeDriver();
		new Filtros(driver);
		f = new FiltrosPage(driver);
		f.getUrl("https://192.168.80.18:8081/mir.console/pages/view/viewkomercitransaction.jsf");
		// Login
		f.loginPrivate();
		// Filtro
		f.waitToClickFilter();
		// Verificar Errro ao entrar
		f.verifyError();
		f.clickFilter();
		f.loading();
		// Preencher Período
		f.waitToClickPeriodIni();
		WebElement PeriodoIni = f.findPeriodIni();
		f.clickPeriodIni();
		f.writePeriodIni("080920201100", PeriodoIni);
		f.clickPeriodoFin();
		f.waitToClickPeriodFin();
		WebElement PeriodoFin = f.findPeriodFin();
		f.writePeriodFin("080920202000", PeriodoFin);
		}

	@After
	public void Encerramento() {
		// Consultar
		f.clickConsult();
		f.loading();
		// Verificar se possui dados
		f.verifyElementTable("listViewBTTransactionDTO:0:viewKomerciDesc");
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
		f.waitToClickComboEmissor();
		f.filterComboEmissor();
		f.selectAll("//div[14]/div[1]/div[1]");
		f.waitToClickComboBandeiras();
		f.filterComboBandeiras();
		f.selectAll("//div[15]/div[1]/div[1]");
		}
	
	/********* Objetivo: Selecionar todas as opções dos Combos ************/
	/********* Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo. ************/
		
	@Test
	public void TestCombos2() {
		f.waitToClickComboOrigemTransacoesWeb();
		f.filterComboOrigemTransacoesWeb();
		f.selectAll("//div[16]/div[1]/div[1]");
		f.waitToClickComboGrupoEstabelecimento();
		f.filterComboGrupoEstabelecimento();
		f.selectAll("//div[17]/div[1]/div[1]");
		f.waitToClickComboGrupoBandeira();
		f.filterComboGrupoBandeira();
		f.selectAll("//div[18]/div[1]/div[1]");
		}

}
