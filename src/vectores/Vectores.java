

package vectores;

/**
 *
 * @author Andres
 */
import javax.swing.JOptionPane;
public class Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int tamano;
        int dato;
        int m=0;
        int n=0;
        int mostrar1=0;
        int mostrar2=0;
        
        tamano=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de los vectores"));
        vectorOperaciones v1=new vectorOperaciones(tamano);
        vectorOperaciones v2=new vectorOperaciones(tamano);
        
        while(n<tamano || m<tamano )
        {
         dato=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Dato: "));
         
         if(dato<20 && n<tamano)
         {
           v1.llenarVector(n, dato);
           n++;
         }
         else if(dato>=20 && m<tamano)
         {
          v2.llenarVector(m, dato);
          m++;
         }
         
         if(n==tamano && mostrar1==0)
         {
          JOptionPane.showMessageDialog(null,v1.mostrar());
          mostrar1++;
         }
         else if(m==tamano && mostrar2==0)
         {
           JOptionPane.showMessageDialog(null,v2.mostrar());
           mostrar2++;
         }
        }
    }
    
}
