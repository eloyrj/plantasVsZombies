
package Personajes;

import Juego.Juego;
import Excepciones.ExcepcionPlanta;

/**
 *
 * @author Eloy Rodríguez y María Chantal
 */

/** La clase Planta será la clase padre para definir a dos de los tipos de 
  * Personajes partícipes en el juego, los LanzaGuisantes y los Girasoles. 
  */
public abstract class Planta extends Personaje {
    /** Atributo que controla los soles que cuesta cada planta */
    private int coste;
    /** Atributo que controla la frecuencia con la que actúa cada planta*/
    private int frecuencia;


    private ExcepcionPlanta excepcion = new ExcepcionPlanta();
    
    /** Constructor de Planta
     */
    public Planta() {
        super();
        
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public ExcepcionPlanta getExcepcion() {
        return excepcion;
    }

    public void setExcepcion(ExcepcionPlanta excepcion) {
        this.excepcion = excepcion;
    }
    
    
    
    /** Método para plantar una nueva planta
     * @param x coordenada x para plantar
     * @param y coordenada y para plantar
     * @param j partida en curso
    */
    public abstract void addPlanta(int x,int y,Juego j);
}
