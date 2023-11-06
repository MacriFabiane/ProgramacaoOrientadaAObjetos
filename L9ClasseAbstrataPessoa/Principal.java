package L9ClasseAbstrataPessoa;

public class Principal {

    public static void main(String[] args) {
        Professor p1 = new Professor("Jefinho", 30, 7500.00, 237890);
        Aluno a1 = new Aluno("Macri", 19, 2456591, "Computação");

        System.out.println(p1.getNome() + "\n"+ p1.getInfos());
        System.out.println(a1.getNome() +"\n" + a1.getInfos());
    }
    
}
