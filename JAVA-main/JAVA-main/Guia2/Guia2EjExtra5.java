/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author pablcastro
 */
public class Guia2EjExtra5 {

    /**
     * Una obra social tiene tres clases de socios:
○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
○ Los socios que menos aportan, los de tipo ‘C’, no reciben
descuentos sobre dichos tratamientos.
○ Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo
al descuento) y determine el importe en efectivo a pagar por dicho
socio.

     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese la categoria del socio A,B,C ");
         String categoria = leer.nextLine();
         System.out.println("Ingrese el valor del tratamiento");
         int valor=leer.nextInt();
         if (categoria.equalsIgnoreCase("a")) {
             System.out.println("El valor del tratamiento es " +  valor*0.5);
             
         } else if  (categoria.equalsIgnoreCase("b")) {
             System.out.println("El valor del tratamiento es " +  valor *0.65);  

         }else if  (categoria.equalsIgnoreCase("b")) {
             System.out.println("El valor del tratamiento es " +  valor *0.65);  
           
    }
              
    }
    

        
    }
    

