/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicascondicionales;
import java.util.Scanner;
/**
 *
 * @author ASUS GAMER
 */
public class LogicasCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Declaracion de variables 
        double n1, n2, n3;
        n1 = 0; n2 = 0; n3 = 0;
        System.out.println("Programa que determina cual es el mayor de 3 numeros \n");
        System.out.println("Ingrese 3 numeros");
        n1 = leer.nextDouble();
        n2 = leer.nextDouble();
        n3 = leer.nextDouble();
        
        if ((n1 > n2)&&(n1 > n3)) {
            System.out.println("El número mayor es: " +n1);
        }
        else{
            if((n2 > n1)&&(n2 > n3)) {
                System.out.println("El número mayor es: " +n2);
            }
            else{
                System.out.println("El número mayor es " +n3);
            }
            
        }
        
    }
    
}
