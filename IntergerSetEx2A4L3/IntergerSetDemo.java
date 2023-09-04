package IntergerSetEx2A4L3;

import java.util.Scanner;

public class IntergerSetDemo {

    public static void main (String[]args){
        IntergerSet grupo1 = new IntergerSet();
        IntergerSet grupo2 = new IntergerSet();
        IntergerSet grupo3 = new IntergerSet();
        int i=0;
        Scanner scanner = new Scanner(System.in); //scanf do java
        //perguntar pro povo ou pra digitar

        System.out.println("Digite os inteiros de 0 a 100 contidos no primeiro cunjunto(-1 pra sair): ");
        do{
            i=scanner.nextInt();
            if(i>=0 && i<101 && i!= -1)
                grupo1.insertElement(i);

        }while(i!=-1);
            
        System.out.println("Digite os inteiros de 0 a 100 contidos no segundo cunjunto(-1 pra sair): ");
        do{
            i=scanner.nextInt();
            if(i>=0 && i<101 && i!= -1)
                grupo2.insertElement(i);

        }while(i!=-1);
        scanner.close();//fechar o scanner

        //TESTE UNION
        grupo3=grupo1.union(grupo2);
        System.out.println(grupo3.toSetString());//transformar em strig antes de imprimir
   
        
    }
    
}
