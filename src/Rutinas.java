
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author mija2
 */
public class Rutinas {

    private Pila pila1;

    public Rutinas() {
        this.pila1 = null;

    }

    public boolean vacio() {
        if (pila1 == null) {
            return true;
        } else {
            return false;
        }
    }

    //----------------------Agrega los valores a las pilas
    public void agregar() {
        int d = (Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor")));
        Pila aux = new Pila();
        aux.setDato(d);
        if (vacio()) {
            pila1 = aux;
        } else {
            aux.setSiguente(pila1);
            pila1 = aux;
        }
    }

//----------------------Busca el valor a en la pila y retorna un true si es verdadero
    public boolean encuentra(int num) {
        Pila aux = pila1;
        int n;
        boolean res = false;
        if (!vacio()) {
            while (aux != null && res != true) {
                n = aux.getDato();
                if (n == num) {
                    res = true;
                }
                aux = aux.getSiguente();
            }
            //solo para validad la informacion----------------------------------
            //if (res) {
            //   JOptionPane.showMessageDialog(null, "El valor " + num + " si se encuentra en la pila \n\n");
            //
            //} else {
            //    JOptionPane.showMessageDialog(null, "El valor " + num + " no se encuentra en la pila \n\n");
            //}
        }

        return res;
    }
//--------el punto es guardar los datos en auxiliar hasta que encuentre el numero y luego devolverlos a la pila excepto el encontrado 
//              aux = null elimina= false 4->3->2->1    num   

    public void extrae(int num) {
        Pila aux = new Pila();
        aux = null;
        boolean elimina = false;
        int n;
        if (encuentra(num)) {
            if (!vacio()) {
                while (pila1.getDato() != num) {
                    if (aux == null) {
                        aux = pila1;
                    } else {
                        aux.setSiguente(pila1);
                    }
                    System.out.println(aux.getDato()); 
                    pila1=pila1.getSiguente();
                }
                
                 
                
            }
            if (vacio()) {
                while (aux != null) {
                    if (pila1 == null) {
                        pila1=aux;
                        
                    }else{
                        pila1.setSiguente(aux);
                        aux=aux.getSiguente();
                    }
                    System.out.println(aux.getDato());
                    
                }
            }
            toString();
        }

    }

    @Override
    public String toString() {
        String s = "";
        Pila aux = pila1;
        if (!vacio()) {
            while (aux != null) {
                s += aux.getDato() + " \n";
                aux = aux.getSiguente();
            }
            JOptionPane.showMessageDialog(null, "El contenido de la pila es \n" + s);
        } else {
            JOptionPane.showMessageDialog(null, "Pila vacia");
        }
        return s;
    }
}
