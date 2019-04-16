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
    private int[] salidaEnemigos;
    

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

    public void setExcepcionJuego(ExcepcionJuego excepcionJuego) {
        this.excepcionJuego = excepcionJuego;
    }
    
    public void actualizar(){
            if (getPartida().getTurno()==1) {
                salidaEnemigos = new int[getPartida().getLonEnemigos()];
                for (int i = 0; i < getPartida().getLonEnemigos();i++){
                    salidaEnemigos[i]= (int) Math.floor(Math.random()*31);
                }
                Arrays.sort(salidaEnemigos);
            }
    }

    
    
}
