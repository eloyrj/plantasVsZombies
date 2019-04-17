/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantasVsZombies.plantavszombies;


import java.util.Arrays;



/**
 *
 * @author Usuario
 */
public class Juego {
    private Comandos comandos;
    private Partida partida;
    private ExcepcionJuego excepcionJuego;
    private int totalEnemigos;
    private int turnosTotales;
    
    

   
    public Juego(Comandos comandos, ExcepcionJuego excepcionJuego) {
        this.comandos = comandos;
        this.excepcionJuego = excepcionJuego;
    }

    public Comandos getComandos() {
        return comandos;
    }

    public void setComandos(Comandos comandos) {
        this.comandos = comandos;
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    public ExcepcionJuego getExcepcionJuego() {
        return excepcionJuego;
        
    }

    public int getTotalEnemigos() {
        return totalEnemigos;
    }

    public void setTotalEnemigos(int totalEnemigos) {
        this.totalEnemigos = totalEnemigos;
    }
    
    

    public int getTurnosTotales() {
        return turnosTotales;
    }

    public void setTurnosTotales(int turnosTotales) {
        this.turnosTotales = turnosTotales;
    }
    
    

    public void setExcepcionJuego(ExcepcionJuego excepcionJuego) {
        this.excepcionJuego = excepcionJuego;
    }
    
    public void actualizar(){
        
        if (getPartida().getTurno()>getPartida().getTurnoInicial() && totalEnemigos < getPartida().getEnemigos() ){
            int zombiesRonda = (int) (Math.random() * getPartida().getTablero().lonY()) + 1;
            int zombiesGenerados=0;
            for (int i = 0; i<zombiesRonda; i++){
                int pos =(int) (Math.random() * getPartida().getTablero().lonY()) + 1;
                ZombieComun z = new ZombieComun();
                if (getPartida().getTablero().getTableroPos(getPartida().getTablero().lonX(),pos) == null){
                    getPartida().getTablero().addT(getPartida().getTablero().lonX(), pos, z);
                    z.setPosX(getPartida().getTablero().lonX());
                    z.setPosY(pos);
                    zombiesGenerados++;
                }
            }
            totalEnemigos += zombiesGenerados;
        }
    }
}
