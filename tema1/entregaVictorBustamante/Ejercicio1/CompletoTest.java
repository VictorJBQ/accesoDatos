package main.Entrega.tema1.Ejercicio1;

public class CompletoTest {
    public static void main(String[] args) {

        Complejo c1 = new Complejo(0.0, 0.0);
        Complejo c2 = new Complejo(0.0, 0.0);
        // METODO ASIGNAR
        c1.asignar(5, 2);
        c2.asignar(4, 3);
        // METODO IMPRIMIR
        c1.imprimir();
        c2.imprimir();
        // metodo sumar
        c1.sumar(c2);
    }

}
