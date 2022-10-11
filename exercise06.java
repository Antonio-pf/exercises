package college.exercicios.condicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercise06 {

    public static double alturaDoTriangulo(double lado, double base) {

        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        double altura = Math.sqrt(Math.pow(lado, 2) - (Math.pow(base,2) / 4));
        decimalFormat.format(altura);

        return altura;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro lado do triângulo:");
        double lado1 = scan.nextDouble();

        System.out.println("Digite o segundo lado do triângulo:");
        double lado2 = scan.nextDouble();
        System.out.println("Digite o terceiro lado do triângulo:");
        double lado3 = scan.nextDouble();

        if (lado3 == lado1 && lado3 == lado2 && lado2 == lado1) {
            double perimetro = lado1 + lado2 + lado3;
            System.out.println("Valor do perímetro: " + perimetro);

        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            if (lado1 == lado2) {
                double area = (lado2 * alturaDoTriangulo(lado1, lado3)) / 2;
                System.out.println("Aréa do triangulo: " + area);
            }if (lado1 == lado3) {
                double area = (lado3 * alturaDoTriangulo(lado1, lado2)) / 2;
                System.out.println("Aréa do triangulo: " + area);
            }if (lado3 == lado2) {
                double area = (lado1 * alturaDoTriangulo(lado3, lado1)) / 2;
                System.out.println("Aréa do triangulo: " + area);
            }

        }else {
            System.out.println("Não é um triângulo");
        }
    }
}
