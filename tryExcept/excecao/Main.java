package excecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int numerador, denominador;
        
        Scanner leitura = new Scanner(System.in);
        
        try{
            System.out.println("Entre com o numerador: ");
            numerador = leitura.nextInt();
            System.out.println("Entre com o denominador ");
            denominador = leitura.nextInt();
            System.out.println("Resultado = " + numerador/denominador);
        }
        catch(InputMismatchException e){
            System.err.println("Exceção: " + e);
            leitura.nextLine();
            System.out.println("Entre com valores inteiros.");
        }
        catch(ArithmeticException e){
            System.err.println("Exceção: " + e);
            leitura.nextLine();
            System.out.println("Entre com o denominador válido");
        }
        finally{
            System.out.println("Tchau tchau");
        }
    }
}
