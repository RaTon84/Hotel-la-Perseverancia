package ar.edu.unahur.obj2.hotel;

public class HabitacionEstandar extends Habitacion{

    private Boolean balcon;
    private Boolean vista;
    private Boolean desayuno;
    private Boolean tvCable;

    public HabitacionEstandar(Integer numero, Integer capacidad, Double precio, Boolean balcon, Boolean vista, Boolean desayuno, Boolean tvCable) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.precio = precio;
        this.balcon = balcon;
        this.vista = vista;
        this.desayuno = desayuno;
        this.tvCable = tvCable;
    }

    @Override
    public String getTipoHabitacion() {
        return "Estandar";
    }
}
