package exercicios;
import java.util.Scanner;

public class Exercicios {
    
    
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        /*Exercício 1*/
        float peso;
        float altura;
        float imc;
        System.out.print("Digite o peso: ");
        peso = leitura.nextFloat();
        System.out.print("Digite a altura: ");
        altura = leitura.nextFloat();
        imc = peso/(altura*altura);
        System.out.println(imc);
        
        /*Exercício 2*/
        String nome;
        float salario;
        int vendas;
        
        System.out.print("Digite o nome: ");
        nome = leitura.next();
        
        System.out.print("Digite o salário: ");
        salario = leitura.nextFloat();
        
        System.out.print("Digite o total de vendas: ");
        vendas = leitura.nextInt();
        
        System.out.println(nome);
        System.out.println(salario);
        System.out.println("Valor das comissões: " + (vendas * 0.15));
        System.out.println("Valor total salário: " + (salario + (vendas * 0.15)));
        
    }
    
}
