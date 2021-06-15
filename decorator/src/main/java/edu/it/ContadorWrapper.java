package edu.it;

public class ContadorWrapper implements IContador {
    private IContador contador;

    public ContadorWrapper(IContador contador) {
        this.contador = contador;
    }
    public String obtenerTexto() {
        return new StringBuilder()
                .append("**********************")
                .append("\n")
                .append(contador.obtenerTexto())
                .append("\n")
                .append("**********************")
                .toString();
    }
}
