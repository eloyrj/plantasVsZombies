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
public class ExcepcionJuego {
    
    
    public boolean partidaCreada(Juego j){
        if (j.getPartida() == null) return true;
        else {
            System.out.println("ya hay una partida creada, no puedes hacer eso.");
            return false;
        }
        
    }
    
    public boolean puedeCrear(String[] comandos){
        if (comandos.length == 4) return true; 
        else {
            System.out.println("Tiene que introducir todos los datos del comando para continuar");
            return false;
        }

    }
    
    public boolean nivelValido(String dificultad){
        if(dificultad.equals("BAJA") || dificultad.equals("MEDIA") || dificultad.equals("ALTA") || dificultad.equals("IMPOSIBLE") ) return true;
        else {
            System.out.println("has introducido un nivel de dificultad no valido, prueba otra vez");
            return false;
        }
    }
    
    public boolean comandoCompleto(String[] comandos){
        if (comandos.length == 3) return true; 
        else {
            System.out.println("Tiene que introducir todos los datos del comando para continuar");
            return false;
        }

    }
    
}
