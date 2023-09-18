import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class AgendaSimploria {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcao = 0;
        Pessoa[] agenda = new Pessoa[10];
        int cont=0;

        // criacão de menu de interacao
        do {
            System.out.println("..::Escolha uma das opções abaixo ::..");
            System.out.println("1 - Incluir pessoa");
            System.out.println("2 - Listar pessoas cadastradas");
            System.out.println("3 - Excluir pessoa (pelo nome)");
            System.out.println("4 - Gravar a agenda em arquivo");
            System.out.println("5 - Ler a agenda do arquivo");
            System.out.println("6 - Sair do programa");
            System.out.print("Entre com uma opção: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    String nome;
                    String cpf;

                    if(cont<10){
                        
                    System.out.println("Insira o nome da pessoa: ");
                    nome=teclado.nextLine();

                    System.out.println("Insira o cpf da pessoa:");
                    cpf=teclado.nextLine();

                    agenda[cont]= new Pessoa(nome, cpf);
                    cont++;
                    }

                    break;
                case 2:
                    for(Pessoa p: agenda){
                        p.imprimirDados();
                    }
                    break;
                case 3:
                    System.out.println("Saindo");
                    break;
                case 4:
                    /* Gravar em arquivo */
                    File arquivo = new File("agenda.dat");
                    try {
                        FileOutputStream fout = new FileOutputStream(arquivo);
                        ObjectOutputStream oos = new ObjectOutputStream(fout);
                        // gravando o vetor de pessoas no arquivo
                        oos.writeObject(agenda);
                        oos.flush();
                        oos.close();
                        fout.close();
                    } catch (Exception ex) {
                        System.err.println("erro: " + ex.toString());
                    }

                    break;
                default:
                    System.out.println("Opçao invalida. Tente novamente");
            }
        } while (opcao != 6);
        teclado.close();
    }

}
