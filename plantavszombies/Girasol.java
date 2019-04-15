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
        super.setFrecuencia(2); //se inicializa a 0 y va variando cada dos ciclos
        super.setDaño(0); //no daña a los soles
        super.setContador(0);
    }
    
    public int ganaSoles(int soles){ 
        return soles += 20;
    }

    @Override
    public void Ataque(Personaje p) {
        //esta funcion en esta planta no sirve
    }

    @Override
    public String localizador() {
        return "G(" + super.getVida()+")";
    }

    @Override
    public void addPlanta(int x, int y,Partida p) {
        if (getExcepcion().dentroTablero(x, y, p.getTablero().lonX(), p.getTablero().lonY()) && getExcepcion().casillaOcupada(x, y, p.getTablero().getTableroPos(x, y)) && getExcepcion().costePosible(this.getCoste(), p.getSoles()))p.getTablero().addT(x, y, this);
    }

    
    @Override
    public void actua(Juego j) {
            if (getContador() % getFrecuencia() ==0){
                j.getPartida().setSoles(ganaSoles(j.getPartida().getSoles()));
                System.out.println("soles");
                System.out.println(getContador());
        }
    }
}
