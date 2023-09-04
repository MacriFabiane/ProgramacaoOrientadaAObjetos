package IntergerSetEx2A4L3;

public class IntergerSet {
    private boolean[] grupo;

    public IntergerSet(){
        grupo= new boolean[101]; //vai inicializar todos as "casas" array com false
    }
    //uniao entre 2 conjuntos em um terceiro
    public IntergerSet union (IntergerSet grupo2){
        IntergerSet grupo3 = new IntergerSet();
        int i=0;

        for (i=0; i<101; i++){
            if (grupo[i]==true || grupo2.grupo[i]==true)
                grupo3.grupo[i]=true;
            
            else
                grupo3.grupo[i]=false;
        }
        return grupo3; 
    }
    //interseção entre dois conjuntos em um terceiro
    public IntergerSet intersection (IntergerSet grupo2){
        IntergerSet grupo3 = new IntergerSet();
        int i=0;

        for(i=0; i<101; i++){
            if(grupo[i]==false || grupo2.grupo[i]==false)
                grupo3.grupo[i]=false;
            
            else 
                grupo3.grupo[i]=true;
        }
        return grupo3;

    }
    //insere um novo inteiro k em um conjunto
    public void insertElement (int k){
        if(k>=0 && k<=100)
            grupo[k]=true;
        else
            System.out.println("Valor fora do intervalo(0 a 100)");
    }
    //exclui o inteiro m
    public void deleteElement (int m){
        if (m>=0 && m<=100)
           grupo[m]=false;
        else
            System.out.println("Valor fora do intervalo(0 a 100)");
    }

    public String toSetString (){
        String presente = new String();
        int i=0;
        int cont=0;

        for(i=0; i<101; i++){
            if(grupo[i]==true){
                presente = i + " ";
                cont++;//vai contar quantas vezes teve um verdadeiro, se n tiver é conjunto vazio
             }
        }
        if (cont==0){
            return "--";
        }
        else{
            return presente; 
        }
    
    }

    public Boolean isEqualTo (IntergerSet grupo2){
        int i=0;

        for(i=0;i<101; i++){
            if(grupo2.grupo[i]!=grupo[i]){
                return false;//se tiver 1 elemento difernte já acaba
            }
        }
        return true;//caso n tenha encontrado nada diferente nos conjuntos acaba
    }

}


