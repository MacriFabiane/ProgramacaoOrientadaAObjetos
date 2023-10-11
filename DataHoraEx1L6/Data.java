package DataHoraEx1L6;

public class Data {

    private byte dia;
    private byte mes; 
    private short ano;

    public Data(byte dia, byte mes, short ano){
        this.dia=dia;
        this.mes=mes;
        this.ano=ano;
    }

    public boolean eIgual (Data essaData){
        boolean igual=false;

        if(this.dia==essaData.dia && this.mes==essaData.mes && this.ano==essaData.ano){
            igual = true;
        }
        else{
            igual=false;
        }
        return igual;
    }

    public String toString(){
        return "Dia: "+this.dia+" Mês: "+this.mes+" Ano: "+this.ano;
    }
    
}
