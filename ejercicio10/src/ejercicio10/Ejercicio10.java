/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author aleja
 * Comprueba si un número es múltiplo de 3 y no es múltiplo de 5.
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        System.out.println("Hola, ingresa un número: ");
        int num = x.nextInt();
        
        if(num%3==0 && num%5!=0){
            System.out.println("El numero que ingresaste es múltiplo de 3 y no de 5");
        }else{
            if(num%3==0 && num%5==0){
                System.out.println("El numero que ingresaste es múltiplo de 3 y de 5");
            }else{
                if(num%3==0){
                    System.out.println("El numero que ingresaste es múltiplo de 3");
                }else{
                    if(num%5==0){
                        System.out.println("El numero que ingresaste es múltiplo de 5");
                    }else{
                        System.out.println("El numero que ingresaste no es múltiplo de 5 ni de 3");
                    }
                }  
            }
        }
    }
    
}
