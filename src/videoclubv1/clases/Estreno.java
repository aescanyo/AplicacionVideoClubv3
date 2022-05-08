
package videoclubv1.clases;

/**
 *
 * @author anton
 */
public abstract class Estreno  extends  Pelicula{
 
    
    
    
   @Override
   public int compareTo (Pelicula p){
       switch (p.getCategoria()) {
           case ESTRENO:
               return 1;
               
               
           default:
               throw new AssertionError();
       }
       
   }
}
