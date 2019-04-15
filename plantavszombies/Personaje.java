
package plantasVsZombies.plantavszombies;


public abstract class Personaje {
    
    //Atributos de los personajes
    private int vida;
    private int daño;
    private int contador;

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
    
    public abstract void actua(Juego j);
    
    public abstract void Ataque(Personaje p);
    
    public abstract String localizador();
    
    
    
    
    
}
