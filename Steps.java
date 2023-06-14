package steps;

import org.junit.After;
import org.junit.Before;

import helper.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Pages;

public class Steps extends DriverFactory {

	Pages pages = new Pages();
	
	
	@Before
	public void antesTeste() {
		
		abrirNavegador("https://www.itau.com.br/");
	}
	
	@After
	public void depoisTeste() {
		fechar();
	}
	
	@Given("que esteja na tela de login")
	public void que_esteja_na_tela_de_login() {
	   pages.fazerLogin();
	}

	@When("informar os dados de login")
	public void informar_os_dados_de_login() {
	    
	}

	@When("selecionar o button login")
	public void selecionar_o_button_login() {
	   
	}

	@Then("visualizo a tela inicial da aplicacao")
	public void visualizo_a_tela_inicial_da_aplicacao() {
	   
	}
	
	
}
