/*
Exercício II – Crie um programa que, dado o vetor a seguir, 
verifique se o número 20 está presente. A complexidade deste algoritmo será menor que O(n)
 */
package application;

public class Ex2 {

    public static void main(String[] args) {
        Long tempo = System.currentTimeMillis();
        
        int v[] = {10, 12, 14, 16, 18, 20, 22, 24, 26, 28};
        int n = v.length;
        int x = 20;
        int result = buscaBinaria(v, 0, n - 1, x);
        if (result == -1) {
            System.out.println("Não encontrado!!!");
        } else {
            System.out.println("Encontrado no índice " + result);
        }
        
        tempo = (System.currentTimeMillis() - tempo);

        System.out.println("Tempo decorrido: " + tempo / 1000.0);
    }

    public static int buscaBinaria(int v[], int esquerda, int direita, int x) {
        if (direita >= esquerda) {
            int meio = esquerda + (direita - esquerda) / 2;
            if (v[meio] == x) {
                return meio;
            }
            if (v[meio] > x) {
                return buscaBinaria(v, esquerda, meio - 1, x);
            }
            return buscaBinaria(v, meio + 1, direita, x);
        }
        return -1;
    }
}
