package ExAnimaisL8;

public class Aves extends Animal{

    Aves(int age, String nome){
        super(age,nome);

    }

    public String mover(){
        return "Esse animal voa";
    }

    public void emitirSom(){

        System.out.println("Emitindo som genérico de ave!"+"\n");
        
     }
    
}
