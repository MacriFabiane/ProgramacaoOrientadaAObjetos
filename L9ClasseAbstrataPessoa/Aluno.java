package L9ClasseAbstrataPessoa;

public class Aluno extends Pessoa {
    private int ra;
    private String curso;

    public Aluno(String nome, int idade, int ra, String curso) {
        super(nome, idade);
        this.ra = ra;
        this.curso = curso;
    }

      public String getInfos(){
        return "Dados aluno:\n"+ "RA: "+ this.ra + "\n Curso:" + this.curso;
    }

}
