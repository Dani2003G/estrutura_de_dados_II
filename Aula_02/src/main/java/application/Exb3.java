//Exercício bônus extra especial – Crie um vetor chamado PESSOA com nome de 4 pessoas. Crie um segundo vetor chamado idade com os seguintes valores idade[]={24,36,16,18}. Considere que a pessoa da posição 0 do vetor PESSOA tem a idade da posição 0 do vetor idade; a pessoa da posição 1 do vetor PESSOA tem a idade da posição 1 do vetor idade, e assim por diante. Agora, mostre na tela a pessoa com maior e com menor idade.

package application;

public class Exb3 {
    public static void main(String[] args) {
        String pessoa[] = {"Daniel", "Renan", "Ariel", "Gilberto"};
        Integer idade[] = {24,36,16,18};
        Integer maiorI = idade[0];
        Integer maiorP = 0;
        Integer menorI = idade[0];
        Integer menorP = 0;
        
        for(int i = 0; i < idade.length; i++) {
            if(idade[i] > maiorI) {
                maiorI = idade[i];
                maiorP = i;
            }
            if(idade[i] < menorI) {
                menorI = idade[i];
                menorP = i;
            }
        }
        
        System.out.println("A pessoa com a maior idade é " + pessoa[maiorP]);
        System.out.println("A pessoa com a menor idade é " + pessoa[menorP]);
    }
}
