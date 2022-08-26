package util;

import domain.Solicitud;

import java.util.Comparator;

public class NombreSolicitudComparator implements Comparator<Solicitud> {

    @Override
    public int compare(Solicitud solicitud1, Solicitud solicitud2) {

        return solicitud1.getNombreSolicitante().compareTo(solicitud2.getNombreSolicitante());
    }
}
