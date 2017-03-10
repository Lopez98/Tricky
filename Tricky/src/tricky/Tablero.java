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
public class Tablero {
    int juego[][] = new int [3][3];
    boolean triqui;
    int cont;

    public Tablero() {
        this.triqui = false;
        this.cont = 0;
    }
    
    
    boolean analizar(int posI, int posJ, int valor){
        juego[posI][posJ] = valor;
        
        for(int i=0; i<3; i++){
            for (int j=0 ; j<3; j++){
                if (juego[i][j]==1){
                    cont += 1;
                    if (cont==3){
                        triqui = true;
                    }
                }
            }
            cont = 0;
        }
        cont = 0;
        
        for(int j=0; j<3; j++){
            for (int i=0 ; i<3; i++){
                if (juego[i][j]==1){
                    cont += 1;
                    if (cont==3){
                        triqui = true;
                    }
                }
            }
            cont = 0;
        }
        cont = 0;
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i==j && juego[i][j]==1){
                    cont += 1;
                    if (cont==3){
                        triqui = true;
                    }
                } 
            }
        }
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i+j==2 && juego[i][j]==1){
                    cont += 1;
                    if (cont==3){
                        triqui = true;
                    }
                } 
            }
        }
        
        return triqui;
    }
    
    
    
    
}
