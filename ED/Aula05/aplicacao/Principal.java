package ED.Aula05.aplicacao;

import ED.Aula05.modelo.Fila;
import ED.Aula05.modelo.PilhaDinamica;

public class Principal{
    public static void main(String[] args) {
        PilhaDinamica<Integer> pilha = new PilhaDinamica<>();
        Fila<String> fila = new Fila<>();

        pilha.inserir(1);
        pilha.inserir(2);
        pilha.inserir(3);

        fila.inserir("A");
        fila.inserir("B");
        fila.inserir("C");

        System.out.println("Pilha:");
        pilha.listarItens();
        System.out.println("Tamanho da Pilha: " + pilha.tamanho());
        System.out.println("Está vazia? " + pilha.estaVazia());

        System.out.println("\nFila:");
        fila.listarItens();
        System.out.println("Tamanho da Fila: " + fila.tamanho());
        System.out.println("Está vazia? " + fila.estaVazia());

        pilha.retirar();
        fila.retirar();

        System.out.println("\nPilha após retirar um elemento:");
        pilha.listarItens();

        System.out.println("\nFila após retirar um elemento:");
        fila.listarItens();
    }
}