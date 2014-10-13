
package bol2ej4;

import java.util.Scanner;

public class Bol2Ej4 {

    public static void main(String[] args) {
  
        float num1 = 0;
        float num2 = 0;
        
        System.out.println("Introduzca el primer número para las operaciones:");
        Scanner rec_num1 = new Scanner (System.in);
        
        num1 = rec_num1.nextFloat();
                
        System.out.println("Introduzca el segundo numero para operar:");
        Scanner rec_num2 =new Scanner ( System.in);
        
        num2 = rec_num2.nextFloat();
        
        System.out.println("La suma es: " +(num1 + num2));
        System.out.println("La resta es: " +(num1 - num2));
        System.out.println("El producto es: " +(num1 * num2));
        System.out.println("El cociente es: " +(num1 / num2));
        
        
    }
    
}
