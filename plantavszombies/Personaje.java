
package plantavszombies;


public class Personaje {
    
    //Constantes de comportamiento de los personajes
    private final static int COMP_ZOMBIE = 0;
    private final static int COMP_GIRASOL = 1;
    private final static int COMP_GUISANTE = 2;
    
    //Atributos de los personajes
    private int vida;
    private int daño;
    private int comportamiento; 
    private int frecuencia; 

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

    public int getComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(int comportamiento) {
        this.comportamiento = comportamiento;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }
    
    
    
    
    
    
    
}
