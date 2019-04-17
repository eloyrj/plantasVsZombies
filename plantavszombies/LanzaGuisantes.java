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
        super.setExcepcion(new ExcepcionPlanta());
        super.setContador(0);
    }

    @Override
    public void Ataque(Personaje p) {
        p.setVida(p.getVida()-super.getDaño());
    }

    @Override
    public String localizador() {
        return "L(" + super.getVida()+")";
    }

    @Override
    public void addPlanta(int x, int y,Juego j) {
        if (getExcepcion().dentroTablero(x, y, j.getPartida().getTablero().lonX(), j.getPartida().getTablero().lonY()) && getExcepcion().casillaOcupada( j.getPartida().getTablero().getTableroPos(x, y)) && getExcepcion().costePosible(this.getCoste(), j.getPartida().getSoles())){
            j.getPartida().getTablero().addT(x, y, this);        
            j.getPartida().setSoles(j.getPartida().getSoles()-getCoste());
            j.getPartida().setTurno(j.getPartida().getTurno()+1);    
        }
    }

    @Override
    public void actua(Juego j) {
        int salir =0;
        if (getContador() % getFrecuencia() ==0){
            for (int i = super.getPosX(); i<j.getPartida().getTablero().getTablero()[super.getPosY()-1].length && salir != 1; i++){
                
                    if ( j.getPartida().getTablero().getTableroPos(i+1,super.getPosY()) instanceof Zombie && !j.getPartida().getTablero().getTableroPos(i+1,super.getPosY()).muerto()){
                        Ataque(j.getPartida().getTablero().getTableroPos(i+1,super.getPosY()) );
                        salir = 1;
                    }
                
            }
        }
    }

    

}
