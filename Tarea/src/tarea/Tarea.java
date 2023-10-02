/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea;
import java.util.Scanner;
/**
 *
 * @author aleja
 * Programa que comprueba si un número es negativo o si es cero
 */
public class Tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        System.out.println("Hola, ingresa un número: ");
        int num = x.nextInt();
        
        if(num<0){
            System.out.println("El numero que ingresaste es negativo");
        }else{
            if(num==0){
                System.out.println("El numero que ingresaste es cero");
            }else{
                System.out.println("El numero que ingresaste es positivo");
            }
        }
        
    }
    
}
