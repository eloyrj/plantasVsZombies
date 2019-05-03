
package plantasVsZombies.plantavszombies;

/**
 *
 * @author Eloy Rodríguez y María Chantal
 */

/** Controla las posibles excepciones que podemos encontrar a la hora de plantar las distintas plantas del juego
*/
public class ExcepcionPlanta {

    public ExcepcionPlanta() {
    }
    
    
    /** Método para controlar si se tienen los suficientes soles para poder plantar
     * @param coste lo que cuesta plantar un Girasol o un LanzaGuisantes
     * @param solesTotales los soles acumulados por el usuario en la partida
     * @return si no se tiene los soles suficientes
    */
    public boolean costePosible(int coste,int solesTotales){
        if (solesTotales >= coste) return true;
        else {
            System.out.println("No puedes añadir esto, no tienes suficientes Soles para ello.");
            return false;
        }
    }
    
    /** Método para controlar si la casilla seleccionada por el usuario está libre u ocupada
     * @param p personaje (Girasol o LanzaGuisantes) que se quiere plantar
     * @return si la casilla está ocupada
    */
    public boolean casillaOcupada(Personaje p){
        if (p == null) return true;
        else {
            System.out.println("Esa casilla esta ocupada, pon otra casilla para continuar");
            return false;
        }
    }
    
    /** Método que controla si se introduce una coordenada fuera del tablero o si es inexistente
     * @param x filas del tablero
     * @param y columnas del tablero
     * @param lTX filas no existentes en el tablero
     * @param lTY columnas no existentes en el tablero
     * @return si la posición existe
    */
    public boolean dentroTablero(int x, int y, int lTX,int lTY){
        
        if (lTX >= x && lTY >= y) return true;
        else  {
            System.out.println("Esa posicion no exixte, intoduzca una posicion valida del tablero para continuar.");
            return false;
        }
    }
    
    
}
