package Aula6;
public class Pessoa{
 private String nome;
 private String cpf;

 public Pessoa(String nome, String cpf) {
  this.nome = nome;
  this.cpf = cpf;
 }
 public void imprimirDados(){
  System.out.println("Nome: " + nome);
  System.out.println("CPF: " + cpf);
 }
}//end yi
