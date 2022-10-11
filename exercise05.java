package college.exercicios.condicionais;

import java.util.Scanner;

public class exercise05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a largura");
        double height = scanner.nextDouble();

        System.out.println("Digite a altura");
        double width = scanner.nextDouble();

        double calculation = height * width;

        if (width < 1.5){
            System.out.println("Essa cortina será barra/vinco");
            System.out.println("Cálculo: " + calculation);
        } else if (width > 1.5 && width < 2.8) {
            System.out.println("Essa cortina será lateral");
            System.out.println("Cálculo: " + calculation);
        }else {
            System.out.println("Essa cortina será barra");
            System.out.println("Cálculo: " + calculation);
        }
    }
}
