
package rafael_ds;
import java.util.Scanner;

public class Exercicio2 {
public Exercicio2 () {
    Scanner leia = new Scanner (System.in);
    int num;
    System.out.println("Digite um número");
    num = leia.nextInt ();
    if (num % 2 == 0){
        System.out.println("Número é múltiplo de 2"); 
    }
        else {
        System.out.println("Número não é multiplo de 2");
    }
    
}   
}
