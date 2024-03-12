import java.util.Scanner;
public class BoletimEstudantil {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Informe sua Primeira Nota ");
        double nota1=sc.nextDouble();
        System.out.print("Informe sua Segunda Nota  ");
        double nota2=sc.nextDouble();
        double media=(nota1+nota2)/2;
        
        if(media <4){
            System.out.println("Aluno Reprovado ");
            System.out.println(media);
        }
        else if(media >4 && media <=6){
            System.out.println("Aluno em Recuperação");
            System.out.println(media);
        }
        else{
            System.out.println("Aluno Aprovado");
            System.out.println(media);
        }

        
        

    }
    
}
