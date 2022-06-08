/*
 * Calcular  la complejidad ciclomática de McCabe V(G) y diseñar las pruebas para cubrir la cobertura de caminos

 */
package com.mycompany.examen;
import java.io.*;  
/**
 *
 * @author ProBook
 */
public class Maximo {
    
    
         public static void main (String args[])  throws IOException {
                 BufferedReader  entrada  =  new  BufferedReader  (new InputStreamReader(System.in));
         int x,y,z,max;
         
         System.out.println("Introduce x,y,z: "); 
         x =  Integer.parseInt (entrada.readLine());  
         y =  Integer.parseInt (entrada.readLine()); 
         z =  Integer.parseInt (entrada.readLine()); 
         if (x>y && x>z)   
             max = x;     
            else if (z>y)      
                 max = z;   
             else      
                 max = y; 
         System.out.println ("El máximo es "+ max);  
         } 
}
    

