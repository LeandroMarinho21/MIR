package metodos.mir;

import org.openqa.selenium.WebDriver;



public class FiltrosPage {
	private Filtros filtros;
	
	public FiltrosPage(WebDriver driver) {
	}

	public void aguardarBotaoFiltro(WebDriver driver) {
		filtros.waitingtoclick("btnFilter");
	}
	
}
