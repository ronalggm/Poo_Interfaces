package org.ronal.poointerfaces.imprenta.modelo;

public class Curriculum extends Hoja {
   public Curriculum(String contenido){
       super(contenido);
   }

    @Override
    public String imprimir() {
        return "";
    }
}
