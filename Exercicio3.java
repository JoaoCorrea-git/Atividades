public class Exercicio3 {
    public static void main(String[] args) {
        Object[] produto = new Object[4];
        produto[0] = "Teclado Mecanico";
        produto[1] = 35;
        produto[2] = 249.90;
        produto[3] = true;

        System.out.println("Nome: " + produto[0]);
        System.out.println("Quantidade em estoque: " + produto[1]);
        System.out.println("Preco: R$ " + produto[2]);
        System.out.println("Disponivel: " + produto[3]);
    }
}