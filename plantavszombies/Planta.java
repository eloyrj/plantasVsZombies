/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantasVsZombies.plantavszombies;

/**
 *
 * @author Usuario
 */
public abstract class Planta extends Personaje {
    
    private int coste;
    private int frecuencia;
    private ExcepcionPlanta excepcion = new ExcepcionPlanta();
    
    public Planta() {
        super();
        
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public ExcepcionPlanta getExcepcion() {
        return excepcion;
    }

    public void setExcepcion(ExcepcionPlanta excepcion) {
        this.excepcion = excepcion;
    }
    
    
    
    
    public abstract void addPlanta(int x,int y,Partida p);
}
