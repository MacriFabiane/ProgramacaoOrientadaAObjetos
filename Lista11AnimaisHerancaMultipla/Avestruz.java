package Lista11AnimaisHerancaMultipla;

class Avestruz extends Animal implements Ave, Terrestre {
    public Avestruz(String nome, String dataNasc, String habitat) {
        super(nome, dataNasc, habitat);
    }

    
    public void caminhar() {
        System.out.println("Avestruz caminhando.");
    }

    
    public void chocaOvo() {
        System.out.println("Avestruz chocando ovo.");
    }
}