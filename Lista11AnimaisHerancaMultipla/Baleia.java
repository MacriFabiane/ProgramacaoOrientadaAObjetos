package Lista11AnimaisHerancaMultipla;

class Baleia extends Animal implements Aquatico, Mamifero {
    public Baleia(String nome, String dataNasc, String habitat) {
        super(nome, dataNasc, habitat);
    }

 
    public void nadar() {
        System.out.println("Baleia nadando.");
    }

    public void amamentar() {
        System.out.println("Cachorro amamentando.");
    }
}