package ExAnimaisL8;
import java.util.Random;
public class Aplicativa {
    public static void main(String[]args){
    int tipo;
    int age;
    
    int cont=1;
    do {
        Random x= new Random();
        age=x.nextInt(3)+2;//2 a 5
        tipo=x.nextInt(3)+1;//1 a 3

        if(tipo==1){
            Mamiferos mamiferoGenerico =new Mamiferos(age, "Mamífero Genérico Aleatório");

            System.out.println(mamiferoGenerico.toString());
            mamiferoGenerico.emitirSom();

        }
        else if(tipo==2){
            Aves aveGenerica=new Aves(age, "Ave Genérica Aleatória");

            System.out.println(aveGenerica.toString());
            aveGenerica.emitirSom();            
        }
        else if(tipo==3){
            Peixes peixeGenerico = new Peixes(age, "Peixe Genérico Aleatório");

            System.out.println(peixeGenerico.toString());
            peixeGenerico.emitirSom();
        }
        cont++;
    } while (cont<=10);

    }
    
}
