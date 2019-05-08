
package plantasVsZombies.plantavszombies;

/**
 *
 * @author Eloy Rodríguez y María Chantal
 */

/** La clase Comandos controlará todos los comandos introducidos por teclado
 */
public class Comandos {
    

    /** Constructor de Comandos*/
    public Comandos() {
        
    }

    
    
    /** Método que pondrá todos los comandos introducidos por teclado en mayúscula
     * @param comando el comando introducido por el usuario
     * @return dicho comando en mayúscula
     */
    public String todoMayus(String comando){
        return comando.toUpperCase();
    }
    
    /** Método para leer los comandos introducidos por teclado por el usuario
     * @param entrada comando introducido por el usuario
     * @param j partida por iniciar
     */
    public void lecturaComando(String entrada, Juego j){
        entrada = todoMayus(entrada);
        String[] partesEntrada =entrada.split(" ");
        String modo = partesEntrada[0];
        
        Comandos c = j.getComandos();

        /** El comando "N" servirá para iniciar una nueva partida 
         */
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

        /** El comando "G" servirá para plantar un Girasol
         */
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
        /** El comando "L" servirá para plantar un Lanzaguisantes
         */
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
        
        /** El comando "S" servirá para salir de la partida
         */
        else if ("S".equals(modo)){
            salir();
        }
        
        /**El comando "AYUDA" mostrará una lista de los comandos a seguir para poder jugar la partida
         */
        else if (entrada.equals("AYUDA")){
            ayuda();
        }
        
        /** El comando "NORMAS" mostrará una lista con las normas del juego
         */
        else if (entrada.equals("NORMAS")){
            normas();
        }
        
        /**El comando servirá para pasar el turno cada vez que el usuario pulse "enter"
         */
        else if ("".equals(modo)){
            if (j.getPartida() != null){
                j.getPartida().setTurno(j.getPartida().getTurno()+1);
                j.getPartida().getTablero().pintarTablero();
                System.out.println("tienes "+ j.getPartida().getSoles() + " soles y estas en el turno " + j.getPartida().getTurno());
            }
        }
    }
    
    /** Método para crear una nueva partida
     * @param j partida a crear
     * @param Dificultad la dificultad deseada por el usuario
     * @param x filas del tablero
     * @param y columnas del tablero
     */
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
    
    /** Método para plantar un Girasol
     * @param x filas del tablero
     * @param y columnas del tablero
     * @param j partida en curso
     */
    public void colGirasol(int x,int y,Juego j){
        Girasol g = new Girasol();
        g.addPlanta(x, y, j);
        j.getPartida().setSoles(j.getPartida().getSoles()-g.getCoste());
    }
    
    /** Método para plantar un LanzaGuisantes
     * @param x filas del tablero
     * @param y columnas del tablero
     * @param j partida en curso
     */    
    public void colLaGisantes(int x,int y,Juego j){
        LanzaGuisantes l = new LanzaGuisantes();
        l.addPlanta(x, y, j);
        j.getPartida().setSoles(j.getPartida().getSoles()-l.getCoste());
    }
    
    /** Método para salir de la partida
    */
    public void salir(){
        System.out.println("Hasta Luego. Esperamos que te haya gustado");
        System.exit(0);
    }
    
    /** Método para mostrar la lista de comandos a seguir para poder jugar la partida
    */
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
    
    /** Método para mostrar la lista de normas del juego
    */
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
