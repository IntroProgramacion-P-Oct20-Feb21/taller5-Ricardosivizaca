/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema1;

/**
 *
 * @author Elio Sivizaca
 */
import java.util.Scanner;
public class Problema1 {
    public static void main (String[]args){
        Scanner teclado= new Scanner(System.in);
        
        int kilovatiosConsumidos;
        int edadUsuario;
        int porcentaje= 10;
        double costohora;
        double costototal;
        double descuento;
        
        System.out.println ("Ingrese en cosoto de el kv/h ");
        costohora= teclado.nextDouble();
        System.out.println ("Ingresar el valor de el kilovatios cosumidos " );
        kilovatiosConsumidos= teclado.nextInt();
        System.out.println ("Ingresar la edad de el usuario ");
        edadUsuario= teclado.nextInt();
        
        costototal = costohora * kilovatiosConsumidos;
        if (edadUsuario>65){
            descuento = (costototal*porcentaje)/100;
            costototal = costototal - descuento;
        }
        System.out.println("El valor total a pagar es: " + costototal);
              
}
    


        
        
    }
    
