/*
Exercício V – Crie um algoritmo que verifique se determinado 
valor está entre os 50 primeiros números da sequência de 
Fibonacci. Lembrando que a sequência de Fibonacci é dada por: 
1 1 2 3 5 8 13 21 ... 
 */
package application;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Digite um número para saber se ele está presente nos 50 primeiro números de fibonacci: ");
        num = sc.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (num == Fibonacci(i)) {
                System.out.printf("O número %d está presente na posição %d do fibonacci\n", num, i);
                break;
            }
        }
        sc.close();
    }

    public static long Fibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }
}
