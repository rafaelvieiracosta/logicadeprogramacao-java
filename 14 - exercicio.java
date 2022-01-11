
package rafael_ds;
import java.util.Scanner;

public class Exercicio14 {
     public Exercicio14 (){
        Scanner leia = new Scanner (System.in);
        
        int A [] = new int[8], I, NP;
        
        for (I = 0; I < 8; I++){
            System.out.println("Digite um número");
            A[I] = leia.nextInt ();        
        }
        
         System.out.println("Digite um número para procurar");
         NP = leia.nextInt();
         
         for (I = 0; I < 8; I++){         
         if (A[I] == NP){ 
         System.out.println("O número " + NP + " se encontra na posição A[" + I + "]"); 
         I = 8 ;
         }
        
         }
         
         if(I == 8){
         System.out.println("O número " + NP + " não se encontra nesse vetor");
         }
                 
     }
}

