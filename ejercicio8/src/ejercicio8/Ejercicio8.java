/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author aleja
 * Comprueba si un número es mayor que 10 y menor que 20.
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        System.out.println("Hola, ingresa un número: ");
        int num = x.nextInt();
        
        if(num>10 && num<20){
            System.out.println("El numero que ingresaste esta en el rango 11-19");
        }else{
            if(num>10){
                System.out.println("El numero que ingresaste es mayor a 10");
            }else{
                if(num<20){
                    System.out.println("El numero que ingresaste es menor a 20");
                }else{
                    System.out.println("El numero que ingresaste esta fuera del rango");
                }
                
            }
        }
    }
    
}
