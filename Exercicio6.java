
package rafael_ds;
import java.util.Scanner;

public class Exercicio6 {
    public Exercicio6 () {
    Scanner leia = new Scanner (System.in);
    int C = 1, ID, IDM = 0, IDN = 0;                                                      
    double M = 0, RM = 0, RN = 1000000000;
    while (C <= 10000){
        System.out.println("Digite o número de identificação do boi");
        ID = leia.nextInt ();
        System.out.println("Digite o peso do boi");
        M = leia.nextDouble ();           
        if (M > RM){
        RM = M;
        IDM = ID;
        }        
        if (M < RN) {
        RN = M;
        IDN = ID;
        }        
        C = C + 1;
        }
        System.out.println("BOI MAIS PESADO: Número de identificação: " + IDM + "; Peso: " + RM + "Kg" );
        System.out.println("BOI MAIS LEVE: Número de identificação: " + IDN + "; Peso: " + RN + "Kg");    
    }    
}
