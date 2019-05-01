/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantasVsZombies.plantavszombies;


import java.util.Arrays;



/**
 *
 * @author Eloy Rodríguez y María Chantal
 */

/** La clase Juego engloba todos los comandos, excepciones y partidas que habrá al iniciar una partida
*/
public class Juego {
    /** Atributo para controlar los comandos introducidos por teclado de la partida*/
    private Comandos comandos;
    /** Atributo que indica la partida a jugar*/
    private Partida partida;
    /** Atributo que controla las excepciones que puede tener el juego*/
    private ExcepcionJuego excepcionJuego;
    /** Atributo que cuenta el número de Zombies que aparecerán en la partida*/
    private int totalEnemigos;
    /** Atributo que cuenta los turnos que tendrá la partida en total*/
    private int turnosTotales;
    /** Atributo que controla el turno anterior al actual*/
    private int turnoAnt;
    


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
    
    /** Método que actualiza la partida a cada turno que pasa
     * @param j partida en curso
    */
    public void actualizar(Juego j){
        if (j.getPartida() != null){
                if (turnoAnt != j.getPartida().getTurno()){
                    turnoAnt = j.getPartida().getTurno();
                    for (int i =0; i< j.getPartida().getTablero().lonY();i++){
                        for (int p =0 ; p < j.getPartida().getTablero().lonX() ; p++){
                            if (j.getPartida().getTablero().getTableroPos(p+1, i+1) != null && !j.getPartida().getTablero().getTableroPos(p+1, i+1).muerto()){
                                j.getPartida().getTablero().getTableroPos(p+1, i+1).setContador(j.getPartida().getTablero().getTableroPos(p+1, i+1).getContador()+1);
                                j.getPartida().getTablero().getTableroPos(p+1, i+1).actua(j);
                            }
                            else if (j.getPartida().getTablero().getTableroPos(p+1, i+1) != null && j.getPartida().getTablero().getTableroPos(p+1, i+1).muerto()){
                                j.getPartida().getTablero().setTableroPos(p+1, i+1,null);
                            }
                        }
                    }
                    if (getPartida().getTurno()>getPartida().getTurnoInicial() && totalEnemigos < getPartida().getEnemigos() ){
                        int zombiesRonda = (int) (Math.random() * getPartida().getTablero().lonY());
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
        
    }
}
