/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantasVsZombies.plantavszombies;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Juego {
    private Comandos comandos;
    private Partida partida;
    private ExcepcionJuego excepcionJuego;

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
    

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean fin = false;
        Comandos comandos = new Comandos();
        System.out.println("Bienbenido a Plantas Vs Zombies: ");
        while(!fin){
            System.out.println("(Teclea ayuda para lista de comandos. <enter> para terminar el turno.");
            String entrada = scan.nextLine();
            comandos.lecturaComando(entrada);
            
            
            
        }
    
    }
    
    
}
