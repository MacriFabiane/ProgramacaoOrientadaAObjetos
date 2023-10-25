package ExAnimaisL8;

public class Peixes extends Animal{
    Peixes(int age, String nome){
        super(age, nome);
    }

    public String mover(){
        return "Esse animal nada";
    }
    public void emitirSom(){

        System.out.println("Peixe não faz barulho!"+"\n");
        
     }
}
