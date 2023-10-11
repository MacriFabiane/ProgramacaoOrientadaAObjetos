package DataHoraEx1L6;

public class UsaDataHora {
   
    public static void main(String[]args){
            DataHora hoje = new DataHora((byte) 1, (byte) 2, (byte) 3, (byte) 14, (byte) 11, (short) 2001);

            DataHora ontem = new DataHora((byte) 13, (byte) 12, (byte) 15, (byte) 23, (byte) 10, (short) 2000);

            DataHora amanha = new DataHora((byte) 1, (byte) 1, (short) 2002);

            DataHora qualquer = new DataHora((byte) 1,(byte) 2, (byte) 3, (byte) 14, (byte)11, (short) 2001);

        System.out.println("Hoje - "+hoje.toString());
        System.out.println("Ontem -"+ontem.toString());
        System.out.println("Amanha -"+amanha.toString());
        System.out.println("Qualguer -"+qualquer.toString());

        System.out.println("A data e hora de hoje é igual a de ontem? " + ontem.eIgual(hoje));
        System.out.println("A data e hora de hoje é igual a uma data qualquer? "+ hoje.eIgual(qualquer));
        System.out.println("A data e hora de ontem é igual a de amanha? "+ ontem.eIgual(amanha));

        
    }
    
}
