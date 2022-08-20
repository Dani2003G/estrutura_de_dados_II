//Exercício bônus extra – Dado o vetor v[]={8,6,4,2,1,0}, crie um algoritmo que o coloque em ordem crescente.
package application;

public class Exb2 {

    public static void main(String[] args) {
        Integer v[] = {8, 6, 4, 2, 1, 0};

        for (int i = 0; i < v.length; i++) {
            for (int j = v.length - 1; j >= i + 1; j--) {
                if (v[j] < v[j - 1]) {
                    Integer aux = v[j];
                    v[j] = v[j - 1];
                    v[j - 1] = aux;
                }
            }
        }
        
        System.out.println("O vetor na ordem crescente:");
        
        System.out.print("[");
        for (int i = 0; i < v.length; i++)
            if (i < v.length - 1)
                System.out.print(v[i] + ", ");
            else 
                System.out.println(v[i] + "]");
    }
}
