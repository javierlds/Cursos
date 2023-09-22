package variables;

public class DeclaracionVariable {
    private String texto;

    public String enviaTexto(String textoEnviado){
        texto = textoEnviado;
        return texto;
    }

    public String textoMayuscula(String texto){
        String textoMay = texto.toUpperCase();
        return textoMay;
    }

    public String textoMinuscula(String textoMin){
        String textoMinuscula = textoMin.toLowerCase();
        return textoMinuscula;
    }

}
