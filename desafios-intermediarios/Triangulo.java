// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  


import java.io.IOException;
import java.util.Scanner;

public class Teste{
	
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		double A = leitor.nextDouble();
		double B = leitor.nextDouble();
		double C = leitor.nextDouble();
		double maior;
		double soma;
		boolean triangulo=false;
		
//TODO: Implemente a condição necessária para o cálculo do triângulo:
//Dica: Você pode utilizar o String.format() na formatação do texto.
    
    if(A + B > C && A + C > B && B + C > A){
     triangulo = true;
    }
    
    if(triangulo == true){
       soma=A+B+C;
      System.out.printf("Perimetro = %.1f",soma);
    }else{
      soma=(A+B)*C/2;
      System.out.printf("Area = %.1f",soma);
    }
		
		
	}
	
}