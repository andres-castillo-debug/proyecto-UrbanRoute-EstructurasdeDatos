/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Objects;

public class Conexion {

    private Estacion origen;
    private Estacion destino;
    private double tiempo;

    public Conexion(Estacion origen, Estacion destino, double tiempo) {
        this.origen = origen;
        this.destino = destino;
        this.tiempo = tiempo;
    }

    public Conexion() {
    }

    public Estacion pedirOrigen() {
        return origen;
    }

    public void ponerOrigen(Estacion origen) {
        this.origen = origen;
    }

    public Estacion pedirDestino() {
        return destino;
    }

    public void ponerDesstino(Estacion destino) {
        this.destino = destino;
    }

    public double pedirTiempo() {
        return tiempo;
    }

    public void ponerTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public double getPeso() {
        return tiempo;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Conexion conexion = (Conexion) o;
        return Objects.equals(origen, conexion.origen) && Objects.equals(destino, conexion.destino);
    }

    public int hashCode() {
        return Objects.hash(origen, destino);
    }

    public String toString() {
        return origen.getNombre() + " -> " + destino.getNombre() + " (" + tiempo + " min)";
    }
}
