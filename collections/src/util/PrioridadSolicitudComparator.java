package util;

import domain.Solicitud;

import java.util.Comparator;

public class PrioridadSolicitudComparator implements Comparator<Solicitud> {

    @Override
    public int compare(Solicitud solicitud1, Solicitud solicitud2) {
        int comparatorResult = 0;
        if (solicitud1.getPrioridad() > solicitud2.getPrioridad()) {
            comparatorResult = 1;
        } else if (solicitud1.getPrioridad() < solicitud2.getPrioridad()) {
            comparatorResult = -1;
        }

        return comparatorResult;
    }
}
