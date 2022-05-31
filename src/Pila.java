/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mija2
 */
public class Pila {
    private Datos datos;
    private Pila siguente;
    
    public Pila(){
        this.siguente=null;
    }

    /**
     * @return the datos
     */
    public Datos getDatos() {
        return datos;
    }

    /**
     * @param datos the datos to set
     */
    public void setDatos(Datos datos) {
        this.datos = datos;
    }

    /**
     * @return the siguente
     */
    public Pila getSiguente() {
        return siguente;
    }

    /**
     * @param siguente the siguente to set
     */
    public void setSiguente(Pila siguente) {
        this.siguente = siguente;
    }
    
}
