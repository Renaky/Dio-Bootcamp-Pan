


import java.io.IOException;
import java.util.Scanner;

public class MediaPositiva {
    
  public static void main(String[] args) throws IOException {
     Scanner leitor = new Scanner(System.in);
     int cont = 0;
     int i =0;
     double media = 0;
     double x=0;
     double somaPos =0;

     //TODO: Implemente as condições adequadas para obter a quantidade 
    //de valores positivos e a média dos valores positivos:
        for (i=0;i<=5; i++) {
            
            x = leitor.nextDouble();
            if(x>0){
                cont++;
                somaPos += x;
            }
            }
        
            media = somaPos/cont;
    System.out.println(cont + " valores positivos");
    System.out.println(String.format("%.1f", media));
        
    }

    

}
