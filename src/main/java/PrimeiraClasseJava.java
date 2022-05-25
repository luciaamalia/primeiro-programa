import javax.swing.*;

public class PrimeiraClasseJava {




    String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
    String idade = JOptionPane.showInputDialog("Qual a idade?");
    String  dataNascimento = JOptionPane.showInputDialog("Data de nascimento?");
    String cpf = JOptionPane = JOptionPane.showInputDialog("Qual o CPF:");
    String nomeMae = JOptionPane = JOptionPane.showInputDialog("Qual o nome da mãe?");
    String matricula = JOptionPane = JOptionPane.showInputDialog("Número da matrícula:");
    String serie = JOptionPane = JOptionPane.showInputDialog("Qual a série?");

    Aluno aluno1 = new Aluno();

    aluno1.setNome(nome);
    aluno1.setIdade(Integer.valueOf(idade));
    aluno1.setDataNascimento(dataNascimento);
    aluno1.setCpf(cpf);
    aluno1.setNomeMae(nomeMae);
    aluno1.setMatricula(matricula);
    aluno1.setSerie(serie);

    for (int pos = 1 ; pos <= 4; pos++){
        String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+pos+" ?");
        String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina "+pos+"  ?");

        Disciplina disciplina = new Disciplina();
        disciplina.setDisciplina(nomeDisciplina);
        disciplina.setNota(Double.valueOf(notaDisciplina));

        aluno1.getDisciplinas().add(disciplina);

    }


    System.out.println(aluno1); //descrição do objeto na memoria
    System.out.pritln("Média do aluno = " + aluno1.getMediaNota());
    System.out.println("Resultado = " + aluno1.getAlunoAprovado2());


}
