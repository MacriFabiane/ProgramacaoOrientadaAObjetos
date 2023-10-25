package ExAnimaisL8;

public class Mamiferos extends Animal {
    Mamiferos(int age, String nome){
        super(age, nome);
    }

    public String mover(){
        return "Esse animal anda";
    }
    public void emitirSom (){

        System.out.println("Emitindo som genérico de mamífero!"+"\n");
        
     }
    
}
