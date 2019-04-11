/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantavszombies;

/**
 *
 * @author Usuario
 */
public class Zombie extends Personaje {

    public Zombie() {
        super();
        super.setVida(5);
        super.setFrecuencia(0); //se inicializa a 0 y se mueve 1 casilla cada 2 ciclos
        super.setDaño(1); //hace daño a las casillas adyacentes
    } 
        
}
    

