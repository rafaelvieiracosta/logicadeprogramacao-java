
package rafael_ds;
import java.util.Scanner;

public class Exercicio3 {
public Exercicio3 (){
    Scanner leia = new Scanner (System.in);
    int NP, N1, N2, Resul = 0; 
    System.out.println("Digite um número");
    NP = leia.nextInt ();
    while (NP >= 1000 && NP <= 9999){
    N1 = NP % 100;
    N2 = NP / 100;
    Resul = N1 + N2;
    Resul = Resul * Resul;
    if(Resul == NP) {
    System.out.println("É um número mágico");
    }
    else {
    System.out.println("Não é um número mágico");
    }
    System.out.println("Digite um número novamente");
    NP = leia.nextInt();
    }
}    
}

