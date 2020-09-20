package Basic;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;


public class TestAutomacao extends BaseTest {

    @Test
    public void testCadastrarERemoverUsuario() {

        navegador.findElement(By.name("form_usuario")).sendKeys("Aluno");
        navegador.findElement(By.name("form_senha")).sendKeys("123456");
        navegador.findElement(By.name("form_nome")).sendKeys("Aluno Cadastrado");
        navegador.findElement(By.xpath("//tr[7]/td/input")).click();
        assertEquals("Aluno Cadastrado","Aluno Cadastrado");
        navegador.findElement(By.linkText("Clique aqui")).click();
        navegador.findElement(By.linkText("Apagar")).click();

    }

}
