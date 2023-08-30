package Aula.aplicacao;
import java.util.Scanner;

public class Estudo {
    public static void main(String[] args) {
        int[] vetor1 = new int[10];

        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = leitor.nextInt();
        }

        System.out.println("Imprimindo vetor");

        for (int i : vetor1) {
            System.out.print(vetor1[i] + " ");
        }

        leitor.close();
    }
}
