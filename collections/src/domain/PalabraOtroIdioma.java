package domain;

public class PalabraOtroIdioma extends Palabra{

    private String pronunciacionEspaniol;

    public PalabraOtroIdioma(String palabra, String significado,
                             String idioma, String pronunciacionEspaniol) {
        super(palabra, significado, idioma);
        this.pronunciacionEspaniol = pronunciacionEspaniol;
    }

    public String getPronunciacionEspaniol() {
        return pronunciacionEspaniol;
    }
}
