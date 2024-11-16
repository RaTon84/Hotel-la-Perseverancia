package ar.edu.unahur.obj2.hotel;

public class HabitacionSuite extends Habitacion {

    private Double tamanio;
    private Boolean jacuzzi;
    private Boolean mayordomo;
    private Boolean zonaEstar;
    private Integer habitaciones;

    public HabitacionSuite(Integer numero, Integer capacidad, Double precio, Double tamanio, Boolean jacuzzi,
                           Boolean mayordomo, Boolean zonaEstar, Integer habitaciones) {
        super();
        this.numero = numero;
        this.capacidad = capacidad;
        this.precio = precio;
        this.tamanio = tamanio;
        this.jacuzzi = jacuzzi;
        this.mayordomo = mayordomo;
        this.zonaEstar = zonaEstar;
        this.habitaciones = habitaciones;
    }

    @Override
    public String getTipoHabitacion() {
        return "Suite";
    }
}
