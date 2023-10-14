package FilaClientesEx3L6;

public class FilaCliente {
    private int tamMax;
    private Cliente[] fila;
    private int tam;
    private int inicio;
    private int fim;
   
    public FilaCliente(){
        tamMax=10;
        fila=new Cliente[tamMax];
        tam=0;
        inicio=-1;
        fim=-1;
    }
    public boolean vazia(){
        return tam==0;
    }

    public boolean cheia(){
        return tam==tamMax;
    }

    public boolean enfileirar(Cliente cliente1){
        if(this.inicio<0){
            this.inicio=0;
        }

        if(!cheia()){
            if(this.fim<tamMax-1){
                this.fim++;
            }
            else{
                this.fim=0;//circular
            }

            this.fila[this.fim]=cliente1;
            this.tam++;

            return true;

        }
        System.out.println("Fila cheia");
        return false;
    }

    public Cliente desenfileirar(){
        Cliente clienteDaVez =new Cliente(null, null);

        if(!vazia()){
            clienteDaVez=this.fila[this.inicio];
            this.tam--;

            if(this.tam ==0){
                this.inicio=-1;
                this.fim=-1;
                
            }
            else if(this.inicio<tamMax-1){
                this.inicio++;
            }
            else{
                this.inicio =0;
            }
        }
        else{
            System.out.println("Fila vazia");
        }

        return clienteDaVez;
    }

}
