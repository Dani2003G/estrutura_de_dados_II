/*
Exercício I – Crie um programa que, dado o vetor a seguir, verifique se o número 20 está
presente. A complexidade deste algoritmo será O(n).
 */
package application;

public class Ex1 {

    public static void main(String[] args) {
        Long tempo = System.currentTimeMillis();
        
        int v[] = {10, 12, 14, 16, 18, 20, 22, 24, 26, 28};

        for (int i = 0; i < v.length; i++) {
            if (v[i] == 20) {
                System.out.println("O número 20 está no vetor na posição " + i);
            }
        }

        tempo = (System.currentTimeMillis() - tempo);

        System.out.println("Tempo decorrido: " + tempo / 1000.0);
    }
}