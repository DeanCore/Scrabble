/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDAs.Casillas;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Marlon
 */
public class Piezas {
    
    private ArrayList<String[]> pieza;
    
    
    public Piezas(){
        pieza=new ArrayList<>();
        leer();
        
    }
    
    public void leer(){
        
        try{
            // Abrimos el archivo
            FileInputStream fstream = new FileInputStream("piezas.txt");
            // Creamos el objeto de entrada
            DataInputStream entrada = new DataInputStream(fstream);
            // Creamos el Buffer de Lectura
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            String strLinea;
            // Leer el archivo linea por linea
            while ((strLinea = buffer.readLine()) != null)   {
                
                getPieza().add(strLinea.split(","));
                
                // Imprimimos la línea por pantalla
                
            }
            // Cerramos el archivo
            entrada.close();
        }catch (Exception e){ //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        }
    }

    

    /**
     * @return the pieza
     */
    public ArrayList<String[]> getPieza() {
        return pieza;
    }

    /**
     * @param pieza the pieza to set
     */
    public void setPieza(ArrayList<String[]> pieza) {
        this.pieza = pieza;
    }

    

    
    
    }
    

