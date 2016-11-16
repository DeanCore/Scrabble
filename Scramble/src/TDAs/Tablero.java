/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDAs;

import TDAs.Casillas.Casillas;
import TDAs.Casillas.Coordenada;

/**
 *
 * @author Marlon
 */
public class Tablero {
    private Coordenada c;
    private int filas;
    private int col;

    public Tablero() {
        this.col=15;
        this.filas=15;
    }

    public Tablero(int filas, int col) {
        this.filas = filas;
        this.col = col;
    }
    
    public void imprimirTablero(){
        for (int i = 1; i <=this.filas; i++) {
        	
        	// Imprime las cabeceras de las columnas del tablero
            if (i == 1) {
                System.out.print("  |");
                for (int k = 1; k <= this.col; k++) {
                    if(k>=10){
                        System.out.print( k + " |");
                    }  
                    else if (k<10){
                        System.out.print(" " + k + " |");
                    }
                    if (k == (this.col )) {
                        System.out.println("");
                    }
                }
            }
            //Imprime el borde inferior
            System.out.print("--|");
            for (int j = 1; j < this.col+1; j++) {
                System.out.print("---" + "+");
                if (j == this.col ) {
                    System.out.println("");
                }
            }
            //Imprime las cabeceras de las filas
            if(i<16 && i<10){
            System.out.print(i + " |");
            }
            if(i>=10 && i<16){
            System.out.print(i+"|");
            }
            
            /**
             * Imprime si la condicion del barco es intacta,
             * o se encuentra una posicion vacia
             */
            for (int j = 1; j <= this.col; j++) {
                
                if(isPremiada(i,j)==1){
                    System.out.print("2l"+" |");
                }
                else if(isPremiada(i,j)==2){
                    System.out.print("3l"+" |");
                }
                else if(isPremiada(i,j)==3){
                    System.out.print("2P"+" |");
                }
                else if(isPremiada(i,j)==4){
                    System.out.print("3P"+" |");
                }
                else if(isPremiada(i,j)==-1){   
                    System.out.print("   |");
                }
            }
            
            System.out.println("");
            
        }
        //Imprime el borde inferior del tablero
        System.out.print("--|");
        for (int j = 1; j < this.col+1; j++) {
            System.out.print("---" + "+");
            if (j == this.col ) {
                System.out.println("");
            }
        }
    }
    private int isPremiada(int x,int y){
        Casillas c=new Casillas();
        for(int k=0;k<c.getL1().size();k++){
            if(c.getL1().get(k).getCordx()==x && c.getL1().get(k).getCordy()==y){
                return 1;
            }
        } 
        for(int k=0;k<c.getL2().size();k++){
            if(c.getL2().get(k).getCordx()==x && c.getL2().get(k).getCordy()==y){
                return 2;
            }
        }
        for(int k=0;k<c.getP1().size();k++){
            if(c.getP1().get(k).getCordx()==x && c.getP1().get(k).getCordy()==y){
                return 3;
            }
        }
        for(int k=0;k<c.getP2().size();k++){
            if(c.getP2().get(k).getCordx()==x && c.getP2().get(k).getCordy()==y){
                return 4;
            }
        }
       return -1; 
    }
    
    
}
