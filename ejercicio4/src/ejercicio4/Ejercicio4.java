/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;
import java.util.Scanner;
/**
 *
 * @author aleja
 * Positivo o diferente de 0
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        System.out.println("Hola, ingresa un número: ");
        int num = x.nextInt();
        
        if(num>0){
            System.out.println("El numero que ingresaste es positivo");
        }else{
            if(num!=0){
                System.out.println("El numero que ingresaste es diferente de 0");
            }else{
                System.out.println("El numero que ingresaste es positivo y puede ser 0");
            }
        }
    }
    
}
