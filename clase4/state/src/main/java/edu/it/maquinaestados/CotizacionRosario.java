package edu.it.maquinaestados;

import edu.it.estados.IState;
import edu.it.model.DatosActivos;
import static edu.it.util.Utiles.dormir;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CotizacionRosario implements IState {
    public IState go() {
        WebDriver webDriver = null;
        try {
            webDriver = new ChromeDriver();
            webDriver.get("https://www.invertironline.com/titulo/cotizacion/BCBA/YPFD/YPF/");
            WebElement elemento = webDriver.findElement(By.id("IdTitulo"));
            String parseable = elemento.getText()
                    .replace("$ ", "")
                    .replace(",", ".");
            System.out.println(parseable);

            DatosActivos.precioRosario = parseable;

            webDriver.close();
            dormir(5);
        }
        catch (Exception ex) {
            try { webDriver.close(); } catch (Exception ex2) {}
            System.out.println(ex.getMessage());
            return new IngresoValorLocalManual();
        }

        return new PublicarContadoConLiqui();
    }
}
