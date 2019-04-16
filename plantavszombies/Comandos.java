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
    
    public void lecturaComando(String entrada, Juego j){
        entrada = todoMayus(entrada);
        String[] partesEntrada =entrada.split(" ");
        String modo = partesEntrada[0];
        
        Comandos c = j.getComandos();
        
       
        if ("N".equals(modo)){
            int x = Integer.parseInt(partesEntrada[1]);
            int y = Integer.parseInt(partesEntrada[2]);
            String dificultad = partesEntrada[3];
            c = new Comandos();            
            ExcepcionJuego ex = new ExcepcionJuego();
            
            j.setPartida(nuevaPartida(j,dificultad,x, y));
            j.getPartida().getTablero().pintarTablero();
            j.setTurnosTotales(j.getPartida().getTurnoInicial()+30);
            System.out.println("tienes "+ j.getPartida().getSoles() + " soles y estas en el turno " + j.getPartida().getTurno());
            
        }
        else if (entrada.equals("AYUDA")){
            ayuda();    
        }
        
        else if ("G".equals(modo)){
            Girasol g = new Girasol();
            int x = Integer.parseInt(partesEntrada[1]);
            int y = Integer.parseInt(partesEntrada[2]);
            g.addPlanta(x, y, j);
            j.getPartida().getTablero().pintarTablero();
            g.setPosX(x);
            g.setPosY(y);
            
                    
            System.out.println("tienes "+ j.getPartida().getSoles() + " soles y estas en el turno " + j.getPartida().getTurno());
            
        } 
        else if ("L".equals(modo)){
            LanzaGuisantes l = new LanzaGuisantes();
            int x = Integer.parseInt(partesEntrada[1]);
            int y = Integer.parseInt(partesEntrada[2]);
            l.addPlanta(x, y, j);
            j.getPartida().getTablero().pintarTablero();
            l.setPosX(x);
            l.setPosY(y);
            
            System.out.println("tienes "+ j.getPartida().getSoles() + " soles y estas en el turno " + j.getPartida().getTurno());
        }
        else if ("S".equals(modo)){
            salir();
        }
        else if ("".equals(modo)){
            j.getPartida().setTurno(j.getPartida().getTurno()+1);
            System.out.println("tienes "+ j.getPartida().getSoles() + " soles y estas en el turno " + j.getPartida().getTurno());
             j.getPartida().getTablero().pintarTablero();
        }
        else {
            System.out.println("no introduciste un comando valido, porfavor intentelo de nuevo.");
        }
                
            
        
    }
    
    public Partida nuevaPartida(Juego j, String Dificultad , int x, int y){
        
        if (j.getPartida() == null) {
            Tablero t = new Tablero(x,y);
                        
            if (Dificultad.equals("BAJA")){
                Partida p = new Partida(50,1,Dificultad,t,5,10);  
                return p;
            }
            else if (Dificultad.equals("MEDIA")){
                Partida p = new Partida(50,1,Dificultad,t,15,7);
                return p;
            }
            else if (todoMayus(Dificultad).equals("ALTA")){
                Partida p = new Partida(50,1,Dificultad,t,25,5);  
                return p;
            }
            else if (todoMayus(Dificultad).equals("IMPOSIBLE")){
                Partida p = new Partida(50,1,Dificultad,t,50,5);
                return p;
            }
            return null;
        }
        else {
            System.out.println("ya estas jugando una partida, por favor terminala para comenzar otra.");
            return null;
        }
        
        
    }
    
    public void colGirasol(int x,int y,Juego j){
        Girasol g = new Girasol();
        g.addPlanta(x, y, j);
        j.getPartida().setSoles(j.getPartida().getSoles()-g.getCoste());
    }
    
    public void colLaGisantes(int x,int y,Juego j){
        LanzaGuisantes l = new LanzaGuisantes();
        l.addPlanta(x, y, j);
        j.getPartida().setSoles(j.getPartida().getSoles()-l.getCoste());
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
