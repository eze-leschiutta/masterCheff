package edu.it.ejemplosimple;

import edu.it.estados.IState;
import static edu.it.util.Utiles.dormir;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Estado1 implements IState {
    public IState go() {
        System.out.println("Estado 1");
        System.setProperty("webdriver.chrome.driver", "C:\\cursos\\masterCheff\\chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.cronista.com/");

        dormir(5);

        List<WebElement> elementos = webDriver.findElements(By.className("title"));
        for (WebElement we : elementos) {
            System.out.println(we.getText());
        }

        dormir(5);

        webDriver.close();

        return new Estado2();
    }
}
