/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.Scanner;

/**
 *
 * @author joago
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       String nombre;
               
       Scanner leer = new Scanner(System.in);  
 
       String[] vector = new String[4];
       
       for (int i = 0 ; i < 4 ; i++){
       
       vector[i] = leer.next();
       
       }
       
       
          for (int i = 0 ; i < 4 ; i++){
       
        System.out.println(vector[i]);
       
       }
       
       
    }
     
}                              
        
        
        
        
        
        
    
    

