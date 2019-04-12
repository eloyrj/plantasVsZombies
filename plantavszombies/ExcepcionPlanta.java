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
    
    
    
    public boolean costePosible(Planta p,Partida g){
        if (p.getCoste()<= g.getSoles()) return true;
        else {
            System.out.println("No puedes añadir esto, no tienes suficientes Soles para ello.");
            return false;
        }
    }
    
    public boolean casillaOcupada(int x, int y,Tablero t){
        if (t.getTableroPos(x, y) == null) return true;
        else {
            System.out.println("Esa casilla esta ocupada, pon otra acilla para continuar");
            return false;
        }
    }
    
    public boolean dentroTablero(int x, int y, Tablero t){
        if (t.lonX()>=x && t.lonY()>=y) return true;
        else  {
            System.out.println("Esa posicion no exixte, intoduzca una posicion valida del tablero para continuar.");
            return false;
        }
    }
    
    
}
