/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author 4istik
 */
public class CO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner bub = new Scanner(System.in);//scanner IF AND ELSE /////////////////////////////////
        
        int numInput;//number
        
        try
        {
        
        System.out.println("NOMER DAI between one and 100");
        
        numInput = bub.nextInt();  
        
        if(numInput < 1 || numInput > 100)
        {
            System.out.println("Between one and a hundred!");//if true
        }
        else
        {System.out.println("Otli4no");}}// if false
        
        catch(Exception e)
        {System.out.println("HUINYA BRAT");}// if oshibka
        
        BufferedReader bob = new BufferedReader(new InputStreamReader(System.in));//bufferedreader SWITCH ////////////////////////////
        
        try{
            
            System.out.println("Type in of the three traffic light colors");
            
            String LightColor = bob.readLine();
            
            LightColor = LightColor.toUpperCase();
            
            
            switch(LightColor)
            {
      
            case "RED" -> 
                System.out.println("STOP");
            
            case "AMBER", "YELLOW", "ORANGE" -> 
                System.out.println("SLOWDOWNN");
            
            case "GREEN" -> 
                System.out.println("GAS");
            
            default ->     
                System.out.println("Not a light");
            
            }
   
            }catch (IOException e) {System.out.println("NET");
        
        
        
    }  
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
