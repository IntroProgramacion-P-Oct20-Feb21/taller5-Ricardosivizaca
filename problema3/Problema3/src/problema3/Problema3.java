/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Elio Sivizaca
 */

public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double costo;
        String marca;
        double origen;
        String descuentoA;
        String descuentoJ = null;
        String descuentoI;
        String descuentoU;
        descuentoA = ("Alemania");
        descuentoJ = ("Japon");
        descuentoI = ("Italia");
        descuentoU = ("USA");
        
        double valorventa = 0;
        int impuestoAlemania = (20);
        int impuestoJapon = (30);
        int impuestoItalia = (15);
        int impuestoUsa = (8);
        double costoAlemania;
        double costoJapon;
        double costoItalia;
        double valorUsa;
        double impuesto;
        
        System.out.println("Ingrese el costo del auto");
        costo=entrada.nextDouble();
        System.out.println("Ingrese la marca del auto");
        marca=entrada.nextLine();
        System.out.println("Indique el pais de origen que desea \n1."
        +"Alemania\n2.Japon\n3.Italia\n4.USA\n");
        entrada.nextLine();
        origen=entrada.nextDouble();
        if (origen==1){
           impuestoAlemania=20;
           valorventa=0;
           impuesto = (impuestoAlemania * costo/100);
           valorventa = (costo + impuesto);
        System.out.printf("El impuesto es: " + impuesto,"El precio" 
                + "de venta: "+valorventa);
        }
        if(origen==4){
            impuestoJapon=30;
            valorventa=0;
            impuesto = (impuestoJapon * costo/100);
            valorventa = (costo + impuesto);
        System.out.printf("El impuesto a pagar es: " + impuesto,"El precio"
        + "de venta: "+valorventa);
        }
        if (origen == 3) {
            impuestoItalia=15;
            valorventa=0;
            impuesto = (impuestoItalia * costo/100);
            valorventa = (costo + impuesto);
        System.out.printf ("El impuesto a pagar es: "+ impuesto,"El precio"
        + "de venta: "+ valorventa);
        }
        if (origen==4){
            impuestoUsa=8;
            valorventa=0;
            impuesto = (impuestoUsa * costo/100);
            valorventa = (costo + impuesto);
        System.out.printf("El impuesto a pagar es: " + impuesto,"El precio"
        + "de venta: "+ valorventa);
        }
        }
        
    }
    

