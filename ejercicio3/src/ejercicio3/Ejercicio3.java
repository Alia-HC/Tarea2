/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;
import java.util.Scanner;
/**
 *
 * @author aleja
 * Determina si una cadena de texto contiene la letra "a" y "b"
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner x = new Scanner(System.in);
        
        System.out.println("Hola, ingresa una palabra: ");
        String z = x.nextLine();
        
        if(z.contains("a")){
            System.out.println("La palabra que ingresaste contiene una o más 'a'");
        }else{
            if(z.contains("b")){
                System.out.println("La palabra que ingresaste contiene una o más 'b'");
            }else{
                System.out.println("La palabra que ingresaste no contiene ni 'a' ni 'b'");
            }
        }
    }
    
}
