package testmir;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VisaoBandeiras {

	/// TestePlayPause
	@Test
	public void TestPlayPause() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://192.168.80.18:8081/mir.console/");
		/// Erro de Privacidade
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(By.id("formLogin:txtUsuario")));
		}
		/// Login
		driver.findElement(By.id("formLogin:txtUsuario")).click();
		driver.findElement(By.id("formLogin:txtUsuario")).sendKeys("qa");
		driver.findElement(By.id("formLogin:txtPassword")).sendKeys("Unicom@10");
		driver.findElement(By.id("formLogin:linkLogin")).click();
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".ui-mnu-bt")));
		}
		{
			WebElement element = driver.findElement(By.cssSelector(".ui-mnu-bt"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}
		/// Menu Visão Bandeiras
		{
			driver.findElement(By.linkText("Vis�o - Bandeiras")).click();
		}
		{
			WebElement element = driver.findElement(By.id("btnPause"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("imgLoadingDashboard")));
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("imgLoadingDashboard")));
		}
		driver.findElement(By.id("btnPause")).click();
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
		}
		driver.findElement(By.id("btnStart")).click();
		{
			driver.quit();
		}
	}

	/// TesteFiltros
	@Test
	public void TestFiltros() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://192.168.80.18:8081/mir.console");
		/// Erro de Privacidade
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(By.id("formLogin:txtUsuario")));
		}
		/// Login
		driver.findElement(By.id("formLogin:txtUsuario")).click();
		driver.findElement(By.id("formLogin:txtUsuario")).sendKeys("qa");
		driver.findElement(By.id("formLogin:txtPassword")).sendKeys("Unicom@10");
		driver.findElement(By.id("formLogin:linkLogin")).click();
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".ui-mnu-bt")));
		}
		{
			WebElement element = driver.findElement(By.cssSelector(".ui-mnu-bt"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}
		/// Menu Vis�o Bandeiras
		{
			driver.findElement(By.linkText("Vis�o - Bandeiras")).click();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
		}
		/// Pause
		driver.findElement(By.id("btnPause")).click();
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
		}
		/// Teste Filtro Selecionar Todos com uma data anterior
		driver.findElement(By.id("bntSearch")).click();
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(By.id("dt_transaction_ini_input")));
		}
		/// Teste Periodo
		driver.findElement(By.id("dt_transaction_ini_input")).click();
		driver.findElement(By.id("dt_transaction_ini_input")).sendKeys("20/11/2019 10:00");
		{
			driver.findElement(By.id("filterpanel_header")).click();
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
		}
		driver.findElement(By.xpath("//*[@id=\"selectChkListIssuer\"]/a/label")).click();
		
		driver.findElement(By.xpath("/html/body/div[15]/div[1]/div[1]/div[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"selectChkProduct\"]/a/label")).click();

		driver.findElement(By.xpath("/html/body/div[16]/div[1]/div[1]/div[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"selectChkSubProduct\"]/a/label")).click();

		driver.findElement(By.xpath("/html/body/div[17]/div[1]/div[1]/div[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"cmbPlots\"]/a/label")).click();
		
		driver.findElement(By.xpath("/html/body/div[18]/div[1]/div/div[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"cmbCellphoneOperator\"]/a/label")).click();

		driver.findElement(By.xpath("/html/body/div[19]/div[1]/div/div[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"cmbSubModality\"]/a/label")).click();

		driver.findElement(By.xpath("/html/body/div[20]/div[1]/div/div[2]")).click();
		
		driver.findElement(By.id("chkSaleType")).click();
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
		}
		driver.findElement(By.id("chkDevice")).click();
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
		}
		driver.findElement(By.id("chkEnterMode")).click();
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
		}
		driver.findElement(By.id("chkPrincipalBusiness")).click();
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
		}
		driver.findElement(By.id("chkTypeIssuer")).click();
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
		}
		driver.findElement(By.id("chkBrand")).click();
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
		}
		driver.findElement(By.id("chkTypeTransaction")).click();
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
		}
		driver.findElement(By.id("chkPiloto")).click();
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
		}
		driver.findElement(By.id("chkWebSource")).click();
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
		}
		driver.findElement(By.id("chkCompanyCode")).click();
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
		}
		driver.findElement(By.id("chkReasonCode")).click();
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
		}
		driver.findElement(By.id("chkSwitch")).click();
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
		}
		driver.findElement(By.id("chkFrontend")).click();
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
		}
		driver.findElement(By.id("chkServiceCode")).click();
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
		}
		driver.findElement(By.id("chkTokenTransaction")).click();
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
		}
		driver.findElement(By.id("btnSearch1")).click();
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
		}
		/// Verificar se o texto esta presente na pagina
		assertThat(driver.findElement(By.id("listViewBTBrandDTO_data")).getText(), is("Nenhum registro encontrado."));

		driver.findElement(By.id("btnFilterStrData")).click();
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
		}
		/// Verificar se o texto esta� presente dentro do pop-up
		assertThat(driver.findElement(By.id("txtFilterStrData")).getText(),
				is("Data: 20-11-2019 10:00 a 20-11-2019 23:59\n" + 
						"Tipo de venda: - A Vista - A Vista em D�lar - Cash - IATA - Parcelado Emissor - Parcelado Estabelecimento - Parcele Mais - Pr� Datada - Referida - Solicita��o Foneshop\n" + 
						"Meio de Captura: - Autoriza��o By-Phone - ELC - Exclusao 1 - hytrhrth - Komerci2 - MPOS - Outros - PDV - POE - POO - POS - POS Wireless - POY - PWI - Teste Marilia - TOF\n" + 
						"Modo de Entrada: - Chip - Chip Fallback - Chip Off Line - Digitada - Fallback digitado - Internet - Magn�tica - N�o classificado - NFC (PAYPASS CHIP) - NFC Fallback\n" + 
						"Grupo Ramo Atividade: - Alimenta��o - Diversos - Educa��o - Hobby - Moradia - Sa�de - T/E - Teste de Regressao - Ve�culos - Vestu�rio\n" + 
						"Tipo Emissor: - Bacen - ICA - Issuer Code - Outro\n" + 
						"Emissor: - Accentiv Servi�os - Mastercard (13805) - Accentiv Servi�os - Mastercard (13881) - Acesso Solu��es - Mastercard (14070) - Acesso Solu��es - Mastercard (17062) - ACG Administradora - Mastercard (13053) - Agiplan Financeira - Mastercard (16609) - Agiplan Financeira - Mastercard (18486) - Alelo (78) - AVista Administradora - Mastercard (15416) - AVISTA Cr�dito Van (99999990009) - Banco Alfa - Visa (10047327) - Banco AZTECA - Mastercard (10878) - Banco Banese - Mastercard D�bito (47636117) - Banco Banif - Visa (10061623) - Banco BMG - Mastercard (10203) - Banco BMG - Mastercard (13642) - Banco BMG - Mastercard (13963) - Banco BMG - Visa (10071762) - Banco Bonsucesso - Mastercard (14076) - Banco Bonsucesso - Visa (10063640) - Banco Bradesco - Amex (99999990213) - Banco Bradesco - Amex (99999990615) - Banco Bradesco - Elo D�bito (99990140204) - Banco Bradesco - Mastercard (14585) - Banco Bradesco - Mastercard (13757) - Banco Bradesco - Mastercard (11102) - Banco Bradesco - Mastercard (11603) - Banco Bradesco - Mastercard (1339) - Banco Bradesco - Mastercard (4380) - Banco Bradesco - Mastercard (6175) - Banco Bradesco - Visa (10021448) - Banco Bradesco - Visa (10065920) - Banco BRB - Mastercard (7935) - Banco BRB - Mastercard D�bito (7725) - Banco BRB - Visa (10039877) - Banco BV - Visa (10061788) - Banco Cacique - Visa (10030352) - Banco Carrefour - Visa (10060389) - Banco Cetelem - Mastercard (16002) - Banco Cetelem - Mastercard (16003) - Banco Cetelem - Mastercard (17176) - Banco Citibank - Mastercard (6631) - Banco Citibank - Mastercard (2989) - Banco Citibank - Mastercard D�bito (7456631) - Banco Citibank - RedeShop (745) - Banco Citibank - Visa (10052281) - Banco Citicard - Mastercard (1183) - Banco Citicard - Mastercard (1727) - Banco Citicard - Mastercard (12974) - Banco Citicard - Visa (10023010) - Banco Cooperativo do Brasil - Mastercard (1434) - Banco Cooperativo do Brasil - Mastercard (4372) - Banco Cooperativo do Brasil - Visa (10044366) - Banco Cooperativo Sicredi - Visa (10046669) - Banco Cooperativo Sicredi � Mastercard (14881) - Banco Cooperativo Sicredi � Mastercard (14882) - Banco Crediare - Visa (10062398) - Banco Cruzeiro do Sul - Visa (10055906) - Banco CSF Carrefour - Mastercard (11277) - Banco da Amaz�nia - Visa (10039458) - Banco Daycoval - Mastercard (14069) - Banco Daycoval - Mastercard (10769) - Banco Daycoval - Mastercard (9432) - Banco do Brasil - Amex (99999990410) - Banco do Brasil - Elo D�bito (99990140001) - Banco do Brasil - Mastercard (13454) - Banco do Brasil - Mastercard (13804) - Banco do Brasil - Mastercard (13880) - Banco do Brasil - Mastercard (4348) - Banco do Brasil - Mastercard (6145) - Banco do Brasil - Mastercard D�bito (7724) - Banco do Brasil - Visa (10061461) - Banco do Brasil - Visa (10069254) - Banco do Brasil - Visa (10021736) - Banco Estado do Para (14270) - Banco Fator - Mastercard (11900) - Banco Fibra - Visa (10039899) - Banco GE Capital - Visa (10045290) - Banco GE Proc Certegy - Mastercard (7804) - Banco Gerador - Visa (10066960) - Banco HSBC - Mastercard (14106) - Banco HSBC - Mastercard (13129) - Banco HSBC - Mastercard (13131) - Banco HSBC - Mastercard (4609) - Banco HSBC - Mastercard D�bito (6598) - Banco HSBC - RedeShop (399) - Banco HSBC - Visa (10043361) - Banco Ibi - Mastercard (14075) - Banco Ibi - Visa (10048883) - Banco Industrial do Brasil - Visa (10047343) - Banco Industrial do Brasil - Visa (10039898) - Banco Intermedium - Mastercard (17503) - Banco Ita� - Hiper (15029) - Banco Ita� - Mastercard (15475) - Banco Ita� - Mastercard (15794) - Banco Ita� - Mastercard (15866) - Banco Ita� - Mastercard (14006) - Banco Ita� - Mastercard (14007) - Banco Ita� - Mastercard (12439) - Banco Ita� - Mastercard (12848) - Banco Ita� - Mastercard (13755) - Banco Ita� - Mastercard (9970) - Banco Ita� - Mastercard (9992) - Banco Ita� - Mastercard (6282) - Banco Ita� - Mastercard (4373) - Banco Ita� - Mastercard D�bito (3168) - Banco Ita� - Mastercard D�bito (6574) - Banco Ita� - RedeShop (341) - Banco Ita� - Visa (10022899) - Banco Ita� - Visa (10054391) - Banco Leader - Visa (10060404) - Banco Mercantil do Brasil - Visa (10022175) - Banco Original - Mastercard (15530) - Banco Panamericano - Mastercard (4370) - Banco Panamericano - Mastercard (4767) - Banco Panamericano - Mastercard (7805) - Banco Panamericano - Mastercard (11755) - Banco Panamericano - Visa (10029901) - Banco Panamericano - Visa (10060058) - Banco Parana - Mastercard (7545) - Banco Rendimento - Mastercard (13859) - Banco Rendimento - Mastercard (15089) - Banco Rendimento - Visa (10051936) - Banco Rendimento - Visa (10070958) - Banco Riachuelo - Mastercard (11620) - Banco Riachuelo - Visa (10065465) - Banco Rodobens - Mastercard (14444) - Banco Safra - Mastercard (16899) - Banco Safra - Mastercard (12648) - Banco Safra - Visa (10038819) - Banco Santander - Mastercard (11783) - Banco Santander - Mastercard (11160) - Banco Santander - Mastercard (7817) - Banco Santander - Mastercard (7862) - Banco Santander - Mastercard (8010) - Banco Santander - Mastercard (8328) - Banco Santander - Mastercard (6155) - Banco Santander - Mastercard (2651) - Banco Santander - Mastercard (2982) - Banco Santander - Mastercard (1541) - Banco Santander - Mastercard D�bito (1632) - Banco Santander - Visa (10022844) - Banco Schahim - Visa (10058710) - Banco Triangulo - Mastercard (10362) - Banco Triangulo - Visa (10032841) - Banco Unibanco -  Mastercard D�bito (4096630) - Banco Unibanco - Mastercard (6630) - Banco Unibanco - Mastercard D�bito (7729) - Banco Unibanco - RedeShop (409) - Banco Unibanco - Visa (10023004) - Banco Unicard M�ltiplo - Visa (10022312) - Bancoob - Mastercard D�bito (756603522) - Banescard - Mastercard (99999990011) - Banestado - RedeShop (38) - Banestes - RedeShop (21) - Banestes - Visa (10033164) - Banestes - Visa (10041035) - Bank of China Limited (1867) - Banrisul - Mastercard (7782) - Banrisul - Visa (10031319) - BESC - Mastercard D�bito (27601452) - BNB Clube (76) - Bradesco private label (66) - Brasil Pre-Pagos - Visa (10072910) - BV Financeira - Mastercard (10391) - BV Financeira - Visa (10059870) - C&A - Mastercard (5144) - Cabal Cr�dito (99999990007) - Cabal D�bito (99999990003) - Cabal Voucher (70) - Caixa - Visa (10037904) (10037904) - Caixa Economica Federal - Construcard (104) - Caixa Economica Federal - Elo D�bito (99990140104) - Caixa Economica Federal - Mastercard (14586) - Caixa Economica Federal - Mastercard (6492) - Caixa Economica Federal - Mastercard (4476) - Caixa Economica Federal - Mastercard D�bito (1342) - Caixa Economica Federal - Visa (10069262) - Caruana - Mastercard (10979) - Caruana - Mastercard (13504) - Caruana - Mastercard (13536) - Caruana Sociedade de Cr�dito - Mastercard (17251) - Cetelem Brasil - Mastercard (11276) - Cetelem Brasil - Mastercard (9127) - Cetelem Brasil Submarino - Mastercard (11473) - Cetelem Brasil Telha Norte - Mastercard (11474) - Commercial Bank of Kuwait (11186) - Companhia Brasileira de Solu��es - Visa (10051292) - Confidence - Mastercard (13363) - Confidence - Visa (10065816) - CooperCred (99999990004) - Coopercred Voucher (62) - Credicard (0) - Credicard - Diners (22) - Crediscotia Financeira - Mastercard (8332) - Credsystem (99999990010) - CredZ (99999990014) - credZ-4 (99999990017) - CUP (99999990006) - Diners Receptivo (2) - Elavon do Brasil - Mastercard (13485) - Elavon do Brasil - Mastercard (13486) - Emissor Nacional Nao Identificado - Visa (99999998) - EMISSORES INTERNACIONAIS AMEX (99999990015) - Esquire Bank (15037) - FAI Americanas - Visa (10060905) - FIC (61) - Financeira Alfa - Visa (10055479) - Financeira Ita� Cbd - Visa (10057636) - Fininvest Private Label (9) - FIServ Solutions - Mastercard (5482) (5482) - Green Card (68) - Hipercard (99999990001) - Hipercard (14614) - Hub Card - Mastercard (17321) - HUB Card - Mastercard (18046) - Itaucard lojista (85) - JSL Arrendamento Mercantil - Mastercard (16979) - Lemon Bank M�ltiplo - Visa (10050128) - Luizacred - Visa (10057813) - Luso Brasileiro - Mastercard (9341) - Mastercard internacional (2535) - Mastercard Receptivo (8888) - MFS Servicos de Meios de Pagamentos - Mastercard (15019) - N�o Categorizado (99) - Nossa Caixa - Mastercard D�bito (151627973) - Nossa Caixa - RedeShop (151) - Novo Banco Continental - Mastercard (16130) - Nu Pagamentos - Mastercard (17050) - NuBank - Mastercard (16570) - Nutricash (69) - PagSeguro Internet - Mastercard (18038) - Pernambucanas Financiadora - Mastercard (4419) - PLANVALE (71) - Porto Seguro - Mastercard (14350) - Porto Seguro - Visa (10062875) - Qui! Card - Mastercard (17620) - Redecard - Mastercard (6207) - Redecard - Mastercard (6208) - Redecard SA - Mastercard (14615) - Renner Cart�es - Mastercard (11955) - Renner Cart�es - Visa (10066276) - Repom SA - Mastercard (13856) - REPOM SA - Mastercard (13050) - Sapore (75) - Serasa (6666) - Sicredi (99999990005) - Sicredi - Visa (10065480) - Sodexo (58) - Sorocred (99999990002) - Sorocred Voucher (74) - teste (345345345) - Teste do Paulo Dev (555555) - Ticket Accor (48) - Travelex Card - Mastercard (12002) - Travelex Card - Mastercard (12010) - Travelex Card - Mastercard (12017) - Unik - Mastercard (15025) - Unik - Mastercard (15050) - Unik - Mastercard (15223) - Unik - Mastercard (16614) - UNIPRIME NORTE DO PARANA - Mastercard (17578) - Vale Presente - Mastercard (14834) - Valecard (77) - VB Benef�cios (72) - Verocheque (73) - Voucher Outros (56) - VR (55) - VR (79)\n" + 
						"Bandeira: - Amex - BANESCARD CR�DITO - BANESCARD D�BITO - CABAL Cr�dito - CABAL D�bito - Construcard - COOPERCRED Van - Credsystem - CREDZ CR�DITO - CUP - Diners Club International - Elo Cr�dito - Elo D�bito - Hiper D�bito - Hipercard - JCB CR�DITO - MasterCard - Mastercard D�bito - Nova Bandeira Cr�dito - Nova Bandeira D�bito - Outros - Private Label - RedeShop CDC - RedeShop Cr�dito - RedeShop D�bito - SICREDI Cr�dito - SICREDI D�bito - Sorocred - VISA Cr�dito - VISA Electron - Voucher\n" + 
						"Produto: - 654654 - CDC - Construcard - Cr�dito - D�bito - DFASDSAAA - Foneshop - Outros - Pagamento de Contas - Parcele Mais - Private Label - SDAasdasdas - Serasa - teste teste teste - Trishop - Voucher\n" + 
						"Sub Produto: - 645665 - Alelo Alimenta��o - Alelo Refei��o - BNB Clube Alimenta��o - BNB Clube Refei��o - Bradesco Private Label - Cabal Alimenta��o - Cabal Combustivel - Cabal Farmacia - Cabal Premia��o - Cabal Refei��o - Cooper MB - Cooper VA - Cooper VCB - Cooper VCT - Cooper VF - Cooper VPR - Cooper VR - FAI - Aut. Orbitall  - Greencard Alimenta��o - Greencard Refei��o - Indefinido - Indefinido - Voucher - Ita� FIC - Aut. Orbtiall - Itaucard Lojista  - Nutricash Alimenta��o - Nutricash Combust�vel - Nutricash Frota - Nutricash Multibenef�cios - Nutricash Refei��o - Planvale Alimenta��o - Planvale Combustivel - Planvale Convenios - Planvale Cultura - Planvale Farmacia - Planvale Refei��o - Sapore Auto - Sapore Cultura - Sapore Mercato - Sapore Ristorante - Saraiva - Banco do Brasil - Sodexo Alimenta��o - Sodexo Alimenta��o Cardapio - Sodexo Alimenta��o Pass - Sodexo Cultura - Sodexo Gift - Sodexo Incentivo - Sodexo Premium - Sodexo Refei��o Pass - Sorocred Alimenta��o - Sorocred Combustivel - Sorocred Farmacia - Sorocred Refei��o - teste - Teste de QA Teste de QA Teste de QA Teste de QA Te - teste123 - Ticket Alimenta��o - Ticket Combustivel - Ticket Convenio - Ticket Cultura - Ticket Parceiro - Ticket Premia��o - Ticket Refei��o - Vale Alimenta��o - Vale Refei��o - Valecard Alimenta��o - Valecard Multibeneficios - Valecard Refei��o - Valecard SIAG - VB Alimenta��o - VB Benef�cio - VB Combust�vel - VB Farmacia - VB Multibeneficios - Verocheque Alimenta��o - Verocheque Combustivel - Verocheque Cultura - Verocheque Farmacia - Verocheque Premia��o - Verocheque Refei��o - VR Alimenta��o - VR Combustivel - VR Refei��o\n" + 
						"Tipo de Transação: - Administrativa - Confirma��o de Pr�-autoriza��o - Consulta - Consulta de Pr�-autoriza��o - Desfazimento - Estorno - Outros - Venda - Zero Dollar\n" + 
						"Piloto: - CredSystem - IWL281 (Autoriza��o By-Phone) - CredSystem - VX680 (Autoriza��o By-Phone) - CredSystem - VX680 NFC (Autoriza��o By-Phone) - CredSystem - VX685 (Autoriza��o By-Phone) - Escala de Sinal e Menu T�cnico- IWL281 (POS) - Escala de Sinal e Menu T�cnico- VX680 (POS) - Escala de Sinal e Menu T�cnico- VX680 NFC (POS) - ICT220 - Fase 2 - Cess�o de Cr�dito (Autoriza��o By-Phone) - Ipiranga Ago/2016 (POO) - Ipiranga_2016J_ICT220 (POS) - Ipiranga_2016J_VX680 (POO) - Ipiranga_FLEX-4403 (POS) - IWL281 - Fase 2 - Cess�o de Cr�dito (Autoriza��o By-Phone) - IWL28C - Abril/2017 (PWI) - IWL28C - Antigos/2017 (PWI) - LFR02 (Autoriza��o By-Phone) - LFR1 (Autoriza��o By-Phone) - Mobile Rede (MPOS) - Modular - ICT220 - MAIO E JUNHO/2016 (POS) - Modular - ICT250 - MAIO E JUNHO/2016 (POS) - Novos banners - IWL281 (POO) - Novos banners - VX680 (POO) - Novos banners - VX680NFC (POO) - Novos banners - VX685 (POO) - Piloto CORBAN - ICT220 (Autoriza��o By-Phone) - Piloto CORBAN - ICT220 32MB (Autoriza��o By-Phone) - Piloto CORBAN - ICT250 (Autoriza��o By-Phone) - Piloto CORBAN - IWL281 (Autoriza��o By-Phone) - Piloto CORBAN - VX520 (Autoriza��o By-Phone) - Piloto CORBAN - VX680 (Autoriza��o By-Phone) - Piloto CORBAN - VX680 NFC (Autoriza��o By-Phone) - Piloto CORBAN - VX685 (Autoriza��o By-Phone) - Piloto Ethernet Redeflex - ICT220 (Autoriza��o By-Phone) - Piloto Intellinac (POS) - Piloto NPC - IWL281 (Autoriza��o By-Phone) - Piloto Programa Bandeiras NFC (Autoriza��o By-Phone) - Piloto Redeflex 9Ae9Bv1 (Autoriza��o By-Phone) - Piloto Terminal IWL28C (Autoriza��o By-Phone) - POS Ethernet - ICT220 (2) (Autoriza��o By-Phone) - POS Ethernet - ICT250 (2) (Autoriza��o By-Phone) - POS Wi-Fi - IWL28C (Autoriza��o By-Phone) - POS Wi-Fi - Veloh W (Autoriza��o By-Phone) - PPC930 - SE - Piloto (PDV) - Projeto Poynt (POY) - Redeflex - ICT220 - JULHO/2016 (POS) - Redeflex - ICT220 - v2 - JULHO/2016 (Autoriza��o By-Phone) - Redeflex - ICT250 - JULHO/2016 (POS) - Redeflex - ICT250 - v2 - JULHO/2016 (Autoriza��o By-Phone) - Redeflex - IWL281 - AGOSTO/2016 (POO) - Redeflex - VX680NFC - AGOSTO/2016 (Autoriza��o By-Phone) - Redeflex � VX520 � JULHO/2016 (POS) - Redeflex � VX680 � JULHO/2016 (POO) - Redeflex � VX685 � JULHO/2016 (POO) - Redeflex 2016 - Pilotos Antigos (Antes da 3C) (POO) - Redeflex 2016 - Pilotos Novos (A partir da 3C) (POO) - Redeflex Release 9A (POO) - Redeflex-Shop Tambore (POO) - Redeflex/Zolkin - ICT 220 (Autoriza��o By-Phone) - Redeflex/Zolkin - IWL 281 (Autoriza��o By-Phone) - Redeflex/Zolkin - VX 680 sem NFC (Autoriza��o By-Phone) - Redeflex/Zolkin - VX 685 (Autoriza��o By-Phone) - Redeflex/Zolkin - VX680 NFC (Autoriza��o By-Phone) - Teste Leandro (PDV) - Teste_rollout_9H (POO) - VX680 - Fase 2 - Cess�o de Cr�dito (Autoriza��o By-Phone) - VX680 NFC - Fase 2 - Cess�o de Cr�dito (POO) - VX685 - Fase 2 - Cess�o de Cr�dito (Autoriza��o By-Phone)\n" + 
						"Operadoras: - Tim - Claro - Vivo - Oi - porto_conecta - Algar - Teste X\n" + 
						"Submodalidades: - Novo D�bito(02) - SubModality 00(00) - SubModality 01(01)\n" + 
						"Origens Transações Web: - Datacash - Default - e.Rede - Grupo 3 - INCLUIR  - Komerci - Rede Pay - teste 1 - teste 1 teste - teste 24 maio - teste incluir - teste incluir 2\n" + 
						"Código da Empresa Adquirente: - Cielo - GetNet - Rede - TesteTeste\n" + 
						"Código de Motivo Rede Externa: - (061) VISA Cr�dito - Activity amount limit exceeded - (061) VISA Electron - Activity amount limit exceeded - (065) VISA Electron - Activity count limit exceeded - (065) VISA Cr�dito - Activity count limit exceeded - (075) MasterCard - Allowable number of PIN tries exceeded - (075) Mastercard D�bito - Allowable number of PIN tries exceeded - (075) Hiper D�bito - Allowable number of PIN tries exceeded - (075) Hipercard - Allowable number of PIN tries exceeded - (075) VISA Electron - Allowable number of PIN-entry tries exceeded - (075) VISA Cr�dito - Allowable number of PIN-entry tries exceeded - (000) Mastercard D�bito - Approved or completed successfully - (000) Hiper D�bito - Approved or completed successfully - (000) Hipercard - Approved or completed successfully - (091) Hiper D�bito - Authorization Platform orissuer system inoperative - (091) Hipercard - Authorization Platform orissuer system inoperative - (091) MasterCard - Authorization Platform orissuer system inoperative - (091) Mastercard D�bito - Authorization Platform orissuer system inoperative - (078) VISA Cr�dito - Blocked, first used?The transaction is from a new cardholder, and the card has not been properly unblocked. - (078) VISA Electron - Blocked, first used?The transaction is from a new cardholder, and the card has not been properly unblocked. - (086) VISA Electron - Cannot Verify PIN - (086) VISA Cr�dito - Cannot Verify PIN - (004) MasterCard - Capture card - (004) Mastercard D�bito - Capture card - (004) Hiper D�bito - Capture card - (004) Hipercard - Capture card - ( Q1) VISA Electron - Card Authentication failed - ( Q1) VISA Cr�dito - Card Authentication failed - ( N3) VISA Cr�dito - Cash service not available - ( N3) VISA Electron - Cash service not available - ( N4) VISA Electron - Cashback request exceeds issuer limit - ( N4) VISA Cr�dito - Cashback request exceeds issuer limit - (070) Mastercard D�bito - Contact Card Issuer - (070) MasterCard - Contact Card Issuer - (070) Hiper D�bito - Contact Card Issuer - (070) Hipercard - Contact Card Issuer - (088) Hipercard - Cryptographic failure - (088) Hiper D�bito - Cryptographic failure - (088) MasterCard - Cryptographic failure - (088) Mastercard D�bito - Cryptographic failure - ( N7) VISA Cr�dito - Decline for CVV2 failure - ( N7) VISA Electron - Decline for CVV2 failure - (005) Hiper D�bito - Do not honor - (005) VISA Electron - Do not honor - (005) Hipercard - Do not honor - (005) VISA Cr�dito - Do not honor - (005) Mastercard D�bito - Do not honor - (005) MasterCard - Do not honor - (081) MasterCard - Domestic Debit Transaction Not Allowed (Regional use only) - (081) Mastercard D�bito - Domestic Debit Transaction Not Allowed (Regional use only) - (081) Hiper D�bito - Domestic Debit Transaction Not Allowed (Regional use only) - (081) Hipercard - Domestic Debit Transaction Not Allowed (Regional use only) - (094) VISA Electron - Duplicate transaction. A transaction was submitted that contains values in the tracing data fields that duplicate the values in a previously submitted transaction. - (094) VISA Cr�dito - Duplicate transaction. A transaction was submitted that contains values in the tracing data fields that duplicate the values in a previously submitted transaction. - (094) Mastercard D�bito - Duplicate transmissiondetected - (094) MasterCard - Duplicate transmissiondetected - (094) Hipercard - Duplicate transmissiondetected - (094) Hiper D�bito - Duplicate transmissiondetected - (006) VISA Electron - Error - (006) VISA Cr�dito - Error - (061) Mastercard D�bito - Exceeds withdrawal amount limit - (061) MasterCard - Exceeds withdrawal amount limit - (061) Hiper D�bito - Exceeds withdrawal amount limit - (061) Hipercard - Exceeds withdrawal amount limit - (065) Hiper D�bito - Exceeds withdrawal count limit - (065) MasterCard - Exceeds withdrawal count limit - (065) Mastercard D�bito - Exceeds withdrawal count limit - (065) Hipercard - Exceeds withdrawal count limit - (054) VISA Cr�dito - Expired card - (054) MasterCard - Expired card - (054) Mastercard D�bito - Expired card - (054) Hiper D�bito - Expired card - (054) Hipercard - Expired card - (054) VISA Electron - Expired card - (028) VISA Electron - File is temporarily unavailable - (028) VISA Cr�dito - File is temporarily unavailable - (092) VISA Cr�dito - Financial institution or intermediate network facility cannot be found for routing - (092) VISA Electron - Financial institution or intermediate network facility cannot be found for routing - ( N0) VISA Electron - Force STIP - ( N0) VISA Cr�dito - Force STIP - (030) Mastercard D�bito - Format error - (030) MasterCard - Format error - (030) Hiper D�bito - Format error - (030) Hipercard - Format error - ( XA) VISA Electron - Forward to issuer - ( XD) VISA Electron - Forward to issuer - ( XA) VISA Cr�dito - Forward to issuer - ( XD) VISA Cr�dito - Forward to issuer - (008) MasterCard - Honor with ID - (008) Mastercard D�bito - Honor with ID - (008) Hiper D�bito - Honor with ID - (008) Hipercard - Honor with ID - (055) VISA Electron - Incorrect PIN - (055) VISA Cr�dito - Incorrect PIN - (051) VISA Cr�dito - Insufficient funds - (051) VISA Electron - Insufficient funds - (051) Hiper D�bito - Insufficient funds/over credit limit - (051) Hipercard - Insufficient funds/over credit limit - (051) Credsystem - Insufficient funds/over credit limit - (051) Sorocred - Insufficient funds/over credit limit - (051) Mastercard D�bito - Insufficient funds/over credit limit - (051) MasterCard - Insufficient funds/over credit limit - (014) VISA Cr�dito - Invalid account number (no such number) - (014) VISA Electron - Invalid account number (no such number) - (013) Hiper D�bito - Invalid amount - (013) Hipercard - Invalid amount - (013) MasterCard - Invalid amount - (013) Mastercard D�bito - Invalid amount - (013) VISA Cr�dito - Invalid amount (currency conversion field overflow); or amount exceeds maximum for card program - (013) VISA Electron - Invalid amount (currency conversion field overflow); or amount exceeds maximum for card program - (084) Hipercard - Invalid Authorization Life Cycle - (084) Hiper D�bito - Invalid Authorization Life Cycle - (084) Mastercard D�bito - Invalid Authorization Life Cycle - (084) MasterCard - Invalid Authorization Life Cycle - ( P2) VISA Cr�dito - Invalid biller information - ( P2) VISA Electron - Invalid biller information - (014) Hiper D�bito - Invalid card number - (014) Hipercard - Invalid card number - (014) MasterCard - Invalid card number - (014) Mastercard D�bito - Invalid card number - (015) Mastercard D�bito - Invalid issuer - (015) MasterCard - Invalid issuer - (015) Hipercard - Invalid issuer - (015) Hiper D�bito - Invalid issuer - (003) Hiper D�bito - Invalid merchant - (003) Hipercard - Invalid merchant - (003) MasterCard - Invalid merchant - (003) Mastercard D�bito - Invalid merchant - (003) VISA Cr�dito - Invalid merchant or service provider - (003) VISA Electron - Invalid merchant or service provider - (055) Hiper D�bito - Invalid PIN - (055) Hipercard - Invalid PIN - (055) Mastercard D�bito - Invalid PIN - (055) MasterCard - Invalid PIN - (012) MasterCard - Invalid transaction - (012) Mastercard D�bito - Invalid transaction - (012) VISA Cr�dito - Invalid transaction - (012) Hiper D�bito - Invalid transaction - (012) Hipercard - Invalid transaction - (012) VISA Electron - Invalid transaction - (077) Hiper D�bito - Invalid/nonexistent ?From Account? specified - (077) Hipercard - Invalid/nonexistent ?From Account? specified - (077) Mastercard D�bito - Invalid/nonexistent ?From Account? specified - (077) MasterCard - Invalid/nonexistent ?From Account? specified - (076) MasterCard - Invalid/nonexistent ?To Account? specified - (076) Mastercard D�bito - Invalid/nonexistent ?To Account? specified - (076) Hipercard - Invalid/nonexistent ?To Account? specified - (076) Hiper D�bito - Invalid/nonexistent ?To Account? specified - (078) Hiper D�bito - Invalid/nonexistent accountspecified (general) - (078) Hipercard - Invalid/nonexistent accountspecified (general) - (078) Mastercard D�bito - Invalid/nonexistent accountspecified (general) - (078) MasterCard - Invalid/nonexistent accountspecified (general) - (091) VISA Cr�dito - Issuer unavailable or switch inoperative (STIP not applicable or available for this transaction). Issuers may respond with this code, which V.I.P. passes to the acquirer without invoking stand-in processing (STIP). Issuer processors use the code to indicate that they cannot perform the authorization on behalf of the issuer. The code causes a decline at the point of service. - (091) VISA Electron - Issuer unavailable or switch inoperative (STIP not applicable or available for this transaction). Issuers may respond with this code, which V.I.P. passes to the acquirer without invoking stand-in processing (STIP). Issuer processors use the code to indicate that they cannot perform the authorization on behalf of the issuer. The code causes a decline at the point of service. - (041) Hiper D�bito - Lost card - (041) Hipercard - Lost card - (041) MasterCard - Lost card - (041) Mastercard D�bito - Lost card - (082) VISA Cr�dito - Negative Online CAM, dCVV, iCVV, or CVV results - (082) VISA Electron - Negative Online CAM, dCVV, iCVV, or CVV results - (021) VISA Electron - No action taken (unable to back out prior transaction) - (021) VISA Cr�dito - No action taken (unable to back out prior transaction) - (052) VISA Cr�dito - No checking account - (052) VISA Electron - No checking account - (039) VISA Electron - No credit account - (039) VISA Cr�dito - No credit account - (085) VISA Cr�dito - No reason to decline a request for account number verification, address verification, CVV2 verification, or a credit voucher or merchandise return - (085) VISA Electron - No reason to decline a request for account number verification, address verification, CVV2 verification, or a credit voucher or merchandise return - (053) VISA Electron - No savings account - (053) VISA Cr�dito - No savings account - (015) VISA Cr�dito - No such issuer - (015) VISA Electron - No such issuer - (085) Hipercard - Not declined Valid for all zero amount transactions. - (085) Hiper D�bito - Not declined Valid for all zero amount transactions. - (085) Mastercard D�bito - Not declined Valid for all zero amount transactions. - (085) MasterCard - Not declined Valid for all zero amount transactions. - (010) MasterCard - Partial Approval - (010) Mastercard D�bito - Partial Approval - (010) VISA Cr�dito - Partial Approval - (010) Hipercard - Partial Approval - (010) VISA Electron - Partial Approval - (010) Hiper D�bito - Partial Approval - (004) VISA Electron - Pickup card - (004) VISA Cr�dito - Pickup card - (041) VISA Cr�dito - Pickup card (lost card) - (041) VISA Electron - Pickup card (lost card) - (043) VISA Electron - Pickup card (stolen card) - (043) VISA Cr�dito - Pickup card (stolen card) - (007) VISA Cr�dito - Pickup card, special condition (other than lost/stolen card) - (007) VISA Electron - Pickup card, special condition (other than lost/stolen card) - ( P5) VISA Electron - PIN Change/Unblock request declined - ( P5) VISA Cr�dito - PIN Change/Unblock request declined - (081) VISA Cr�dito - PIN cryptographic error found (error found by VIC security module during PIN decryption) - (081) VISA Electron - PIN cryptographic error found (error found by VIC security module during PIN decryption) - (071) Hiper D�bito - PIN Not Changed - (071) Hipercard - PIN Not Changed - (071) Mastercard D�bito - PIN Not Changed - (071) MasterCard - PIN Not Changed - (086) MasterCard - PIN Validation not possible - (086) Mastercard D�bito - PIN Validation not possible - (086) Hipercard - PIN Validation not possible - (086) Hiper D�bito - PIN Validation not possible - (077) VISA Electron - Previous message located for a repeat or reversal, but repeat or reversal data are inconsistent with original message - (077) VISA Cr�dito - Previous message located for a repeat or reversal, but repeat or reversal data are inconsistent with original message - (087) Mastercard D�bito - Purchase Amount Only, NoCash Back Allowed - (087) MasterCard - Purchase Amount Only, NoCash Back Allowed - (087) Hiper D�bito - Purchase Amount Only, NoCash Back Allowed - (087) Hipercard - Purchase Amount Only, NoCash Back Allowed - (019) VISA Electron - Re-enter transaction - (019) VISA Cr�dito - Re-enter transaction - (001) VISA Cr�dito - Refer to card issuer - (001) VISA Electron - Refer to card issuer - (001) MasterCard - Refer to card issuer - (001) Mastercard D�bito - Refer to card issuer - (001) Hiper D�bito - Refer to card issuer - (001) Hipercard - Refer to card issuer - (002) VISA Electron - Refer to card issuer, special condition - (002) VISA Cr�dito - Refer to card issuer, special condition - (062) Mastercard D�bito - Restricted card - (062) MasterCard - Restricted card - (062) Hiper D�bito - Restricted card - (062) Hipercard - Restricted card - (062) VISA Electron - Restricted card (for example, in Country Exclusion table) - (062) VISA Cr�dito - Restricted card (for example, in Country Exclusion table) - ( R3) VISA Cr�dito - Revocation of All Authorizations Order - ( R3) VISA Electron - Revocation of All Authorizations Order - ( R1) VISA Electron - Revocation of Authorization Order - ( R1) VISA Cr�dito - Revocation of Authorization Order - (063) VISA Cr�dito - Security violation - (063) MasterCard - Security violation - (063) Mastercard D�bito - Security violation - (063) VISA Electron - Security violation - (063) Hipercard - Security violation - (063) Hiper D�bito - Security violation - (043) Hipercard - Stolen card - (043) Hiper D�bito - Stolen card - (043) Mastercard D�bito - Stolen card - (043) MasterCard - Stolen card - ( R0) VISA Cr�dito - Stop Payment Order - ( R0) VISA Electron - Stop Payment Order - (000) VISA Electron - Successful approval/completion or that V.I.P. PIN verification is valid - (000) VISA Cr�dito - Successful approval/completion or that V.I.P. PIN verification is valid - ( B1) VISA Cr�dito - Surcharge amount not permitted on Visa cards (U.S. acquirers only) - ( B1) VISA Electron - Surcharge amount not permitted on Visa cards (U.S. acquirers only) - (059) VISA Electron - Suspected fraud - (059) VISA Cr�dito - Suspected fraud - (096) Mastercard D�bito - System error - (096) MasterCard - System error - (096) Hipercard - System error - (096) Hiper D�bito - System error - (096) VISA Electron - System malfunction System malfunction or certain field error conditions - (096) VISA Cr�dito - System malfunction System malfunction or certain field error conditions - (057) BANESCARD D�BITO - Teste - (000) Private Label - Teste - Cod Private Label - (056) Elo Cr�dito - Teste 1 - (000) Voucher - Teste 2 - (000) Outros - TEste II - (005) Outros - Teste IIII - (079) VISA Electron - Transaction already reversed - (079) VISA Cr�dito - Transaction already reversed - (093) VISA Cr�dito - Transaction cannot be completed; violation of law - (093) VISA Electron - Transaction cannot be completed; violation of law - (064) VISA Electron - Transaction does not fulfill AML requirement - (064) VISA Cr�dito - Transaction does not fulfill AML requirement - (058) VISA Cr�dito - Transaction not allowed at terminal - (058) VISA Electron - Transaction not allowed at terminal - (058) Hipercard - Transaction not permitted to acquirer/terminal - (058) Hiper D�bito - Transaction not permitted to acquirer/terminal - (058) Mastercard D�bito - Transaction not permitted to acquirer/terminal - (058) MasterCard - Transaction not permitted to acquirer/terminal - (057) VISA Cr�dito - Transaction not permitted to cardholder - (057) VISA Electron - Transaction not permitted to cardholder - (057) Hiper D�bito - Transaction not permitted to issuer/cardholder - (057) Hipercard - Transaction not permitted to issuer/cardholder - (057) MasterCard - Transaction not permitted to issuer/cardholder - (057) Mastercard D�bito - Transaction not permitted to issuer/cardholder - ( Z3) VISA Cr�dito - Unable to go online; declined - ( Z3) VISA Electron - Unable to go online; declined - (076) VISA Electron - Unable to locate previous message (no match on Retrieval Reference number) - (076) VISA Cr�dito - Unable to locate previous message (no match on Retrieval Reference number) - (025) VISA Cr�dito - Unable to locate record in file, or account number is missing from the inquiry - (025) VISA Electron - Unable to locate record in file, or account number is missing from the inquiry - (092) Hipercard - Unable to route transaction - (092) Hiper D�bito - Unable to route transaction - (092) Mastercard D�bito - Unable to route transaction - (092) MasterCard - Unable to route transaction - (089) MasterCard - Unacceptable PIN?Transaction Declined?Retry - (089) Mastercard D�bito - Unacceptable PIN?Transaction Declined?Retry - (089) Hiper D�bito - Unacceptable PIN?Transaction Declined?Retry - (089) Hipercard - Unacceptable PIN?Transaction Declined?Retry - ( P6) VISA Electron - Unsafe PIN - ( P6) VISA Cr�dito - Unsafe PIN - (011) VISA Cr�dito - V.I.P. approval - (011) VISA Electron - V.I.P. approval - (080) VISA Electron - Visa transactions: credit issuer unavailable. Private label and check acceptance: Invalid date - (080) VISA Cr�dito - Visa transactions: credit issuer unavailable. Private label and check acceptance: Invalid date\n" + 
						"Switch: - 236 - 7.1 - uxfsip236cto ( 10.59.148.130 ) - 236 - 7.5 - soxx005cto ( 10.59.148.135 ) - 237 - 7.1 - uxfsip237cas ( 10.59.212.130 ) - 237 - 7.5 - soxx003cas ( 10.59.212.133 ) - 238 - 7.1 - soxx238cto ( 10.59.148.140 ) - 238 - 7.5 - soxx605cto ( 10.59.148.145 ) - 239 - 7.1 - soxx239cas ( 10.59.212.140 ) - 239 - 7.5 - soxx605cas ( 10.59.212.143 ) - 240 - 7.1 - soxx240cto ( 10.59.148.150 ) - 240 - 7.5 - soxx606cto ( 10.59.148.155 ) - 241 - 7.1 - soxx241cas ( 10.59.212.150 ) - 241 - 7.5 - soxx606cas ( 10.59.212.153 ) - 242 - 7.1 - soxx242cto ( 10.59.148.160 ) - 242 - 7.5 - soxx607cto ( 10.59.148.165 ) - 243 - 7.1 - soxx243cas ( 10.59.212.160 ) - 243 - 7.5 - soxx607cas ( 10.59.212.163 ) - 436 - 7.1 - sxxxp2100cto ( 10.59.148.76 ) - 436 - 7.5 - sxxxp2104cto ( 10.59.148.78 ) - 437 - 7.1 - sxxxp1100ctm ( 10.234.174.130 ) - 437 - 7.5 - sxxxp1104ctm ( 10.234.174.133 ) - 438 - 7.1 - sxxxp2101cto ( 10.59.148.80 ) - 438 - 7.5 - sxxxp2105cto ( 10.59.148.82 ) - 439 - 7.1 - sxxxp1101ctm ( 10.234.174.140 ) - 439 - 7.5 - sxxxp1105ctm ( 10.234.174.143 ) - 440 - 7.1 - sxxxp2102cto ( 10.59.148.84 ) - 440 - 7.5 - sxxxp2106cto ( 10.59.148.86 ) - 441 - 7.1 - sxxxp1102ctm ( 10.234.174.150 ) - 441 - 7.5 - sxxxp1106ctm ( 10.234.174.153 ) - 442 - 7.1 - sxxxp2103cto ( 10.59.148.88 ) - 442 - 7.5 - sxxxp2107cto ( 10.59.148.90 ) - 443 - 7.1 - sxxxp1103ctm ( 10.234.174.160 ) - 443 - 7.5 - sxxxp1107ctm ( 10.234.174.163 ) - Consolidado 7.1 - null ( Consolidado 7.1 ) - Consolidado 7.5 - null ( Consolidado 7.5 )\n" + 
						"FrontEnd: - CRT - CRTM - CRTO - DBT - DBTM - DBTO - EC - FE EC - GEN - HST - PD2 - PDV - PO2 - POS - WEB\n" + 
						"Código Serviço: - Corban - Default - Recarga - Zolkin\n" + 
						"Transações Tokenizadas: - QA - TESTE - TESTE-QA - Transa��es Indeterminadas - Transa��es N�o Tokenizadas - Transa��es Tokenizadas\n" + 
						"Qt. Parcelas: 0,1,3,6,9,12,24"));
	{
		driver.findElement(By.xpath("/html/body/center/div[3]/form[3]/div/div[1]/a/span")).click();
	}
	{
		driver.findElement(By.id("bntSearch")).click();
	}
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
	}
	{
		driver.findElement(By.id("bntClean")).click();
	}
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
	}
	{
		assertThat(
				driver.findElement(By.xpath("/html/body/center/div[3]/form[1]/div[3]/div[3]/table/tbody/tr/td[2]"))
						.getText(),
				is("Data: 20-11-2019 10:00 a 20-11-2019 23:59"));
	}
	{
		driver.findElement(By.id("btnSearch1")).click();
	}
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
	}
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
	}
	{
		assertThat(driver.findElement(By.xpath("/html/body/center/div[3]/form[1]/div[3]/div[1]/span"))
				.getText(), is("Vis�o - Bandeiras"));
	}
	{
		driver.quit();
	}
}

	/// TesteAlarmes
	@Test
	public void TestAlarmes() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://192.168.80.18:8081/mir.console");
		driver.manage().window().setSize(new Dimension(1920, 1080));
		/// Login
		driver.findElement(By.id("formLogin:txtUsuario")).click();
		driver.findElement(By.id("formLogin:txtUsuario")).sendKeys("qa");
		driver.findElement(By.id("formLogin:txtPassword")).sendKeys("Unicom@10");
		driver.findElement(By.id("formLogin:linkLogin")).click();
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".ui-mnu-bt")));
		}
		{
			WebElement element = driver.findElement(By.cssSelector(".ui-mnu-bt"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}
		/// Menu Visão Bandeiras
		{
			driver.findElement(By.linkText("Visão - Bandeiras")).click();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
		}
		/// Pause
		driver.findElement(By.id("btnPause")).click();
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
		}
		/// Verificar Pop-up Threshold
		{
			WebElement element = driver.findElement(By.id("listViewBTBrandDTO:0:alarmDesc"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).contextClick().perform();
		}
		{
		driver.findElement(By.id("mnuitemThreshold")).click();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
		}
		/// Verificar o texto do Pop-up Threshold
		{
			assertThat(driver.findElement(By.id("listAlarmPopup_head")).getText(), is("Descrição"));
		}
		{
			driver.findElement(By.xpath("/html/body/center/div[3]/form[1]/div[4]/div[1]/a")).click();
		}
		{
			driver.findElement(By.id("listViewBTBrandDTO:0:alarmDesc")).click();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
		}
		driver.findElement(By.id("listAlarmesDTO1:0:buttonDetailAlarmEvent")).click();
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
		}
		{
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(0));
			driver.switchTo().window(tabs2.get(1));
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(By.id("frmList:dt_transactionIni_input")));
		}
		/// Verificar o texto presente no Pop-up Distribuição das Transações por Evento
		{
			assertThat(driver.findElement(By.id("frmList:listViewBTAlarm:j_idt14")).getText(), is("Alarmes"));
			assertThat(driver.findElement(By.id("frmList:listViewBTAlarm:j_idt15")).getText(), is("Descrição"));
			assertThat(driver.findElement(By.id("frmList:listViewBTAlarm:j_idt16")).getText(),
					is("Total de Transações"));
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("frmList:dt_transactionIni_input")));
		}
		/// Teste Campo Período
		{
			driver.findElement(By.id("frmList:dt_transactionIni_input")).click();
			driver.findElement(By.id("frmList:dt_transactionIni_input")).clear();
			driver.findElement(By.id("frmList:dt_transactionIni_input")).sendKeys("18/12/2019 8:00");
		}
		{
			driver.findElement(By.id("frmList:dt_transactionFin_input")).click();
			driver.findElement(By.id("frmList:dt_transactionFin_input")).clear();
			driver.findElement(By.id("frmList:dt_transactionFin_input")).sendKeys("18/12/2019 8:05");
		}
		driver.findElement(By.id("frmList:btnApply")).click();
		{
			WebDriverWait wait1 = new WebDriverWait(driver, 30);
			wait1.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(By.id("frmList:btnChartsToVolume")));
		}
		{
			WebDriverWait wait1 = new WebDriverWait(driver, 30);
			wait1.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
		}
		/// Teste Botão Volume
		{
			driver.findElement(By.id("frmList:btnChartsToVolume")).click();
		}
		{
			WebDriverWait wait1 = new WebDriverWait(driver, 30);
			wait1.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
		}
		driver.close();
		{
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(0));
		}
		/// Teste Detalhe por Estabelecimento
		{
			driver.findElement(By.id("listAlarmesDTO1:0:buttonDetailAlarm")).click();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
		}
		{
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));
			driver.manage().window().setSize(new Dimension(1920, 1080));
		}
		/// Teste Campo Período
		{
			driver.findElement(By.id("frmList:dt_transactionIni_input")).click();
			driver.findElement(By.id("frmList:dt_transactionIni_input")).clear();
			driver.findElement(By.id("frmList:dt_transactionIni_input")).sendKeys("18/12/2019 8:00");
		}
		{
			driver.findElement(By.id("frmList:dt_transactionFin_input")).click();
			driver.findElement(By.id("frmList:dt_transactionFin_input")).clear();
			driver.findElement(By.id("frmList:dt_transactionFin_input")).sendKeys("18/12/2019 8:05");
		}
		driver.findElement(By.id("frmList:btnApply")).click();
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
		}
		/// Teste Lista
		{
			driver.findElement(By.id("frmList:listViewBT_rppDD")).click();
		}
		{
			driver.findElement(
					By.xpath("/html/body/form/div[2]/table/tbody/tr[2]/td/div/div[2]/div/div[2]/select/option[2]"))
					.click();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
		}
		{
			driver.findElement(
					By.xpath("/html/body/form/div[2]/table/tbody/tr[2]/td/div/div[2]/div/div[2]/select/option[3]"))
					.click();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
		}
		{
			driver.findElement(
					By.xpath("/html/body/form/div[2]/table/tbody/tr[2]/td/div/div[2]/div/div[2]/select/option[4]"))
					.click();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
		}
		{
			driver.findElement(
					By.xpath("/html/body/form/div[2]/table/tbody/tr[2]/td/div/div[2]/div/div[2]/select/option[5]"))
					.click();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
		}
		{
			driver.findElement(
					By.xpath("/html/body/form/div[2]/table/tbody/tr[2]/td/div/div[2]/div/div[2]/select/option[6]"))
					.click();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
		}
		{
			driver.findElement(
					By.xpath("/html/body/form/div[2]/table/tbody/tr[2]/td/div/div[2]/div/div[2]/select/option[7]"))
					.click();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
		}
		/// Teste Páginação
		{
			driver.findElement(By.xpath("/html/body/form/div[2]/table/tbody/tr[2]/td/div/div[2]/div/div[2]/span[4]"))
					.click();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
		}
		driver.findElement(By.xpath("/html/body/form/div[2]/table/tbody/tr[2]/td/div/div[2]/div/div[2]/span[5]"))
				.click();
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
		}
		{
			driver.findElement(By.xpath("/html/body/form/div[2]/table/tbody/tr[2]/td/div/div[2]/div/div[2]/span[2]"))
					.click();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
		}
		{
			driver.findElement(By.xpath("/html/body/form/div[2]/table/tbody/tr[2]/td/div/div[2]/div/div[2]/span[1]"))
					.click();
		}
		{
			driver.close();
		}
		{
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(0));
		}
		/// Teste Pop-up (+ Detalhes)
		{
			driver.findElement(By.id("btnShowDlgDetailEst")).click();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
		}
		{
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));
			driver.manage().window().setSize(new Dimension(1920, 1080));
		}
		/// Teste Período
		{
			driver.findElement(By.id("frmList:dt_transactionIni_input")).click();
			driver.findElement(By.id("frmList:dt_transactionIni_input")).sendKeys("18/12/2019 08:00");
		}
		{
			driver.findElement(By.id("frmList:dt_transactionFin_input")).click();
			driver.findElement(By.id("frmList:dt_transactionFin_input")).sendKeys("18/12/2019 08:05");
		}
		{
			driver.findElement(By.id("frmList:btnApply")).click();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
		}
		/// Teste Lista
		{
			driver.findElement(By.id("frmList:listAlarmFreq_rppDD")).click();
		}
		{
			driver.findElement(By.xpath("/html/body/form/div[2]/table/tbody/tr[2]/td/div/div[2]/select/option[2]"))
					.click();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
		}
		{
			driver.findElement(By.xpath("/html/body/form/div[2]/table/tbody/tr[2]/td/div/div[2]/select/option[3]"))
					.click();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
		}
		{
			driver.findElement(By.xpath("/html/body/form/div[2]/table/tbody/tr[2]/td/div/div[2]/select/option[4]"))
					.click();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
		}
		{
			driver.findElement(By.xpath("/html/body/form/div[2]/table/tbody/tr[2]/td/div/div[2]/select/option[5]"))
					.click();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
		}
		{
			driver.findElement(By.xpath("/html/body/form/div[2]/table/tbody/tr[2]/td/div/div[2]/select/option[6]"))
					.click();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
		}
		/// Teste Botão Exportação
		{
			driver.findElement(By.id("frmList:btnXLS")).click();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
		}
		/// Teste Botão Hostname
		{
			driver.findElement(By.id("frmList:btnHostname")).click();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
		}
		{
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(2));
			driver.manage().window().setSize(new Dimension(1920, 1080));
		}
		/// Verificar Texto no pop-up Hostname
		{
			assertThat(driver
					.findElement(
							By.xpath("/html/body/form/div[2]/table/tbody/tr/td/div/div/table/thead/tr[1]/th[3]/span"))
					.getText(), is("Transações no período selecionado"));
		}
		driver.close();
		{
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));
		}
		/// Teste botão FrontEnd
		{
			driver.findElement(By.id("frmList:btnFrontend")).click();
		}
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
		}
		{
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(2));
		}
		/// Verificar Texto no pop-up FrontEnd
		{
			assertThat(driver.findElement(By.xpath("/html/body/form/div[2]/table/tbody/tr/td/table/thead/tr[1]/th[4]"))
					.getText(), is("Transações no período selecionado"));
		}
		{
			driver.close();
		}
		{
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));
		}
		{
			driver.close();
		}
		{
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(0));
		}
		{
			driver.close();
		}
		}
		
		/// TesteAlarmes
		@Test
		public void TestGraficos() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://192.168.80.18:8081/mir.console");
			driver.manage().window().setSize(new Dimension(1920, 1080));
			/// Login
			driver.findElement(By.id("formLogin:txtUsuario")).click();
			driver.findElement(By.id("formLogin:txtUsuario")).sendKeys("qa");
			driver.findElement(By.id("formLogin:txtPassword")).sendKeys("Unicom@10");
			driver.findElement(By.id("formLogin:linkLogin")).click();
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".ui-mnu-bt")));
			}
			{
				WebElement element = driver.findElement(By.cssSelector(".ui-mnu-bt"));
				Actions builder = new Actions(driver);
				builder.moveToElement(element).perform();
			}
			/// Menu Visão Bandeiras
			{
				driver.findElement(By.linkText("Visão - Bandeiras")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			/// Pause
			driver.findElement(By.id("btnPause")).click();
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			/// Teste Insetir 5 Datas
			{
				driver.findElement(By.id("txtDateGrap_input")).click();
				driver.findElement(By.id("txtDateGrap_input")).sendKeys("29/12/2019");
			}
			{
				driver.findElement(By.id("addDate")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			{
				driver.findElement(By.id("txtDateGrap_input")).click();
				driver.findElement(By.id("txtDateGrap_input")).sendKeys("28/12/2019");
			}
			{
				driver.findElement(By.id("addDate")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			{
				driver.findElement(By.id("txtDateGrap_input")).click();
				driver.findElement(By.id("txtDateGrap_input")).sendKeys("20/12/2019");
			}
			{
				driver.findElement(By.id("addDate")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			{
				driver.findElement(By.id("txtDateGrap_input")).click();
				driver.findElement(By.id("txtDateGrap_input")).sendKeys("10/12/2019");
			}
			{
				driver.findElement(By.id("addDate")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			{
				driver.findElement(By.id("txtDateGrap_input")).click();
				driver.findElement(By.id("txtDateGrap_input")).sendKeys("15/12/2019");
			}
			{
				driver.findElement(By.id("addDate")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			/// Verificar se está exibindo a mensagem
			{
				driver.findElement(By.xpath("html/body/div[10]/div/div/div[2]/span"));
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			{
				driver.findElement(By.id("cleanDate")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			{
				driver.findElement(By.id("interval_label")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[12]/div/ul/li[2]")));
			}
			{
				driver.findElement(By.xpath("/html/body/div[12]/div/ul/li[2]")).click();
			}
			{
				driver.findElement(By.id("applyPeriod")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			{
				driver.findElement(By.id("interval_label")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[12]/div/ul/li[3]")));
			}
			{
				driver.findElement(By.xpath("/html/body/div[12]/div/ul/li[3]")).click();
			}
			{
				driver.findElement(By.id("applyPeriod")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			{
				driver.findElement(By.id("interval_label")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"interval_panel\"]/div/ul/li[4]")));
			}
			{
				driver.findElement(By.xpath("//*[@id=\"interval_panel\"]/div/ul/li[4]")).click();
			}
			{
				driver.findElement(By.id("applyPeriod")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			{
				driver.findElement(By.id("interval_label")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 120);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"interval_panel\"]/div/ul/li[5]")));
			}
			{
				driver.findElement(By.xpath("//*[@id=\"interval_panel\"]/div/ul/li[5]")).click();
			}
			{
				driver.findElement(By.id("applyPeriod")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			{
				driver.findElement(By.id("period")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"period_panel\"]/div/ul/li[2]")));
			}
			{
				driver.findElement(By.xpath("//*[@id=\"period_panel\"]/div/ul/li[2]")).click();
			}
			{
				driver.findElement(By.id("applyPeriod")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			{
				driver.findElement(By.id("period")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"period_panel\"]/div/ul/li[3]")));
			}
			{
				driver.findElement(By.xpath("//*[@id=\"period_panel\"]/div/ul/li[3]")).click();
			}
			{
				driver.findElement(By.id("applyPeriod")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			{
				driver.findElement(By.id("period")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"period_panel\"]/div/ul/li[4]")));
			}
			{
				driver.findElement(By.xpath("//*[@id=\"period_panel\"]/div/ul/li[4]")).click();
			}
			{
				driver.findElement(By.id("applyPeriod")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			{
				driver.findElement(By.id("period")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"period_panel\"]/div/ul/li[5]")));
			}
			{
				driver.findElement(By.xpath("//*[@id=\"period_panel\"]/div/ul/li[5]")).click();
			}
			{
				driver.findElement(By.id("applyPeriod")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 120);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			{
				driver.findElement(By.id("btnShowDlgGeneric")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 120);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			{
				ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(tabs2.get(0));
				driver.switchTo().window(tabs2.get(1));
				driver.manage().window().setSize(new Dimension(1920, 1080));
			}
			{
				driver.findElement(By.id("interval")).click();
			}
			{
				driver.findElement(By.xpath("/html/body/div[4]/div/ul/li[1]")).click();
			}
			{
				driver.findElement(By.id("period")).click();
			}
			{
				driver.findElement(By.xpath("/html/body/div[5]/div/ul/li[1]")).click();
			}
			{
				driver.findElement(By.id("applyPeriod")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 60);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2_modal")));
			}
			{
				driver.findElement(By.id("txtDateGrap_input")).click();
				driver.findElement(By.id("txtDateGrap_input")).sendKeys("29/12/2019");
			}
			{
				driver.findElement(By.id("addDate")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 60);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2_modal")));
			}
			{
				driver.findElement(By.id("txtDateGrap_input")).click();
				driver.findElement(By.id("txtDateGrap_input")).sendKeys("28/12/2019");
			}
			{
				driver.findElement(By.id("addDate")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 60);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2_modal")));
			}
			{
				driver.findElement(By.id("txtDateGrap_input")).click();
				driver.findElement(By.id("txtDateGrap_input")).sendKeys("20/12/2019");
			}
			{
				driver.findElement(By.id("addDate")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 60);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2_modal")));
			}
			{
				driver.findElement(By.id("txtDateGrap_input")).click();
				driver.findElement(By.id("txtDateGrap_input")).sendKeys("10/12/2019");
			}
			{
				driver.findElement(By.id("addDate")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 60);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2_modal")));
			}
			{
				driver.findElement(By.id("txtDateGrap_input")).click();
				driver.findElement(By.id("txtDateGrap_input")).sendKeys("15/12/2019");
			}
			{
				driver.findElement(By.id("addDate")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 60);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2_modal")));
			}
			/// Verificar se está exibindo a mensagem
			{
				driver.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/span"));
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2_modal")));
			}
			{
				driver.findElement(By.id("cleanDate")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 60);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2_modal")));
			}
			{
				driver.findElement(By.id("interval")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 60);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"interval_panel\"]/div/ul/li[2]")));
			}
			{
				driver.findElement(By.xpath("//*[@id=\"interval_panel\"]/div/ul/li[2]")).click();
			}
			{
				driver.findElement(By.id("applyPeriod")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2_modal")));
			}
			{
				driver.findElement(By.id("interval")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/ul/li[3]")));
			}
			{
				driver.findElement(By.xpath("/html/body/div[4]/div/ul/li[3]")).click();
			}
			{
				driver.findElement(By.id("applyPeriod")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2_modal")));
			}
			{
				driver.findElement(By.id("interval")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/ul/li[4]")));
			}
			{
				driver.findElement(By.xpath("/html/body/div[4]/div/ul/li[4]")).click();
			}
			{
				driver.findElement(By.id("applyPeriod")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2_modal")));
			}
			{
				driver.findElement(By.id("interval")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 120);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/ul/li[5]")));
			}
			{
				driver.findElement(By.xpath("/html/body/div[4]/div/ul/li[5]")).click();
			}
			{
				driver.findElement(By.id("applyPeriod")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2_modal")));
			}
			{
				driver.findElement(By.id("period")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div/ul/li[2]")));
			}
			{
				driver.findElement(By.xpath("/html/body/div[5]/div/ul/li[2]")).click();
			}
			{
				driver.findElement(By.id("applyPeriod")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2_modal")));
			}
			{
				driver.findElement(By.id("period")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div/ul/li[3]")));
			}
			{
				driver.findElement(By.xpath("/html/body/div[5]/div/ul/li[3]")).click();
			}
			{
				driver.findElement(By.id("applyPeriod")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2_modal")));
			}
			{
				driver.findElement(By.id("period")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div/ul/li[4]")));
			}
			{
				driver.findElement(By.xpath("/html/body/div[5]/div/ul/li[4]")).click();
			}
			{
				driver.findElement(By.id("applyPeriod")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2_modal")));
			}
			{
				driver.findElement(By.id("period")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div/ul/li[5]")));
			}
			{
				driver.findElement(By.xpath("/html/body/div[5]/div/ul/li[5]")).click();
			}
			{
				driver.findElement(By.id("applyPeriod")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 120);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2_modal")));
			}
			{
				driver.findElement(By.id("interval")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 60);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"interval_panel\"]/div/ul/li[2]")));
			}
			{
				driver.findElement(By.xpath("//*[@id=\"interval_panel\"]/div/ul/li[2]")).click();
			}
			{
				driver.findElement(By.id("period")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div/ul/li[2]")));
			}
			{
				driver.findElement(By.xpath("/html/body/div[5]/div/ul/li[2]")).click();
			}
			{
				driver.findElement(By.id("applyPeriod")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2_modal")));
			}
			{
				driver.findElement(By.id("btnChartBar")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 120);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2_modal")));
			}
			{
				driver.findElement(By.id("btnChanceGrap")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 120);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2_modal")));
			}
			{
				driver.findElement(By.id("btnChartBar")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 120);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2_modal")));
			}
			{
				driver.findElement(By.id("btnChanceGrap")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 120);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2_modal")));
			}
			{
				driver.findElement(By.id("j_idt49")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 120);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2_modal")));
			}
			{
				driver.findElement(By.id("btnPdf")).click();
			}
			{
				driver.findElement(By.id("btnCvs")).click();
			}
			{
				driver.findElement(By.id("btnXls")).click();
			}
			{
				driver.quit();
			}	
}
		/// TesteAlarmes
				@Test
				public void TestNavegacao() {
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://192.168.80.18:8081/mir.console");
				driver.manage().window().setSize(new Dimension(1920, 1080));
				/// Login
				driver.findElement(By.id("formLogin:txtUsuario")).click();
				driver.findElement(By.id("formLogin:txtUsuario")).sendKeys("qa");
				driver.findElement(By.id("formLogin:txtPassword")).sendKeys("Unicom@10");
				driver.findElement(By.id("formLogin:linkLogin")).click();
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".ui-mnu-bt")));
			}
			{
				WebElement element = driver.findElement(By.cssSelector(".ui-mnu-bt"));
				Actions builder = new Actions(driver);
				builder.moveToElement(element).perform();
			}
				/// Menu Visão Bandeiras
			{
				driver.findElement(By.linkText("Visão - Bandeiras")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
				/// Pause
				driver.findElement(By.id("btnPause")).click();
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			/// Verificar Redes
			{
				WebElement element = driver.findElement(By.xpath("//*[@id=\"listViewBTBrandDTO_data\"]/tr[1]"));
				Actions builder = new Actions(driver);
				builder.moveToElement(element).contextClick().perform();
			}
			{
			driver.findElement(By.id("mnuitemRedirectNet")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			/// Verificar Texto no título da página
			{
				assertThat(driver.findElement(By.xpath("//*[@id=\"mainpanel_header\"]/span")).getText(), is("Visão - Redes >> Origem: Visão - Bandeiras"));
			}
			{
				WebElement element = driver.findElement(By.cssSelector(".ui-mnu-bt"));
				Actions builder = new Actions(driver);
				builder.moveToElement(element).perform();
			}
				/// Menu Visão Bandeiras
			{
				driver.findElement(By.linkText("Visão - Bandeiras")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
				/// Pause
				driver.findElement(By.id("btnPause")).click();
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			/// Verificar Emissores
			{
				WebElement element = driver.findElement(By.xpath("//*[@id=\"listViewBTBrandDTO_data\"]/tr[1]"));
				Actions builder = new Actions(driver);
				builder.moveToElement(element).contextClick().perform();
			}
			{
			driver.findElement(By.id("mnuitemRedirectIssuer")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			/// Verificar Texto no título da página
			{
				assertThat(driver.findElement(By.xpath("//*[@id=\"mainpanel_header\"]/span")).getText(), is("Visão - Emissor >> Origem: Visão - Bandeiras"));
			}
			{
				WebElement element = driver.findElement(By.cssSelector(".ui-mnu-bt"));
				Actions builder = new Actions(driver);
				builder.moveToElement(element).perform();
			}
				/// Menu Visão Bandeiras
			{
				driver.findElement(By.linkText("Visão - Bandeiras")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
				/// Pause
				driver.findElement(By.id("btnPause")).click();
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			{
				driver.findElement(By.id("btnShowDlgDetail")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar")));
			}
			{
				ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(tabs2.get(0));
				driver.switchTo().window(tabs2.get(1));
				driver.manage().window().setSize(new Dimension(1920, 1080));
			}
			{
				driver.findElement(By.id("frmList:btnPause")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
			}
			{
				driver.findElement(By.id("frmList:dt_transactionIni_input")).click();
				driver.findElement(By.id("frmList:dt_transactionIni_input")).sendKeys("26/05/2019 23:00");
			}
			{
				driver.findElement(By.id("frmList:dt_transactionFin_input")).click();
				driver.findElement(By.id("frmList:dt_transactionFin_input")).sendKeys("26/05/2019 23:59");
			}
			{
				driver.findElement(By.id("frmList:btnApply")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
			}
			{
				driver.findElement(By.id("frmList:percentual")).click();
				driver.findElement(By.id("frmList:percentual")).clear();
				driver.findElement(By.id("frmList:percentual")).sendKeys("2");
			}
			{
				driver.findElement(By.id("frmList:coluna_label")).click();
				driver.findElement(By.xpath("//*[@id=\"frmList:coluna_panel\"]/div/ul/li[2]")).click();
			}
			{
				driver.findElement(By.id("frmList:btnImpacto")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
			}
			{
				driver.findElement(By.id("frmList:coluna_label")).click();
				driver.findElement(By.xpath("//*[@id=\"frmList:coluna_panel\"]/div/ul/li[3]")).click();
			}
			{
				driver.findElement(By.id("frmList:btnImpacto")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
			}
			{
				driver.findElement(By.id("frmList:btnCalc15")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
			}
			{
				assertThat(driver.findElement(By.xpath("//*[@id=\"frmList:modalRegra15Min\"]/div[1]")).getText(), is("Resumo dos 15 Minutos"));
			}
			{
				driver.findElement(By.xpath("//*[@id=\"frmList:modalRegra15Min\"]/div[1]/a/span")).click();
			}
			{
				driver.findElement(By.id("j_idt45:btnCsvExtract")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 120);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
			}
			{
				driver.findElement(By.id("j_idt45:btnCsv")).click();
			}
			{
				WebDriverWait wait = new WebDriverWait(driver, 120);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dialogLoadbar2")));
			}
			{
				driver.close();
			}
			{
				ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(tabs2.get(0));
			}
			{
				driver.findElement(By.id("j_idt59:j_idt59")).click();
			}
			{
				driver.findElement(By.xpath("//*[@id=\"helpContent\"]")).getText();

			}
			{
			driver.quit();
			}	
}
}
