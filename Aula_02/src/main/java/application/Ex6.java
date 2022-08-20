//Exercício VI – Considerando o exercício V, mostre na tela os valores do vetor que sejam maiores que a média encontrada 
package application;

public class Ex6 {
    public static void main(String[] args) {
        Integer v[] = {2,4,5,6,3,1,4,0};
        Float media = 0f;
        
        for(float n : v)
            media += n;
        
        media /= v.length;
        
        System.out.printf("Os valores dentro do vetor maiores que a média %.3f são:\n", media);
        
        for(int n : v) {
            if(n > media)
                System.out.println(n);
        }
    }
}
