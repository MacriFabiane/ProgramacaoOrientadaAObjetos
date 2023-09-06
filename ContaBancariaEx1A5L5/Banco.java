public class Banco {
    
    public static void main(String[] args){
        ContaBancaria2[] nome = new ContaBancaria2[10]; //ecapsula array de instancias de contaBancaria2
        double saldoTotal=0;

        //Declaração de algumas contas
        nome[0]= new ContaBancaria2("Mabel", 1100);
        nome[1]= new ContaBancaria2("Carol", 1000000.99);
        nome[2]= new ContaBancaria2("Bruno", 12000);
        nome[3]= new ContaBancaria2("Macri", 80000);

        saldoTotal=total(nome);
        System.out.println(saldoTotal);


    }
    //metodo static dentro da classe aplicativa para soma os saldo das contas do array
    public static double total(ContaBancaria2[] nome){
        double saldoTotal=0;
        for(ContaBancaria2 p : nome){
            if(p!=null){
                saldoTotal+= p.getSaldo();
            }
        }
        return saldoTotal;
    }
}
