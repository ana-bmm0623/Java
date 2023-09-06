package ED.Aula05.modelo;

public class Fila<T> {
    private Node<T> front;
    private Node<T> rear;
    private int tamanho;

    public Fila() {
        front = null;
        rear = null;
        tamanho = 0;
    }

    public int tamanho() {
        return tamanho;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public void inserir(T item) {
        Node<T> newNode = new Node<>(item);
        if (estaVazia()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        tamanho++;
    }

    public T retirar() {
        if (estaVazia()) {
            throw new IllegalStateException("A fila está vazia.");
        }
        T item = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        tamanho--;
        return item;
    }

    public void listarItens() {
        Node<T> current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
