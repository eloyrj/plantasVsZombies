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
    
    public boolean puedeCrear(String modo,int x,int y,String dificultad){
        if (((modo == null && x == 0) && y == 0) && dificultad == null ) {
            System.out.println("tienes que introducir todos los datos para crear una partida");
            return false;
        } 
        else return true;

    }
    
    public boolean nivelValido(String dificultad){
        if(dificultad.equals("BAJA") || dificultad.equals("MEDIA") || dificultad.equals("ALTA") || dificultad.equals("IMPOSIBLE") ) return true;
        else {
            System.out.println("has introducido un nivel de dificultad no valido, prueba otra vez");
            return false;
        }
    }
}
