package edu.it.maquinaestados;

import edu.it.estados.IState;
import edu.it.model.DatosActivos;
import static edu.it.util.Utiles.dormir;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CotizacionNyse implements IState {
    public IState go() {
        WebDriver webDriver = null;
        try {
            webDriver = new ChromeDriver();
            webDriver.get("https://www.invertironline.com/titulo/cotizacion/NYSE/YPF/YPF/");
            WebElement elemento = webDriver.findElement(By.id("IdTitulo"));
            String parseable = elemento.getText()
                    .replace("US$ ", "")
                    .replace(",", ".");
            System.out.println(parseable);

            DatosActivos.precioNyse = parseable;

            webDriver.close();
            dormir(5);
        }
        catch (Exception ex) {
            webDriver.close();
            System.out.println(ex.getMessage());
        }

        return new CotizacionRosario();
    }
}
