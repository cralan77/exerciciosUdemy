/*
Fazer um programa para ler os dados de uma reserva de hotel (número do quarto, data
de entrada e data de saída) e mostrar os dados da reserva, inclusive sua duração em
dias. Em seguida, ler novas datas de entrada e saída, atualizar a reserva, e mostrar
novamente a reserva com os dados atualizados. O programa não deve aceitar dados
inválidos para a reserva, conforme as seguintes regras:
- Alterações de reserva só podem ocorrer para datas futuras
- A data de saída deve ser maior que a data de entrada

* */
package program;
import model.entities.Reservation;
import model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Digite o numero do quarto: ");
            Integer room = sc.nextInt();

            sc.nextLine();

            System.out.print("Data do Check-in: ");
            Date checkin = sdf.parse(sc.nextLine());

            System.out.print("Data do Check-out: ");
            Date checkout = sdf.parse(sc.nextLine());



            Reservation reservation = new Reservation(room, checkin, checkout);
            System.out.print(reservation);



            System.out.println("Entre com os dados para atualizar a reserva:");

            System.out.print("Nova data de Check-In: ");
            checkin = sdf.parse(sc.nextLine());

            System.out.print("Nova data de Check-Out: ");
            checkout = sdf.parse(sc.nextLine());


            reservation.updateDates(checkin, checkout);
            System.out.println(reservation);
        }
        catch (ParseException e){
            System.out.println("Formato de data invalido");
        }
        catch (DomainException e){
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Erro inesperado");
        }
        sc.close();


    }
}