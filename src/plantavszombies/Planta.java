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
public class Planta extends Personaje {
    private int coste; 
    
    public Planta() {
        super();
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }
    
}
