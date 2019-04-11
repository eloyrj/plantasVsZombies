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
public class Girasol extends Planta{

    public Girasol() {
        super();
        super.setVida(1);
        super.setCoste(20); 
        super.setFrecuencia(0); //se inicializa a 0 y va variando cada dos ciclos
        super.setDaño(0); //no daña a los soles
    }
    
    public void ganaSoles(){ //los soles que genera el girasol
        
    }

    @Override
    public void Ataque(Personaje p) {
        //esta funcion en esta planta no sirve
    }

    @Override
    public String localizador() {
        return "G(" + super.getVida()+")";
    }
    
}
