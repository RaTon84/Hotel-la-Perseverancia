package ar.edu.unahur.obj2.hotel;

public class HabitacionInexistenteException extends Exception {
    public HabitacionInexistenteException(String mensaje) {
        super(mensaje);
    }
}
