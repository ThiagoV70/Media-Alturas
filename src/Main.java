import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        Pessoa[] vetor = new Pessoa[n];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Dados da " + (i+1) + ". Pessoa: ");
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("altura: ");
            double altura = sc.nextDouble();
            vetor[i] = new Pessoa(nome, idade, altura);
            System.out.println();
        }
        int menor = 0;
        double soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].getIdade() < 16) {
                menor++;
            }
            soma += vetor[i].getAltura();
        }
        double porcentagem = ((double)menor / n) * 100;
        double media = soma / vetor.length;
        System.out.println("Altura média: " + String.format("%.2f", media));
        System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f",porcentagem)+"%");

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].getIdade() < 16) {
                System.out.println(vetor[i].getNome());
            }
        }
        sc.close();
    }
}