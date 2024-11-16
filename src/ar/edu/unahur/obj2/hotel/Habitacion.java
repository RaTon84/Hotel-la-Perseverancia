package ar.edu.unahur.obj2.hotel;

import java.util.Objects;

public abstract class Habitacion {

    protected Integer numero;
    protected Integer capacidad;
    protected Double precio;
    protected Boolean disponible = true;

    public Double getPrecio() {
        return precio;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public abstract String getTipoHabitacion();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Habitacion that = (Habitacion) o;
        return Objects.equals(numero, that.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numero);
    }
}
