package EstruturadeRepetição;

public class Exercicio08 {
    public static void main(String[] args) {
        int quantidadeProdutos = 5;
        double valorProduto = 20.0;
        double totalCompra = 0.0;
        int contador = 0;

        while (contador < quantidadeProdutos) {
            totalCompra += valorProduto;
            contador++;
        }

        System.out.println("Quantidade de produtos: " + quantidadeProdutos);
        System.out.println("Valor de cada produto: R$ " + valorProduto);
        System.out.println("Total da compra: R$ " + totalCompra);
    }
}

