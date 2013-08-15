/**
 *  Ejercicio 6 - TP1
 * 
 * @author  Introducción a la POO
 * @version 2013
 */

public class Tablas
{
    
    
    
   /**
    * El siguiente método limpia la pantalla del bluej, manda un caracter especial a la entrada
    * estandar. Esta forma de limpiar la pantalla es propia de BlueJ
    */ 
   private void clearScreen()
   {
      System.out.print('\u000C');
   }

   /**
    * Toma una pausa de 2 segundos.
    */
   private void pause(){
    try{
       Thread.sleep(2000);
    }catch(Exception e) {}        
    }
   
 
}
