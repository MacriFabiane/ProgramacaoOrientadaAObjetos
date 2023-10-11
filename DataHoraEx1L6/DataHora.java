package DataHoraEx1L6;

public class DataHora {
    private Data estaData;
    private Hora estaHora;

    public DataHora(byte hora, byte minuto, byte segundo, byte dia, byte mes, short ano){
        estaData= new Data(dia, mes, ano);
        estaHora= new Hora(hora, minuto, segundo);
    }
    
    public DataHora(byte dia, byte mes, short ano){
        estaData= new Data(dia, mes, ano);
        estaHora =new Hora((byte)0,(byte)0, (byte)0); //inicializa a hora como meia noite
    }

    public String toString(){
        return estaData+ " "+estaHora;
    }

    public boolean eIgual (DataHora outraDataHora){
        boolean igual;
        if(this.estaData.eIgual(estaData)==outraDataHora.estaData.eIgual(estaData) && this.estaHora.eIgual(estaHora)==outraDataHora.estaHora.eIgual(estaHora)){
            igual=true;
        }
        else{
            igual=false;
        }
        return igual;
    }
}
