/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercícios;

/**
 *
 * @author CAMARGO
 */
public class Exercício03 {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int res = 0;
        
        for (int i=0; i <= 10; i++){
            if (n1 == 0){
                System.out.println(n1);
                System.out.println(n2);
            } 
            res = n1 + n2;
            n1 = n2;
            n2 = res;
        
        System.out.println(res);
            
    }
        
        
                
        



//        int soma = 0;
//        int total = 0;
//        for (int i=0; i<=20; i++){
//            soma = soma + i;
//            total = soma + i;
//            System.out.println(total);
//        }
    }
}
