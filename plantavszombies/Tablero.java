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
public class Tablero {
    
    private Personaje[][] tablero;

    public Tablero(int x, int y) {//donde y son las columnas e x son las filas
        
        tablero = new Personaje[y][x];
    }

    public Personaje[][] getTablero() {
        return tablero;
    }
    public Personaje getTableroPos(int x,int y) {
        return tablero[y-1][x-1];
    }
    
    public void setTableroPos(int x,int y, Personaje p ) {
         tablero[y-1][x-1] = p;
    }
    
    public void setTablero(Personaje[][] tablero) {
        this.tablero = tablero;
    }
    public void addT(int x, int y, Personaje p){
        tablero[y-1][x-1] = (Personaje) p;
    }
    
    public void pintarTablero(){
        
        String lineaFinal = "";
        for (int i=0; i < tablero.length; i++) {
            String lineaArriba = "|";
            for (int j=0; j < tablero[i].length; j++) {
                if(j == tablero[i].length-1)lineaArriba+=("-------|");
                else lineaArriba+=("--------");
            }
            lineaFinal= lineaArriba;
            System.out.println(lineaArriba);
            
            String lineaAbajo = "|";
            for (int j=0; j < tablero[i].length; j++) {
                if (tablero[i][j]==null){
                    lineaAbajo+=("       ");
                    lineaAbajo+=("|");
                }
                else{
                    lineaAbajo += tablero[i][j].localizador()+"   ";
                    lineaAbajo+=("|");
                }
            }
            
            System.out.println(lineaAbajo);
        }
        System.out.println(lineaFinal);
    }
    
    public int lonX(){
        return tablero[1].length;
    }
    
    public int lonY(){
        return tablero.length;
    }
    
}
