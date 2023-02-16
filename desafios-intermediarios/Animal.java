// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		
		String AN1,AN2,AN3;
		
		AN1 = sc.nextLine();
		AN2 = sc.nextLine();
		AN3 = sc.nextLine();
    boolean v = false;
    boolean ave = false;
    boolean carn = false;
    boolean oniv = false;
    boolean mamif = false;
    boolean inv = false;
    boolean anel = false; 
    boolean ins = false;
    boolean hematofago = false;
    boolean herb = false;
		//TODO: Implemente as condição necessária para que seja verificado que tipo de animal é:
               //Dica: Você pode utilizar o método equals para realizar comparações.
    
    if (AN1.equals("vertebrado")){
      v = true;
      inv = false;
    }
   
    if(AN1.equals("invertebrado")){
      inv = true;
      v = false;
    }
    
    
    if(AN2.equals("ave")){
      ave = true;
      
    }
    if(AN2.equals("mamifero")){
      mamif=true;
      
    }
    if(AN2.equals("inseto")){
      ins=true;
      
    }
    if(AN2.equals("anelideo")) {
      anel=true;
      
    }
    
    if(AN3.equals("carnivoro")){
     carn = true;
    }
    if(AN3.equals("onivoro")){
      oniv=true;
    }
    if(AN3.equals("hematofago")){
      hematofago=true;
      
    }
    if(AN3.equals("herbivoro")){
     herb=true;
    }
    
    
    if(v == true && ave == true && carn == true){
      System.out.println("aguia");
    }
    
    if(v == true && ave == true && oniv == true){
      System.out.println("pomba");
    }
    
    if(v == true && mamif == true && oniv == true){
      System.out.println("homem");
    }
    
    if(v == true && mamif == true && herb == true){
      System.out.println("vaca");
    }
    //---------------
    //Teste dos invertebrados 
    
    if(inv == true && ins == true && hematofago == true){
      System.out.println("pulga");
    }
    
    if(inv == true && ins && herb ){
      System.out.println("lagarta");
    }
    
    if(inv ==true && anel==true && hematofago == true){
      System.out.println("sanguessuga");
    
    }
    if(inv == true && anel && oniv){
      System.out.println("minhoca");
        }
     
   
    }
 }

    
    
    
    
    
    