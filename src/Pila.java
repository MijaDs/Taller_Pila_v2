/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mija2
 */
public class Pila {
    private int dato;
    private Pila siguente;
    
    public Pila(){
        this.siguente=null;
        this.dato=0;
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

    /**
     * @return the dato
     */
    public int getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(int dato) {
        this.dato = dato;
    }
    
}
