/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aula07;

/**
 *
 * @author CAMARGO
 */
public class Ex {
     public static void main(String[] args) {
        
        int par = 0;
        int impar = 0;
        int i = 1;
        while (i <= 100) {
           
            
            if (i % 2 == 0) {
                System.out.println(i + " Par");
                 par = par + 1;
            } else {
                System.out.println(i + " Ímpar");
                 impar = impar + 1;
            }
                i++;
        
        }
        System.out.println("\n Os valores pares são: " + par);
        System.out.println(" Os valores impares são: " + impar);
        
        if(par > impar) {
                System.out.println("\n Os números pares são maiores");
            }else{
                System.out.println("\n Os números ímpares são maiores");
            }
        
    }

}
