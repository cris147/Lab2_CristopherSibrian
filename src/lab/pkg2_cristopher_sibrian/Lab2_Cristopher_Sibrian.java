/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.pkg2_cristopher_sibrian;

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
        int juego, num1, num2, pm, sm, tab, tab2;
        do{
             System.out.println("Menu de opciones \n1. Numero comunes en multiplicaion \n2. juego de suerte \n3. llenar el trapecio \n4. salida \nElija una opcion:");
        juego = lab.nextInt();
        if (juego == 1)
                System.out.println("Ingrese el numero de la primera tabla:");
                num1 = lab.nextInt();
                System.out.println("Ingrese el numero de la segunda tabla: ");
                num2 = lab.nextInt();
                
                pm = 1;
                while(pm!=13){
                    sm = 1;
                    tab = num1 * pm;
                    pm++;
                    while (sm!=13){
                        tab2 = num2 * sm;
                        sm++;
                        if (tab == tab2){
                            System.out.print(tab+" ");
                        }
                        sm++;
                    }
                    System.out.print("_ "); 
                }
                      
                
        }
        while(true);

    }
    
}
