
package Juego;

import java.util.Arrays;



/**
 *
 * @author Eloy Rodríguez y María Chantal
 */

/** Esta clase controlará los elementos necesarios para poder llevar a cabo una partida*/
public class Partida {
    /** Atributo que guarda la cantidad de soles*/
    private int soles;
    /** Atributo que almacena los turnos (ciclos) de la partida*/
    private int turno;
    /** Atributo que indica la dificultad deseada por el usuario: baja, media, alta o imposible*/
    private String dificultad;
    /** Atributo que se encarga de controlar el tablero*/
    private Tablero tablero;
    /** Atributo para fijar cuántos enemigos hay*/
    private int enemigos;
    /** Atributo que indica los turnos iniciales sin zombies dependiendo de la dificultad de la partida*/
    private int turnoInicial; 
                              
    /** Constructor de Partida
     * @param soles que hay en la partida
     * @param turno en el que se encuentra el usuario en la partida
     * @param dificultad seleccionada por el usuario
     * @param tablero creado por el usuario
     * @param enemigos dependiendo del nivel de dificultad
     * @param turnoInicial sin zombies dependiendo del nivel de dificultad
     */
    public Partida(int soles, int turno, String dificultad, Tablero tablero, int enemigos, int turnoInicial) {
        this.soles = soles;
        this.turno = turno;
        this.dificultad = dificultad;
        this.tablero = tablero;
        this.turnoInicial = turnoInicial;
        this.enemigos=enemigos;
    
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
 
    /** Imprime todos los elementos a tener en cuenta dentro de una partida
     * @return los datos de todos estos elementos
     */
    @Override
    public String toString() {
        return "Partida{" + "soles=" + soles + ", turno=" + turno + ", dificultad=" + dificultad + ", enemigos=" + enemigos + ", turnoInicial=" + turnoInicial + '}';
    }
    
    

}