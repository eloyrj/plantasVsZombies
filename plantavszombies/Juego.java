/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantasVsZombies.plantavszombies;

import plantasVsZombies.plantavszombies.Comandos;
import plantasVsZombies.plantavszombies.ExcepcionJuego;
import java.util.Arrays;
import plantasVsZombies.plantavszombies.Partida;


/**
 *
 * @author Usuario
 */
public class Juego {
    private Comandos comandos;
    private Partida partida;
    private ExcepcionJuego excepcionJuego;
    private int[] salidaEnemigos;
    private int[] turnoInicial;
    private int[] turnosTotales;
    
    

   
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
    /*Vale no sé si esto estará bien pero mi idea era juntar los arrays de turnoInicial y de salidaEnemigos
    para que me sacara el array de turnosTotales*/
    
    /*Actualización: me han saltado dos bombillitas con triangulo amarillo diciendo que metiera la vaina esa 
    de arraycopy y lo he puesto no sé que es pero si java lo recomienda será bueno*/
    
    public void actualizar(){
            if (getPartida().getTurno()==1) {
                salidaEnemigos = new int[getPartida().getLonEnemigos()];
                for (int i = 0; i < getPartida().getLonEnemigos();i++){
                    salidaEnemigos[i]= (int) Math.floor(Math.random()*31);
                }
                Arrays.sort(salidaEnemigos);
            }
            if (getPartida().getTurno() == getPartida().getTurnoInicial()){
                turnoInicial = new int [getPartida().getTurnoInicial()];
                turnosTotales = new int [salidaEnemigos.length + turnoInicial.length];
                
                System.arraycopy(salidaEnemigos, 0, turnosTotales, 0, salidaEnemigos.length);
                System.arraycopy(turnoInicial, 0, turnosTotales, salidaEnemigos.length, turnoInicial.length);
            }
    }
}
