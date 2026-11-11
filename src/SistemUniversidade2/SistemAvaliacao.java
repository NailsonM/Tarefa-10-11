package SistemUniversidade2;

public class SistemAvaliacao {

    public static void main(String[] args) {

        Avaliacao avaliacao = new Avaliacao("Prova de Java POO ", 3);

        avaliacao.adicionarQuestao(0, "O que é encapsulamento?", 2.9f);
        avaliacao.adicionarQuestao(1, "Qual a diferença entre Composição e Agregação?", 4.1f);
        avaliacao.adicionarQuestao(2, "Como se declara um array em Java?", 3.0f);

        avaliacao.exibirQuestoes();
        System.out.println("Pontuação Total: " + avaliacao.calcularPontuacaoTotal() );

        System.out.println("Removendo a questão da posição 1...");
        avaliacao.removerQuestao(1);

        avaliacao.exibirQuestoes();
        System.out.println("Pontuação Total: " + avaliacao.calcularPontuacaoTotal() );
    }
}
