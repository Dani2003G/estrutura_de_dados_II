package application;

public class Exemplo {

    public static void main(String[] args) {
        String[] pessoas = new String[100];
        Double[] pesos = new Double[100];

        pesos[5] = 4.6;

        Integer idade[] = {12, 14, 16, 18};

        for (int i = 0; i < 4; i++) {
            System.out.println("Idade: " + idade[i]);
        }
    }
}
