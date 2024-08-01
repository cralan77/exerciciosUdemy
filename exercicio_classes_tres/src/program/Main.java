/*
Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
resolver este problema
 */

package program;
import java.util.Scanner;
import entities.Student;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student st = new Student();

        System.out.println("Digite o nome do aluno: ");
        st.setName(sc.nextLine());

        System.out.println("Digite a primeira nota: ");
        st.setNoteOne(sc.nextDouble());

        System.out.println("Digite a segunda nota: ");
        st.setNoteTwo(sc.nextDouble());

        System.out.println("Digite a terceira nota: ");
        st.setNoteTree(sc.nextDouble());

        st.calc();

        sc.close();
    }
}