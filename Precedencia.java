/**
 *  Ejercicio 2 - TP1
 * 
 * @author  Introducción a la POO
 * @version 2013
 */

public class Precedencia
{
   
    private Integer x;
    private Integer y;

    /**
     * Constructor para la clase precedencia
     */            
    public Precedencia()
    {
        // Inicializa las variables
        x = 5;
        y=3;
    }

    
    /**
     * Operación a comprarar
     * 
     * 
     * @return    un calculo
     */
    public Integer calculo()
    {        
        return x + 2*5-8+6/7*y;
    }
    
    
    /**
     * @return caso a
     */
    
    public Integer casoA()
    {
     return (x+2)*(5-8)+(6/(7*y));
    }
    
    
    /**
     * @return caso b
     */
    public Integer casoB()
    {
     return x+(2*5)-8+((6/7)*y);
    }
    
    /**
     * @return caso c
     */
    public Integer casoC()
    {
     return (x+2)*(5-((8+6)/(7*y)));
    }
    
    
    /**
     * @return caso d
     */
    public Integer casoD()
    {
     return x+(2*(5-8))+((6/7)*y);
    }
}
