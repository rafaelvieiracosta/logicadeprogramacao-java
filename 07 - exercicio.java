
package rafael_ds;
import java.util.Scanner;

public class Exercicio7 {
    public Exercicio7 () {
    Scanner leia = new Scanner (System.in);
    int QS, QB;
    double PP, P, RP = 0, RB = 0, RS = 0, RF = 0, TT = 0;
    String NP, NS, NB; 
    
    System.out.println("Digite o nome do prato");
    System.out.println("Massa = R$12,00 por Kg");
    System.out.println("Peixe = R$15,00 por Kg");
    System.out.println("Carne = R$16,00 por Kg");
    NP = leia.next ();
    
    while (!NP.equals("Fim")){
        
    System.out.println("Digite o peso do prato em gramas");
    PP = leia.nextDouble ();
    
    PP = PP / 1000;
    
    if (NP.equals("Massa")){
        RP = 12 * PP;     
    }    
     
    if (NP.equals("Peixe")){
        RP = 15 * PP;
    }
    
    if (NP.equals("Carne")){
        RP = 16 * PP;
    }
        System.out.println("Preço total do prato: R$ " + RP + "\n");
        
    System.out.println("Digite o nome da sobremesa");
    System.out.println("Salada de fruta = R$5,00 por unidade");
    System.out.println("Sorvete = R$8,00 por unidade");
    System.out.println("Pudim = R$10,00 por unidade");
    NS = leia.next ();    
    
    System.out.println("Digite a quantidade");
    QS = leia.nextInt ();
           
    if (NS.equals("Salada de fruta")){
        RS = QS * 5;     
    }    
     
    if (NS.equals("Sorvete")){
        RS = QS * 8;
    }
    
    if (NS.equals("Pudim")){
        RS = QS * 10;
    }
        System.out.println("Preço total da sobremesa: R$ " + RS + "\n");
        
    System.out.println("Digite o nome da bebida");
    System.out.println("Suco = R$7,00 por unidade");
    System.out.println("Refrigerante = R$5,00 por unidade");
    System.out.println("Água = R$3,00 por unidade");
    NB = leia.next ();
    
    System.out.println("Digite a quantidade");
    QB = leia.nextInt ();
           
    if (NB.equals("Suco")){
        RB = QB * 7;     
    }    
     
    if (NB.equals("Refrigerante")){
        RB = QB * 5;
    }
    
    if (NB.equals("Água")){
        RB = QB * 3;
    }
        System.out.println("Preço total da bebida: R$ " + RB + "\n");
        
    RF = RP + RS + RB;    
    
    System.out.println("Valor a pagar nesse pedido: R$" + RF + "\n");   
    
    TT = RF + TT;     
        
    System.out.println("Digite o nome do prato");
    System.out.println("Massa = R$12,00 por Kg");
    System.out.println("Peixe = R$15,00 por Kg");
    System.out.println("Carne = R$16,00 por Kg");
    System.out.println("Fim = Finalizar a sessão");
    NP = leia.next ();
    }  
    
    System.out.println("Total a pagar: R$" + TT);        
                               
    }
}
