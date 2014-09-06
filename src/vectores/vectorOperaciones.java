

package vectores;

/**
 *
 * @author Andres
 */
public class vectorOperaciones {
    
    private int[] vector;
    
    public vectorOperaciones(int tamano)
    {
      vector=new int[tamano];
    }
    
    public void llenarVector(int pos,int dato)
    {
      vector[pos]=dato;
    }
    
    public String mostrar()
    {
      String imprimir="";
      
      for(int i=0;i<vector.length;i++)
      {
       imprimir+="["+vector[i]+"]";
      }
      
      return imprimir;
    }
           
            
    

}
