package Lista11AnimaisHerancaMultipla;

class Leao extends Animal implements Terrestre, Mamifero {
    public Leao(String nome, String dataNasc, String habitat) {
        super(nome, dataNasc, habitat);
    }

    
    public void caminhar() {
        System.out.println("Leão caminhando.");
    }

    
    public void amamentar() {
        System.out.println("Leoa amamentando.");
    }
}