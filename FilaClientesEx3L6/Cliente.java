package FilaClientesEx3L6;

public class Cliente {
    private String nome;
    private String sexo;

    public Cliente (String nome, String sexo){
        this.nome=nome;
        this.sexo=sexo;
    }

    public String toString(){
        return "Nome do cliente: "+this.nome+" - Sexo: "+this.sexo;
    }
    
}
