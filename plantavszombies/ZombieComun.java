/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantasVsZombies.plantavszombies;

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
        super.setContador(0);
    }

    @Override
    public void Ataque(Personaje p) {
        p.setVida(p.getVida()-super.getDaño());
    }

    @Override
    public String localizador() {
        return "Z(" + super.getVida()+")";
    }

    @Override
    public void actua(Juego j) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    public void ataca (Juego j) {
        

        if (j.getPartida().getTablero().getTableroPos(super.getPosX(), super.getPosY()-1 ) instanceof Planta ){
            Ataque(j.getPartida().getTablero().getTableroPos(super.getPosX(), super.getPosY()-1));
        }
        if (j.getPartida().getTablero().getTableroPos(super.getPosX(), super.getPosY()+1 ) instanceof Planta ){
            Ataque(j.getPartida().getTablero().getTableroPos(super.getPosX(), super.getPosY()+1));
        }
        if (j.getPartida().getTablero().getTableroPos(super.getPosX()-1, super.getPosY() ) instanceof Planta ){
            Ataque(j.getPartida().getTablero().getTableroPos(super.getPosX()-1, super.getPosY()));
        }
      
    }

}
