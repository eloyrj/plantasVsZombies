
package plantasVsZombies.plantavszombies;

/**
 *
 * @author Eloy Rodríguez y María Chantal
 */

/** Esta clase controlará el ataque de los zombies durante la partida*/
public class ZombieComun extends Zombie {

    /** Constructor de ZombieComun
     */
    public ZombieComun() {
        super();
        /** El zombie avanza 1 casilla cada 2 turnos*/
        super.setVelocidad(2);
        /** Le resta una vida al enemigo cada turno que se encuentre frente a él*/
        super.setDaño(1);
        /** El zombie tendrá 5 vidas*/
        super.setVida(5);
        /** Turnos que lleva el ZombieComun en la partida*/
        super.setContador(0);
    }
    
    /**Método que imprimirá un mensaje en caso de que se pierda la partida
     */
    public void fin(){
        System.out.println("por suerte los zombies te mataron, ahora eres uno de ellos disfruta de tu vida de muerto");
        System.exit(0);
    }
    
    /** Mñetodo que permite atacar al ZombieComún
     * @param p personaje, en este caso el zombie
     */
    @Override
    public void Ataque(Personaje p) {
        p.setVida(p.getVida()-super.getDaño());
    }

    /** Método que localiza al ZombieComún en el tablero
     * @return la posición del zombie y las vidas que le quedan */
    @Override
    public String localizador() {
        return "Z(" + super.getVida()+")";
    }

    /** Método que controla el ataque de un ZombieComún
     * @param j partida
     */
    @Override
    public void actua(Juego j) {
        if (this.getPosX()==1) fin();
        
        
        if (j.getPartida().getTablero().getTableroPos(super.getPosX()-1, super.getPosY()) == null){
            if (getContador() % getVelocidad() ==0){
                j.getPartida().getTablero().setTableroPos(super.getPosX(), super.getPosY(), null) ;
                j.getPartida().getTablero().setTableroPos(super.getPosX()-1, super.getPosY(), this);
                this.setPosX(super.getPosX()-1);
            }
        }
        
        //comentamos estas lineas que lo que hacen es que los zombies ataquen tanto a la planta que tengan arriba como a la que tengan debajo
        //creemos que el hecho de que el zombie ataque solo delante proporcione al jugaror menos confusiones y mejora su inversion en el juego
        
        /*
        if ( this.getPosY()!= 1){
            if (j.getPartida().getTablero().getTableroPos(super.getPosX(), super.getPosY()-1 ) instanceof Planta  &&  !j.getPartida().getTablero().getTableroPos(super.getPosX(), super.getPosY()-1 ).muerto()){
                Ataque(j.getPartida().getTablero().getTableroPos(super.getPosX(), super.getPosY()-1));
            }
        }
        
        if (this.getPosY()!= j.getPartida().getTablero().lonY()){
            if (j.getPartida().getTablero().getTableroPos(super.getPosX(), super.getPosY()+1 ) instanceof Planta  &&  !j.getPartida().getTablero().getTableroPos(super.getPosX(), super.getPosY()-1 ).muerto()){
                Ataque(j.getPartida().getTablero().getTableroPos(super.getPosX(), super.getPosY()+1));
            }
        }
        */
        
        else{
            if ( this.getPosX()!= 1 ){
                if (j.getPartida().getTablero().getTableroPos(super.getPosX()-1, super.getPosY() ) instanceof Planta  &&  !j.getPartida().getTablero().getTableroPos(super.getPosX()-1, super.getPosY() ).muerto()){
                    Ataque(j.getPartida().getTablero().getTableroPos(super.getPosX()-1, super.getPosY()));
                }
            }
        }
    }
}  
