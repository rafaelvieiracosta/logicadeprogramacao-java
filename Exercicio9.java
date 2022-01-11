
package rafael_ds;
import java.util.Scanner;

public class Exercicio9 {
public Exercicio9 (){
Scanner leia = new Scanner (System.in);
int QM, TEMPH, TEMPM, C = 0, NIM, RTF, NIP = 0, TFP = 0, NIU = 0, TFU = 0;
String HH, HCM;

    System.out.println("Digite a quantidade de maratonistas que participará");
    QM = leia.nextInt();

    System.out.println("Digite o horário de início da competição");
    HH = leia.next ();
    String[]temp = HH.split(":");
    TEMPH = Integer.parseInt(temp[0])*3600+Integer.parseInt(temp[1])*60+Integer.parseInt(temp[2]);
    
    while(C < QM){
        
    System.out.println("Digite o número de inscrição do maratonista");
    NIM = leia.nextInt ();
        
    System.out.println("Digite o horário da chegada do maratonista");
    HCM = leia.next ();
    String[]temp1= HCM.split(":");
    TEMPM = Integer.parseInt(temp1[0])*3600+Integer.parseInt(temp1[1])*60+Integer.parseInt(temp1[2]);
    
    RTF = TEMPM - TEMPH;
    
    System.out.println("O maratonista " + NIM + " terminou a corrida em " + RTF +"s");
    
    C++;
    
    if (C == 1){
    NIP = NIM;
    TFP = RTF;    
    }
    
    if (C == QM){
    NIU = NIM;
    TFU = RTF;      
    }
           
    }
    
    System.out.println("PRIMEIRO COLOCADO: Número de inscrição: " + NIP + ", Terminou em " + TFP +"s");
    System.out.println("ÚLTIMO COLOCADO: Número de inscrição: " + NIU + ", Terminou em " + TFU +"s");
  
} 
}
