// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.util.*;

public class Quitanda {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
       int morangos = input.nextInt();
       int macas = input.nextInt();
       double precoMorango=0;
       double precoMaca=0;
       double valorPg=0;
       double soma=0;
       

//TODO: Implemente as condições necessárias para retornar o preço a ser pago pelo cliente, conforme a tabela de preços do seu Zé:
      if(morangos>5){
          precoMorango=2.20;
      }else{
          precoMorango=2.50;
      }
      //condicao maça
      if(macas>5){
          precoMaca=1.50;
      }else{
          precoMaca=1.80;
      }
      valorPg=(macas*precoMaca) + (morangos*precoMorango);
      
      if(macas+morangos>=8 || valorPg>=25){
          valorPg = ((macas*precoMaca) + (morangos*precoMorango))*0.90;
      }
      System.out.println(valorPg);
      
      
      
    }
}
