package util;

import domain.Urgencia;

import java.util.Comparator;

public class TriageComparator implements Comparator<Urgencia> {

    @Override
    public int compare(Urgencia urgencia1, Urgencia urgencia2) {
        int comparatorResult = 0;
        if (urgencia1.getTriage().getPrioridad() > urgencia2.getTriage().getPrioridad()) {
            comparatorResult = 1;
        } else if (urgencia1.getTriage().getPrioridad() < urgencia2.getTriage().getPrioridad()) {
            comparatorResult = -1;
        }

        return comparatorResult;
    }
}
