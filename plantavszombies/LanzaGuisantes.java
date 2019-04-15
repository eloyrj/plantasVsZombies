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
    public void addPlanta(int x, int y,Partida p) {
        if (getExcepcion().dentroTablero(x, y, p.getTablero().lonX(), p.getTablero().lonY()) && getExcepcion().casillaOcupada(x, y, p.getTablero().getTableroPos(x, y)) && getExcepcion().costePosible(this.getCoste(), p.getSoles()))p.getTablero().addT(x, y, this);
    }

    

}
