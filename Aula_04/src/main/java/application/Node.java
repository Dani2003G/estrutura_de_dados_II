package application;

public class Node {

    int dado; // Valor a ser inserido
    Node esquerdo, direito;

    public Node(int valor) {
        dado = valor;
        esquerdo = direito = null;
    }
}
