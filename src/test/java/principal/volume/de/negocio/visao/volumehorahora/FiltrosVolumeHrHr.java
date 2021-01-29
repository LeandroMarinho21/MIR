package principal.volume.de.negocio.visao.volumehorahora;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import metodos.mir.Filtros;
import metodos.mir.FiltrosPage;

public class FiltrosVolumeHrHr {
	
	private WebDriver driver;
	private FiltrosPage f;

	@Before
	public void Inicializar() {
		driver = new ChromeDriver();
		new Filtros(driver);
		f = new FiltrosPage(driver);
		f.getUrl("https://192.168.80.18:8081/mir.console/pages/view/viewgraphic.jsf");
		/// Login
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
		f.verifyElementTable("tblTransactionsDay");
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
		f.selectAll("//div[9]/div[1]/div[1]");
		f.waitToClickComboSubProduto();
		f.filterComboSubProduto();
		f.selectAll("//div[10]/div[1]/div[1]");
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
		f.selectAll("//div[11]/div[1]/div[1]");
		f.waitToClickComboMeioDeCaptura();
		f.filterComboMeioDeCaptura();
		f.selectAll("//div[12]/div[1]/div[1]");
		f.waitToClickComboModoDeEntrada();
		f.filterComboModoDeEntrada();
		f.selectAll("//div[13]/div[1]/div[1]");
		f.waitToClickComboGrupoRamoAtividade();
		f.filterComboGrupoRamoAtividade();
		f.selectAll("//div[14]/div[1]/div[1]");
		}
	
	/********* Objetivo: Selecionar todas as opções dos Combos ************/
	/********* Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo. ************/
	
	@Test
	public void TestCombos3() {
		// Preencher primeiros combos
		f.filterComboTipoDeEmissor();
		f.selectAll("//div[15]/div[1]/div[1]");
		f.waitToClickComboTipoTransacao();
		f.filterComboTipoTransacao();
		f.selectAll("//div[16]/div[1]/div[1]");
		f.waitToClickComboStatusTransacao();
		f.filterComboStatusTransacao();
		f.selectAll("//div[17]/div[1]/div[1]");
		f.waitToClickComboOperadoras();
		f.filterComboOperadoras();
		f.selectAll("//div[18]/div[1]/div[1]");
		f.waitToClickComboRegiao();
		f.filterComboRegiao();
		f.selectAll("//div[19]/div[1]/div[1]");
		f.waitToClickComboOrigemTransacoesWeb();
		f.filterComboOrigemTransacoesWeb();
		f.selectAll("//div[20]/div[1]/div[1]");
		}
	
	/********* Objetivo: Selecionar todas as opções dos Combos ************/
	/********* Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo. ************/
		
	@Test
	public void TestCombos4() {
		// Preencher primeiros combos
		f.filterComboCodEmpresaAdquirente();
		f.selectAll("//div[21]/div[1]/div[1]");
		f.waitToClickComboCodMotivoRedeExterna();
		f.filterComboCodMotivoRedeExterna();
		f.selectAll("//div[22]/div[1]/div[1]");
		f.waitToClickComboSwitch();
		f.filterComboSwitch();
		f.selectAll("//div[23]/div[1]/div[1]");
		f.waitToClickComboFrontEnd();
		f.filterComboFrontEnd();
		f.selectAll("//div[24]/div[1]/div[1]");
		f.waitToClickComboCodServico();
		f.filterComboCodServico();
		f.selectAll("//div[25]/div[1]/div[1]");
		}
	
	/********* Objetivo: Selecionar todas as opções dos Combos ************/
	/********* Resultado Esperado: Verificar se esta retornando dados e nao ocorreu nenhum erro administrativo. ************/
	
	@Test
	public void TestCombos5() {
		// Preencher primeiros combos
		f.filterComboTransacoesTokenizadas();
		f.selectAll("//div[26]/div[1]/div[1]");
		f.waitToClickComboCodigoCarteira();
		f.filterComboCodigoCarteira();
		f.selectAll("//div[27]/div[1]/div[1]");
		f.waitToClickComboQrCode();
		f.filterComboQrCode();
		f.selectAll("//div[28]/div[1]/div[1]");
		f.waitToClickComboGrupoBandeira();
		f.filterComboGrupoBandeira();
		f.selectAll("//div[29]/div[1]/div[1]");
		}

}
