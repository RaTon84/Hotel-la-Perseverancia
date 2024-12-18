package ar.edu.unahur.obj2.hotel;

public class HabitacionEstandar extends Habitacion{

    private Boolean balcon;
    private Boolean vista;
    private Boolean desayuno;
    private Boolean tvCable;

    public HabitacionEstandar(Integer numero, Integer capacidad, Boolean balcon, Boolean vista, Boolean desayuno, Boolean tvCable) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.balcon = balcon;
        this.vista = vista;
        this.desayuno = desayuno;
        this.tvCable = tvCable;
        this.precio = 200.0;
    }

    @Override
    public String getTipoHabitacion() {
        return "Estandar";
    }
}
