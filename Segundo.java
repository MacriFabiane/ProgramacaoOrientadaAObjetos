import java.util.Scanner;
public class Segundo {
    public static void main (String[] args){
        Scanner teclado= new Scanner(System.in);

        int i = teclado.nextInt(); //lendo inteiro
        double r= teclado.nextDouble(); //lendo real
        String s= teclado.nextLine();//lendo cadeia de caracteres
        s= teclado.nextLine(); //ou coloca 2 next line ou só o next acima(p uma palavra só)
        System.out.println ( "inteiro:" + i + ", real:" + r );
        System.out.println ( "Frase : " + s );
    }
    
}
