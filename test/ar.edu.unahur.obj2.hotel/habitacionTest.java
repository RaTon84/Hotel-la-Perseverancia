package ar.edu.unahur.obj2.hotel;
import org.junit.Test;
import java.time.LocalDate;
import static org.junit.Assert.assertEquals;

public class habitacionTest {

    Hotel laPerseverancia = new Hotel();
    HabitacionEstandar estandar = new HabitacionEstandar(22,2,true,false,true,true);
    Cliente cliente = new Cliente("Hernan",30893000);
    HabitacionSuite suite = new HabitacionSuite(22,2,10.0,false,true,true, 3);

    @Test
    public void reservarUnaHabitacionEstandarDisponible() throws HabitacionInexistenteException, HabitacionOcupadaException {
        laPerseverancia.agregarHabitacion(estandar);
        LocalDate fechaInicio = LocalDate.now();
        LocalDate fechaFin = LocalDate.now().plusDays(1);
        Reserva reserva = laPerseverancia.reservarHabitacion(cliente, estandar, fechaInicio, fechaFin);
        assertEquals(Integer.valueOf(1), reserva.getId());
    }

    @Test (expected = HabitacionOcupadaException.class)
    public void IntentarReservarUnaHabitacionYaOcupada() throws HabitacionInexistenteException, HabitacionOcupadaException {
        laPerseverancia.agregarHabitacion(estandar);
        LocalDate fechaInicio = LocalDate.now();
        LocalDate fechaFin = LocalDate.now().plusDays(1);
        laPerseverancia.reservarHabitacion(cliente, estandar, fechaInicio, fechaFin);
        laPerseverancia.reservarHabitacion(cliente, estandar, fechaInicio, fechaFin);
    }

    @Test (expected = HabitacionInexistenteException.class)
    public void IntentarReservarUnaHabitacionInexistente() throws HabitacionInexistenteException, HabitacionOcupadaException {
        LocalDate fechaInicio = LocalDate.now();
        LocalDate fechaFin = LocalDate.now().plusDays(1);
        Reserva reserva = laPerseverancia.reservarHabitacion(cliente, estandar, fechaInicio, fechaFin);
    }

    @Test
    public void reservarUnaHabitacionSuiteDisponible() throws HabitacionInexistenteException, HabitacionOcupadaException {
        laPerseverancia.agregarHabitacion(suite);
        LocalDate fechaInicio = LocalDate.now();
        LocalDate fechaFin = LocalDate.now().plusDays(1);
        Reserva reserva = laPerseverancia.reservarHabitacion(cliente, suite, fechaInicio, fechaFin);
        assertEquals(Integer.valueOf(1), reserva.getId());
    }


}
