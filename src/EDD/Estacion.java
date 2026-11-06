/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Andre
 */
public class Estacion {
    
    private String id;
    private String nombre;
    private String linea;
    private String zona;
    private int capacidad;
    private Lista<Arista> aristas;
    private boolean activa;
    
    /**
     * Constructor de la clase Estacion.
     * 
     */
    public Estacion(String id, String nombre, String linea, String zona, int capacidad) {
        this.id = id;
        this.nombre = nombre;
        this.linea = linea;
        this.zona = zona;
        this.capacidad = capacidad;
        this.aristas = new Lista<>();
        this.activa = true;
    }
    
    /**
     * Obtiene el identificador de la estación.
     */
    public String getId() { 
        return id; 
    }
    
    /**
     * Obtiene el nombre de la estación.
     */
    public String getNombre() { 
        return nombre; 
    }
    
    /**
     * Obtiene la línea de transporte.
     */
    public String getLinea() { 
        return linea; 
    }
    
    /**
     * Obtiene la zona geográfica.
     */
    public String getZona() { 
        return zona; 
    }
    
    /**
     * Obtiene la capacidad de pasajeros.
     */
    public int getCapacidad() { 
        return capacidad; 
    }
    
    /**
     * Obtiene la lista de aristas de la estación.
     */
    public Lista<Arista> getAristas() { 
        return aristas; 
    }
    
    /**
     * Verifica si la estación está activa.
     */
    public boolean isActiva() { 
        return activa; 
    }
    
    /**
     * Establece el estado de la estación.
     */
    public void setActiva(boolean activa) { 
        this.activa = activa; 
    }
    
    /**
     * Agrega una arista a la estación.
     */
    public void agregarArista(Arista a) {
        if (!aristas.contiene(a)) aristas.agregar(a);
    }
    
    /**
     * Elimina una arista de la estación.
     */
    public void eliminarArista(Arista a) {
        aristas.eliminar(a);
    }
    
    /**
     * Obtiene el grado de la estación (número de conexiones).
     */
    public int getGrado() { 
        return aristas.getTamaño(); 
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Estacion e = (Estacion) obj;
        return id.equals(e.id);
    }
    
    @Override
    public int hashCode() { 
        return id.hashCode(); 
    }
    
    @Override
    public String toString() {
        return id + " - " + nombre + " (" + linea + ")";
    }
}


