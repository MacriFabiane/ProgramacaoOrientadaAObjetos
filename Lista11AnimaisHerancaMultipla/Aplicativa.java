package Lista11AnimaisHerancaMultipla;

public class Aplicativa {
    public static void main(String[] args) {
        Arara arara = new Arara("Arara Azul", "01/01/2020", "Floresta");
       

        Avestruz avestruz = new Avestruz("Avestruz Veloz", "05/05/2018", "Savana");
     

        Baleia baleia = new Baleia("Baleia Gigante", "10/10/2015", "Oceano");
     

        Cachorro cachorro = new Cachorro("Cachorro Fiel", "03/03/2019", "Casa");
   

        Gato gato = new Gato("Gato Malhado", "02/02/2017", "Casa");
       

        Leao leao = new Leao("Leão Rei", "07/07/2016", "Savana");
       

        Lobo lobo = new Lobo("Lobo Selvagem", "04/04/2021", "Floresta");
       

        Macaco macaco = new Macaco("Macaco Ágil", "06/06/2020", "Floresta");
    

        Morcego morcego = new Morcego("Morcego Noturno", "09/09/2018", "Caverna");
       

        Pinguim pinguim = new Pinguim("Pinguim Gentil", "12/12/2017", "Polo Sul");
       

        Ornitorrinco ornitorrinco = new Ornitorrinco("Ornitorrinco Aquático", "08/08/2015", "Rio");
       
        System.out.println("\nDetalhes da Arara:");
        arara.getNome();
        arara.getDataNasc();
        arara.getHabitat();
        arara.voar();
        arara.chocaOvo();

        System.out.println("\nDetalhes da Avestruz:");
        avestruz.getNome();
        avestruz.getDataNasc();
        avestruz.getHabitat();
        avestruz.caminhar();
        avestruz.chocaOvo();

        System.out.println("\nDetalhes da Baleia:");
        baleia.getNome();
        baleia.getDataNasc();
        baleia.getHabitat();
        baleia.nadar();

        System.out.println("\nDetalhes do Cachorro:");
        cachorro.getNome();
        cachorro.getDataNasc();
        cachorro.getHabitat();
        cachorro.caminhar();
        cachorro.amamentar();

        System.out.println("\nDetalhes do Macaco:");
        macaco.getNome();
        macaco.getDataNasc();
        macaco.getHabitat();
        macaco.caminhar();
        macaco.amamentar();

        System.out.println("\nDetalhes do Morcego:");
        morcego.getNome();
        morcego.getDataNasc();
        morcego.getHabitat();
        morcego.voar();
        morcego.amamentar();

        System.out.println("\nDetalhes do Pinguim:");
        pinguim.getNome();
        pinguim.getDataNasc();
        pinguim.getHabitat();
        pinguim.nadar();
        pinguim.caminhar();
        pinguim.chocaOvo();

        System.out.println("\nDetalhes do Ornitorrinco:");
        ornitorrinco.getNome();
        ornitorrinco.getDataNasc();
        ornitorrinco.getHabitat();
        ornitorrinco.nadar();
        ornitorrinco.caminhar();
        ornitorrinco.amamentar();

        System.out.println("\nDetalhes do Gato:");
        gato.getNome();
        gato.getDataNasc();
        gato.getHabitat();
        gato.caminhar();
        gato.amamentar();

        System.out.println("\nDetalhes do Leão:");
        leao.getNome();
        leao.getDataNasc();
        leao.getHabitat();
        leao.caminhar();
        leao.amamentar();

        System.out.println("\nDetalhes do Lobo:");
        lobo.getNome();
        lobo.getDataNasc();
        lobo.getHabitat();
        lobo.caminhar();
        lobo.amamentar();
        
    }

}
