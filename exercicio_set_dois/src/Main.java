import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.print("Digite a quantidade de Alunos do Curso A: ");
        int quantityA= sc.nextInt();

        for(int i=0; i<quantityA;i++){
            System.out.print("Digite o numero da matricula: " );
            int matricula = sc.nextInt();
            a.add(matricula);
        }

        System.out.print("Digite a quantidade de Alunos do Curso B: ");
        int quantityB=sc.nextInt();
        for (int i=0; i<quantityB; i++){
            System.out.print("Digite o numero da matricula: ");
            int matricula = sc.nextInt();
            b.add(matricula);
        }

        System.out.print("Digite a quantiadde de Alunos do Curso C: ");
        int quantityC=sc.nextInt();

        for(int i=0; i<quantityC; i++){
            System.out.print("Digite o numero da matricula: ");
            int matricula=sc.nextInt();
            c.add(matricula);
        }

        Set<Integer> totalAlunos = new HashSet<>();
        totalAlunos.addAll(a);
        totalAlunos.addAll(b);
        totalAlunos.addAll(c);

        System.out.println("O total de alunos matriculados é: "+totalAlunos.size());

        sc.close();

    }
}