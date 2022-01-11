
package rafael_ds;
import java.util.Scanner;

public class Exercicio11 {
public Exercicio11 (){
Scanner leia = new Scanner (System.in);
double N1, N2, N3, M;
int QA1 = 0, QA2 = 0,QA3 = 0, C = 1;

    while(C < 500){
    System.out.println("Digite a primeira nota do aluno");
    N1 = leia.nextDouble ();
    System.out.println("Digite a segunda nota do aluno");
    N2 = leia.nextDouble ();
    System.out.println("Digite a terceira nota do aluno");
    N3 = leia.nextDouble ();
    
    M = (N1 + N2 + N3) / 3;
    
    System.out.println("Média desse aluno: " + M);
    
    if(M < 4.0){
    QA1++;
    }
    
    if(M > 4.1 && M < 5.9 ){
    QA2++;
    }
    
    if(M > 6.0){
    QA3++;
    }
    
    C++;
    }
    System.out.println("Total de alunos com a média abaixo de 4.0: " + QA1);
    System.out.println("Total de alunos com a média entre 4.1 e 5.9: " + QA2);
    System.out.println("Total de alunos com a média acima de 6.0: " + QA3);
}
}   
