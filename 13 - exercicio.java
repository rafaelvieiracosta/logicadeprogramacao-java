
package rafael_ds;
import java.util.Scanner;

public class Exercicio13 {
     public Exercicio13 (){
        Scanner leia = new Scanner (System.in);
        
        int A [] = new int[5], I, J, D = 0;
        int B [] = new int[5];
        int C [] = new int[10];
        
        for (I = 0; I < 5; I++){
            System.out.println("Digite um número para A");
            A[I] = leia.nextInt ();     
        }
        for (I = 0; I < 5; I++){
            System.out.println("Digite um número para B");
            B[I] = leia.nextInt ();     
        }

        for (I = 0; I < 5 ;I++){           
        C[D]= A[I];
        D = D + 2;
        }
        
        D = 1;
        
        for (I = 0; I < 5 ;I++){           
        C[D]= B[I];
        D = D + 2;
        }        
                             
        for(I = 0; I < 10; I++){
        System.out.println(C[I]);
    }
    }

}
