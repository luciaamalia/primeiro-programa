import java.util.ArrayList;
import java.util.List;

//Classe/objeto que representa o aluno
public class Aluno {

    private String nome;
    private int idade;
    private String dataNascimento;
    private String cpf;
    private String nomeMae;
    private String matricula;
    private String serie;

    private Disciplina disciplina = new Disciplina();

    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public void setDisciplinas(List<Disciplina>());
        this.disciplinas = disciplinas;
}
    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setMatricula(String matricula) {
        this.serie = serie;
    }

    //Método que retorna a média do aluno
    public double getMediaNota() {
        double somaNotas = 0.0;

        for (Disciplina disciplina : disciplinas) {
            somaNotas += disciplina.getNota();
        }

        return somaNotas / disciplinas.size();
    }

    //Metodo que retorna true para AP e false para RP
    public boolean getAlunoAprovado(){
    double media = this.getMediaNota();
    if (media >= 70) {
        return true;
    }else {
        return false;
    }
    }
}
