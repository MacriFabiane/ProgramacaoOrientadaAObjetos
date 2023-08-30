package DieEx8A4;
import java.util.Random;
public class Die{
    private int sideUp;
        public Die(){
            sideUp=1;
        }
        public int getSideUp(){
        return  sideUp;
        }
        public void roll(){
            Random x= new Random();
            sideUp = x.nextInt(6)+1;
        }
    }

