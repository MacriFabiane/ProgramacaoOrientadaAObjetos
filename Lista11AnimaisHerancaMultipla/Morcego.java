package Lista11AnimaisHerancaMultipla;

class Morcego extends Animal implements Aereo, Mamifero {
    public Morcego(String nome, String dataNasc, String habitat) {
        super(nome, dataNasc, habitat);
    }

 
    public void voar() {
        System.out.println("Morcego voando.");
    }

 
    public void amamentar() {
        System.out.println("Morcego amamentando.");
    }
}