package edu.it.maquinaestados;

import edu.it.estados.IState;

public class EstadoInicial implements IState {
    public IState go() {
        System.setProperty("webdriver.chrome.driver", "C:\\cursos\\masterCheff\\chromedriver.exe");
        return new CotizacionNyse();
    }
}
