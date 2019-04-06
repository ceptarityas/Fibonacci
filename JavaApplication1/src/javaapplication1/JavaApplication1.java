/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    static void reverseFibonacci(int n) 
    { 
        int deret[] = new int[n]; 
      
        // assigning first and second elements 
        deret[0] = 1; 
        deret[1] = 1; 
      
        for (int i = 2; i < n; i++) 
        { 
      
   
            deret[i] = deret[i - 2] + deret[i - 1]; 
        } 
      
        for (int i = n - 1; i >= 0; i--)  
        { 
      
            // printing array in 
            // reverse order 
            System.out.print(deret[i] +" "); 
        } 
    } 

    public static void main(String[] args) 
    { 
        
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nilai: ");
        int i = in.nextInt();
        reverseFibonacci(i);
      
    }
    
}
