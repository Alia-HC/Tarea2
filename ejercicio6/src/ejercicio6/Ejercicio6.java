/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;
import java.util.Scanner;
/**
 *
 * @author aleja
 * Determina si un estudiante ha aprobado si su nota es mayor o igual a 60 y menor o
igual a 100.
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner x = new Scanner(System.in);
        
        System.out.println("Hola, ingresa tu calificación: ");
        int cal = x.nextInt();
        
        if((cal>=60)&&(cal<=100)){
            System.out.println("Tu calificación es aprobatoria");
        }else{
            System.out.println("Has reprobado, pero héchale ganas");
        }
        
    }
    
}
