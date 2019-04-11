package personajes;

/**
 *
 * @author corte
 */
public abstract class Personaje {
    
    private int vida;
    private int daño;
    

    public Personaje(int vida, int daño) {
        this.vida = vida;
        this.daño = daño;
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
    
}
