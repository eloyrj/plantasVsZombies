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
        System.out.println("Bienbenido a Plantas Vs Zombies: ");
        while(!fin){
            System.out.println("Teclea ayuda para lista de comandos. <enter> para terminar el turno.");
            String entrada = scan.nextLine();
            comandos.lecturaComando(entrada,j);
            
            
            
        }
    
    }
    
}
