package DieEx8A4;
public class DieDemo {
    public static void  main(String[]args){
        Die d1=new Die(); //cria d1
        Die d2=new Die(); //cria d2
        d1.roll(); //rola o dado 1
        d1.roll(); // rola o segundo

        System.out.println("Dado 1: "+d1.getSideUp()+" Dado 2: " + d2.getSideUp()+" Soma: "+(d1.getSideUp()+d2.getSideUp()));
    }
    
}
