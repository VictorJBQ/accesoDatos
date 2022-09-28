package main.Entrega.tema1.Ejercicio2;

public class Ordenador {
    protected int iCodigo;
    protected int iRam;
    protected String sCPU;
    protected double dPrecio;

    public Ordenador(int iCodigo, int iRam, String sCPU, double dPrecio) {
        this.iCodigo = iCodigo;
        this.iRam = iRam;
        this.sCPU = sCPU;
        this.dPrecio = dPrecio;
    }

    public int getiCodigo() {
        return iCodigo;
    }

    public void setiCodigo(int iCodigo) {
        this.iCodigo = iCodigo;
    }

    public int getiRam() {
        return iRam;
    }

    public void setiRam(int iRam) {
        this.iRam = iRam;
    }

    public String getsCPU() {
        return sCPU;
    }

    public void setsCPU(String sCPU) {
        this.sCPU = sCPU;
    }

    public double getdPrecio() {
        return dPrecio;
    }

    public void setdPrecio(double dPrecio) {
        this.dPrecio = dPrecio;
    }

    public void getCaracteristica() {
        System.out.println("CARACTERISTICAS: " + "\n" +
                "Codigo: " + this.iCodigo + "\n" +
                "RAM: " + this.iRam + "\n" +
                "CPU: " + this.sCPU + "\n" +
                "Precio: " + this.dPrecio);
    }

    @Override
    public String toString() {
        return "Ordenador [dPrecio=" + dPrecio + ", iCodigo=" + iCodigo + ", iRam=" + iRam + ", sCPU=" + sCPU + "]";
    }

}