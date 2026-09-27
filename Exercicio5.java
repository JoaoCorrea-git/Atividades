public class Exercicio5 {
    public static void main(String[] args) {
        Object[][] compra = new Object[3][3];

        compra[0][0] = "Caderno";
        compra[0][1] = 3;
        compra[0][2] = 12.50;

        compra[1][0] = "Caneta";
        compra[1][1] = 10;
        compra[1][2] = 2.00;

        compra[2][0] = "Mochila";
        compra[2][1] = 1;
        compra[2][2] = 150.00;

        double totalFinal = 0;

        for (int i = 0; i < compra.length; i++) {
            String nome = (String) compra[i][0];
            Integer quantidade = (Integer) compra[i][1];
            Double valorUnitario = (Double) compra[i][2];

            double totalProduto = quantidade * valorUnitario;
            totalFinal += totalProduto;

            System.out.println(nome + " - Qtd: " + quantidade
                    + " x R$ " + valorUnitario
                    + " = R$ " + totalProduto);
        }

        System.out.println("Total final da compra: R$ " + totalFinal);
    }
}