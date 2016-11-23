/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDAs.Casillas;

import TDAs.Tablero;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author Marlon
 */
public class Validaciones {
    public static boolean validarfoc(String num,int max){
        try {
            int x = Integer.parseInt(num);
            if (x > max || x < 1) {
                return false;
            } else {
                return true;
            }
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static boolean iscentro(Coordenada c){
        return c.getCordx()==8 && c.getCordy()==8;
    }
    
    public static boolean palvalida(String s){
        try{
            FileReader diccionarioEspañol = new FileReader ("C:\\Users\\Carolina\\Documents\\ESPOL 2016 - 2S\\P.O.O\\Proyecto 1er parcial\\DiccionarioEspañol.txt");
            BufferedReader leerDiccionario = new BufferedReader(diccionarioEspañol);
            
            String buscar = "";
            
            while (buscar != null){
                buscar = leerDiccionario.readLine();
                if (buscar.contains(s)){
                    System.out.println("Palabra encontrada en el diccionario");
                    return true;  
                }
            }
        }
        catch(Exception e){
            System.out.println("Palabra NO encontrada en el diccionario");
            return false;
        }  
        return false;
        
    }
    public static boolean posvalida(Coordenada c,int x, int y) {
        try{
            
            if(c.getCordx()==x+1 || c.getCordy()==y+1){
                return true;
            }
            else if(c.getCordx()==x-1 || c.getCordy()==y-1){
                return true;
            }
                
        }
        catch(Exception e){
            return false;
        }
        return false;
    }
    public static int cespecial(Coordenada cord){
        Casillas c=new Casillas();
       for(int i=0;i<c.getL1().size();i++){
           if(cord.equals(c.getL1().get(i))){
               c.getL1().remove(i);
               return 1;
           }
       }
       for(int i=0;i<c.getL2().size();i++){
           if(cord.equals(c.getL2().get(i))){
               c.getL2().remove(i);
               return 2;
           }
       }
       for(int i=0;i<c.getP1().size();i++){
           if(cord.equals(c.getP1().get(i))){
               c.getP1().remove(i);
               return 3;
           }
       }
       for(int i=0;i<c.getP2().size();i++){
           if(cord.equals(c.getP2().get(i))){
               c.getP2().remove(i);
               return 4;
           }
       }
       return 0;
    }
    public static int isPremiada(int x,int y){
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
        return 0;
    }
    public static boolean firstmove(ArrayList<Coordenada> temp){
        for(int i=0;i<temp.size();i++){
            if(temp.get(i).equals(new Coordenada(8,8))){
                return true;
            }
        }
        return false;
    }
    public static boolean palvalida(ArrayList<Coordenada> novalida,int x, int y){
        for(int i=0;i<novalida.size();i++){
            if(novalida.get(i).getCordx()==x && novalida.get(i).getCordy()==y){
                return false;
            }
            if(novalida.get(i).getCordx()+1==x || novalida.get(i).getCordx()-1==x){
                return false;
            }
            if(novalida.get(i).getCordy()+1==y || novalida.get(i).getCordy()-1==y){
                return false;
            }
        }
        return true;
    }
    public static boolean leerPalabrahorizontal(Coordenada c,int v, Tablero t){
        //horizontal
        int cont=0;
        for(int i=0;i<v+1;i++){
            if((t.isPremiada(c.getCordx(), c.getCordy()+i)==-1)&&(cont<v)&&(i==v)){
                return false;
            }
            else if (cont>=v){
                return true;
               
            }
            else if(t.isPremiada(c.getCordx()+i, c.getCordy())==5){
                cont++;
            }
   
        }
        return false;
    }
public static boolean leerPalabravertical(Coordenada c, int v, Tablero t){
        int cont=0;
    for(int i=0;i<v+1;i++){
            if((t.isPremiada(c.getCordx()+i, c.getCordy())==-1)&&(cont<v)&&(i==v)){
                return false;
            }
            else if (cont>=v){
                return true;
               
            }
            else if(t.isPremiada(c.getCordx()+i, c.getCordy())==5){
                cont++;
            }
    }
    return false;
}
}
