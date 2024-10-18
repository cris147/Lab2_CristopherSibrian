/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.pkg2_cristopher_sibrian;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author BLINTEC
 */
public class Lab2_Cristopher_Sibrian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner lab = new Scanner(System.in);
        int juego, num1, num2, p, s, tab, tab2;
        do{
             System.out.println("Menu de opciones \n1. Numero comunes en multiplicaion \n2. juego de suerte \n3. llenar el trapecio \n4. salida \nElija una opcion:");
        juego = lab.nextInt();
        if (juego == 1){
                System.out.println("Ingrese el numero de la primera tabla:");
                num1 = lab.nextInt();
                System.out.println("Ingrese el numero de la segunda tabla: ");
                num2 = lab.nextInt();
                
                p = 1;
                while(p<13){
                    tab = num1 * p;
                    s = 1;
                  
                    while (s<13){
                        tab2 = num2 * s;
                        if (tab == tab2){
                            System.out.print(tab + " ");
                        }
                        s++;
                    }
                    p++;
                System.out.print("_ "); 
                }
        }
        else if (juego == 2){
               Random numeros = new Random();
               int Pjugador = 0, Pmaquina = 0, ronda = 1;
               boolean Gameover = false;
               
               while (ronda<= 3){
                   System.out.println("\n Ronda " + ronda + " ");
                   Pjugador += numeros.nextInt(10) + 1;
                   
                   while (!Gameover){
                       System.out.println("Puntos del jugador "+ Pjugador);
                       System.out.println("OPCIONES: \n1. Agregar 1 \n2.Agregar 2 \n3. Seguir \n Terminar");
                   }
                       
                   
                   
               
               }
                 
                       
        }
                       
                
                      
                
        }
        while(true);

    }
    
}
