/*
Exercício III – Crie um programa que, 
dada a matriz a seguir, verifique se um determinado número está presente.
A complexidade deste algoritmo será O(n²)
 */
package application;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Long tempo = System.currentTimeMillis();

        int[][] v = {{10, 12, 14}, {16, 18, 20}, {22, 24, 26}};

        Scanner sc = new Scanner(System.in);
        int pos = 0;
        int qtde = 0;

        System.out.print("Digite um número para verificar se está na matriz: ");
        int num = sc.nextInt();

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length; j++) {
                qtde++;
                if (num == v[i][j]) {
                    pos++;
                    System.out.printf("O valor %d foi encontrado na linha %d, coluna %d \n", num, i, j);
                }
            }
        }

        if (pos == 0) {
            System.out.println("Valor não encontrado");
        }

        tempo = (System.currentTimeMillis() - tempo);

        System.out.println("Tempo decorrido: " + tempo / 1000.0);

        System.out.println("Quantidade de vezes que pecorreu o matriz: " + qtde + " veze(s)");

        sc.close();
    }
}
