package application;

public class Main {

    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        arvore.raiz = new Node(5);
        arvore.raiz.esquerdo = new Node(8);
        arvore.raiz.direito = new Node(6);
        arvore.raiz.esquerdo.direito = new Node(9);
        arvore.raiz.esquerdo.esquerdo = new Node(12);
        arvore.raiz.direito.direito = new Node(7);
        arvore.raiz.direito.esquerdo = new Node(4);

        if (arvore.isArvoreCheia(arvore.raiz)) {
            System.out.println("Árvore binária cheia");
        } else {
            System.out.println("Árvore não é binária");
        }

        if (arvore.isArvorePerfeita(arvore.raiz)) {
            System.out.println("Árvore binária perfeita");
        } else {
            System.out.println("Árvore binária não é perfeita");
        }
    }
}
