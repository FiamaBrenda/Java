package EstruturaDeRepeticao;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a sua idade");
        int idade;

        do{
            idade = leitor.nextInt();
            System.out.println("Idade invalida");
        }while (idade < 18);
        System.out.println("Maior que 18");

    }
}
