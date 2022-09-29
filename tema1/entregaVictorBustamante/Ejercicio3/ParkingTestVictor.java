package main.Entrega.tema1.Ejercicio3;

public class ParkingTestVictor {
    public static void main(String[] args) throws Exception {
        System.out.println("Inicio ParkingTestVictor");
        try {
            // Creamos Coches
            Vehiculo coche1 = new Vehiculo("12321G");
            Vehiculo coche2 = new Vehiculo("43433H");
            Vehiculo coche3 = new Vehiculo("32312T");
            Vehiculo coche4 = new Vehiculo("45678J");
            Vehiculo coche5 = new Vehiculo("34567K");
            // Creamos parking
            ParkingVehiculo parkingCortes = new ParkingVehiculo("Cortes 1 Madrid");
            // Aparcamos los coches
            parkingCortes.aparcaCoche(coche1);
            parkingCortes.aparcaCoche(coche2);
            parkingCortes.aparcaCoche(coche3);
            parkingCortes.aparcaCoche(coche4);
            parkingCortes.aparcaCoche(coche5);
            // Espero 2 minutos
            Thread.sleep(120 * 1000);
            // Sacamos coches
            parkingCortes.sacaCoche(coche1);
            parkingCortes.sacaCoche(coche2);
            parkingCortes.sacaCoche(coche3);
            parkingCortes.sacaCoche(coche4);
            parkingCortes.sacaCoche(coche5);
            // Sacamos factura de cada coche
            double dFactura1 = parkingCortes.getFactura(coche1);
            // Mostramos por pantalla
            System.out.println(coche1 + "->  Factura: " + dFactura1);
            double dFactura2 = parkingCortes.getFactura(coche2);
            // Mostramos por pantalla
            System.out.println(coche2 + "->  Factura: " + dFactura2);
            double dFactura3 = parkingCortes.getFactura(coche3);
            // Mostramos por pantalla
            System.out.println(coche3 + "->  Factura: " + dFactura3);
            double dFactura4 = parkingCortes.getFactura(coche4);
            // Mostramos por pantalla
            System.out.println(coche4 + "->  Factura: " + dFactura4);
            double dFactura5 = parkingCortes.getFactura(coche5); // Mostramos por pantalla
            System.out.println(coche5 + "->  Factura: " + dFactura5);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
