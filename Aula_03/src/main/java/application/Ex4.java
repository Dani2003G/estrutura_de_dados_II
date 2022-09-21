/*
Exercício IV – Crie um programa que, dada a matriz a seguir, 
verifique se um determinado número está presente. A complexidade 
deste algoritmo será menor que O(n²)
 */
package application;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Long tempo = System.currentTimeMillis();

        int[][] v = {{10, 12, 14}, {16, 18, 20}, {22, 24, 26}};
        int pos, posI, posJ, qtde, validador, testador, i;
        pos = posI = posJ = qtde = validador = testador = 0;
        i = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para verificar se está na matriz: ");
        int num = sc.nextInt();

        for (int j = v[0].length - 1; j >= 0; j--) {
            qtde++;
            if (num <= v[i][j]) {
                if (num == v[i][j]) {
                    pos++;
                    posI = i;
                    posJ = j;
                    validador = 1;
                    break;
                }
                if (j == 0) {
                    validador = 1;
                }
            } else {
                i++;
                j++;
                testador++;
                if (testador == 3) {
                    validador = 1;
                }
            }
            if (validador == 1) {
                break;
            }
        }
        
        if(pos == 1) {
            System.out.printf("O valor %d foi encontrado na linha %d, coluna %d\n", num, posI, posJ);
        } else {
            System.out.printf("O valor %d não foi encontrado na matriz\n", num);
        }
        
        tempo = (System.currentTimeMillis() - tempo);

        System.out.println("Tempo decorrido " + tempo / 1000.0);

        System.out.println("Quantidade de vezes que pecorreu o matriz: " + qtde + " veze(s)");

        sc.close();
    }
}
