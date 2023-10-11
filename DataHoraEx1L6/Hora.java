package DataHoraEx1L6;

public class Hora {
    private byte hora;
    private byte min;
    private byte seg;

    public Hora(byte hora, byte min, byte seg){
        this.hora=hora;
        this.min=min;
        this.seg=seg;
    }

    public boolean eIgual (Hora essaHora){
        boolean igual;
        if(this.hora==essaHora.hora && this.min==essaHora.min && this.seg==essaHora.seg){
            igual=true;
        }
        else{
            igual=false;
        }
        return igual;
    }
    public String toString(){
        return "// Horas: "+this.hora+" Minutos: "+this.min+" Segundo: "+this.seg;
    }
}
