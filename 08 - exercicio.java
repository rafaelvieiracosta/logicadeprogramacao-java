
package rafael_ds;
import java.util.Scanner;

public class Exercicio8 {
    public Exercicio8 () {
    Scanner leia = new Scanner (System.in);     
    double QP = 0, QOC = 0, QOA = 0, QOP = 0, QH = 0, QM = 0, I, Q3 = 0,PH, PM, P3;
    String H, M, HM = "Homem", CO;
         
        while(!HM.equals("Fim")){   
        System.out.println("Homem ou Mulher?");
        HM = leia.next ();
        
        if (HM.equals("Homem")){
            H = HM;
            QH++;            
        } else {
            M = HM;
            QM++;
        }
        
        System.out.println("Informe a idade");
        I = leia.nextInt();
        
        if (I >= 60){
            Q3++;    
        }
        
        System.out.println("Informe a cor dos olhos");
        CO = leia.next();
        
        if(CO.equals("Castanho")){
            QOC++;
        }
    
        if(CO.equals("Azul")){
            QOA++;
        }
        
        if(CO.equals("Preto")){
            QOP++;
        }
        
        QP++;
    
         System.out.println("Digite 'Fim' para finalizar ou 'Cont' para continuar");
         HM = leia.next ();
     
     }
        PH = (QH / QP) * 100;
        PM = (QM / QP) * 100;
        P3 = (Q3 / QP) * 100;
                       
       System.out.println("Total de pessoas: " + QP);
       
       System.out.println("Percentual de Homens: " + PH + "%");
       
       System.out.println("Percentual de Mulheres: " + PM + "%");
       
       System.out.println("Percentual de Pessoas acima de 60 anos " + P3 + "%");
       
       System.out.println("Quantidade de Pessoas de Olhos Castanhos: " + QOC);
       
       System.out.println("Quantidade de Pessoas de Olhos Castanhos: " + QOA);
       
       System.out.println("Quantidade de Pessoas de Olhos Castanhos: " + QOP);
        
    }       
}
