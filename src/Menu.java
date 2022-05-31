
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mija2
 */
public class Menu {
    private int op;
    Rutinas p = new Rutinas();
     

    public void mostrarMenu() {
        op = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu Principal\n\n"
                + "1.Agregar elemento \n"
                + "2.Quitar elemento \n"
                + "3.Salir \n\n"
                + "Digite la opcion deseada", "Menu", JOptionPane.QUESTION_MESSAGE));
        switch (op) {
            case 1:
                p.agregar();
                p.toString();
                mostrarMenu();
                break;
            case 2:
                int num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor a eliminar"));
                
                if(p.encuentra(num)){
                    p.extrae(num);
                }
                p.toString();
                mostrarMenu();
                break;
            case 3:
                p.toString();
                mostrarMenu();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion invalida");
                mostrarMenu();
        }

    }
}
