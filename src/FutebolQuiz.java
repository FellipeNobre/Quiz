import java.util.Scanner;

public class FutebolQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pontuacao = 0;
        String resposta;

        // Pergunta 1
        System.out.println("1. Qual é o nome do jogador que venceu a Bola de Ouro da FIFA em 2021?");
        System.out.println("a) Lionel Messi");
        System.out.println("b) Cristiano Ronaldo");
        System.out.println("c) Robert Lewandowski");
        resposta = input.nextLine();
        if (resposta.equals("c")) {
            pontuacao++;
        }

        // Pergunta 2
        System.out.println("2. Qual país venceu a Copa do Mundo da FIFA de 2018?");
        System.out.println("a) Espanha");
        System.out.println("b) França");
        System.out.println("c) Brasil");
        resposta = input.nextLine();
        if (resposta.equals("b")) {
            pontuacao++;
        }

        // Pergunta 3
        System.out.println("3. Qual time venceu a Liga dos Campeões da UEFA em 2020?");
        System.out.println("a) Bayern de Munique");
        System.out.println("b) Paris Saint-Germain");
        System.out.println("c) Manchester City");
        resposta = input.nextLine();
        if (resposta.equals("a")) {
            pontuacao++;
        }

        // Pergunta 4
        System.out.println("4. Qual jogador tem o recorde de gols marcados em uma única temporada da Liga dos Campeões da UEFA?");
        System.out.println("a) Lionel Messi");
        System.out.println("b) Cristiano Ronaldo");
        System.out.println("c) Neymar");
        resposta = input.nextLine();
        if (resposta.equals("b")) {
            pontuacao++;
        }

        // Pergunta 5
        int i = 0;
        while (i < 3) {
            System.out.println("5. Qual é o apelido da seleção brasileira de futebol?");
            System.out.println("a) Amarelinha");
            System.out.println("b) Canarinho");
            System.out.println("c) Verde-Amarela");
            resposta = input.nextLine();
            if (resposta.equals("b")) {
                pontuacao++;
                break;
            } else {
                i++;
            }
        }

        // Exibe a pontuação final
        System.out.println("Sua pontuação final é " + pontuacao + " de 5.");

        // Classificação do jogador
        if (pontuacao == 5) {
            System.out.println("Excelente! Você é um verdadeiro fã de futebol.");
        } else if (pontuacao >= 3) {
            System.out.println("Bom trabalho! Você sabe muito sobre futebol.");
        } else {
            System.out.println("Que pena! Você precisa estudar mais sobre futebol.");
        }
    }
}
