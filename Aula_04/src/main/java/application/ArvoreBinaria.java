package application;

public class ArvoreBinaria {

    Node raiz;

    boolean isArvoreCheia(Node node) {
        if (node == null) {
            return true; //Arvore binária cheia
        }

        if (node.esquerdo == null && node.direito == null) {
            return true; //Arvore binária cheia
        }

        if (node.esquerdo != null && node.direito != null) {
            return isArvoreCheia(node.esquerdo) && isArvoreCheia(node.direito);
        }

        return false;
    }

    int verificaProfundidade(Node node) {
        int profundidade = 0;
        while (node != null) { // Enquanto não encontra a folha
            profundidade++;
            node = node.esquerdo;
        }
        return profundidade; // Retorna a profundidade da árvore
    }

    boolean isArvorePerfeita(Node node) {
        int profundidade = verificaProfundidade(node); // Verificar a profundidade do nó
        return isArvoreBinariaPerfeita(node, profundidade, 0);
    }

    boolean isArvoreBinariaPerfeita(Node node, int profundidade, int nivel) {
        if (node == null) {
            return true;
        } // caso base
        if (node.esquerdo == null && node.direito == null) {
            return profundidade == nivel + 1; // cheguei no fundo da árvore
        }
        if (node.esquerdo == null || node.direito == null) {
            return false; // Árvore binária não é perfeita
        }

        return isArvoreBinariaPerfeita(node.esquerdo, profundidade, nivel + 1)
                && isArvoreBinariaPerfeita(node.direito, profundidade, nivel + 1);
    }
}
