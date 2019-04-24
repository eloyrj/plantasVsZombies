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
            if (j.getExcepcionJuego().puedeCrear(partesEntrada)){
                int x = Integer.parseInt(partesEntrada[1]);
                int y = Integer.parseInt(partesEntrada[2]);
                String dificultad = partesEntrada[3];
                c = new Comandos();
                ExcepcionJuego ex = new ExcepcionJuego();
                if (ex.nivelValido(dificultad) && ex.partidaCreada(j) ){           
                    nuevaPartida(j,dificultad,x, y);
                    j.getPartida().getTablero().pintarTablero();
                    j.setTurnosTotales(j.getPartida().getTurnoInicial()+30);
                    System.out.println("tienes "+ j.getPartida().getSoles() + " soles y estas en el turno " + j.getPartida().getTurno());
                }
            }
        }


        else if ("G".equals(modo)){
            if (j.getExcepcionJuego().comandoCompleto(partesEntrada)){
                if (j.getPartida() != null){
                    Girasol g = new Girasol();
                    int x = Integer.parseInt(partesEntrada[1]);
                    int y = Integer.parseInt(partesEntrada[2]);
                    g.addPlanta(x, y, j);
                    j.getPartida().getTablero().pintarTablero();
                    g.setPosX(x);
                    g.setPosY(y);


                    System.out.println("tienes "+ j.getPartida().getSoles() + " soles y estas en el turno " + j.getPartida().getTurno());
                }
                else System.out.println("tiene que crear una partida primero");
            }

        } 
        else if ("L".equals(modo)){
                
            if (j.getExcepcionJuego().comandoCompleto(partesEntrada)){
                if (j.getPartida() != null){
                    LanzaGuisantes l = new LanzaGuisantes();
                    int x = Integer.parseInt(partesEntrada[1]);
                    int y = Integer.parseInt(partesEntrada[2]);
                    l.addPlanta(x, y, j);
                    j.getPartida().getTablero().pintarTablero();
                    l.setPosX(x);
                    l.setPosY(y);

                    System.out.println("tienes "+ j.getPartida().getSoles() + " soles y estas en el turno " + j.getPartida().getTurno());
                }
            }
            else System.out.println("tiene que crear una partida primero");
        }
        
        else if ("S".equals(modo)){
            salir();
        }

        else if (entrada.equals("AYUDA")){
            ayuda();
        }

        else if (entrada.equals("NORMAS")){
            normas();
        }

        else if ("".equals(modo)){
            if (j.getPartida() != null){
                j.getPartida().setTurno(j.getPartida().getTurno()+1);
                j.getPartida().getTablero().pintarTablero();
                System.out.println("tienes "+ j.getPartida().getSoles() + " soles y estas en el turno " + j.getPartida().getTurno());
            }
        }      
        
        
    }
    
    public void nuevaPartida(Juego j, String Dificultad , int x, int y){
        
        
        Tablero t = new Tablero(x,y);

        if (Dificultad.equals("BAJA")){
            Partida p = new Partida(50,1,Dificultad,t,5,10);  
            j.setPartida(p);
        }
        else if (Dificultad.equals("MEDIA")){
            Partida p = new Partida(50,1,Dificultad,t,15,7);
            j.setPartida(p);
        }
        else if (todoMayus(Dificultad).equals("ALTA")){
            Partida p = new Partida(50,1,Dificultad,t,25,5);  
            j.setPartida(p);
        }
        else if (todoMayus(Dificultad).equals("IMPOSIBLE")){
            Partida p = new Partida(50,1,Dificultad,t,50,5);
            j.setPartida(p);
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
        System.out.println(" ");        
        System.out.println("N <filas> <columnas> <Dificultad>: Nueva partida (Dificultad: BAJA, MEDIA, ALTA, IMPOSIBLE).");
        System.out.println("G <fila> <columna>: colocar girasol.");
        System.out.println("L <fila> <columna>: colocar LanzaGuisantes.");
        System.out.println("S: Salir de la aplicación");
        System.out.println("<Enter>: Pasar Turno");
        System.out.println("ayuda: este comando solicita a la aplicación que muestre la ayuda sobre cómo utilizar los comandos");
        System.out.println("normas: este comando te permite leer las instrucciones del juego.");
        System.out.println(" ");
    }
    
    public void normas() {
        System.out.println(" ");
        System.out.println("Normas para jugar a Plantas vs Zombies: ");
        System.out.println(" ");
        System.out.println("El objetivo del juego es eliminar a los Zombies que aparecen por la derecha mediante el uso de plantas como armas.");
        System.out.println("Los soles se usan como unidad de dinero. Necesitas soles para comprar Girasoles y LanzaGuisantes.");
        System.out.println("Los Girasoles cuestan 20 soles y, a su vez, producen 20 soles más cada 2 turnos de la partida.");
        System.out.println("Por su parte, los LanzaGuisantes cuestan 50 soles y son los capaces de matar a los zombies.");
        System.out.println("Para plantarlas, tienes que seleccionar la casilla en la que quieres plantarlo. ¿Cómo? Mediante coordenadas.");
        System.out.println("Visualiza la casilla en la que quieres plantar y teclea el número de columna y luego de fila. Al pulsar enter aparecerá.");
        System.out.println(" ");
    }
}
