package L9ClasseAbstrataPessoa;

public class Principal {

    public static void main(String[] args) {
        int i=0;
        Pessoa[] p= new Pessoa[10];
        p[0]=new Aluno("Macri", 19, 2456591, "Computação");
        p[1] = new Professor("Jefinho", 30, 7500.00, 237890);
        p[2] = new Professor("João", 35, 8000.00, 237891);
        p[3] = new Professor("Maria", 40, 8500.00, 237892);
        p[4] = new Professor("Pedro", 45, 9000.00, 237893);
        p[5] = new Professor("Lucas", 50, 9500.00, 237894);
        p[6] = new Aluno("Joana", 20, 2456592, "Engenharia Civil");
        p[7] = new Aluno("Mariana", 21, 2456593, "Engenharia Mecanica");
        p[8] = new Aluno("Julia", 22, 2456594, "Engenharia Elétrica");
        p[9] = new Aluno("Luciana", 23, 2456595, "Letras");
       
        while(i!=10){
             System.out.println(p[i].getNome() + ":\n"+ p[i].getInfos()+"\n");
            i++;
        }
     
    }
    
}
