/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDAs.Casillas;

/**
 *
 * @author Marlon
 */
public class Coordenada {
    private int cordx;
    private int cordy;

    public Coordenada(int cordx, int cordy) {
        this.cordx = cordx;
        this.cordy = cordy;
    }

    /**
     * @return the cordx
     */
    public int getCordx() {
        return cordx;
    }

    /**
     * @param cordx the cordx to set
     */
    public void setCordx(int cordx) {
        this.cordx = cordx;
    }

    /**
     * @return the cordy
     */
    public int getCordy() {
        return cordy;
    }

    /**
     * @param cordy the cordy to set
     */
    public void setCordy(int cordy) {
        this.cordy = cordy;
    }
    
    
    
}
