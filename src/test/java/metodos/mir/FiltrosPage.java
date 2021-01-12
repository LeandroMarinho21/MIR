package metodos.mir;

import org.openqa.selenium.WebDriver;

public class FiltrosPage extends Filtros {
	
	public FiltrosPage(WebDriver driver) {
	}

	public void aguardarBotaoFiltro(WebDriver driver) {
		waitingtoclick(driver, "btnFilter");
	}
	
}
