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
public class Juego {
    private String comandos;
    private String partida;
    private ExcepcionJuego excepcionJuego;

    public Juego(String comandos, String partida, ExcepcionJuego excepcionJuego) {
        this.comandos = comandos;
        this.partida = partida;
        this.excepcionJuego = excepcionJuego;
    }

    public String getComandos() {
        return comandos;
    }

    public void setComandos(String comandos) {
        this.comandos = comandos;
    }

    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }

    public ExcepcionJuego getExcepcionJuego() {
        return excepcionJuego;
    }

    public void setExcepcionJuego(ExcepcionJuego excepcionJuego) {
        this.excepcionJuego = excepcionJuego;
    }

    
    
    
}
