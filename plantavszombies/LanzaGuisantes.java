/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantasVsZombies.plantavszombies;
/**
 *
 * @author Usuario
 */
public class LanzaGuisantes extends Planta {
    
    public LanzaGuisantes() {
        super();
        super.setVida(3);
        super.setCoste(50);
        super.setFrecuencia(1); //lanza 1 guisante por ciclo
        super.setDaño(1); 
        
    }

    @Override
    public void Ataque(Personaje p) {
        p.setVida(p.getVida()-super.getDaño());
    }

    @Override
    public String localizador() {
        return "L(" + super.getVida()+")";
    }

    
    

}
