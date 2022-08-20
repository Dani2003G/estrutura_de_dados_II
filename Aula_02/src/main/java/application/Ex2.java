//Exercício II – Imprima na tela o valor do vetor anterior na ordem inversa
package application;

public class Ex2 {
    public static void main(String[] args) {
        Integer v[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        for(int i = v.length - 1; i >= 0; i--)
            System.out.println(v[i]);
    }
}
