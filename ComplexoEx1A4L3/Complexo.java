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

   public boolean equal(Complexo outroComplexo){
    return(outroComplexo.real==this.real && outroComplexo.imaginaria==this.imaginaria);//retorna 1 se verdadeiro

   }

   public void soma(Complexo outroComplexo){
    this.real = real + outroComplexo.real;
    this.imaginaria = imaginaria + outroComplexo.imaginaria;

   }

   public void subtrai(Complexo outroComplexo){
    this.real = real - outroComplexo.real;
    this.imaginaria = imaginaria - outroComplexo.imaginaria;

   }

   public void multiplica(Complexo outroComplexo){
    this.real= ( real * outroComplexo.real - imaginaria * outroComplexo.imaginaria);
    this.imaginaria= ( real * outroComplexo.imaginaria + imaginaria * outroComplexo.real);

   }

   public void divide(Complexo outroComplexo){

    this.real = (real*outroComplexo.real + imaginaria*outroComplexo.imaginaria) / (Math.pow(outroComplexo.real, 2)+Math.pow(outroComplexo.imaginaria,2));

    this.imaginaria =(imaginaria*outroComplexo.real - real*outroComplexo.imaginaria) / (Math.pow(outroComplexo.real, 2)+Math.pow(outroComplexo.imaginaria,2));

   }
    
}
