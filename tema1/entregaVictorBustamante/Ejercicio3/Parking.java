package main.Entrega.tema1.Ejercicio3;

public interface Parking {

    public boolean hayPlaza() throws Exception;

    public void aparcaCoche(Vehiculo coche) throws Exception;

    public void sacaCoche(Vehiculo coche) throws Exception;

    public double getFactura(Vehiculo coche) throws Exception;

}
