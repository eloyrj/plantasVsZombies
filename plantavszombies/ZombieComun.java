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
    
    public void fin(){
        System.out.println("por suerte los zombies te mataron, ahora eres uno de ellos disfruta de tu vida de muerto");
        System.exit(0);
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
        if (this.getPosX()==1)fin();
        
        if (getContador() % getVelocidad() ==0){
            j.getPartida().getTablero().setTableroPos(super.getPosX(), super.getPosY(), null) ;
            j.getPartida().getTablero().setTableroPos(super.getPosX()-1, super.getPosY(), this);
            this.setPosX(super.getPosX()-1);
        }
        if (this.getPosY()!= 1){
            if (j.getPartida().getTablero().getTableroPos(super.getPosX(), super.getPosY()-1 ) instanceof Planta ){
                Ataque(j.getPartida().getTablero().getTableroPos(super.getPosX(), super.getPosY()-1));
            }
        }
        
        if (this.getPosY()!= j.getPartida().getTablero().lonY()){
            if (j.getPartida().getTablero().getTableroPos(super.getPosX(), super.getPosY()+1 ) instanceof Planta ){
                Ataque(j.getPartida().getTablero().getTableroPos(super.getPosX(), super.getPosY()+1));
            }
        }
        if (this.getPosX()!= 2 && this.getPosX()!= 1 ){
            if (j.getPartida().getTablero().getTableroPos(super.getPosX()-1, super.getPosY() ) instanceof Planta ){
                Ataque(j.getPartida().getTablero().getTableroPos(super.getPosX()-1, super.getPosY()));
            }
        }
        
      }
    

    

}
