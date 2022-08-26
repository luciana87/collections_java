import domain.ClasificacionTriage;
import domain.Libro;
import domain.Medico;
import domain.Paciente;
import domain.Persona;
import domain.Solicitud;
import domain.TipoIdentificacion;
import service.Biblioteca;
import service.GestorUrgencias;
import util.NombreSolicitudComparator;
import util.PrioridadSolicitudComparator;
import util.StringLengthComparator;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class App {

    public static void main(String[] args) {
        /*Diccionario diccionarioIngles = new Diccionario("Inglés");
        diccionarioIngles.registrarPalabra(new PalabraOtroIdioma("Programming",
                "the process or activity of writing computer programs.", "Inglés", "Programming"));
        diccionarioIngles.registrarPalabra(new PalabraOtroIdioma("Bee",
                "An insect of a large group to which the honeybee belongs, including many solitary as well as social kinds.", "Inglés", "bi"));
        diccionarioIngles.registrarPalabra(new PalabraOtroIdioma("Greeting",
                "The action of giving a sign of welcome.", "Inglés", "gritin"));
        diccionarioIngles.registrarPalabra(new PalabraOtroIdioma("Programming",
                "the process or activity of writing computer programs.", "Inglés", "Programming"));
        diccionarioIngles.registrarPalabra(new PalabraOtroIdioma("Apple",
                "the round fruit of a tree of the rose family, which typically has thin green or red skin and crisp flesh.", "Inglés", "apel"));

        diccionarioIngles.buscarPalabra("Programming");
        diccionarioIngles.imprimirPalabras();
        diccionarioIngles.removerPalabra("Programming");
        System.out.println("Diccionario después de remover");
        diccionarioIngles.imprimirPalabras();*/

        /*Biblioteca bibliotecaDeDuitama = new Biblioteca();
        bibliotecaDeDuitama.registrarLibro(new Libro("Harry Potter", "J.K. Rowling", 2011));
        bibliotecaDeDuitama.registrarLibro(new Libro("Sangre y Fuego", "George R. R. Martin", 2018));
        bibliotecaDeDuitama.imprimirLibros();
        bibliotecaDeDuitama.etiquetarLibros();
        bibliotecaDeDuitama.imprimirLibros();
        System.out.println(bibliotecaDeDuitama.buscarLibro("Harry Potter"));*/

        /*Comparator<String> stringComparator = new StringLengthComparator();
        Queue<String> strings = new PriorityQueue<>(stringComparator);
        strings.add("Zapato");
        strings.add("Ojo");
        strings.add("Manzana");
        strings.add("Torre");
        strings.add("Abeja");
        strings.add("Dedo");*/

        /*Queue<Solicitud> solicitudes = new PriorityQueue<>();
        solicitudes.add(new Solicitud(5, "Brenda"));
        solicitudes.add(new Solicitud(2, "Mariana"));
        solicitudes.add(new Solicitud(0, "Lucía"));
        solicitudes.add(new Solicitud(1, "Kenny"));

        while (solicitudes.size() > 0) {
            System.out.println(solicitudes.poll());
        }*/

        Persona medico = new Medico(TipoIdentificacion.DNI, "012456",
                "Pepito", "Pérez", LocalDateTime.of(1991, 1, 7, 0, 0),
                12345);
        Persona juan = new Paciente(TipoIdentificacion.PASAPORTE, "AQ12345",
                "Juan Carlos", "Albarracín", LocalDateTime.of(1991, 1, 6, 0, 0),
                "Desarrollador", "Allianz");
        Persona fabiola = new Paciente(TipoIdentificacion.DNI, "456789",
                "Fabiola", "Lutrario", LocalDateTime.of(1995, 5, 19, 0, 0),
                "Cocinera", "Hospital Público");
        GestorUrgencias gestorUrgencias = new GestorUrgencias(medico);
        gestorUrgencias.registrarUrgencia(juan, "Dolor de cabeza", ClasificacionTriage.BLANCO);
        gestorUrgencias.registrarUrgencia(fabiola, "Tiene una fractura de cráneo", ClasificacionTriage.AZUL);
        gestorUrgencias.imprimirUrgencias();
        System.out.println("La próxima urgencia a atender es: " + gestorUrgencias.asignarUrgencia().toString());
        gestorUrgencias.imprimirUrgencias();
    }
}
