package FichaUsuario;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    WebDriver navegador;

    @Before
    public void abreNavegador() {
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.get("http://demo.automationtesting.in");
    }

    @After
    public void fechaNavegador() {
        navegador.quit();
    }
}
