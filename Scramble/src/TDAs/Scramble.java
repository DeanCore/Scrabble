/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDAs;

import TDAs.Casillas.Coordenada;
import TDAs.Casillas.Piezas;
import TDAs.Casillas.Validaciones;
import java.util.Scanner;

/**
 *
 * @author Marlon
 */
public class Scramble 
{
    
    public static void main (String[] args){
        //Jugador j=new Jugador("Pepe");
        menuPricipal();
        //j.ImprimirAtril();
        /*j.ImprimirAtril();
        Tablero t=new Tablero();
        t.imprimirTablero(); 
        t.colocarficha("h",2,2);
        /*
        System.out.println();
        t.imprimirTablero();
        t.colocarficha("o",3,2);
        System.out.println();
        t.imprimirTablero();
        t.colocarficha("l",4,2);
        System.out.println();
        t.imprimirTablero();
        t.colocarficha("a",5,2);
        System.out.println();
        t.imprimirTablero();
        */
}
    
    public static void menuPricipal()
    {
        System.out.println("\033[32m~~~~~~~~~~~~~~~~~");
        //System.out.println("\033[32m~"+"               "+"\033[32m~");
        System.out.println("\033[32m~"+"\033[31m    Scrabble   "+"\033[32m~");
        //System.out.println("\033[32m~"+"               "+"\033[32m~");
        System.out.println("\033[32m~~~~~~~~~~~~~~~~~");        
        String opcion = "0";
        
        while(!(opcion.equals("2")))
        {
            System.out.println("1._ Iniciar un nuevo juego");
            System.out.println("2._ Salir del juego");
            Scanner ingreso = new Scanner (System.in);
            System.out.println("Ingrese una opción: ");
            opcion = ingreso.nextLine();
        
            while (!(opcion.equals("1") || opcion.equals("2"))){
                System.out.println("\033[31mEl numero ingresado es incorrecto.");
                System.out.println("Ingrese una opción: ");
                opcion = ingreso.nextLine();
            }
            if(opcion.equals("1"))
            {
                Jugador jugador1=jugadorNuevo(1);
                
                Jugador jugador2=jugadorNuevo(2);
            }
        }
    }
    public static Jugador jugadorNuevo(int numejugad)
    {   
        String nombre;
        Jugador jugador;
        Scanner ingreso=new Scanner (System.in);
        System.out.println("\033[36mIngrese el nombre del jugador: ");
        nombre=ingreso.nextLine();
        jugador=new Jugador(nombre);
        System.out.println("Bienvenio"+nombre);
        return jugador;
        
    }
}      
 
