/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantasVsZombies.plantavszombies;

import java.util.Scanner;

/**
 *
 * @author eloy
 */
public class main {
    public static void main(String[] args){
        ExcepcionJuego ex = new ExcepcionJuego();
        Comandos c = new Comandos();
        Juego j = new Juego(c,ex);
        Scanner scan = new Scanner(System.in);
        boolean fin = false;
        Comandos comandos = new Comandos();
        int turnoAnt = 0;
        System.out.println("Bienvenido a Plantas Vs Zombies: ");
        while(!fin){
            
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
                    j.actualizar(); 
                    
                }
            }
            System.out.println("Teclea ayuda para lista de comandos. <enter> para terminar el turno.");
            String entrada = scan.nextLine();
            comandos.lecturaComando(entrada,j);
            
            
            if (j.getPartida() !=null) {
                
                if (j.getTurnosTotales() == j.getPartida().getTurno()) fin =true;
            }
        }
        System.out.println("me cago en maria 10 000 veces");
    
    }
    
}
