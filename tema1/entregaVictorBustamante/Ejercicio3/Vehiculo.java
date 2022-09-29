package main.Entrega.tema1.Ejercicio3;

import java.time.LocalDateTime;

public class Vehiculo {
    // atributos
    protected String matricula;
    protected LocalDateTime fechaIni;
    protected LocalDateTime fechaFin;

    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }

    public Vehiculo(String matricula, LocalDateTime fechaIni, LocalDateTime fechaFin) {
        this.matricula = matricula;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDateTime getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(LocalDateTime fechaIni) {
        this.fechaIni = fechaIni;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "Vehiculo [fechaFin=" + fechaFin + ", fechaIni=" + fechaIni + ", matricula=" + matricula + "]";
    }

}
