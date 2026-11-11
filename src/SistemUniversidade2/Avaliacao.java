package SistemUniversidade2;

public class Avaliacao {
    private String titulo;
    private Questao[] questoes;
    private int tam;

    public Avaliacao(String titulo, int tam) {
        this.titulo = titulo;
        this.tam = tam;
        this.questoes = new Questao[tam];
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void adicionarQuestao(int posicao, String enunciado, float pontuacao) {
        if (posicao >= 0 && posicao < tam) {
            this.questoes[posicao] = new Questao(enunciado, pontuacao);
        }
    }

    public void removerQuestao(int posicao) {
        if (posicao >= 0 && posicao < tam) {
            this.questoes[posicao] = null;
        }
    }

    public void exibirQuestoes() {
        System.out.println("--- Avaliação: " + this.titulo + " ---");
        for (int i = 0; i < tam; i++) {
            if (questoes[i] != null) {
                System.out.println("Questão " + (i + 1) + " | Pontos: " + questoes[i].getPontuacao());
                System.out.println("Enunciado: " + questoes[i].getEnunciado());
            }
        }
    }

    public float calcularPontuacaoTotal() {
        float total = 0;
        for (int i = 0; i < tam; i++) {
            if (questoes[i] != null) {
                total += questoes[i].getPontuacao();
            }
        }
        return total;
    }
}
