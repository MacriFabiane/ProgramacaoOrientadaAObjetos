package IntergerSetEx2A4L3;

public class IntergerSetDemo {

    public static void main (String[]args){
        IntergerSet grupo1 = new IntergerSet();
        IntergerSet grupo2 = new IntergerSet();
        int i=0;

        for(i=0; i<101; i++){
            if (i%2==0){
                grupo1.insertElement(i);
            }
            else{
                grupo2.insertElement(i);
            }
        }//perguntar pro povo ou pra prof
        
    }
    
}
