
package plantasVsZombies.plantavszombies;

/**
 *
 * @author Eloy Rodríguez y María Chantal
 */


/** La clase Personaje nos permitirá tener acceso a las cualidades propias de los personajes
  * que nos vamos a ir encontrando a lo largo del juego
  */
public abstract class Personaje {
    
    /** Atributo que fija la vida que tiene un personaje*/
    private int vida;
    /** Atributo que señala la cantidad de daño que infringe cada personaje*/
    private int daño;
    /** */
    private int contador;
    /** Atributo que situa a los personajes en su coordenada X del trablero (filas)*/
    private int posX;
    /** Atributo que situa a los personajes en su coordenada Y del tablero (columnas)*/
    private int posY;

    public Personaje() {
        
    
    }
   
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    /** Método que indica si el personaje ha muerto
     * @return la cantidad de vidas que le quedan
    */
    public boolean muerto(){
       return vida <= 0;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
    
    
    
    public abstract void actua(Juego j);
    
    public abstract void Ataque(Personaje p);
    
    public abstract String localizador();
    
    
    
    
    
}
