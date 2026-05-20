package aula;

import java.util.Scanner;
public class Aula {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Aluno[] alunos;
        alunos = new Aluno[4];
        
        Aluno a = new Aluno();
        Aluno b = new Aluno();
        
        a.setNome("Marcos");
        b.setNome("Marcio");
        alunos[0] = a;
        alunos[1] = b;
        alunos[2] = new Aluno();
        
        System.out.println(a.getNome());
        System.out.println(alunos[0]);
        System.out.println(alunos[0].getNome());
        alunos[0].setNome("Marcelo");
        System.out.println(a.getNome());
        System.out.println(alunos[2]);
        alunos[2].setNome("Carlos");
        System.out.println(alunos[2]);
        
        /*Exercício vetores*/
        int[] numeros = new int[10];
        for(int n = 0; n <=9; n++){
            System.out.println("Digite um número");
            numeros[n] = leitura.nextInt();
        }
        for(int m = 9; m >= 0; m--){
            System.out.println("Números digitados em ordem inversa:");
            System.out.println(numeros[m]);
        }
    }
    
}
