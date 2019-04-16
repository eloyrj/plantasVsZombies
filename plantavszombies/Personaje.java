
package plantasVsZombies.plantavszombies;


public abstract class Personaje {
    
    //Atributos de los personajes
    private int vida;
    private int daño;
    private int contador;
    private int posX;
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

    public boolean muerto(){
       return vida == 0;
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
