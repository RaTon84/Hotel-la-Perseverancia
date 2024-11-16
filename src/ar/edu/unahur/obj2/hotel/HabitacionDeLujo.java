package ar.edu.unahur.obj2.hotel;

public class HabitacionDeLujo extends Habitacion{

    private Boolean gimnasio;
    private Boolean vista;

    public HabitacionDeLujo(Integer numero, Integer capacidad, Double precio, Boolean gimnasio, Boolean vista) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.precio = precio;
        this.gimnasio = gimnasio;
        this.vista = vista;
    }

    @Override
    public String getTipoHabitacion() {
        return "Lujo";
    }
}
