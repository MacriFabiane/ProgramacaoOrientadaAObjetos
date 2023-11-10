package Lista11AnimaisHerancaMultipla;

class Pinguim extends Animal implements Aquatico, Terrestre, Ave {
    public Pinguim(String nome, String dataNasc, String habitat) {
        super(nome, dataNasc, habitat);
    }

   
    public void nadar() {
        System.out.println("Pinguim nadando.");
    }

   
    public void caminhar() {
        System.out.println("Pinguim caminhando.");
    }

   
    public void chocaOvo() {
        System.out.println("Pinguim chocando ovo.");
    }
}
