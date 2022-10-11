package college.exercicios.condicionais;

import java.util.Scanner;

public class exercise08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.println("Segundo número");
        double num2 = scanner.nextDouble();
        System.out.println("Terceiro número");
        double num3 = scanner.nextDouble();

        if (num1 > num2 && num1 > num3) {
            System.out.println("Maior: " + num1);
        }else if (num2 > num1 && num2 > num3) {
            System.out.println("Maior: " + num2);
        }else{
            System.out.println("Maior: " + num3);

        }
    }
}
