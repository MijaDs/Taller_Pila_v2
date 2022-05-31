
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

    public void agregar() {
        Datos d = new Datos();
        d.setNum(Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor")));
        Pila aux = new Pila();
        aux.setDatos(d);
        if (vacio()) {
            pila1 = aux;
        } else {
            aux.setSiguente(pila1);
            pila1 = aux;
        }
    }

    public boolean encuentra(int num) {
        Pila aux = pila1;
        int n;
        boolean res = false;
        if (!vacio()) {
            while (aux != null) {
                n = aux.getDatos().getNum();
                if (n == num) {
                    res = true;
                }
            }
        }
        if(res  = false){
            JOptionPane.showMessageDialog(null, "No se encuentra el valor " + num);
        }
        return res;
    }

    public void extrae(int num) {
        Pila aux = new Pila();
        Datos d = new Datos();
        int n;
        if (!vacio()) {
            n = pila1.getDatos().getNum();
            if (n != num) {
                d.setNum(n);
                aux.setDatos(d);
                aux.getSiguente();
                pila1.getSiguente();
            } else {
                do {
                    n = aux.getDatos().getNum();
                    d.setNum(n);
                    aux.getSiguente();
                    pila1.setDatos(d);
                    pila1.getSiguente();
                } while (aux != null);
            }
        }

    }

    @Override
    public String toString() {
        String s = "";
        Pila aux = pila1;
        if(!vacio()){
            while(aux!=null){
                s += aux.getDatos().getNum()+ " \n";
                aux=aux.getSiguente();            
            }
            JOptionPane.showMessageDialog(null, "El contenido de la pila es \n" + s);
        }else{
            JOptionPane.showMessageDialog(null, "Pila vacia");
        }
        return s;
    }
}
