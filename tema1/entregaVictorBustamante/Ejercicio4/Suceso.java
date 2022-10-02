package main.Entrega.tema1.Ejercicio4;

public class Suceso extends Punto3D {
    protected double dTiempo;
    protected String sDescripcion;

    public Suceso(int paramiX, int paramiY, int z, double paramTiempo, String paramDescripcion) {
        super(paramiX, paramiY, z);
        this.dTiempo = paramTiempo;
        this.sDescripcion = paramDescripcion;
    }

    public boolean equals(Suceso suceso) {
        return this.iX == suceso.iX && this.iY == suceso.iY && this.iZ == suceso.iZ && this.dTiempo == suceso.dTiempo
                && this.sDescripcion == suceso.sDescripcion ? true : false;
    }
}
