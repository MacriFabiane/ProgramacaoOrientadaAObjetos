package PilhaRevistaEx2L6;

public class PilhaRevista {
    private int tam;
    private Revista[] revista;
    private int topo;

    public PilhaRevista(){
        revista= new Revista[50];
        tam=50;
        topo = -1;
    }

    public boolean cheia(){
        return topo == tam -1; //retorna true se isso acontecer
    }

    public boolean vazia(){
        return topo == -1; //retorna true se isso acontecer
    }


    public void empilhar(Revista revista){
        if(!cheia()){
            this.revista[++topo]=revista;
        }
        else{
            System.out.println("Pilha cheia");
        }

    }
    public Revista desempilhar() {
        if (!vazia()) {
            Revista revistaRemovida = this.revista[topo];
            this.revista[topo] = null;
            topo--;
            return revistaRemovida;
        } else {
            System.out.println("A pilha de revistas está vazia");
            return null;
        }
    }

    
}
