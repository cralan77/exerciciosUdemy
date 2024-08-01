/*
* Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int horaInicial, horaFinal, resultado;

        System.out.println("Digite o primeiro horário: ");
        horaInicial=sc.nextInt();

        System.out.println("Digite o segundo horário: ");
        horaFinal= sc.nextInt();

        if(horaInicial < 25 && horaFinal <25){
            if(horaFinal==horaInicial){
                resultado=24;
            }else{
                if(horaFinal<horaInicial){
                    resultado = 24-horaInicial+horaFinal;
                }else{
                    resultado=horaFinal-horaInicial;
                }
            }
            System.out.printf("O jogo durou %d hora(s)", resultado);
        }else{
            System.out.println("Horário informado inválido.");
        }


        sc.close();
    }
}