
package rafael_ds;
import java.util.Scanner;

public class Exercicio17 {
   public Exercicio17 (){
        Scanner leia = new Scanner (System.in);
        int [][] M=new int [4][4];
        int I=0, J=0, V=0;
        for(I=0; I<4; I++){
        for(J=0; J<4; J++){
        System.out.println("Digite um numero");
        M[I][J] =leia.nextInt();  
        }
        }  
        for(I=0; I<4; I++){
        for(J=0; J<4; J++){
      
        if(I==0 && J==0 || I==1 && J==1 || I==2 && J==2 || I==3 && 3==J){
        J = J+1;
        }
        
        System.out.println(M[I][J]);    
        }
        }
        
    }
}
