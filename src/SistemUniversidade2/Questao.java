package SistemUniversidade2;

public class Questao {
    private String enunciado;
    private float pontuacao;

    public Questao(String enunciado, float pontuacao) {
        this.enunciado = enunciado;
        this.pontuacao = pontuacao;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public float getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(float pontuacao) {
        this.pontuacao = pontuacao;
    }
}
