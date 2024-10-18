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
    @SuppressWarnings("empty-statement")
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
                   System.out.println("\n Ronda " + ronda + " " + "\n---------------------");
                   Pjugador += numeros.nextInt(10) + 1;
                   
                   while (!Gameover){
                       System.out.println("Puntos del jugador: "+ Pjugador);
                       System.out.println("Puntos de la PC " + Pmaquina + "\n---------------------");
                       System.out.println("OPCIONES: \n1. Agregar 1 \n2. Agregar 2 \n3. Seguir \n4. Terminar");
                       
                       int game  = lab.nextInt();
                       
                       if (game == 1){
                           Pjugador += 1;
                       }else if(game ==2 ){
                           Pjugador += 2;
                       }else if(game == 3){
                           Gameover = true;
                       }else if(game == 4){
                           System.out.println("La ronda ha terminado!");
                           Gameover = true;
                           
                       }
                       if (Pjugador > 20){
                           System.out.println("UY. Te pasaste de 20, has perdido");
                           Gameover = true;
                       }
                       
                   }
                   Pmaquina += numeros.nextInt(10)+1;
                  
                   Gameover = false;
                   ronda++;
               }
               System.out.println("\n-----FINAL SCORE------");
               System.out.println("Puntos del jugador: "+ Pjugador);
               System.out.println("Puntos de la PC: "+ Pmaquina);
               
               if (Pjugador > 20 && Pmaquina>20){
               System.out.println("Empate, que skill issue del jugador");
               }else if(Pjugador >20){
                   System.out.println("WOMP WOMP, TE GANO LA MAQUINA JAJAJA");
               }else if(Pmaquina >20){
                   System.out.println("Felicidades, puedes decir que eres mejor que una maquina");
               }else if (Pjugador > Pmaquina){
                   System.out.println("Bro enserio gano contra la maquina");
               }else if(Pmaquina > Pjugador){
                   System.out.println("Increible, perdiste");
               }else{
                   System.out.println("Empate");
               }
               
               
                   
                   
                   
               }else if (juego == 3){
                   System.out.println("Vamos a imprimir un trapezoide.");
                   System.out.println("\n1. 25% \n2. 50% \n3. 75% \n4. 100%");
                   System.out.println("Elegi el porcentaje que quieres visualizar. ");
                   int por = lab.nextInt();
                   int bi = 12, bs = 8, al= 5; 
                   int fila  = (al * por / 100);
                   
                   if (por < 1 || por > 4){
                       System.out.println("Debe elegir una opcion correcta");
                       continue;
                   }
                   int x = 0;
                   while (x < fila){
                       int sp = (bi - (bs + 2 * x)) / 2;
                       int as = bs + 2 * x;
                       
                       int i = 0 ;
                       while (i < sp){
                           System.out.println(" ");
                           i++;
                       }
                    int j = 0;
                    while (j < as) {
                        System.out.print("*");
                        j++;
                    }
                    System.out.println(); 
                    x++;
                   }
                   
                         
                   
                   
        }else if(juego == 4){
           System.out.println("Gracias por participar");
        }
        }
        while(juego != 4);
        

    }
    
}
