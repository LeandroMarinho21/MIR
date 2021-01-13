package principal.tipo.de.captura.pos.remodeladas;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import metodos.mir.Filtros;
import metodos.mir.FiltrosPage;

public class FiltrosPOSRemodeladas {
	
	private WebDriver driver;
	private FiltrosPage f;

	
	@Before
	public void Inicializar() {
		driver = new ChromeDriver();
		new Filtros(driver);
		f = new FiltrosPage(driver);
		f.getUrl("https://192.168.80.18:8081/mir.console/pages/view/viewPosOperatorNew.jsf");
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
		f.verifyElementTable("listViewOperadoraPosDTO_data");
		// Verificar se ocorre erro
		f.verifyError();
		System.out.println("Sucess");
		f.finish();
		}
	
	/********* Objetivo: Selecionar todas as opções dos Combos ************/
	/********* Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo. ************/
	
	@Ignore
	public void TestCombos1() {
		// Preencher primeiros combos
		f.filterComboEmissor();
		f.selectAll("//div[18]/div[1]/div[1]");
		f.waitToClickComboProduto();
		f.filterComboProduto();
		f.selectAll("//div[19]/div[1]/div[1]");
		f.waitToClickComboSubProduto();
		f.filterComboSubProduto();
		f.selectAll("//div[20]/div[1]/div[1]");
		}
		
	
	/********* Objetivo: Preencher os 11 campos por like ************/
	/********* Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo. ************/
	
	@Test
	public void TestNovosCampos1() {
		// Preencher Campos
		f.filterInputImei();
		f.filterInputSimCard();
		f.filterInputOperadora();
		f.filterInputMacAdress();
		f.filterInputIpTerminal();
		f.filterInputCodPais();
		f.filterInputCodRede();
		f.filterInputCodArea();
		f.filterInputIdCel();
		f.filterInputVersionPlat();
		f.filterInputVersionCA();
		}
	
	/********* Objetivo: Preencher os 4 campos por like ************/
	/********* Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo. ************/
	
	@Test
	public void TestNovosCampos2() {
		// Preencher novos campos
		f.waitToClickInputPanWeb();
		f.filterInputPanWeb();
		f.filterInputCVV();
		f.filterInputDesc();
		f.filterInputPort();
		}
	
	/********* Objetivo: Selecionar todas as opções dos Combos ************/
	/********* Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo. ************/
	
	@Test
	public void TestCombos2() {
		// Preencher primeiros combos
		f.filterComboTipoDeVenda();
		f.selectAll("//div[21]/div[1]/div[1]");
		f.waitToClickComboTipoTransacao();
		f.filterComboTipoTransacao();
		f.selectAll("//div[22]/div[1]/div[1]");
		}

	
	/********* Objetivo: Selecionar todas as opções dos Combos ************/
	/********* Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo. ************/
	
	@Test
	public void TestCombos3() {
		// Preencher primeiros combos
		f.filterComboBandeiras();
		f.selectAll("//div[23]/div[1]/div[1]");
		f.waitToClickComboGrupoBandeira();
		f.filterComboGrupoBandeira();
		f.selectAll("//div[24]/div[1]/div[1]");
		}
	
	/********* Objetivo: Selecionar todas as opções dos Combos ************/
	/********* Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo. ************/
	
	@Test
	public void TestCombos4() {
		// Preencher primeiros combos
		f.filterComboGrupoRamoAtividade();
		f.selectAll("//div[25]/div[1]/div[1]");
		f.waitToClickComboTipoDeEmissor();
		f.filterComboTipoDeEmissor();
		f.selectAll("//div[26]/div[1]/div[1]");
		}
	
	/********* Objetivo: Selecionar todas as opções dos Combos ************/
	/********* Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo. ************/
	
	@Test
	public void TestCidades5() {
		// Preencher primeiros combos
		f.clickComboEstado();
		f.clickInputEstado();
		f.writeInputEstado();
		f.SelectEstado();
		f.loading();
		f.SelectAllCities();
		f.loading();
		}

}
