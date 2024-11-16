package ar.edu.unahur.obj2.hotel;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Hotel {

    private Set<Habitacion> habitaciones = new HashSet<>();
    private Set<Reserva> reservas = new HashSet<>();
    private Integer idReserva = 1;

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public Set<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public Reserva reservarHabitacion(Cliente cliente, Habitacion habitacion, LocalDate fechaInicio, LocalDate fechaFin) throws HabitacionInexistenteException, HabitacionOcupadaException {
        Reserva reserva = null;
        if (habitaciones.contains(habitacion)) {
            if (habitacion.getDisponible()){
                reserva = new Reserva(idReserva++, cliente, habitacion, fechaInicio, fechaFin);
                reservas.add(reserva);
                habitacion.setDisponible(false);
            }else{
                throw new HabitacionOcupadaException("La habitacion esta ocupada");
            }
        }else{
            throw new HabitacionInexistenteException("La habitación no existe");
        }
        return reserva;
    }

    public Set<Reserva> getReservas() {
        return reservas;
    }

    public void cancelarReserva(Integer numeroReserva) {
        Reserva reserva = reservas.stream()
                .filter(r -> r.getId() == numeroReserva)
                .findFirst().orElse(null);
        reserva.getHabitacion().setDisponible(true);
        reservas.remove(reserva);
    }

    public Set<Reserva> consultarReservas(LocalDate fechaInicio, LocalDate fechaFin) {
        Set<Reserva> reservasEnRango = new HashSet<>();
        for (Reserva reserva : reservas) {
            if ((reserva.getFechaInicio().isBefore(fechaFin) || reserva.getFechaInicio().isEqual(fechaFin)) &&
                    (reserva.getFechaFin().isAfter(fechaInicio) || reserva.getFechaFin().isEqual(fechaInicio))) {
                reservasEnRango.add(reserva);
            }
        }
        return reservasEnRango;
    }
}
