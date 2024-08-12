package program;

import entities.Contract;
import services.ContractService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Digite os dados do contrato:");
        System.out.print("Numero: ");
        int numberContract = sc.nextInt();
        sc.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        Date date = sdf.parse(sc.nextLine());
        System.out.print("Valor do contrato: ");
        Double totalAmount = sc.nextDouble();
        System.out.print("Numero de parcelas: ");
        int installments = sc.nextInt();

        Contract contract = new Contract(numberContract, date, totalAmount );

        ContractService processing = new ContractService();
        processing.processContract(contract, installments);

        System.out.print(contract);

        sc.close();
    }
}