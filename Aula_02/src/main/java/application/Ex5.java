////Exercício V – Encontrar a média dos valores do vetor do exercício IV (não usar método pronto)
package application;

public class Ex5 {
    public static void main(String[] args) {
        Integer v[] = {2,4,5,6,3,1,4,0};
        Float media = 0f;
        
        for(float n : v)
            media += n;
        
        media /= v.length;
        
        System.out.println("A média da soma dos números dos vetores é: " + media);
    }
}
