package org.ronal.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja implements Imprimible {

    private Persona persona;
    private String carrera;
    private List<String> experiencias;


    public Curriculum(String contenido, Persona persona, String carrera) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<>();
    }

    public Curriculum addExperiencia(String exp) {
        experiencias.add(exp);
        return this;
    }


    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre: ");
        sb.append(persona).append("\n")
                .append("Resumen: ").append(this.contenido)
                .append("\n").append("Profesion: ")
                .append(this.carrera)
                .append("\n")
                .append("Experiencias: \n");
        for (String exp : this.experiencias) {
            sb.append("- ").append(exp).append("\n");
        }

        return sb.toString();
    }


}
