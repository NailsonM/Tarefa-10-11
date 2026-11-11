package SistemUniversidade1;

public class Professor {
    private String nome;
    private String areaFormacao;

    public Professor(String nome, String areaFormacao ){
        this.nome = nome;
        this.areaFormacao = areaFormacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getAreaFormacao() {
        return areaFormacao;
    }

    public void setAreaFormacao(String areaFormacao) {
        this.areaFormacao = areaFormacao;
    }

}
