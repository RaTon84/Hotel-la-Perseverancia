package ar.edu.unahur.obj2.hotel;
import static org.junit.Assert.*;
import org.junit.Test;
import java.time.LocalDate;

public class hotelTest {

    Hotel laPerseverancia = new Hotel();
    HabitacionEstandar estandar = new HabitacionEstandar(22,2,200.0,true,false,true,true);
    HabitacionSuite suite = new HabitacionSuite(22,2,200.0,10.0,false,true,true, 3);
    HabitacionDeLujo lujo = new HabitacionDeLujo(22,2,200.0,true,true);
    Cliente cliente = new Cliente("Hernan",30893000);

    @Test
    public void agregarUnaHabitacionEstandar() {
        laPerseverancia.agregarHabitacion(estandar);
        assertTrue(laPerseverancia.getHabitaciones().contains(estandar));
    }

    @Test
    public void cancelarUnaReserva() throws HabitacionInexistenteException, HabitacionOcupadaException {
        laPerseverancia.agregarHabitacion(estandar);
        LocalDate fechaInicio = LocalDate.now();
        LocalDate fechaFin = LocalDate.now().plusDays(1);
        Reserva reserva = laPerseverancia.reservarHabitacion(cliente, estandar, fechaInicio, fechaFin);
        Integer numeroReserva = 1;
//        System.out.println(estandar.getDisponible());
        laPerseverancia.cancelarReserva(numeroReserva);
        assertTrue(estandar.getDisponible());
    }

    @Test
    public void cosultarReservasPorRangoDeFechas() throws HabitacionInexistenteException, HabitacionOcupadaException {
        laPerseverancia.agregarHabitacion(suite);
        laPerseverancia.agregarHabitacion(estandar);
        laPerseverancia.agregarHabitacion(lujo);
        ///------------------------------------
        LocalDate fechaInicio1 = LocalDate.now();
        LocalDate fechaFin1 = LocalDate.now().plusDays(1);
        Reserva reservaBuscada = laPerseverancia.reservarHabitacion(cliente, suite, fechaInicio1, fechaFin1);
        ///------------------------------------
        LocalDate fechaInicio2 = LocalDate.now().plusDays(2);
        LocalDate fechaFin2 = LocalDate.now().plusDays(5);
        laPerseverancia.reservarHabitacion(cliente, estandar, fechaInicio2, fechaFin2);
        ///------------------------------------
        LocalDate fechaInicio3 = LocalDate.now().plusDays(2);
        LocalDate fechaFin3 = LocalDate.now().plusDays(5);
        laPerseverancia.reservarHabitacion(cliente, lujo, fechaInicio3, fechaFin3);
        ///------------------------------------
        LocalDate fechaInicioBuscada = LocalDate.now();
        LocalDate fechaFinBuscada = LocalDate.now().plusDays(1);
        assertEquals(1,laPerseverancia.consultarReservas(fechaInicioBuscada, fechaFinBuscada).size());
    }

}
