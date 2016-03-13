    
package boletin_21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Javii
 */
public class MetodosPalabras {
    private final ArrayList<String> lista= new ArrayList<>();
    
    public void introducir(){
        int vueltas= Integer.parseInt(JOptionPane.showInputDialog("Cantidad de palabras a introducir"));
        for(int i=0;i<vueltas;i++){
    lista.add(JOptionPane.showInputDialog("Introduce una palabra:"));
        }
        JOptionPane.showMessageDialog(null,lista);
    }
    
    public void ordenar(){
        lista.sort(null);
        JOptionPane.showMessageDialog(null,lista);
    }
        public void escribirNombres(String nomeFich){
        File f = new File(nomeFich);
        PrintWriter escribir = null;
        try {
            //abrimos fichero para escribir
            escribir = new PrintWriter(f);
            for(int i=0;i<lista.size();i++)
                escribir.println((i+1)+" "+lista.get(i));
            JOptionPane.showMessageDialog(null,"Se ha escrito en el fichero");
            
        } catch (FileNotFoundException ex) {
            System.out.println("error escritura "+ex.getMessage());
        }
        finally{
            escribir.close();
        }
    }
}
