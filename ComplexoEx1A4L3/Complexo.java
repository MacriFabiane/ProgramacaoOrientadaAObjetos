package ComplexoEx1A4L3;

public class Complexo {
    //campos parte real e imag
   private double real;
   private double imaginaria;

   //construtor padrao

   public Complexo(){
    real = 0;
    imaginaria = 0;

   }
   //metodo de inicializar numero complexo

   public void inicializaNumero (double real, double imaginaria){
    this.real= real;
    this.imaginaria = imaginaria;

   }

   public void imprimeNumero(){
    System.out.println(real + "+" + imaginaria + "i" ); //real e imaginario não precisam de get pq sã da propria classe nem de () depois pois são variaveis e n metodos

   }

   public boolean eIqual(Complexo outroComplexo){
    return(outroComplexo.real==this.real && outroComplexo.imaginaria==this.imaginaria);//retorna 1 se verdadeiro

   }

   public Complexo soma(Complexo outroComplexo){
    Complexo novo= new Complexo();

    novo.real = this.real + outroComplexo.real;
    novo.imaginaria = this.imaginaria + outroComplexo.imaginaria;

    novo.inicializaNumero(novo.real, novo.imaginaria);
    return novo;

   }

   public Complexo subtrai(Complexo outroComplexo){
    Complexo novo= new Complexo(); 

    novo.real = this.real - outroComplexo.real;
    novo.imaginaria = this.imaginaria - outroComplexo.imaginaria;

    novo.inicializaNumero(novo.real, novo.imaginaria);
    return novo;

   }

   public Complexo multiplica(Complexo outroComplexo){
    Complexo novo= new Complexo(); 

    novo.real= (this.real * outroComplexo.real - imaginaria * outroComplexo.imaginaria);
    novo.imaginaria= (this.real * outroComplexo.imaginaria + imaginaria * outroComplexo.real);

    novo.inicializaNumero(novo.real, novo.imaginaria);
    return novo;

   }

   public Complexo divide(Complexo outroComplexo){
    Complexo novo= new Complexo(); 

    novo.real = (this.real*outroComplexo.real + this.imaginaria*outroComplexo.imaginaria) / (Math.pow(outroComplexo.real, 2)+Math.pow(outroComplexo.imaginaria,2));

    novo.imaginaria =(this.imaginaria*outroComplexo.real - this.real*outroComplexo.imaginaria) / (Math.pow(outroComplexo.real, 2)+Math.pow(outroComplexo.imaginaria,2));

    novo.inicializaNumero(novo.real, novo.imaginaria);
    return novo;

   }
    
}
