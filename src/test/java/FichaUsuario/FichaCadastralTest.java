package FichaUsuario;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class FichaCadastralTest extends BaseTest {

    @Test
    public void testFichaCadastralUsuario(){

        //Informando um Email
        navegador.findElement(By.id("email")).sendKeys("teste@tes.com");
        navegador.findElement(By.xpath("//*[@id=\"enterimg\"]")).click();

        //Realizando o cadastro
        navegador.findElement(By.cssSelector("input[placeholder=\"First Name\" ]:nth-of-type(1)")).sendKeys("FichaUsuario");
        navegador.findElement(By.cssSelector("input[placeholder=\"Last Name\" ]:nth-of-type(1)")).sendKeys("Cadastro");
        navegador.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Rua ABC Nº123");
        navegador.findElement(By.cssSelector("input[ng-model=\"EmailAdress\" ]:nth-of-type(1)")).sendKeys("acbb@tmee.com");
        navegador.findElement(By.cssSelector("input[ng-model=\"Phone\" ]:nth-of-type(1)")).sendKeys("5380309044");
        navegador.findElement(By.cssSelector("input[value=\"Male\" ]:nth-of-type(1)")).click();
        navegador.findElement(By.id("checkbox1")).click();
        navegador.findElement(By.id("checkbox3")).click();
        navegador.findElement(By.id("Skills")).click();
        WebElement comboboxElement=navegador.findElement(By.id("Skills"));
        Select combobox=new Select(comboboxElement);
        combobox.selectByValue("Adobe InDesign");
        navegador.findElement(By.id("countries")).click();
        comboboxElement=navegador.findElement(By.id("countries"));
        combobox=new Select(comboboxElement);
        combobox.selectByValue("Brazil");
        WebElement pesquisa=navegador.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span"));
        pesquisa.sendKeys("Hong Kong");
        pesquisa.sendKeys(Keys.ENTER);
        navegador.findElement(By.id("yearbox")).sendKeys("1993");
        navegador.findElement(By.cssSelector("select[placeholder=\"Month\" ]:nth-of-type(1)")).sendKeys("December");
        navegador.findElement(By.id("daybox")).sendKeys("27");
        navegador.findElement(By.id("firstpassword")).sendKeys("aBc123456");
        navegador.findElement(By.id("secondpassword")).sendKeys("aBc123456");
        navegador.findElement(By.id("submitbtn")).click();
        String url="http://demo.automationtesting.in/WebTable.html";
        String titulo;
        navegador.get(url);
        titulo=navegador.getTitle();
        System.out.println("O título da página que confirma o cadastro é: "+titulo);

    }
}
