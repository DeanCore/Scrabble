/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDAs;

import TDAs.Casillas.Casillas;
import TDAs.Casillas.Coordenada;
import TDAs.Casillas.Validaciones;
import java.util.ArrayList;

/**
 *
 * @author Marlon
 */
public class Tablero {
    private Coordenada c;
    private int filas;
    private int col;
    private String s;
    private ArrayList<Object[]> pieza;
    private ArrayList<Coordenada> valida;
    private ArrayList<Coordenada> novalida;
    private ArrayList<Coordenada> temp;
    

    public Tablero() {
        this.col=15;
        this.filas=15;
        this.s="";
        pieza=new ArrayList<>();
        temp=new ArrayList<>();
        valida=new ArrayList<>();
        novalida=new ArrayList<>();
    }

    public Tablero(int filas, int col) {
        this.filas = filas;
        this.col = col;
    }
    public void colocarficha(String s, int x,int y){
        
        Object[] p={s,x,y};
        this.pieza.add(p);
        this.temp.add(new Coordenada(x,y));
    }
    public void imprimirTablero(){
        for (int i = 1; i <=this.getFilas(); i++) {
        	
        	// Imprime las cabeceras de las columnas del tablero
            if (i == 1) {
                System.out.print("  |");
                for (int k = 1; k <= this.getCol(); k++) {
                    if(k>=10){
                        System.out.print( k + " |");
                    }  
                    else if (k<10){
                        System.out.print(" " + k + " |");
                    }
                    if (k == (this.getCol() )) {
                        System.out.println("");
                    }
                }
            }
            //Imprime el borde inferior
            System.out.print("--|");
            for (int j = 1; j < this.getCol()+1; j++) {
                System.out.print("---" + "+");
                if (j == this.getCol() ) {
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
            for (int j = 1; j <= this.getCol(); j++) {
                
                switch (isPremiada(i,j)) {
                    case 5:
                        System.out.print(" "+this.pieza.get(posarreglo(i,j))[0]+" |");
                        break;
                    case 1:
                        System.out.print("2l"+" |");
                        break;
                    case 2:
                        System.out.print("3l"+" |");
                        break;
                    case 3:
                        System.out.print("2P"+" |");
                        break;
                    case 4:
                        System.out.print("3P"+" |");
                        break;
                    case -1:
                        System.out.print("   |");
                        break;
                    default:
                        break;
                }
            }
            
            System.out.println("");
            
        }
        //Imprime el borde inferior del tablero
        System.out.print("--|");
        for (int j = 1; j < this.getCol()+1; j++) {
            System.out.print("---" + "+");
            if (j == this.getCol() ) {
                System.out.println("");
            }
        }
    }
    public int isPremiada(int x,int y){
        Casillas c=new Casillas();
        for(int i=0;i<this.pieza.size();i++){
            if(this.pieza.get(i)[1].equals(x) && this.pieza.get(i)[2].equals(y)){
                Validaciones.cespecial(new Coordenada((int)this.pieza.get(i)[1],(int)this.pieza.get(i)[2]));
                return 5;
            }
        }
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

    private int posarreglo(int x,int y){
        for(int i=0;i<this.pieza.size();i++){
            if(this.pieza.get(i)[1].equals(x) && this.pieza.get(i)[2].equals(y)){
                return i;
            }
        }
        return 0;
    }
    /**
     * @return the c
     */
    public Coordenada getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(Coordenada c) {
        this.c = c;
    }

    /**
     * @return the filas
     */
    public int getFilas() {
        return filas;
    }

    /**
     * @param filas the filas to set
     */
    public void setFilas(int filas) {
        this.filas = filas;
    }

    /**
     * @return the col
     */
    public int getCol() {
        return col;
    }

    /**
     * @param col the col to set
     */
    public void setCol(int col) {
        this.col = col;
    }

    /**
     * @return the s
     */
    public String getS() {
        return s;
    }

    /**
     * @param s the s to set
     */
    public void setS(String s) {
        this.s = s;
    }

    
    
}
