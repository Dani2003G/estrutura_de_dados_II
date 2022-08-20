//Exercício VII – Complementando o exercício anterior, coloque 0 (zero) nos valores menores que a média
package application;

public class Ex7 {
    public static void main(String[] args) {
        Integer v[] = {2,4,5,6,3,1,4,0};
        Float media = 0f;
        
        for(float n : v)
            media += n;
        
        media /= v.length;
        
        for(int i = 0; i < v.length; i++) {
            if(v[i] < media)
                v[i] = 0;
        }
        
        System.out.println("Os valores dentro do vetor são:");
        
        for(int n : v)
            System.out.println(n);
    }
}
