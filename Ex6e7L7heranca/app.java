package Ex6e7L7heranca;

public class app {
    public static void main(String[]args){
     
        int x=8;
        int y=7;
         C num = new C(x , y);

        System.out.println(num.getX());
        System.out.println(num.getBMember().getY());
    }
    
}
