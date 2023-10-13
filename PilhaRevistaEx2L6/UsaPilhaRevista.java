package PilhaRevistaEx2L6;

public class UsaPilhaRevista {

    public static void main(String[]args){
         PilhaRevista pilha =new PilhaRevista();
         Revista r1 =new Revista("Java1", 1, 2004, 12);
         Revista r2 = new Revista("Java2", 2, 2005, 3);
         Revista r3 =new Revista("Java3", 3, 2007, 7);

        pilha.empilhar(r1);
        pilha.empilhar(r2);
        pilha.empilhar(r3);

        System.out.println("Tirando resvita do topo da pilha: " +pilha.desempilhar());
        System.out.println("Tirando resvita do topo da pilha: " +pilha.desempilhar());
        System.out.println("Tirando resvita do topo da pilha: " +pilha.desempilhar());

    }
    
}
