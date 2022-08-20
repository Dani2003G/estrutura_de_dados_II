//Exercício bônus extra especial para ficar feroz em Array – Crie dois vetores. O primeiro será chamado de PRIMEIRO e o segundo será chamado de B. Para o primeiro, coloque os valores: “Ana”, “Beatriz”, “Celso”, “Diego”. Para o segundo, inicialize-o como B[]={3,0,1,2}. Faça um código que, quando você capturar o VALOR/CONTEÚDO do vetor B, ele mostre na tela o nome da pessoa do vetor PRIMEIRO. Por exemplo, quando você pegar o conteúdo de B[0] deverá imprimir na tela o nome Diego, afinal, B[0] é o número 3 e a posição 3 no vetor PRIMEIRO é Diego; outro exemplo, ao pegar o conteúdo de B[3] (que é 2), o programa deverá imprimir na tela o nome Celso, afinal, a posição 2 do vetor PRIMEIRO é Celso.

package application;

import java.util.Scanner;

public class Exb4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String primeiro[] = {"Ana", "Beatriz", "Celso", "Diego"};
        Integer b[] = {3, 0, 1, 2};
        char res = 's';
        
        while(res == 's') {
            System.out.print("Digite um valor de 0 á 3: ");
            Integer num = sc.nextInt();
            if (num >= 0 && num <= 3){
                num = b[num];
                System.out.println(primeiro[num]);
            } else
                System.out.println("Valor inválido!");
            System.out.print("Deseja continuar s/n? ");
            res = sc.next().toLowerCase().charAt(0);
        }
        
        sc.close();
    }
}
