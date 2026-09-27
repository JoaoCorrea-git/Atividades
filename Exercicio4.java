public class Exercicio4 {
    public static void main(String[] args) {
        Object[] valores = new Object[6];
        valores[0] = "texto";
        valores[1] = 10;
        valores[2] = 5.5;
        valores[3] = true;
        valores[4] = 20;
        valores[5] = 2.5;

        double soma = 0;

        for (int i = 0; i < valores.length; i++) {
            Object dado = valores[i];

            if (dado instanceof Integer) {
                Integer inteiro = (Integer) dado;
                soma += inteiro;
            } else if (dado instanceof Double) {
                Double decimal = (Double) dado;
                soma += decimal;
            }
        }

        System.out.println("Soma dos valores numericos: " + soma);
    }
}
