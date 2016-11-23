/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDAs;

import TDAs.Casillas.Coordenada;
import TDAs.Casillas.Piezas;
import java.util.ArrayList;

/**
 *
 * @author Marlon
 */
public class Jugador extends Piezas{
    private Piezas pieza;
    private String nombre;
    private int puntaje;
    private String[] atril;

    public Jugador(String nombre) {
        this.nombre = nombre;
        atril=new String[7];
        this.puntaje=0;
        
        llenar();
    }

    public void llenar(){
        pieza=new Piezas();
        for (int i=0;i<getAtril().length;i++){
            
                getAtril()[i]=pieza.getPieza().get((int) (Math.random() * 30))[0];
            
        }
    }
    public void ImprimirAtril(){
        System.out.print("[");
        for(int i=0;i<getAtril().length;i++){
            System.out.print(getAtril()[i]+",");
        }
        System.out.println("]");
    }
    public void intercambiarfichas(String[] atril,String[] atril2, String c1,String c2){
        
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the puntaje
     */
    public int getPuntaje() {
        return puntaje;
    }

    /**
     * @param puntaje the puntaje to set
     */
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    /**
     * @return the atril
     */
    public String[] getAtril() {
        return atril;
    }

    /**
     * @param atril the atril to set
     */
    public void setAtril(String[] atril) {
        this.atril = atril;
    }

    

    
    
    
    
    
    
}
