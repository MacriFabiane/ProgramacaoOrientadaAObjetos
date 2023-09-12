package RationalEx1A4L4;

public class AppRational {

    public static void main (String[]args){
        Rational num1 = new Rational();
        Rational num2 = new Rational();
        //Rational num3 = new Rational();
        Rational soma = new Rational();
        Rational menos = new Rational();
        Rational div = new Rational();
        Rational multi = new Rational();

       
        num1.inicializaRational(5,5); 
        num2.inicializaRational(2, 3);

        System.out.println("Fração 1:");
        num1.imprimeRationalFrac();
        num1.imprimeRationalFloat(2);

        System.out.println("Fração 2:");
        num2.imprimeRationalFrac();
        num2.imprimeRationalFloat(2);

        System.out.println("Soma das frações:");
        soma=num1.soma(num2);
        soma.imprimeRationalFrac();
        soma.imprimeRationalFloat(2);

        System.out.println("Subtração das frações:");
        menos=num1.subtrai(num2);
        menos.imprimeRationalFrac();
        menos.imprimeRationalFloat(2);

        System.out.println("Multiplicação das frações:");
        multi=num1.multiplica(num2);
        multi.imprimeRationalFrac();
        multi.imprimeRationalFloat(2);
        
        System.out.println("Divisão das frações:");
        div=num1.divide(num2);
        div.imprimeRationalFrac();
        div.imprimeRationalFloat(2);


    }
    
}
