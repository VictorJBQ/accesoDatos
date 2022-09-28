package main.Entrega.tema1.Ejercicio2;

public class Mesa extends Ordenador {
    protected String sTipo;

    public Mesa(int iCodigo, int iRam, String sCPU, double dPrecio, String sTipo) {
        super(iCodigo, iRam, sCPU, dPrecio);
        this.sTipo = sTipo;
    }

    public String getsTipo() {
        return sTipo;
    }

    public void setsTipo(String sTipo) {
        this.sTipo = sTipo;
    }

    public void getCaracteristica() {
        super.getCaracteristica();
        System.out.println("Tipo: " + this.sTipo + "\n" + "\n");

    }

    @Override
    public String toString() {
        return "Mesa [sTipo=" + sTipo + "]";
    }

}
