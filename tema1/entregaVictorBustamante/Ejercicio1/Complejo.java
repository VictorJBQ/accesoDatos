package main.Entrega.tema1.Ejercicio1;

public class Complejo {
    Double dPReal;
    Double dPImag;

    // CONSTRUCTOR
    public Complejo(Double dPReal, Double dPImag) {
        this.dPReal = dPReal;
        this.dPImag = dPImag;
    }

    public void asignar(double x, double y) {
        this.dPReal = x;
        this.dPImag = y;

    }

    public Complejo sumar(Complejo c1) {
        double dSumaReal;
        double dSumaImag;

        // suma de los atributos correspondiente de ambos objetos
        dSumaReal = this.dPReal + c1.dPReal;
        dSumaImag = this.dPImag + c1.dPImag;
        Complejo c3 = new Complejo(dSumaReal, dPImag);

        // Resultado con formáto por pantalla
        System.out.println("La parte REAL: (" + dPReal + "," + c3.dPReal + ") = " + dSumaReal);
        System.out.println("La parte IMAGINARIA: (" + dPImag + "," + c3.dPImag + ") = " + dSumaImag);

        return c3;
    }

    public void imprimir() {
        System.out.println("Real: " + dPReal.toString() + "  Imag: " + dPImag.toString());
    }
}
