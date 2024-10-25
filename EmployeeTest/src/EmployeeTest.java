import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("Digite a quantidade de funcionarios: ");
        int quantidade = sc.nextInt();
        sc.nextLine();

        for(int i=1; i<=quantidade; i++){
            System.out.printf("Digite o nome do %d funcionario: ", i);
            String nome = sc.nextLine();

            System.out.printf("Digite o sobrenome do %d funcionario: ", i);
            String sobrenome = sc.nextLine();

            System.out.printf("Digite salario do %d funcionario: ", i);
            double salario = sc.nextDouble();
            sc.nextLine();

            employees.add(new Employee(nome, sobrenome, salario));
        }

        for(Employee funcionario : employees){
            double salarioAtual=funcionario.getSalarioMensal();


            funcionario.setSalarioMensal(funcionario.getSalarioMensal()+funcionario.getSalarioMensal()*0.1);

            System.out.println(funcionario.toString());
        }
    }
}