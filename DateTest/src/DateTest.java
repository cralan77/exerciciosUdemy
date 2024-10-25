import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o dia: ");
        int dia = sc.nextInt();

        System.out.print("Digite o mes: ");
        int mes = sc.nextInt();

        System.out.print("Digite o ano: ");
        int ano = sc.nextInt();

        Date date = new Date(mes, dia, ano);

        System.out.println(date.displayDate());
    }
}