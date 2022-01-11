
package rafael_ds;
import java.util.Scanner;

public class Exercicio12 {
    public Exercicio12 (){
        Scanner leia = new Scanner (System.in);
        
        int A [] = new int[10], NV, I, J, S, C = -1;
        for (I = 0; I < 10; I++){
            System.out.println("Digite um número");
            A[I] = leia.nextInt ();     
        }
        for(I = 0; I < 10; I++){ 
        NV=A[I];
        C = C+1;
        for(J = C; J < 10; J++){
        if(A[J]>NV){
        NV=A[J];
        S=A[I];
        A[I]=NV;
        A[J]=S;
        }
        }
        }
        System.out.println("A sequencia na ordem decrescente é:");
        for(I = 0; I < 10; I++){
        System.out.println(A[I]);
    }
    }
}
