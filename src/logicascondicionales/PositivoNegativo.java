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
public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Declaracion de variales 
        int n = 0;
        String tipo = "";
        
        System.out.println("Programa para verificar si un número es positivo o negativo");
        
        //Ingreso de datos
        System.out.println("Ingrese el número a verificar");
        n = leer.nextInt();
        
        if (n % 2 == 0){
            tipo = "positivo";
        }    
        else {
            tipo = "negativo";
        }
        
        System.out.println("El número " +n+ " es "+tipo);
        
        
        
    }
}
