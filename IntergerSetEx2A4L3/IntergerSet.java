package IntergerSetEx2A4L3;

public class IntergerSet {
    private boolean[] a;

    public IntergerSet(){
        a= new boolean[101]; //vai inicializar todos as "casas" array com false
    }

    public IntergerSet union (IntergerSet x){
        IntergerSet c = new IntergerSet();
        int i=0;

        for (i=0; i<101; i++){
            if (a[i]==true || x.a[i]==true)
                c.a[i]=true;
            
            else
                c.a[i]=false;
        }
        return c;
    }
}
