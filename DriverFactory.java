package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

	
	WebDriver driver;
	
	public void abrirNavegador(String url) {
		System.setProperty("webdriver.chrome.driver", "C:/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public void digitar(String texto, By elemento) {
		
		driver.findElement(elemento).sendKeys(texto);
	}
	
	public void clicar(By elemento) {
		
		driver.findElement(elemento).click();
	}
	
	public void espera() {
		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
	       e.printStackTrace();
		}
	
	}
	
	public void fechar() {
		driver.close();
	}
	
}
