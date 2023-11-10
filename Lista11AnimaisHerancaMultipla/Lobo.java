package Lista11AnimaisHerancaMultipla;

class Lobo extends Animal implements Terrestre, Mamifero {
    public Lobo(String nome, String dataNasc, String habitat) {
        super(nome, dataNasc, habitat);
    }

   
    public void caminhar() {
        System.out.println("Lobo caminhando.");
    }

   
    public void amamentar() {
        System.out.println("Loba amamentando.");
    }
}