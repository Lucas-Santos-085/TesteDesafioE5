package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static suporte.Driver.*;//utiliza os métodos da classe Driver sem o uso do extends

public class PageE5B {
		
	public void inserirUsername(String username) {
		getDriver().findElement(By.xpath("//label[.='Username']/..//div//input")).clear();
		getDriver().findElement(By.xpath("//label[.='Username']/..//div//input")).sendKeys(username);
		
	}
	public PageE5B repetirUsername(String usernameRepetido) {
		getDriver().findElement(By.xpath("//label[.='Username (repetir)']/..//div//input")).clear();
		getDriver().findElement(By.xpath("//label[.='Username (repetir)']/..//div//input")).sendKeys(usernameRepetido);
		return this;
	}
	
	public PageE5B inserirSenha(String senha) {
		getDriver().findElement(By.xpath("//label[.='Password']/..//div//input")).sendKeys(senha);
		return this;
	
	}
	
	public PageE5B repetirSenha(String senhaRepetida) {
		getDriver().findElement(By.xpath("//label[.='Password (repetir)']/..//div//input")).sendKeys(senhaRepetida);
		return this;
	
	}
	
	public PageE5B clicarEnviar() {
		getDriver().findElement(By.id("submitBtn2")).click();
		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return this;
	}
	
	public String obterMensagemErro() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 20);
		wait.until(ExpectedConditions.visibilityOf(getDriver().findElement(By.id("errorDiv2"))));
		
		return getDriver().findElement(By.id("errorDiv2")).getText();
	}
	
}

