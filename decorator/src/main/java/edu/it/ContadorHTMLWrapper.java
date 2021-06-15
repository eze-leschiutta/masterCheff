package edu.it;

public class ContadorHTMLWrapper implements IContador {
    private IContador contador;

    public ContadorHTMLWrapper(IContador contador) {
        this.contador = contador;
    }
    public String obtenerTexto() {
        String[] arrStr = contador.obtenerTexto().split("\n");
        StringBuilder strBld = new StringBuilder();

        for (String s : arrStr) {
            strBld.append("<h4>");
            strBld.append(s);
            strBld.append("</h4>");
            strBld.append("<br />");
        }

        return strBld.toString();
    }
}
