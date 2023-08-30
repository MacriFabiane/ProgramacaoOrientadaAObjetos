package ComplexoEx1A4L3;

public class AplicativaComplexo {
    
    public static void main (String[]args){
        Complexo numero1 = new Complexo();
        Complexo numero2 = new Complexo();
        Complexo numero3 = new Complexo();
        Complexo soma = new Complexo();
        Complexo menos = new Complexo();
        Complexo multi = new Complexo();
        Complexo div = new Complexo();


        numero1.inicializaNumero(2, 3);
        numero2.inicializaNumero(2, 3);
        numero3.inicializaNumero(6, 3);

        numero1.imprimeNumero();
        numero2.imprimeNumero();
        numero3.imprimeNumero(); 

        System.out.println(numero1.eIqual(numero2)); // imprime true or false
        System.out.println(numero1.eIqual(numero3));  

        soma = numero1.soma(numero3);
        soma.imprimeNumero();

        menos =numero1.subtrai(numero3);
        menos.imprimeNumero();

        multi = numero1.multiplica(numero2);
        multi.imprimeNumero();

        div = numero3.divide(numero1);
        div.imprimeNumero();
   
    }
    
}
