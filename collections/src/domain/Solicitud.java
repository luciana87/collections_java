package domain;

public class Solicitud implements Comparable<Solicitud> {

    private int prioridad;
    private String nombreSolicitante;

    public Solicitud(int prioridad, String nombreSolicitante) {
        this.prioridad = prioridad;
        this.nombreSolicitante = nombreSolicitante;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public String getNombreSolicitante() {
        return nombreSolicitante;
    }

    @Override
    public String toString() {
        return "Solicitud{" +
                "prioridad=" + prioridad +
                ", nombreSolicitante='" + nombreSolicitante + '\'' +
                '}';
    }

    @Override
    public int compareTo(Solicitud solicitudAComparar) {
        int result = 0;
        if (this.prioridad > solicitudAComparar.getPrioridad()) {
            result = 1;
        } else if (this.prioridad < solicitudAComparar.getPrioridad()) {
            result = -1;
        }

        return result;
    }
}
