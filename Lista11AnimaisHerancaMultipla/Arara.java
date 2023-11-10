package Lista11AnimaisHerancaMultipla;

class Arara extends Animal implements Ave, Aereo {
    public Arara(String nome, String dataNasc, String habitat) {
        super(nome, dataNasc, habitat);
    }

   
    public void voar() {
        System.out.println("Arara voando.");
    }

   
    public void chocaOvo() {
        System.out.println("Arara chocando ovo.");
    }
}