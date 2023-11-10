package Lista11AnimaisHerancaMultipla;

class Ornitorrinco extends Animal implements Aquatico, Terrestre, Mamifero {
    public Ornitorrinco(String nome, String dataNasc, String habitat) {
        super(nome, dataNasc, habitat);
    }

    
    public void nadar() {
        System.out.println("Ornitorrinco nadando.");
    }

    
    public void caminhar() {
        System.out.println("Ornitorrinco caminhando.");
    }

    
    public void amamentar() {
        System.out.println("Ornitorrinco amamentando.");
    }
}
