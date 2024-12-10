package org.ronal.poointerfaces.imprenta;

import org.ronal.poointerfaces.imprenta.modelo.*;

import static org.ronal.poointerfaces.imprenta.modelo.Genero.*;
import static org.ronal.poointerfaces.imprenta.modelo.Imprimible.imprimir;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculum cv = new Curriculum("CV", new Persona("CACUMA", "HAMARU"), "Resumen laboral...");
        cv.addExperiencia("JAVA")
                .addExperiencia("Oracle dba")
                .addExperiencia("Spring Framework")
                .addExperiencia("Desarrollador FullStack")
                .addExperiencia("Angular");

        System.out.println("CURRICULUM: ");
        System.out.println();
        imprimir(cv);

        Informe informe =
                new Informe(new Persona("Martin", "Fower"),
                        new Persona("James", "Gostling"),
                        "Estudio sobre microservicios");


        System.out.println();
        System.out.println("INFORME:");
        imprimir(informe);
        System.out.println();

        System.out.println("LIBRO:");

        Libro libro = new Libro(new Persona("Pepe", "Mujica")
                , "Patrones de diseño"
                , PROGRAMACION);

        libro.addPagina(new Pagina(("Patron singletos")))
                .addPagina(new Pagina("Patrón Observador "))
                .addPagina(new Pagina("Patrón Composite"))
                .addPagina(new Pagina("Patrón Facade"));

        System.out.println("LIBRO");
        System.out.println();
        imprimir(libro);


        //Con clase anonima: imprimira el metodo imprimir porque es un metodo por defecto
        imprimir(new Imprimible() {
        });


        Imprimible objImpr = new Imprimible() {
            @Override
            public String imprimir() {
                return "Hola que tal, imprimiendo un objeto genérico de una clase anonima!";
            }
        };

    }
}

