
package plantasVsZombies.plantavszombies;

import java.util.Scanner;

/**
 *
 * @author Eloy Rodríguez y María Chantal
 */

/** La clase main del programa. Es el bucle principal del juego
 */
public class main {
    public static void main(String[] args){
        ExcepcionJuego ex = new ExcepcionJuego();
        Comandos c = new Comandos();
        Juego j = new Juego(c,ex);
        Scanner scan = new Scanner(System.in);
        boolean fin = false;
        Comandos comandos = new Comandos();
        System.out.println("Bienvenido a Plantas Vs Zombies: ");
        
        while(!fin){
            j.actualizar(j);
            
            System.out.println("Teclea ayuda para lista de comandos. <enter> para terminar el turno.");
            String entrada = scan.nextLine();
            comandos.lecturaComando(entrada,j);
            
            if (j.getPartida() !=null) {
                
                if (j.getTurnosTotales() == j.getPartida().getTurno()) fin =true;
            }
        }
        System.out.println(" Bueno si a esto le llamas victoria..., diremos que has ganado pero yo hubiera dejado que los zombies me mataran. ");
    
    }
    
}
