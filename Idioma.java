package com.aluracursos.Pedro.model;

public enum Idioma {
    FRANCES("fr"),
    PORTUGUES("po"),
    ESPAÑOL("es"),
    INGLES("en"),
;

    private String idiomaGu;

    Idioma(String idiomaGu) {
        this.idiomaGu = idiomaGu;
    }

    public static Idioma getIdioma(String idiomaGu) {
        for (Idioma idioma : Idioma.values()) {
            if(idioma.idiomaGu.equals(idiomaGu)){
                return idioma;
            }
        }
        throw new IllegalArgumentException("Idioma no encontrado: "+idiomaGu);
    }
}
