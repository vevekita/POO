package exercicios;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        /*Exercício 1*/
        int numero;
        System.out.print("Digite um número inteiro: ");
        numero = leitura.nextInt();
        for (int i = numero; i >= 0; i--){
            if ((i % 2) == 0 && i != numero){
                System.out.println(i);
            }
            
        }
        
        /*Exercício 2*/
        for (int j = 1; j <= 100; j++){
            if((j % 5) == 0){
                System.out.println(j);
            }
        }
        
        /*Exercício 3*/
        int opcao = 1;
        while((opcao != 0) && (opcao <= 4)){
            System.out.println("**********************");
            System.out.println("(0) Sair");
            System.out.println("(1) Somar");
            System.out.println("(2) Subtrair");
            System.out.println("(3) Multiplicar");
            System.out.println("(4) Dividir");
            System.out.println("**********************");
            System.out.print("Digite um número: ");
            opcao = leitura.nextInt();
            
            int num1;
            int num2;
            
            switch(opcao){
                case 0: 
                    System.out.println("Saindo do sistema...");
                    break;
                case 1:
                    System.out.print("Digite o primeiro número para a operação escolhida: ");
                    num1 = leitura.nextInt();
                    System.out.print("Digite o segundo número para a operação escolhida: ");
                    num2 = leitura.nextInt();
                    System.out.println("A soma dos dois números inseridos é igual a " + (num1 + num2));
                    break;
                    
                case 2:
                    System.out.print("Digite o primeiro número para a operação escolhida: ");
                    num1 = leitura.nextInt();
                    System.out.print("Digite o segundo número para a operação escolhida: ");
                    num2 = leitura.nextInt();
                    System.out.println("A subtração dos dois números inseridos é igual a " + (num1 - num2));
                    break;
                
                case 3:
                    System.out.print("Digite o primeiro número para a operação escolhida: ");
                    num1 = leitura.nextInt();
                    System.out.print("Digite o segundo número para a operação escolhida: ");
                    num2 = leitura.nextInt();
                    System.out.println("A multiplicação dos dois números inseridos é igual a " + (num1 * num2));
                    break;
                
                case 4:
                    System.out.print("Digite o primeiro número para a operação escolhida: ");
                    num1 = leitura.nextInt();
                    System.out.print("Digite o segundo número para a operação escolhida: ");
                    num2 = leitura.nextInt();
                    System.out.println("A divisão dos dois números inseridos é igual a " + (num1 / num2));
                    break;
                    
            }
                
                    
        }
    }
    
}
