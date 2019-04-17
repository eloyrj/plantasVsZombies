/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantasVsZombies.plantavszombies;

/**
 *
 * @author corte
 */
public class ExcepcionPlanta {

    public ExcepcionPlanta() {
    }
    
    
    
    public boolean costePosible(int coste,int solesTotales){
        if (solesTotales >= coste) return true;
        else {
            System.out.println("No puedes añadir esto, no tienes suficientes Soles para ello.");
            return false;
        }
    }
    
    public boolean casillaOcupada(Personaje p){
        if (p == null) return true;
        else {
            System.out.println("Esa casilla esta ocupada, pon otra casilla para continuar");
            return false;
        }
    }
    
    public boolean dentroTablero(int x, int y, int lTX,int lTY){
        
        if (lTX >= x && lTY >= y) return true;
        else  {
            System.out.println("Esa posicion no exixte, intoduzca una posicion valida del tablero para continuar.");
            return false;
        }
    }
    
    
}
