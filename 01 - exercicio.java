
package rafael_ds;
import java.util.Scanner;

public class Exercicio1 {
public Exercicio1 () {
    Scanner leia = new Scanner (System.in);
    System.out.println("Digite 2 números"); 
    double a, b;
    a = leia.nextDouble ();
    b = leia.nextDouble ();
    double c = a+b;
    System.out.println("Resultado de a + b = " + c);
    
}
}
