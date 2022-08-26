package domain;

import java.util.Objects;

public class Employee {

    private String nombre;
    private long dni;
    private int edad;

    public Employee(String nombre, long dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isLessThanThirty() {
        return edad < 30;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return dni == employee.dni && edad == employee.edad && nombre.equals(employee.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, dni, edad);
    }

    @Override
    public String toString() {
        return nombre + "/" + dni + "/" + edad;
    }
}
