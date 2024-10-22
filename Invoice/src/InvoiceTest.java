import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de produtos: ");
        int quantidade = sc.nextInt();
        sc.nextLine();

        List<Invoice> lista = new ArrayList<>();

        for(int i=1; i<=quantidade; i++){
            System.out.printf("Digite o codigo do %dº item: ", i);
            String codigo = sc.nextLine();

            System.out.printf("Digite a descrição do produto: ");
            String descricao = sc.nextLine();

            System.out.printf("Digite a quantidade de itens: ");
            int quantidadeItens = sc.nextInt();

            System.out.printf("Digite o valor do produto: ");
            double preco = sc.nextDouble();
            sc.nextLine();
            System.out.println();
            lista.add(new Invoice(codigo, descricao, quantidadeItens, preco));

        }

        System.out.println("CODIGO | DESCRICAO | QUANTIDADE | PRECO | TOTAL");

        double valorTotal=0;

        for(Invoice item : lista){

            System.out.printf("%s | %s | %d | %.2f | %.2f %n",
                    item.getNumber(), item.getDescription(), item.getQuantity(), item.getPrice(), item.getInvoiceAmount());
            valorTotal += item.getInvoiceAmount();
        }

        System.out.printf("Total: %.2f", valorTotal);


    }
}