package domain;

import java.time.LocalDateTime;

public class Urgencia {

    private long numero;
    private LocalDateTime fechaLlegada;
    private LocalDateTime fechaAsignacion;
    private Persona medico;
    private Persona paciente;
    private String sintomas;
    private ClasificacionTriage triage;

    public Urgencia(long numero, LocalDateTime fechaLlegada, Persona medico, Persona paciente,
                    String sintomas, ClasificacionTriage triage) {
        this.numero = numero;
        this.fechaLlegada = fechaLlegada;
        this.medico = medico;
        this.paciente = paciente;
        this.sintomas = sintomas;
        this.triage = triage;
    }

    public long getNumero() {
        return numero;
    }

    public LocalDateTime getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaAsignacion(LocalDateTime fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public LocalDateTime getFechaAsignacion() {
        return fechaAsignacion;
    }

    public Persona getMedico() {
        return medico;
    }

    public Persona getPaciente() {
        return paciente;
    }

    public String getSintomas() {
        return sintomas;
    }

    public ClasificacionTriage getTriage() {
        return triage;
    }

    @Override
    public String toString() {
        return numero + " - " + fechaLlegada + " - " + triage + " - "
                + medico.getNombres() + " " + medico .getApellidos() + " - "
                + paciente.getNombres() + " " + paciente.getApellidos();
    }
}
