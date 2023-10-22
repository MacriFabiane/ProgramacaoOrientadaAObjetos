package Ex6e7L7heranca;

public class C extends A {
    private B bMember;

   public C(int x, int y){
        super(x);
        bMember = new B(y);
    }

    public B getBMember() {
        return bMember;
    } 
}
