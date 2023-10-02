/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author aleja
 * Verifica si una cadena de texto contiene la palabra "Java" y no contiene la palabra
"Python".

 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        System.out.println("Hola, ingresa una palabra: ");
        String z = x.nextLine();
        
        if((z.contains("Java"))&&(!(z.contains("Python")))){
            System.out.println("La oración que ingresaste contiene la palabra Java y no la palabraPython");
        }else{
            if(z.contains("Python")){
                System.out.println("La oración que ingresaste contiene palabra Python y no la palabra Java");
            }
        }
    }
    
}
