public class Exercicio6 {
    public static void main(String[] args) {
        Object[][] planilha = new Object[4][3];

        planilha[0][0] = "Nome";
        planilha[0][1] = "Idade";
        planilha[0][2] = "Cidade";

        planilha[1][0] = "Ana";
        planilha[1][1] = 20;
        planilha[1][2] = "Florianopolis";

        planilha[2][0] = "Bruno";
        planilha[2][1] = 25;
        planilha[2][2] = "Tubarao";

        planilha[3][0] = "Carla";
        planilha[3][1] = 31;
        planilha[3][2] = "Criciuma";

        for (int linha = 0; linha < planilha.length; linha++) {
            for (int coluna = 0; coluna < planilha[linha].length; coluna++) {
                System.out.print(planilha[linha][coluna] + " \t ");
            }
            System.out.println();
        }
    }
}