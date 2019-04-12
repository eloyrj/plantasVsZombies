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
public class Comandos {
    
    public String todoMayus(String comando){
        return comando.toUpperCase();
    }
    
    public void nuevaPartida(Juego j,String Dificultad,Tablero t,){
        
        if (j.getPartida == null) {
        
            if (todoMayus(Dificultad).equals("BAJA")){
                Partida p = new Partida(50,0,Dificultad,t,5,10);
                j.setPartida(p);
            }
            if (todoMayus(Dificultad).equals("MEDIA")){
                Partida p = new Partida(50,0,Dificultad,t,15,7);
                j.setPartida(p);
            }
            if (todoMayus(Dificultad).equals("ALTA")){
                Partida p = new Partida(50,0,Dificultad,t,25,5);
                j.setPartida(p);
            }
            if (todoMayus(Dificultad).equals("IMPOSIBLE")){
                Partida p = new Partida(50,0,Dificultad,t,50,5);
                j.setPartida(p);
            }
            
        }
        
    }
    
    public void colGirasol(int x,int y, Tablero t,Partida p){
        Girasol g = new Girasol();
        g.addPlanta(x, y, t, p);
        p.setSoles(p.getSoles()-g.getCoste());
    }
    
    public void colLaGisantes(int x,int y, Tablero t,Partida p){
        LanzaGuisantes l = new LanzaGuisantes();
        l.addPlanta(x, y, t, p);
        p.setSoles(p.getSoles()-l.getCoste());
    }
    
    public void salir(){
        System.out.println("Hasta Luego. Esperamos que te haya gustado");
        System.exit(0);
    }
    public void ayuda(){
        System.out.println("N <filas> <columnas> <Dificultad>: Nueva partida (Dificultad: BAJA, MEDIA, ALTA, IMPOSIBLE).");
        System.out.println("G <fila> <columna>: colocar girasol.");
        System.out.println("L <fila> <columna>: colocar LanzaGuisantes.");
        System.out.println("S: Salir de la aplicación");
        System.out.println("<Enter>: Pasar Turno");
        System.out.println("ayuda: este comando solicita a la aplicación que muestre la ayuda sobre cómo utilizar los comandos");
    }
    
}
