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
public class Partida {
    private int soles;
    private int turno; //turno = ciclo
    private String dificultad; // baja, media, alta, imposible
    private Tablero tablero;
    private Zombie[] enemigos; // para fijar cuántos enemigos hay
    private int turnoInicial; /* turnos iniciales sin zombies dependiendo
                               * de la dificultad de la partida */

    public Partida(int soles, int turno, String dificultad, Tablero tablero, int enemigos, int turnoInicial) {
        this.soles = soles;
        this.turno = turno;
        this.dificultad = dificultad;
        this.tablero = tablero;
        this.turnoInicial = turnoInicial;
        this.enemigos = new Zombie[enemigos];
        for (int i = 0; i < enemigos; i++){
            ZombieComun z = new ZombieComun();
            this.enemigos[i] = z; 
        }
    
    }

    public int getSoles() {
        return soles;
    }

    public void setSoles(int soles) {
        this.soles = soles;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public Zombie[] getEnemigos() {
        return enemigos;
    }

    public void setEnemigos(Zombie[] enemigos) {
        this.enemigos = enemigos;
    }
    
    public int getLonEnemigos(){
        return enemigos.length;
    }

    public int getTurnoInicial() {
        return turnoInicial;
    }

    public void setTurnoInicial(int turnoInicial) {
        this.turnoInicial = turnoInicial;
    }

    @Override
    public String toString() {
        return "Partida{" + "soles=" + soles + ", turno=" + turno + ", dificultad=" + dificultad + ", enemigos=" + Arrays.toString(enemigos) + ", turnoInicial=" + turnoInicial + '}';
    }
    
    

}