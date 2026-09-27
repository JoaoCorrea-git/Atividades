public class Exercicio1 {
    public static void main(String[] args) {
        Object[] pessoa = new Object[4];
        pessoa[0] = "Maria";
        pessoa[1] = 22;
        pessoa[2] = 1.68;
        pessoa[3] = true;

        for (int i = 0; i < pessoa.length; i++) {
            System.out.println("Posicao " + i + ": " + pessoa[i]);
        }
    }
}
