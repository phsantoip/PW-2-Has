import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //nome de metodos e variaves sempre começa com letra minuscula
        // cemelCase
        System.out.println("Digite o primeiro número:");
        int n1 = leitor.nextInt();
        System.out.println("Digite o segundo número:");
        int n2 = leitor.nextInt();
        int soma = n1 + n2;
        System.out.println("Resultado do calculo é: " + soma);

    }
}