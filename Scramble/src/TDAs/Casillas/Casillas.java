/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDAs.Casillas;

import java.util.ArrayList;

/**
 *
 * @author Marlon
 */
public class Casillas {
    private Coordenada c;
    private String tipo;
    private ArrayList<Coordenada> l1;
    private ArrayList<Coordenada> l2;
    private ArrayList<Coordenada> p1;
    private ArrayList<Coordenada> p2;
    
    
    public Casillas(){
        l1=new ArrayList<>();
        l2=new ArrayList<>();
        p1=new ArrayList<>();
        p2=new ArrayList<>();
        ppletra();
        ppl2();
        premPal1();
        premPal2();
    }
    
    private void ppletra(){
        getL1().add(new Coordenada(1,4));
        getL1().add(new Coordenada(1,12));
        getL1().add(new Coordenada(3,7));
        getL1().add(new Coordenada(3,9));
        getL1().add(new Coordenada(4,1));
        getL1().add(new Coordenada(4,8));
        getL1().add(new Coordenada(4,15));
        getL1().add(new Coordenada(7,3));
        getL1().add(new Coordenada(7,7));
        getL1().add(new Coordenada(7,9));
        getL1().add(new Coordenada(7,13));
        getL1().add(new Coordenada(8,4));
        getL1().add(new Coordenada(8,12));
        getL1().add(new Coordenada(9,3));
        getL1().add(new Coordenada(9,7));
        getL1().add(new Coordenada(9,9));
        getL1().add(new Coordenada(9,13));
        getL1().add(new Coordenada(12,1));
        getL1().add(new Coordenada(12,8));
        getL1().add(new Coordenada(12,15));
        getL1().add(new Coordenada(13,7));
        getL1().add(new Coordenada(13,9));
        getL1().add(new Coordenada(15,4));
        getL1().add(new Coordenada(15,12));
        
    }
    private void ppl2(){
        getL2().add(new Coordenada(2,6));
        getL2().add(new Coordenada(2,10));
        getL2().add(new Coordenada(6,2));
        getL2().add(new Coordenada(6,6));
        getL2().add(new Coordenada(6,10));
        getL2().add(new Coordenada(6,14));
        getL2().add(new Coordenada(10,2));
        getL2().add(new Coordenada(10,6));
        getL2().add(new Coordenada(10,10));
        getL2().add(new Coordenada(10,14));
        getL2().add(new Coordenada(14,66));
        getL2().add(new Coordenada(14,10));
    }
    private void premPal1(){
        getP1().add(new Coordenada(2,2));
        getP1().add(new Coordenada(2,14));
        getP1().add(new Coordenada(3,3));
        getP1().add(new Coordenada(3,13));
        getP1().add(new Coordenada(4,4));
        getP1().add(new Coordenada(4,12));
        getP1().add(new Coordenada(5,5));
        getP1().add(new Coordenada(5,11));
        getP1().add(new Coordenada(11,5));
        getP1().add(new Coordenada(11,11));
        getP1().add(new Coordenada(12,4));
        getP1().add(new Coordenada(12,12));
        getP1().add(new Coordenada(13,3));
        getP1().add(new Coordenada(13,13));
        getP1().add(new Coordenada(14,2));
        getP1().add(new Coordenada(14,14));
        getP1().add(new Coordenada(8,8));
        
    }
    private void premPal2(){
        getP2().add(new Coordenada(1,1));
        getP2().add(new Coordenada(1,8));
        getP2().add(new Coordenada(1,15));
        getP2().add(new Coordenada(8,1));
        getP2().add(new Coordenada(8,15));
        getP2().add(new Coordenada(15,1));
        getP2().add(new Coordenada(15,8));
        getP2().add(new Coordenada(15,15));
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
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the l1
     */
    public ArrayList<Coordenada> getL1() {
        return l1;
    }

    /**
     * @param l1 the l1 to set
     */
    public void setL1(ArrayList<Coordenada> l1) {
        this.l1 = l1;
    }

    /**
     * @return the l2
     */
    public ArrayList<Coordenada> getL2() {
        return l2;
    }

    /**
     * @param l2 the l2 to set
     */
    public void setL2(ArrayList<Coordenada> l2) {
        this.l2 = l2;
    }

    /**
     * @return the p1
     */
    public ArrayList<Coordenada> getP1() {
        return p1;
    }

    /**
     * @param p1 the p1 to set
     */
    public void setP1(ArrayList<Coordenada> p1) {
        this.p1 = p1;
    }

    /**
     * @return the p2
     */
    public ArrayList<Coordenada> getP2() {
        return p2;
    }

    /**
     * @param p2 the p2 to set
     */
    public void setP2(ArrayList<Coordenada> p2) {
        this.p2 = p2;
    }
    
}
