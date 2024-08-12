package program;

import entities.Product;
import services.ProcessFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
* Fazer um programa para ler o caminho de um arquivo .csv
contendo os dados de itens vendidos. Cada item possui um
nome, preço unitário e quantidade, separados por vírgula. Você
deve gerar um novo arquivo chamado "summary.csv", localizado
em uma subpasta chamada "output" a partir da pasta original do
arquivo de origem, contendo apenas o nome e o valor total para
aquele item (preço unitário multiplicado pela quantidade),
conforme exemplo.
* */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o caminho do arquivo: ");
        String path = sc.nextLine();

        List products = ProcessFile.readFile(path);

        List forNewFile = new ArrayList<>();

        for(Object  x  : products){
            String name = ((Product) x).getName();
            Double totalAmount = ((Product) x).totalAmount();
            forNewFile.add(name+","+totalAmount);
        }

        ProcessFile.saveFile(forNewFile, path);
    }
}