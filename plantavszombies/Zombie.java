
package plantasVsZombies.plantavszombies;

/**
 *
 * @author Eloy Rodríguez y María Chantal
 */

/** La clase Zombie será la clase padre para definir a uno de los tipos de 
  * Personajes partícipes en el juego, los ZombieComun
  */
public abstract class Zombie extends Personaje {

    /** Atributo que fijará los avances del zombie por cada turno de partida*/
    private int velocidad;
    
    /** Constructor de Zombie
     */
    public Zombie() {
        super();
    } 
    
    

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    
        
}
    

