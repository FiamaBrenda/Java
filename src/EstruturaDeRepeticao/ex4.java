package EstruturaDeRepeticao;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String usuario, senha;
        System.out.println("Digite o seu usuario");
        usuario = leitor.nextLine();
        System.out.println("Digite a sua senha");
        senha = leitor.nextLine();

        if (usuario.equals("admin") && senha.equals("senha123")){

            System.out.println("Login bem-sucedido!");

        }else{

            System.out.println("Nome de usuario ou senha incorretos");

        }
    }
}
