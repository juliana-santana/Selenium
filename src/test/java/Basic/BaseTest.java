package Basic;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    WebDriver navegador;

    @Before
    public void abreNavegador() {
        //Preparação
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.get("http://www.aprendendotestar.com.br/treinar-automacao.php");
    }

    @After
    public void fechaNavegador() {
            navegador.quit();

    }
}
