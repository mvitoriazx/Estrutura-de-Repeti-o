package EstruturadeRepetição;

public class Exercicio04 {
    public static void main(String[] args) {
        int numero = 1;
        int soma = 0;

        while (numero <= 100) {
            soma += numero;
            numero++;
        }

        System.out.println("A soma de 1 até 100 é: " + soma);
    }

}
