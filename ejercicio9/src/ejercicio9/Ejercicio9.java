/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author aleja
 * Verifica si un número es menor que 50 o mayor que 100.

 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        System.out.println("Hola, ingresa un número: ");
        int num = x.nextInt();
        
        if(num<50){
            System.out.println("El numero que ingresaste es menor que 50");
        }else{
            if(num>100){
                System.out.println("El numero que ingresaste es mayor a 100");
            }else{
                System.out.println("El numero que ingresaste esta entre 50-100");
                
                
            }
        }
    }
    
}
