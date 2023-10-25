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
        tipo=x.nextInt(6)+1;//1 a 3

        if(tipo==1){
            Cachorro poodle =new Cachorro(age, "Poodle");

            System.out.println(poodle.toString());
            poodle.emitirSom();

        }
         else if(tipo==2){
            Gato siames =new Gato(age, "Siamês");

            System.out.println(siames.toString());
            siames.emitirSom();

        }
        else if(tipo==3){
            Arara arara=new Arara(age, "Arara");

            System.out.println(arara.toString());
            arara.emitirSom();            
        }
        else if(tipo==4){
            Bentevi bentevi=new Bentevi(age, "Bem-te-vi");

            System.out.println(bentevi.toString());
            bentevi.emitirSom();            
        }
        else if(tipo==5){
            Bagre bagre = new Bagre(age, "Bagre");

            System.out.println(bagre.toString());
            bagre.emitirSom();
        }
        else if(tipo==6){
           Tilapia tilapia = new Tilapia(age, "Tilapia");

            System.out.println(tilapia.toString());
            tilapia.emitirSom();
        }
        cont++;
    } while (cont<=10);

    }
    
}
