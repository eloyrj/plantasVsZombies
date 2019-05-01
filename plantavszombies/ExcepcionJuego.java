/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantasVsZombies.plantavszombies;

/**
 *
 * @author Eloy Rodríguez y María Chantal
 */

/** Controla las posibles excepciones que podemos encontrar en el juego 
*/
public class ExcepcionJuego {
    
    /** Método que indicará si ya hay una partida creada o si se puede iniciar una nueva
     * @param j partida por crear
     * @return si hay una partida en curso o no
    */
    public boolean partidaCreada(Juego j){
        if (j.getPartida() == null) return true;
        else {
            System.out.println("ya hay una partida creada, no puedes hacer eso.");
            return false;
        }
        
    }
    
    /** Método para comprobar si los comandos introducidos para crear una nueva partida son válidos
     * @param comandos introducidos por teclado: n, filas, columnas, dificultad
     * @return si los datos introducidos son erroneos
    */
    public boolean puedeCrear(String[] comandos){
        if (comandos.length == 4) return true; 
        else {
            System.out.println("Tiene que introducir todos los datos del comando para continuar");
            return false;
        }

    }
    
    /** Método para comprobar si el nivel introducido es válido
     * @param dificultad las dificultades permitidas en el juego
     * @return si la dificultad no existe
    */
    public boolean nivelValido(String dificultad){
        if(dificultad.equals("BAJA") || dificultad.equals("MEDIA") || dificultad.equals("ALTA") || dificultad.equals("IMPOSIBLE") ) return true;
        else {
            System.out.println("has introducido un nivel de dificultad no valido, prueba otra vez");
            return false;
        }
    }
    
    /** Método para comprobar los comandos en cada turno
     * @param comandos los comandos introducidos por el usuario
     * @return si los datos no son válidos
    */
    public boolean comandoCompleto(String[] comandos){
        if (comandos.length == 3) return true; 
        else {
            System.out.println("Tiene que introducir todos los datos del comando para continuar");
            return false;
        }

    }
    
}
