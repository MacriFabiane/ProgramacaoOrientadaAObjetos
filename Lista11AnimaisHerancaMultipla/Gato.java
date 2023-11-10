package Lista11AnimaisHerancaMultipla;

class Gato extends Animal implements Terrestre, Mamifero {
    public Gato(String nome, String dataNasc, String habitat) {
        super(nome, dataNasc, habitat);
    }

    
    public void caminhar() {
        System.out.println("Gato caminhando.");
    }

    
    public void amamentar() {
        System.out.println("Gato amamentando.");
    }
}