import java.util.Locale;
import java.util.Scanner;
public class ChamadaScanner {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite sua Altura: ");
        double Altura=sc.nextDouble();

        System.out.print("Informe o Seu Nome: ");
        String nome=sc.next();

        System.out.print("Informe O Seu Sobrenome: ");
        String Sobrenome=sc.next();

        System.out.print("Informe A Sua Idade: ");
        int idade=sc.nextInt();

        System.out.println("Nome Informado"+" "+nome);
        System.out.println("Nome Sobrenome"+" "+Sobrenome);
        System.out.println("Nome Altura"+" "+Altura);
        System.out.println("Nome Idade"+" "+idade);


        
    }
}
