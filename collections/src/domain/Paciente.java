package domain;

import java.time.LocalDateTime;

public class Paciente extends Persona {

    private String ocupacion;
    private String aseguradora;

    public Paciente(TipoIdentificacion tipoIdentificaci√≥n, String numeroIdentificacion,
                       String nombres, String apellidos, LocalDateTime fechaNacimiento,
                       String ocupacion, String aseguradora) {
        super(tipoIdentificaci√≥n, numeroIdentificacion, nombres, apellidos, fechaNacimiento);
        this.ocupacion = ocupacion;
        this.aseguradora = aseguradora;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public String getAseguradora() {
        return aseguradora;
    }
}
