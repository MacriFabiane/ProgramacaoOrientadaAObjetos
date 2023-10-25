package ExAnimaisL8;

public class Animal {
    private int age;
    private String nome;

    Animal(int age, String nome){
        this.age=age;
        this.nome=nome;
    }

    public String mover(){
      return "Esse animal se move";
    }

    public void emitirSom(){

        System.out.println("Emitindo som genérico!"+"\n");
        
     }

    public String toString(){
        return (nome+"\n"+"Idade: "+age +"anos\n"+mover());

    }

}
