package Pages;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

@DisplayName("Testes para a funcionalidade de login")
public class LoginInvalidoTests {

    @Test
    public void TestLoginValido() {


        //Abrindo navegador passando argumento para abrir a tela maximizado
        WebDriver navegador = new ChromeDriver(new ChromeOptions().addArguments("--start-maximized"));

        //Navegando até a url destino
        navegador.get("https://www.saucedemo.com/");

        //Aguardar um tempo definido para carregamento dos elementos da tela
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        validação do título da página;
        WebElement validaTitulo = navegador.findElement(By.className("null"));
        System.out.println(validaTitulo);


        navegador.close();


    }
}
