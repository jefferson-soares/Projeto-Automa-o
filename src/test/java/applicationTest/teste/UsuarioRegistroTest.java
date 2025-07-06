package applicationTest.teste;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Testes para Registrar um novo usuário")
public class UsuarioRegistroTest {

    @Test
    public void testeRegistroUsuarioComSucesso() {

        //Instanciando o ChromeDriver e abrindo o navegador maximizado
        WebDriver navegador = new ChromeDriver(new ChromeOptions().addArguments("--start-maximized"));

        //Navegando até a página de registro do site proposto
        navegador.get("https://demo.automationtesting.in/Register.html");

        //Pegando o Título da página
        navegador.getTitle();

        //Validar o Título da página
        assertEquals("Register", navegador.getTitle(), "O título da página não corresponde ao esperado");

        navegador.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Jefferson");

        navegador.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Soares");

        //está com erro validar depois
        //navegador.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-valid ng-touched']")).sendKeys("Teste para validar xxpto");

        navegador.findElement(By.cssSelector("input[type='email']")).sendKeys("teste@gmail.com");

        navegador.findElement(By.cssSelector("input[type='tel']")).sendKeys("619827884");
        

        //Fechar navegador
        //navegador.close();
    }
}
