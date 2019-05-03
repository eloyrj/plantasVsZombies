
package plantasVsZombies.plantavszombies;

/**
 *
 * @author Eloy Rodríguez y María Chantal
 */

/** Esta clase controlará el efecto de los Girasoles dentro de la partida
*/
public class Girasol extends Planta{

    public Girasol() {
        super();
        /** Tiene una unidad de vida*/
        super.setVida(1);
        /** Cuesta 20 soles*/
        super.setCoste(20); 
        /** Se incializa a 0 y va variando cada dos turnos*/
        super.setFrecuencia(2); 
        /** No daña a los zombies*/
        super.setDaño(0); 
        /** */
        super.setContador(0);
    }
    
    /** Método que controla los soles que van generando los girasoles a lo largo de la partido
     * @param soles los soles que hay en la partida
     * @return la ganancia que se acumula cada vez que el girasol da nuevos soles
    */
    public int ganaSoles(int soles){ 
        return soles += 20;
    }
    
    /** Este método no afecta a esta planta ya que los girasoles no atacan
     * @param p personaje, en este caso el girasol
    */
    @Override
    public void Ataque(Personaje p) {

    }
    
    /** Método que localiza al Girasol en el tablero
     * @return la posición del Girasol en el tablero
    */
    @Override
    public String localizador() {
        return "G(" + super.getVida()+")";
    }
 
    /** Método que permite plantar Girasoles
     * @param x coordenada x dentro del tablero donde se quiere situar 
     * @param y coordenada y dentro del tablero donde se quiere situar
     * @param j partida en curso
    */
    @Override
    public void addPlanta(int x, int y, Juego j) {
        if (getExcepcion().dentroTablero(x, y, j.getPartida().getTablero().lonX(), j.getPartida().getTablero().lonY()) && getExcepcion().casillaOcupada( j.getPartida().getTablero().getTableroPos(x, y)) && getExcepcion().costePosible(this.getCoste(), j.getPartida().getSoles())){
            j.getPartida().getTablero().addT(x, y, this);
            j.getPartida().setSoles(j.getPartida().getSoles()-getCoste());
            j.getPartida().setTurno(j.getPartida().getTurno()+1);
        }
    }

    /** Método que genera soles 
     * @param j partida en curso
    */
    @Override
    public void actua(Juego j) {
            if (getContador() % getFrecuencia() ==0){
                j.getPartida().setSoles(ganaSoles(j.getPartida().getSoles()));
                
        }
    }
}
