package ar.edu.unahur.obj2.hotel;

public class HabitacionDeLujo extends Habitacion{

    private Boolean gimnasio;
    private Boolean vista;

    public HabitacionDeLujo(Integer numero, Integer capacidad, Boolean gimnasio, Boolean vista) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.gimnasio = gimnasio;
        this.vista = vista;
        this.precio = 450.0;
    }

    @Override
    public String getTipoHabitacion() {
        return "Lujo";
    }
}
