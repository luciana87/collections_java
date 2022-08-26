package domain;

import java.time.LocalDateTime;

public abstract class Persona {

    protected TipoIdentificacion tipoIdentificación;
    protected String numeroIdentificacion;
    protected String nombres;
    protected String apellidos;
    protected LocalDateTime fechaNacimiento;

    protected Persona(TipoIdentificacion tipoIdentificación, String numeroIdentificacion, String nombres,
                   String apellidos, LocalDateTime fechaNacimiento) {
        this.tipoIdentificación = tipoIdentificación;
        this.numeroIdentificacion = numeroIdentificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    public TipoIdentificacion getTipoIdentificación() {
        return tipoIdentificación;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }
}
