package PilhaRevistaEx2L6;
//Sabe-se que uma revista possui um nome, um n´umero da edi¸c˜ao, o mˆes e o ano da publica¸c˜ao.

public class Revista {
    private int nEd;
    private int anoPubli;
    private String nome;
    private int mesPubli;

    public Revista (String nome, int nEd, int anoPubli, int mesPubli){
        this.nome=nome;
        this.nEd=nEd;
        this.anoPubli=anoPubli;
        this.mesPubli=mesPubli;
    }

    public String toString(){
        return "Revista: "+ nome +" - Edição: "+nEd+" - Publicado em: "+mesPubli+"/"+anoPubli;
    }
}
