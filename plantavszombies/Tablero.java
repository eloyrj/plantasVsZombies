
package plantasVsZombies.plantavszombies;

/**
 *
 * @author Eloy Rodríguez y María Chantal
 */

/** La clase Tablero creará un tablero (array) a partir de las preferencias del usuario 
 */
public class Tablero {
    
    /** Atributo que introduce un personaje en el tablero
     */
    private Personaje[][] tablero;

    
    /** Constructor de tablero
     * @param x que son las filas
     * @param y que son las columnas
     */
    public Tablero(int x, int y) {
        
        tablero = new Personaje[y][x];
    }

    public Personaje[][] getTablero() {
        return tablero;
    }
    public Personaje getTableroPos(int x,int y) {
        return tablero[y-1][x-1];
    }
    
    public void setTableroPos(int x,int y, Personaje p ) {
         tablero[y-1][x-1] = p;
    }
    
    public void setTablero(Personaje[][] tablero) {
        this.tablero = tablero;
    }
    
    
    /** Método que añade un personaje al tablero en las coordenadas x, y.
     * @param x las filas del tablero
     * @param y las columnas del tablero
     * @param p el personaje en el tablero
     */
    public void addT(int x, int y, Personaje p){
        tablero[y-1][x-1] = (Personaje) p;
    }
    
    /** Método para sacar el tablero por pantalla
     */
    public void pintarTablero(){
        
        String lineaFinal = "";
        for (int i=0; i < tablero.length; i++) {
            String lineaArriba = "|";
            for (int j=0; j < tablero[i].length; j++) {
                if(j == tablero[i].length-1)lineaArriba+=("-------|");
                else lineaArriba+=("--------");
            }
            lineaFinal= lineaArriba;
            System.out.println(lineaArriba);
            
            String lineaAbajo = "|";
            for (int j=0; j < tablero[i].length; j++) {
                if (tablero[i][j]==null){
                    lineaAbajo+=("       ");
                    lineaAbajo+=("|");
                }
                else{
                    lineaAbajo += tablero[i][j].localizador()+"   ";
                    lineaAbajo+=("|");
                }
            }
            
            System.out.println(lineaAbajo);
        }
        System.out.println(lineaFinal);
    }
    
    /** Método que mide la longitud de la variable x
     * @return la longitud de la variable x
     */
    public int lonX(){
        return tablero[1].length;
    }
    
    /** Método que mide la longitud de la variable y
     * @return la longitud de la variable y
     */
    public int lonY(){
        return tablero.length;
    }
    
}
