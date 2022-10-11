package college.exercicios.condicionais;

import java.util.Scanner;

public class exercise07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = scan.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = scan.nextDouble();

        double media = (num1 + num2) / 2;
        int pares = 0;
        int impares = 0;

        if (num1 % 2 == 0) {
            pares++;
        }else {
            impares ++;

        }if (num2 % 2 == 0) {
            pares ++;
        }else {
            impares ++;
        }

        System.out.println(impares);
        System.out.println(pares);
        System.out.println(media);

    }
}
