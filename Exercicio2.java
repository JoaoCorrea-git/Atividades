public class Exercicio2 {
    public static void main(String[] args) {
        Object[] valores = new Object[5];
        valores[0] = "Java";
        valores[1] = 42;
        valores[2] = 3.14;
        valores[3] = false;
        valores[4] = "Fim";

        for (int i = 0; i < valores.length; i++) {
            Object dado = valores[i];

            if (dado instanceof String) {
                System.out.println("Posicao " + i + " e do tipo String: " + dado);
            } else if (dado instanceof Integer) {
                System.out.println("Posicao " + i + " e do tipo Integer: " + dado);
            } else if (dado instanceof Double) {
                System.out.println("Posicao " + i + " e do tipo Double: " + dado);
            } else if (dado instanceof Boolean) {
                System.out.println("Posicao " + i + " e do tipo Boolean: " + dado);
            } else {
                System.out.println("Posicao " + i + " e de um tipo nao tratado.");
            }
        }
    }
}
