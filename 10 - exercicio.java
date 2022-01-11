
package rafael_ds;
import java.util.Scanner;

public class Exercicio10 {
public Exercicio10 (){
    Scanner leia = new Scanner (System.in);
    
    int NN, C = 0, NA = 0, NB = 1, NC = 1;
    
    System.out.println("Digite um número pra a sequência Fibonacci");
    NN = leia.nextInt();
    NN = NN - 3;
    
    System.out.print("0, 1");
   
    while (C < NN){
        
    C++;
    
    if(NC>0){        
    System.out.print(", " + NC);
    NA = NB;
    NB = NC;
    NC = NB + NA;       
    }
   
    }
    
   System.out.print(", " + NC);
   
} 
}          
