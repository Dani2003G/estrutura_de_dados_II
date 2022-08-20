//Exercício III – Encontre o maior número no vetor int v[]={2,4,1,7,8} (não usar método pronto)
package application;

public class Ex3 {
    public static void main(String[] args) {
        Integer v[] = {2, 4, 1, 7, 8};
        Integer maior = v[0];
        
        for(int n: v){
            if(n > maior)
                maior = n;
        }
        
        System.out.println("O maior número do vetor é: " + maior);
    }
}
