package service;

import domain.Libro;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Biblioteca {

    private int consecutivo;
    private List<Libro> libros;

    public Biblioteca() {
        this.libros = new LinkedList<>();
    }

    public void registrarLibro(Libro libro) {
        libros.add(libro);
    }

    public void etiquetarLibros() {
        for (Libro libro : libros) {
            if (libro.getCodigo() == null) {
                libro.setCodigo(libro.getTitulo() + "/"
                        + libro.getAnioPublicacion() + "/" + consecutivo);
                consecutivo++;
            }
        }
    }

    public List<Libro> buscarLibro(String titulo) {
        List<Libro> librosEncontrados = new ArrayList<>();
        for (Libro libro : libros) {
            if(libro.getTitulo().equals(titulo)) {
                librosEncontrados.add(libro);
                librosEncontrados.remove(libro);
            }
        }

        return librosEncontrados;
    }

    public void imprimirLibros() {
        System.out.println(libros);
    }
}
