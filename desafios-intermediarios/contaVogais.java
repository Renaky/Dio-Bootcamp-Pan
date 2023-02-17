import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String[] strSplit = str.split(" ");
    char[] arrVogais = {'a', 'e', 'i', 'o', 'u'};
    int espacosEmBranco = strSplit.length - 1, quantVogais = 0;
    
        for (int i = 0; i < str.length(); i++) {
            char c = Character.toLowerCase(str.charAt(i));
    
        for (int j = 0; j < arrVogais.length; j++) {
            if (c == arrVogais[j]) {
            quantVogais++;
            
        }
      }
    }

    System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
  }
}
