package org.ronal.poointerfaces.imprenta.modelo;

public class Pagina extends Hoja {

    public Pagina(String contenido) {
        super(contenido);
    }

    @Override
    public String imprimir() {
        return super.contenido;
    }
}
