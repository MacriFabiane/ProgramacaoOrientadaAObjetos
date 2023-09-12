package RationalEx1A4L4;

public class Rational {
    private int numerador;
    private int denominador;
    
    public Rational(){
      numerador = 0;
      denominador=1;
    }


    public void inicializaRational(int numerador, int denominador){

      if(denominador!=0){//armazena a menor frac possivel
        int mmc= mmc(numerador, denominador);
        this.numerador = numerador / mmc;
        this.denominador = denominador / mmc;
      }

    }

    private int mmc(int a, int b) { //faz o minimo multiplo comum
        return (b == 0 ? a : mmc(b, a % b));
    }

    public Rational soma(Rational num){
      Rational novo = new Rational();

      if(this.denominador != num.denominador){

      novo.numerador = (this.numerador * num.denominador + this.denominador * num.numerador);

      novo.denominador =(this.denominador * num.denominador);
      }
      else{//pra denominadores iguais

        novo.numerador=(this.numerador + num.numerador);

        novo.denominador = this.denominador;
      }
      //pra retornar a mais simplificada
      int mmc= mmc(novo.numerador,novo.denominador);
        novo.numerador = novo.numerador / mmc;
        novo.denominador = novo.denominador / mmc;
      return novo;

    }

    public Rational subtrai (Rational num){
      Rational novo = new Rational();

      if(this.denominador != num.denominador){

      novo.numerador = (this.numerador * num.denominador - this.denominador * num.numerador);

      novo.denominador =(this.denominador * num.denominador);
      }
      else{//pra denominadores iguais

        novo.numerador=(this.numerador - num.numerador);

        novo.denominador = this.denominador;
      }
      //pra retornar a mais simplificada
      int mmc= mmc(novo.numerador,novo.denominador);
        novo.numerador = novo.numerador / mmc;
        novo.denominador = novo.denominador / mmc;
      return novo;

    }

    public Rational multiplica (Rational num){
      Rational novo = new Rational();

      novo.numerador=(this.numerador * num.numerador);

      novo.denominador=(this.denominador * num.denominador);

      //pra retornar a mais simplificada
      int mmc= mmc(novo.numerador,novo.denominador);
        novo.numerador = novo.numerador / mmc;
        novo.denominador = novo.denominador / mmc;
      return novo;

    }

    public Rational divide (Rational num){
      Rational novo =new Rational();

      novo.numerador =(this.numerador * num.denominador);

      novo.denominador=(this.denominador *num.numerador);

      //pra retornar a mais simplificada
      int mmc= mmc(novo.numerador,novo.denominador);
        novo.numerador = novo.numerador / mmc;
        novo.denominador = novo.denominador / mmc;
      return novo;
    }

    public void imprimeRationalFrac(){
      System.out.println(numerador + "/" + denominador);
    }

    public void imprimeRationalFloat(int n){ //n é a quantidade de numeros flutuantes que devem ser impressos
      float valor= (float)numerador/(float)denominador;
      System.out.printf("%." +n+ "f\n", valor);//tipo em C \n com o f pra pular de linha
    }
    
}

