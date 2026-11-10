/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;
import EDD.Estacion;
/**
 * Representa una conexion (arista) entre dos estaciones de la red de transporte.
 * cada arista tiene un origen, un destino y un tiempo de traslado en minutos.
 * 
 */

/**
 *
 * @author Andre
 */
public class Arista {
    private Estacion origen ;
    private Estacion destino;
    private double tiempo;
    private boolean activa;
    
    /*
    constructor de la clase Arista.
     *@param origen Estación de origen
     * @param destino Estación de destino
     * @param tiempo Tiempo de traslado en minutos

    */
    
    public Arista(Estacion origen,Estacion destino,double tiempo){
        this.origen = origen;
        this.destino = destino;
        this.tiempo = tiempo;
        this.activa = true;
    }
    
    /*
    obtiene la estacion de origen.
    */
    
    public Estacion getOrigen(){
        return origen;
    }
    
    /**
     * obtiene la estacion destino.
     */
    
    public Estacion getDestino(){
        return destino;
    }
    /**
     * obtiene el tiempo de translado.
     */
    
    public double getTiempo(){
        return tiempo;
    }
    
    /**
     * verifica si la arista esta vacia.
     * return true si esta vacia
     */
    
    public boolean isActiva(){
        return activa;
    }
    
    /**
     * establece el estado de la arista.
     * activa Nuevo estado.
     */
 
    public void setActiva(boolean activa){
        this.activa = activa;
    }
    
    /**
     * Obtiene el nodo opuesto al dado.
     * @param e Estación de referencia
     * @return La estación opuesta, o null si no pertenece a la arista.
 */
    public Estacion getOtroNodo(Estacion e) {
        if(origen.equals(e)) return destino;
        if(destino.equals(e))return origen;
        return null;
    }
    
    @Override
    public boolean equals(Object obj){
        if(this == obj)return true;
        if(obj == null|| getClass()!= obj.getClass()) return false;
        Arista a = (Arista) obj;
        return(origen.equals(a.origen)&& destino.equals(a.destino))||
                (origen.equals(a.destino)&& destino.equals(a.origen));
    }
    
    @Override
    public String toString(){
        return origen.getId() + "-" + destino.getId() + "(" + tiempo + "min)"; 
    }
}
