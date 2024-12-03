package org.ronal.poointerfaces.imprenta.modelo;

import java.util.List;

public class Libro {
    private List<Hoja> paginas;
    private String autor;
    private String titulo;
    private Genero genero;

    public Libro(String autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
    }

    public Libro addPagina(Hoja pagina) {
        paginas.add(pagina);
        return this;
    }

    public String imprimr() {
        StringBuilder sb = new StringBuilder("Titulo:");
        sb.append(this.titulo)
                .append("\n")
                .append("Autor: ").append(this.autor)
                .append("\n")
                .append("Genero: ").append(genero)
                .append("\n");
        for (Hoja paginas : this.paginas) {
            sb.append(paginas.imprimir()).append("\n");
        }
        return sb.toString();
    }
}
