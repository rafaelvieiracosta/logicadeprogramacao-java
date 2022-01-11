
package rafael_ds;
import java.util.Scanner;

public class Exercicio16 {
    public Exercicio16 (){
    Scanner leia = new Scanner (System.in);
    
    int A[][] = new int [5][4], I,J,C;
    
    for (I = 0; I < 5; I++){
        for (J = 0; J < 4; J++){
            System.out.println("Digite um número");
            A[I][J] = leia.nextInt ();                            
    }   
}
        System.out.println("Digite a coluna para exibir ( 1 - 4 )");
        C = leia.nextInt ();
        
        for (I = 0; I < 5; I++){
            System.out.println(A[I][C]);
        }
    
}
}
