package org.ronal.poointerfaces.imprenta.modelo;

public interface Imprimible {
    final static String TEXTO_DEFECTO = "Imprimiento el valor por defecto";

    default String imprimir() {
        return TEXTO_DEFECTO;
    }

    ;


    static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }
}
