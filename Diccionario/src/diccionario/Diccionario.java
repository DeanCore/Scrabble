/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diccionario;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class Diccionario {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese una palabra: ");
        String palabra = scan.nextLine();
        
        try{
            FileReader diccionarioEspañol = new FileReader ("C:\\Users\\Carolina\\Documents\\ESPOL 2016 - 2S\\P.O.O\\Proyecto 1er parcial\\DiccionarioEspañol.txt");
            BufferedReader leerDiccionario = new BufferedReader(diccionarioEspañol);
            
            String buscar = "";
            
            while (buscar != null){
                buscar = leerDiccionario.readLine();
                if (buscar.contains(palabra)){
                    System.out.println("Palabra encontrada en el diccionario");
                    break;
                }
                
                //System.out.println(buscar); //Imprimira todo el diccionario
            }
        }
        catch(Exception e){
            System.out.println("Palabra NO encontrada en el diccionario");
        }  
        
    }
    
}
