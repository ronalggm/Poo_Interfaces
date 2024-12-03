package org.ronal.poointerfaces.imprenta;

import org.ronal.poointerfaces.imprenta.modelo.*;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculum cv = new Curriculum("John doe", "Ingeniero de sistemas", "Resumen laboral...");
        cv.addExperiencia("JAVA")
                .addExperiencia("Oracle dba")
                .addExperiencia("Spring Framework")
                .addExperiencia("Desarrollador FullStack")
                .addExperiencia("Angular");


        Informe informe = new Informe("Martin Fower", "James", "Estudio sobre microservicios");

        System.out.println();
        imprimir(cv);
        imprimir(informe);


        System.out.println("LIBRO:");
        Libro libro = new Libro("Erich Gamma", "Patrones de diseño", Genero.PROGRAMACION);
    }

    public static void imprimir(Hoja imprimible) {
        System.out.println(imprimible.imprimir());
    }
}
