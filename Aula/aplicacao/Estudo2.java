package Aula.aplicacao;

import java.util.Scanner;

public class Estudo2 {
    public static void main(String[] args) {
        char[][] matriz = new char[4][4];

        Scanner leitor = new Scanner(System.in);
        
    for(int i = 0; i < 4; i++){
        for(int j = 0; j < 4; j++){
            matriz[i][j] = leitor.next();
        }
    }
    leito.close();
    }
}
