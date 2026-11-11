package SistemUniversidade1;

public class Curso{
    private String nome ;
    private Professor[] professores;
    private int tam;

    public String getNome(){
        return nome ;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Curso(String nome,int tam){
        this.nome = nome;
        this.tam = tam;
        professores = new Professor[tam];
    }

    public void adicionarProfessor(int posicao, Professor professor){
        if(posicao >= 0 && posicao < tam){
            professores[posicao] = professor;
        }
    }

    public void listarProfessores(){
        for(int i = 0; i < tam; i++){
            if (professores[i] !=null){
                System.out.println("Nome: " + professores[i].getNome()+". Formação: " + professores[i].getAreaFormacao());
            }
        }
    }
    public void listarCurso(){
        System.out.println("Curso: " + this.getNome());
    }

}


