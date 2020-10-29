package sms.visoes;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteSMSEmissor extends SmsMetodos{

	/// TesteSMSEmissor
	@Test
	public void Testsmsemissor() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://192.168.80.18:8081/mir.console/pages/view/viewissuer.jsf");
		 driver.get("https://10.59.184.60/mir.console/pages/view/viewissuer.jsf");
		/// Erro de Privacidade
		click(driver, "details-button");
		click(driver, "proceed-link");
			waitingtoclick(driver, "formLogin:txtUsuario");
		/// Login
		click(driver, "formLogin:txtUsuario");
		escreverlogin(driver, "formLogin:txtUsuario");
		escreversenhaenter(driver, "formLogin:txtPassword");
		// Pause
			waitingtoclick(driver, "listViewBTIssuerDTO:0:tbody_desc");
			waiting(driver, "dialogLoadbar");
		click(driver, "btnPause");
		// Selecionado um emissor
			waiting(driver, "dialogLoadbar");
		click(driver, "listViewBTIssuerDTO:0:tbody_desc");
			waiting(driver, "dialogLoadbar");
		// Selecionando o botão de SMS
		click(driver, "listAlarmesDTO1:0:j_idt309:btnSendSMS");
			waiting(driver, "dialogLoadbar");
		// Mudando de pagina
		changewindow(driver, null);
			waitingtoclickx(driver, "/html/body/form/table/tbody/tr[2]/td/div/div[3]");
		// Enviando SMS para um contato
		clickx(driver, "/html/body/form/table/tbody/tr[2]/td/div/div[3]");
		escrevercontatox(driver, "//*[@id=\"frmCadastroSmsMessage:selectContacts_panel\"]/div[1]/div[2]/input");
		clickx(driver, "/html/body/div[3]/div[2]/ul/li[12]/div/div[2]");
		click(driver, "frmCadastroSmsMessage:btnSendSMS");
			waiting2(driver, "dialogLoadbar2");
		// Verificar se o pop-up de sms já enviado é exibido
		if (driver.findElement(By.xpath("//*[@id=\"frmCadastroSmsMessage:j_idt23\"]/div[1]")).isDisplayed()) {
			driver.findElement(By.cssSelector("#frmCadastroSmsMessage\\:confirm")).click();
			waiting2(driver, "dialogLoadbar2");
		}
		equals(driver, "div > div > div.ui-growl-message > span");
		driver.quit();
	}
}
