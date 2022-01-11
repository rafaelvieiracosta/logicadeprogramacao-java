
package rafael_ds;
import java.util.Scanner;

public class Exercicio5 {
public Exercicio5 (){
    Scanner leia = new Scanner (System.in);
    long N, R = 1;
    System.out.println("Digite um número");
    N = leia.nextLong();
    while ( N > 1){
    R = R * N;
    N = N - 1;
    }
    System.out.println("Resultado: " + R);       
}    
}
