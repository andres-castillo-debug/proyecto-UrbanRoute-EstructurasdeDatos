/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Andre
 */
/**
 * 
 */

/* representa una estacion de la red de transporte multimodal.
*/

public class Estacion {
    private String id;
    private String nombre;
    private String linea;
    private String Zona;
    private int capacidad;
    private Lista<Arista> aristas;
    private boolean activa;
    /**conastructor de la clase Estacion.*/
    
    public Estacion(String id,String nombre,String linea,String Zona,int capacidad){
        this.id = id;
        this.nombre = nombre;
        this.linea = linea;
        this.Zona = Zona;
        this.capacidad =capacidad;
        this.aristas = new Lista<>();
        this.activa = true;
    }
    /*obtiene el identificador de la estacion.*/
    public String getId(){
        return id;
    }
        /**obtiene el nombre de la estacion.*/
        public String getNombre(){
            return nombre;
        }
        /**obtiene la linea de transporte.*/
        public String getlinea(){
            return linea;
        }
       
        /**obtiene la zona geografica.*/
        public String getZona(){
            return Zona;
            
        }
        /**obtiene la capacidad de pasajeros.*/
        public int getCapacidad(){
            return capacidad;
        }
        /**obiene la lista de aristas de la estacion.*/
        public Lista<Arista>getArista(){
            return aristas;
        }
        
        /**verifica si la estacion esta activa.*/
        
        public boolean isActiva(){  
            return activa;
        }
        
        /**establece el estado de la estacion.*/
        
        public void setActiva(boolean activa){
            this.activa = activa;
        }
        /**agrega una arista a la estacion.*/
        
        public void agregarArista(Arista a) {
            if (!aristas.contiene(a)) aristas.agragar(a);
        }
        
        /**elimina una arista de la estacion.*/
        
        public void eliminarArista(Arista a) {
            aristas.eliminar (a);
        }
        /**obtiene el grado de la estacion(numero de conexiones).*/
        
        public int getGrado(){
            return aristas.getTamaño();    
      }
        @Override
        public boolean equals(Object obj){
            if (this==obj) return true;
            if(obj ==null || getClass() != obj.getClass())return false;
            Estacion e = (Estacion) obj;
            return id.equals (e.id);
        }
        @Override
        public int hashCode(){
            return id.hashCode();
        }
        @Override
        public String toString(){
            return id +" - " + nombre + "(" + linea + ")";
        }
    }
    

