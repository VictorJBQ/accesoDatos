package main.Entrega.tema1.Ejercicio3;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ParkingVehiculo implements Parking {
    // constantes
    protected static double precioMin = 0.0425;
    protected static int plazasMax = 100;

    // atributos
    protected String direccion;
    protected int plazasOcupadas;

    public ParkingVehiculo(String direccion) {
        this.direccion = direccion;

    }

    @Override
    public boolean hayPlaza() throws Exception {
        return plazasOcupadas < plazasMax ? true : false;
    }

    @Override
    public void aparcaCoche(Vehiculo coche) throws Exception {
        if (hayPlaza()) {
            plazasOcupadas++;
            coche.setFechaIni(LocalDateTime.now());
        } else {
            throw new Exception("No hay plazas para aparcar");
        }

    }

    @Override
    public void sacaCoche(Vehiculo coche) throws Exception {
        if (coche.getFechaIni() != null) {
            plazasOcupadas--;
            coche.setFechaFin(LocalDateTime.now());
        } else {
            throw new Exception("Coche no aparcado");

        }

    }

    @Override
    public double getFactura(Vehiculo coche) throws Exception {
        double minutes = ChronoUnit.MINUTES.between(coche.fechaIni, coche.fechaFin);
        double factura = 0.0;
        if (minutes != 0) {
            factura = minutes * precioMin;
        }
        return factura;
    }

}
