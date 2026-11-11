package SistemUniversidade1;

public class SistemUniversidade {

    public static void main(String[] args) {

        Professor p1 = new Professor("Cleber", "Linguagem de Programação II");
        Professor p2 = new Professor("Rebeca", "Banco de Dados");
        Professor p3 = new Professor("Jailson", "Estatística");

        Curso curso = new Curso("Sistemas de Informação",3);

        curso.adicionarProfessor(0, p1);
        curso.adicionarProfessor(1, p2);
        curso.adicionarProfessor(2, p3);

        curso.listarCurso();
        curso.listarProfessores();

    }
}