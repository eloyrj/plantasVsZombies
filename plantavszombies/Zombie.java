
package plantasVsZombies.plantavszombies;

/**
 *
 * @author Usuario
 */

/** La clase Zombie será la clase padre para definir a uno de los tipos de 
  * Personajes partícipes en el juego, los ZombieComun
  */
public abstract class Zombie extends Personaje {

    /** Atributo que fijará los avances del zombie por cada turno de partida*/
    private int velocidad;
    
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
    

