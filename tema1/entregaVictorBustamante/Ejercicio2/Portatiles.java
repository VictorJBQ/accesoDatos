package main.Entrega.tema1.Ejercicio2;

public class Portatiles extends Ordenador {
    protected double peso;

    public Portatiles(int iCodigo, int iRam, String sCPU, double dPrecio, double peso) {
        super(iCodigo, iRam, sCPU, dPrecio);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void getCaracteristica() {
        super.getCaracteristica();
        System.out.println("Peso: " + this.peso + "\n" + "\n");

    }

    @Override
    public String toString() {
        return "Portatiles [peso=" + peso + "]";
    }

}
