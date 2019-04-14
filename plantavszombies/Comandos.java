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
    private boolean fin;

    public Comandos() {
        fin = false;
    }

    public boolean isFin() {
        return fin;
    }

    public void setFin(boolean fin) {
        this.fin = fin;
    }
    
    
    
    public String todoMayus(String comando){
        return comando.toUpperCase();
    }
    
    public void lecturaComando(String entrada){
        entrada = todoMayus(entrada);
        char modo = entrada.charAt(0);
        
        ExcepcionJuego ex = new ExcepcionJuego();
        Comandos c = new Comandos();
        Tablero t = new Tablero(7,7);
        Juego j = new Juego(c,ex);
       
        if (modo == 'N'){
            int x = Integer.parseInt(Character.toString(entrada.charAt(2)));
            int y = Integer.parseInt(Character.toString(entrada.charAt(4)));
            
            c = new Comandos();
            char[] dif = new char[20];
            entrada.getChars(5, entrada.length(), dif, 0);
            String dificultad = "";
            for (int i=0;i<dif.length;i++){
                dificultad +=Character.toString(dif[i]);
            }
            
            ex = new ExcepcionJuego();
            j = new Juego(c,ex);
            t = new Tablero(x,y);
            j.setPartida(nuevaPartida(j,dificultad,t));
            System.out.println(dificultad);
            System.out.println(j.getPartida().getDificultad());
            t.pintarTablero();
        }
        else if (entrada.equals("AYUDA")){
            ayuda();    
        }
        
        else if (modo == 'G'){
            Girasol g = new Girasol();
            System.out.println(t.lonX() +" / "+ t.lonY());
            int x = Integer.parseInt(Character.toString(entrada.charAt(2)));
            int y = Integer.parseInt(Character.toString(entrada.charAt(4)));
            System.out.println(x +" / "+ y);
            if (j.getPartida() == null) System.out.println("null");
            g.addPlanta(x, y, t, j.getPartida());
            t.pintarTablero();
            
        } 
                
            
        
    }
    
    public Partida nuevaPartida(Juego j, String Dificultad, Tablero t){
        
        if (j.getPartida() == null) {
        Partida p = new Partida(50,0,"usp",t,5,10);
            System.out.println(Dificultad);
            
            if (Dificultad.equals("BAJA")){
                p = new Partida(50,0,Dificultad,t,5,10);  
                return p;
            }
            else if (Dificultad.equals("MEDIA")){
                System.out.println("uips");
                p = new Partida(50,0,Dificultad,t,15,7);
                return p;
            }
            else if (todoMayus(Dificultad).equals("ALTA")){
                p = new Partida(50,0,Dificultad,t,25,5);  
                return p;
            }
            else if (todoMayus(Dificultad).equals("IMPOSIBLE")){
                p = new Partida(50,0,Dificultad,t,50,5);
                return p;
            }
            else
            return p;
        }
        else {
            System.out.println("ya estas jugando una partida, por favor terminala para comenzar otra.");
            return null;
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
        fin = true;
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
