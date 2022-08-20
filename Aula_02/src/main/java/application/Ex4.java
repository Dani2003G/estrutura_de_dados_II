//Exercício IV – Encontre a soma de todos os valores do vetor v[]={2,4,5,6,3,1,4,0} (não usar método pronto)
package application;

public class Ex4 {
    public static void main(String[] args) {
        Integer v[] = {2,4,5,6,3,1,4,0};
        Integer soma = 0;
        
        for(int n : v)
            soma += n;
        
        System.out.println("A soma de todos os números do vetor é: " + soma);
    }
}
