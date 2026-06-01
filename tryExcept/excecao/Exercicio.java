package excecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
    
        String nomeCompleto;
        int peso, altura;
        boolean loop = true;
        do{
            try{
                System.out.println("Entre com seu nome: ");
                nomeCompleto = leitura.next();
                System.out.println("Entre com seu peso: ");
                peso = leitura.nextInt();
                System.out.println("Entre com sua altura: ");
                altura = leitura.nextInt();
                System.out.println(nomeCompleto + "seu IMC é igual a: " + peso/(altura * altura));
                loop = false;
            }
            catch(InputMismatchException e){
                System.err.println("Exceção: " + e);
                leitura.nextLine();
                System.out.println("Entre com valores válidos para peso e altura.");
            }
            catch(ArithmeticException e){
                System.err.println("Exceção: " + e);
                leitura.nextLine();
                System.out.println("Sua altura deve ser diferente de zero.");
            }
            finally{
                System.out.println("Encerrando o programa...");
            }
        }while(loop);
    }
