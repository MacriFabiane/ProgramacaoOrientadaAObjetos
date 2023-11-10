package Lista11AnimaisHerancaMultipla;

class Cachorro extends Animal implements Terrestre, Mamifero {
    public Cachorro(String nome, String dataNasc, String habitat) {
        super(nome, dataNasc, habitat);
    }

    
    public void caminhar() {
        System.out.println("Cachorro caminhando.");
    }

    
    public void amamentar() {
        System.out.println("Cachorro amamentando.");
    }
}