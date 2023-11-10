package Lista11AnimaisHerancaMultipla;

public class Animal {
    private String nome;
    private String dataNasc;
    private String habitat;

    public Animal(String nome, String dataNasc, String habitat) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.habitat = habitat;
    }

    public void getNome() {
        System.out.println("Nome: " + this.nome);
    }

    public void getDataNasc() {
        System.out.println("Data de Nascimento: " + this.dataNasc);
    }

    public void getHabitat() {
        System.out.println("Habitat: " + this.habitat);
    }
}
