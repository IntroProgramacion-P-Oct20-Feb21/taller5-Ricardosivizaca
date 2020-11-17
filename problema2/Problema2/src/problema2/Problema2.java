/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;
import java.util.Scanner;
/**
 *
 * @author Elio Sivizaca
 */

public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado= new Scanner(System.in);
        double costo;
        int articulos;
        double precioUnitario;
        double descuento;
        int porcentaje=15;
        System.out.println("Ingrese la cantidad de articulos ");
        articulos= teclado.nextInt();
        System.out.println("Ingrese el valor unitario");
        precioUnitario= teclado.nextDouble();
        
        costo = precioUnitario * articulos;
        if(articulos>50){
            descuento = (costo * porcentaje)/100;
            costo = costo - descuento;
            
        }
        System.out.println ("El costo total del pedido del articulos es de: " + 
                costo);
    }
    
}
