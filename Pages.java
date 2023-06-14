package pages;

import org.openqa.selenium.By;

import helper.DriverFactory;

public class Pages extends DriverFactory {

	
	public void fazerLogin() {
		digitar("0000", campoAgencia);
		digitar("00000-0", campoConta);
		digitar("584867", campoSenha);
		clicar(buttonLogin);
		
	}
	
	private By campoAgencia = By.xpath("//*[@id=\"agencia\"]");
	private By campoConta = By.xpath("//*[@id=\"conta\"]");
	private By campoSenha = By.xpath("//*[@id=\"mbr-slide-1\"]/div/div/div[2]/div[1]");
	private By buttonLogin = By.xpath("//*[@id=\"header\"]/div[2]/div/div[3]/form/button[1]");
	
	public By getCampoAgencia() {
		return campoAgencia;
	}

	public By getCampoConta() {
		return campoConta;
	}

	public By getCampoSenha() {
		return campoSenha;
	}

	public By getButtonLogin() {
		return buttonLogin;
	}
	
	
	
}
