package Suites;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import suporte.Driver;
import tests.DesafioE5;


@RunWith (Suite.class)
@SuiteClasses ({

	DesafioE5.class
	
})


public class SuiteE5 extends Driver {
	
	@BeforeClass
	public static void inicializar() {
	
	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lucas\\Documents\\SELENIUM\\Driver Selenium Chrome\\chromedriver.exe");
	getDriver().get("http://eliasnogueira.com/arquivos_blog/selenium/desafio/5desafio/");
		
	}
		
	@AfterClass
	public static void finalizaTudo() {
		terminar();
	}
	
}
