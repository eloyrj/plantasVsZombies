
package plantasVsZombies.plantavszombies;
/**
 *
 * @author Eloy Rodríguez y María Chantal
 */

/** Esta clase controlará a los LanzaGuisantes dentro de la partida
*/
public class LanzaGuisantes extends Planta {
    
    
    public LanzaGuisantes() {
        super();
        /** Tiene 3 unidades de vida*/
        super.setVida(3);
        /** Cuesta 50 soles*/
        super.setCoste(50);
        /** Lanza un guisante por turno*/
        super.setFrecuencia(1);
        /** Le resta una vida al enemigo por lanzamiento*/
        super.setDaño(1);
        super.setExcepcion(new ExcepcionPlanta());
        super.setContador(0);
    }

    /** Método que permite atacar al LanzaGuistantes
     * @param p personaje, en este caso el LanzaGuisantes
     */ 
    @Override
    public void Ataque(Personaje p) {
        p.setVida(p.getVida()-super.getDaño());
    }

    /** Método que localiza al LanzaGuisantes en el tablero
     * @return la posición del LanzaGuisantes en el tablero
     */
    @Override
    public String localizador() {
        return "L(" + super.getVida()+")";
    }

    /** Método que permite plantar LanzaGuisantes
     * @param x coordenada x dentro del tablero donde se quiere situar 
     * @param y coordenada y dentro del tablero donde se quiere situar
     * @param j partida en curso
     */
    @Override
    public void addPlanta(int x, int y,Juego j) {
        if (getExcepcion().dentroTablero(x, y, j.getPartida().getTablero().lonX(), j.getPartida().getTablero().lonY()) && getExcepcion().casillaOcupada( j.getPartida().getTablero().getTableroPos(x, y)) && getExcepcion().costePosible(this.getCoste(), j.getPartida().getSoles())){
            j.getPartida().getTablero().addT(x, y, this);        
            j.getPartida().setSoles(j.getPartida().getSoles()-getCoste());
            j.getPartida().setTurno(j.getPartida().getTurno()+1);    
        }
    }

    /**Método que controla el ataque del LanzaGuisantes
     * @param j partida en curso
     */
    @Override
    public void actua(Juego j) {
        int salir =0;
        if (getContador() % getFrecuencia() ==0){
            for (int i = super.getPosX(); i<j.getPartida().getTablero().getTablero()[super.getPosY()-1].length && salir != 1; i++){
                
                    if ( j.getPartida().getTablero().getTableroPos(i+1,super.getPosY()) instanceof Zombie && !j.getPartida().getTablero().getTableroPos(i+1,super.getPosY()).muerto()){
                        Ataque(j.getPartida().getTablero().getTableroPos(i+1,super.getPosY()) );
                        salir = 1;
                    }
            }
        }
    }

}
