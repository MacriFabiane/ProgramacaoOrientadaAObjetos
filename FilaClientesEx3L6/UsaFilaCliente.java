package FilaClientesEx3L6;

public class UsaFilaCliente {
    public static void main(String[] args){
        FilaCliente fila = new FilaCliente();
        Cliente c1 = new Cliente("Annabeth Chase", "Feminino");
        Cliente c2 = new Cliente("Percy Jackson", "Masculino");
        Cliente c3 =new Cliente("Severo Snape", "Masculino");
        Cliente c4 = new Cliente("Branca de Neve", "Feminino");
        int i=1;

        fila.enfileirar(c4);
        fila.enfileirar(c3);
        fila.enfileirar(c1);
        fila.enfileirar(c2);

        System.out.println("Imprimindo a ordem em que os atendimentos foram feitos: ");
        while(!fila.vazia()){
            System.out.println("Cliente "+i+": "+ fila.desenfileirar());
            i++;
        }

    }
    
}
