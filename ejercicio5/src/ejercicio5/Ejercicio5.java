/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;
import java.util.Scanner;

/**
 *
 * @author aleja
 * par o múltiplo de 5
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        System.out.println("Hola, ingresa un número: ");
        int num = x.nextInt();
        
        if(num%2==0){
            System.out.println("El numero que ingresaste es par");
        }else{
            if(num%5==0){
                System.out.println("El numero que ingresaste es múltiplo de 5");
            }else{
                System.out.println("El numero que ingresaste no es par ni múltiplo de 5");
            }
        }
    }
    
}
