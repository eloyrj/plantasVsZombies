package personajes;

/**
 *
 * @author corte
 */
public abstract class Personaje {
    
    private int comportamiento;
    private int vida;
    private int daño;
    private int frecuencia;

    public Personaje(int comportamiento, int vida, int daño, int frecuencia) {
        this.comportamiento = comportamiento;
        this.vida = vida;
        this.daño = daño;
        this.frecuencia = frecuencia;
    }

    public int getComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(int comportamiento) {
        this.comportamiento = comportamiento;
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

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

   public boolean muerto(){
       return vida == 0;
   }
    
   public abstract void Ataque(Personaje p);
    
}
