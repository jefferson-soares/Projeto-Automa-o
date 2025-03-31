package applicationTest.teste;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
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

        navegador.getTitle();

        assertEquals("Register", navegador.getTitle(), "O título da página não corresponde ao esperado");

        //navegador.close();
    }
}
