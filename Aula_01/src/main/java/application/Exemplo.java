package application;

public class Exemplo {

    public static void main(String[] args) {
        class Main {

            public static void main(String[] args) {
                int[] numeros = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
                int soma = 0;
                double media;

                // for (int i = 0; i < numeros.length; i++)
                // soma += numeros[i];
                for (int n : numeros) {
                    soma += n;
                }

                media = (double) soma / numeros.length;

                System.out.println(soma);
                System.out.println(media);
                System.out.println(numeros);
            }
        }
    }
}
