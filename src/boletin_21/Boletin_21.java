
package boletin_21;

import javax.swing.JOptionPane;

/**
 *
 * @author Javii
 */
public class Boletin_21 {

    
    public static void main(String[] args) {
        boolean condicion= true;
        MetodosPalabras palabras = new MetodosPalabras();
        do {
            int res = Integer.parseInt(JOptionPane.showInputDialog("Elige una opción:\n1)Introducir.\n2)Ordenar palabras.\n3)Escribir en el fichero.\n4)Salir.\nElige otra opción para salir."));
            switch (res) {
                case 1:
                    palabras.introducir();
                    break;
                case 2:
                    palabras.ordenar();
                    break;
                case 3:
                    palabras.escribirNombres("src/boletin21/datos.txt");
                    break;
                case 4:
                    condicion=false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Introduce una opción válida.");
            }

        }while(condicion);
    }

    }
    
