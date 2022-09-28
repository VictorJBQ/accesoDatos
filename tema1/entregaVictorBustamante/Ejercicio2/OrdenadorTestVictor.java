package main.Entrega.tema1.Ejercicio2;

public class OrdenadorTestVictor {
    public static void main(String[] args) {

        Portatiles p1 = new Portatiles(21321, 16, "sadasdsa", 1221.6, 12.5);
        Portatiles p2 = new Portatiles(21541, 32, "sadasdsa", 2345.6, 12.5);
        Mesa m1 = new Mesa(323234, 36, "dasdsadsadsa", 582.22, "Gamer");
        Mesa m2 = new Mesa(3234, 16, "dasdsadsadsa", 222.22, "Oficina");

        // METODOS
        p1.getCaracteristica();
        p2.getCaracteristica();
        m1.getCaracteristica();
        m2.getCaracteristica();
    }
}
