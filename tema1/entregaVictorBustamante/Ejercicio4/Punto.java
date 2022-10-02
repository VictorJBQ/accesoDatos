package main.Entrega.tema1.Ejercicio4;

public class Punto {
    protected int iX;
    protected int iY;

    public Punto(int paramiX, int paramiY) {
        this.iX = paramiX;
        this.iY = paramiY;
    }

    public double distancia(Punto punto) {
        int distancia = (this.iX - punto.iX) * (this.iX - punto.iX)
                + (this.iY - punto.iY) * (this.iY - punto.iY);
        double res = Math.sqrt(distancia);
        return res;
    }

    public boolean equals(Punto punto) {
        // this.equals(punto);
        return this.iX == punto.iX && this.iY == punto.iY ? true : false;

    }

}
