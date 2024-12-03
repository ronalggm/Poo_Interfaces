package org.ronal.poointerfaces.imprenta;

import org.ronal.poointerfaces.imprenta.modelo.*;

import static org.ronal.poointerfaces.imprenta.modelo.Genero.*;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculum cv = new Curriculum("John doe", "Ingeniero de sistemas", "Resumen laboral...");
        cv.addExperiencia("JAVA")
                .addExperiencia("Oracle dba")
                .addExperiencia("Spring Framework")
                .addExperiencia("Desarrollador FullStack")
                .addExperiencia("Angular");

        System.out.println("CURRICULUM: ");
        System.out.println();
        imprimir(cv);

        Informe informe = new Informe("Martin Fower", "James", "Estudio sobre microservicios");
        System.out.println();
        System.out.println("INFORME:");
        imprimir(informe);
        System.out.println();

        System.out.println("LIBRO:");
        Libro libro = new Libro("Erich Gamma", "Patrones de diseño", PROGRAMACION);

        libro.addPagina(new Pagina(("Patron singletos")))
                .addPagina(new Pagina("Patrón Observador "))
                .addPagina(new Pagina("Patrón Composite"));

        System.out.println("LIBRO");
        System.out.println();
        imprimir(libro);
    }


    public static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }
}
