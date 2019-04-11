
package plantasVsZombies.plantavszombies;


public abstract class Personaje {
    
    //Atributos de los personajes
    private int vida;
    private int daño;

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
    
    public abstract void Ataque(Personaje p);
    
    public abstract String localizador();
    
    
    
    
    
}
