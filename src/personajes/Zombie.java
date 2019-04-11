/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personajes;

/**
 *
 * @author corte
 */
public class Zombie extends Personaje{
    
       public int velocidad;

    public Zombie(int velocidad, int comportamiento, int vida, int daño) {
        super(comportamiento, vida, daño);
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    
    
}
