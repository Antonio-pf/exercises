package college.exercicios.condicionais;

import java.util.Scanner;

public class exercise20 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("=============");
        System.out.println("     Média");
        System.out.println("=============");

        System.out.print("Digite sua primeira nota: ");
        double nota1 = scan.nextDouble();

        System.out.print("Digite sua segunda nota: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >=6 ) {
            System.out.println("PARABÉNS! Você foi aprovado!");
        }else {
            System.out.println("Você foi reprovado!!!Estude mais...");
        }
    }
}
