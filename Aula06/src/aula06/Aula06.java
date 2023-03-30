package aula06;


public class Aula06 {

    public static void main(String[] args) {
        
        int par = 0;
        int impar = 0;
        
        for (int i = 1; i <= 100; i++){
        
            if(i % 2 == 0){
                System.out.println( i + " Par");
                par = par + 1;
            }else{
                System.out.println(i + " Ímpar");
                impar = impar + 1;
            }
      
        }
        System.out.println("Os valores pares são: " + par);
        System.out.println("Os valores ímpares são: " + impar);
        
            if(par > impar) {
                System.out.println("Os números pares são maiores");
            }else{
                System.out.println("Os números ímpares são maiores");
            }
                   
    }
    
}
