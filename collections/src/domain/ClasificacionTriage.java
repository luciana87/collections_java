package domain;

public enum ClasificacionTriage {

    AZUL(1),
    ROJO(2),
    AMARILLO(3),
    VERDE(4),
    BLANCO(5);

    private int prioridad;

    ClasificacionTriage(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getPrioridad() {
        return prioridad;
    }
}
