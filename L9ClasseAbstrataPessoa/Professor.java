package L9ClasseAbstrataPessoa;

public class Professor extends Pessoa{
    private double salario;
	private int id;
	public Professor(String nome, int idade, double salario, int id){
        super(nome, idade);
		this.salario = salario;
        this.id = id;
	}

    public String getInfos() {
        return "Dados do Professor: \n" + "Salário:" +this.salario + "\n ID: "+ this.id;
    }

}
