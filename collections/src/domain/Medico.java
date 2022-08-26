package domain;

import java.time.LocalDateTime;

public class Medico extends Persona {

    private int tarjetaProfesional;

    public Medico(TipoIdentificacion tipoIdentificación, String numeroIdentificacion, String nombres,
                     String apellidos, LocalDateTime fechaNacimiento, int tarjetaProfesional) {
        super(tipoIdentificación, numeroIdentificacion, nombres, apellidos, fechaNacimiento);
        this.tarjetaProfesional = tarjetaProfesional;
    }

    public int getTarjetaProfesional() {
        return tarjetaProfesional;
    }
}
