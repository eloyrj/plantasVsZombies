/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantavszombies;

/**
 *
 * @author corte
 */
public class ZombieComun extends Zombie {

    public ZombieComun() {
        super();
        super.setVelocidad(2);
        super.setDaño(1);
        super.setVida(5);
    }

    @Override
    public void Ataque(Personaje p) {
        p.setVida(p.getVida()-super.getDaño());
    }

    @Override
    public String localizador() {
        return "Z(" + super.getVida()+")";
    }
    
    
    
}
