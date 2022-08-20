//Exercício bônus – Encontrar quantos números 2 estão presentes no vetor v[]={5,8,2,6,8,4,8}
package application;

public class Exb1 {
    public static void main(String[] args) {
        Integer v[] = {5,8,2,6,8,4,8};
        Integer qtde = 0;
        
        for(int n : v) {
            if(n == 2)
                qtde++;
        }
        
        System.out.printf("Existe %d número(s) 2 dentro do vetor", qtde);
    }
}
