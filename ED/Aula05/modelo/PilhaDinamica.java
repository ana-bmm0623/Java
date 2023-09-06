package ED.Aula05.modelo;

public class PilhaDinamica<T> {
        private Node<T> top;
        private int tamanho;
    
        public PilhaDinamica() {
            top = null;
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
            newNode.next = top;
            top = newNode;
            tamanho++;
        }
    
        public T retirar() {
            if (estaVazia()) {
                throw new IllegalStateException("A pilha está vazia.");
            }
            T item = top.data;
            top = top.next;
            tamanho--;
            return item;
        }
    
        public void listarItens() {
            Node<T> current = top;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

