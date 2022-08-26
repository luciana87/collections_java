package service;

import domain.ClasificacionTriage;
import domain.Persona;
import domain.Urgencia;
import util.TriageComparator;

import java.time.LocalDateTime;
import java.util.PriorityQueue;
import java.util.Queue;

public class GestorUrgencias {

    private long consecutivo;
    private Queue<Urgencia> urgencias;
    private Persona medicoTurno;

    public GestorUrgencias(Persona medicoTurno) {
        this.medicoTurno = medicoTurno;
        this.urgencias = new PriorityQueue<>(new TriageComparator());
    }

    public void setMedicoTurno(Persona medicoTurno) {
        this.medicoTurno = medicoTurno;
    }

    public void registrarUrgencia(Persona paciente, String sintomas, ClasificacionTriage triage) {
        Urgencia urgencia = new Urgencia(consecutivo, LocalDateTime.now(), medicoTurno, paciente,
                sintomas, triage);
        urgencias.add(urgencia);
        consecutivo++;
    }

    public Urgencia asignarUrgencia() {
        Urgencia urgencia = urgencias.poll();
        urgencia.setFechaAsignacion(LocalDateTime.now());

        return urgencia;
    }

    public void imprimirUrgencias() {
        System.out.println(urgencias);
    }
}
