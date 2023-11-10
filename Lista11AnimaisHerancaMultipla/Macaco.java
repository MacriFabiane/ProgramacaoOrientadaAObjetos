package Lista11AnimaisHerancaMultipla;

class Macaco extends Animal implements Terrestre, Mamifero {
    public Macaco(String nome, String dataNasc, String habitat) {
        super(nome, dataNasc, habitat);
    }

   
    public void caminhar() {
        System.out.println("Macaco caminhando.");
    }

   
    public void amamentar() {
        System.out.println("Macaco amamentando.");
    }
}