/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tricky;

/**
 *
 * @author Estudiantes
 */
public class Jugador {
    int valor;
    private int turno;

    public Jugador() {
        this.valor = 1;
        this.turno = 0;
    }
    
    int marcar(){
        this.turno += 1;
        
        if (turno < 10){
            if(turno%2==0){
                valor = 0;
            }else{
                valor = 1;
            }
            return valor;
        }else{
            return 2;
        } 
    }
    
}
