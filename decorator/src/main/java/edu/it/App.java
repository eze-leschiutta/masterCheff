package edu.it;

import java.io.File;
import java.util.function.Predicate;
import org.apache.commons.io.FileUtils;

public class App {
    public static void main(String[] args) {
        Predicate<Integer> esPar = z -> z % 2 == 0;
        String archSalida = null;

        try {
            if (args.length == 0) {
                throw new RuntimeException("Debe enviar [txt, html]");
            }
            if (args[0].contains("txt")) {
                archSalida = "/tmp/salida.txt";
            }
            if (args[0].contains("html")) {
                archSalida = "/tmp/salida.html";
            }

            IContador contadorComun = new Contador(z -> " hola");
            IContador contadorWrapper = new ContadorWrapper(contadorComun);
            IContador icont = null;

            StringBuilder strBld = new StringBuilder();

            for (int x = 1; x <= 10; x++) {
                if (esPar.test(x)) {
                    icont = contadorWrapper;
                }
                else {
                    icont = contadorComun;
                }

                strBld.append(icont.obtenerTexto());
                strBld.append("\n");
                strBld.append("\n");
            }

            FileUtils.writeStringToFile(new File(archSalida),
                    strBld.toString(), "utf8");
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
