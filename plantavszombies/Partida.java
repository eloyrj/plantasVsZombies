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
public class Partida {
    private int soles;
    private int turno; //turno = ciclo
    private String dificultad; // baja, media, alta, imposible
    private Tablero tablero;
    private int enemigos; // para fijar cuántos enemigos hay
    private int turnoInicial; /* turnos iniciales sin zombies dependiendo
                               * de la dificultad de la partida */

    public Partida(int soles, int turno, String dificultad, Tablero tablero, int enemigos, int turnoInicial) {
        this.soles = soles;
        this.turno = turno;
        this.dificultad = dificultad;
        this.tablero = tablero;
        this.enemigos = enemigos;
        this.turnoInicial = turnoInicial;
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

    public int getEnemigos() {
        return enemigos;
    }

    public void setEnemigos(int enemigos) {
        this.enemigos = enemigos;
    }

    public int getTurnoInicial() {
        return turnoInicial;
    }

    public void setTurnoInicial(int turnoInicial) {
        this.turnoInicial = turnoInicial;
    }

    @Override
    public String toString() {
        return "Partida{" + "soles=" + soles + ", turno=" + turno + ", dificultad=" + dificultad + ", enemigos=" + enemigos + ", turnoInicial=" + turnoInicial + '}';
    }
    
    

}