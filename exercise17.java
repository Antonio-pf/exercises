package college.exercicios.condicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercise17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#,##");
        double pesoIdeal = 0;

        System.out.println("Digite o seu sexo: ");
        System.out.println("1-Feminino");
        System.out.println("2-Masculino");
        String sexo = scan.next();
        int convertSexo = Integer.parseInt(sexo);

        System.out.println("Digite a sua altura: ");
        double altura = scan.nextDouble();

        if (convertSexo == 2) {
            pesoIdeal = (72.7 * altura) - 58;
        }else {
            pesoIdeal = (62.1 * altura) - 44.7;
        }
        System.out.println("Seu peso ideal é de: " + decimalFormat.format(pesoIdeal));
    }
}
