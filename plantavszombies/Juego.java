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

    public int[] getSalidaEnemigos() {
        return salidaEnemigos;
    }

    public void setSalidaEnemigos(int[] salidaEnemigos) {
        this.salidaEnemigos = salidaEnemigos;
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
            if (getPartida().getTurno()==2) {
                salidaEnemigos = new int[getPartida().getLonEnemigos()];
                for (int i = 0; i < getPartida().getLonEnemigos();i++){
                    salidaEnemigos[i]= (int) Math.floor(Math.random()*31);
                }
                
            }
            if (getPartida().getTurno()>3) {
                if (getPartida().getTurnoInicial()>= getPartida().getTurno()){
                    for (int i = 0; i < salidaEnemigos.length; i++){
                        if(getPartida().getTurno() == salidaEnemigos[i] + getPartida().getTurnoInicial()){
                            int y =(int) Math.floor(Math.random()*getPartida().getTablero().lonY()+1);
                            getPartida().getTablero().addT(getPartida().getTablero().lonX(), y, getPartida().getEnemigosPos(i));
                            getPartida().getEnemigosPos(i).setPosX(getPartida().getTablero().lonX());
                            getPartida().getEnemigosPos(i).setPosY(y);
                        }
                    }
                }
    
            }
    }
}
