package L9ClasseAbstrataPessoa;

public abstract class Pessoa {

    String nome;
    int idade;
   

   public Pessoa(String nome, int idade){
       this.nome = nome;
       this.idade = idade;
   }

   public abstract String getInfos();

   public String getNome(){
    return this.nome;
   }

   public int getIdade(){
       return this.idade;
   }
    
}
