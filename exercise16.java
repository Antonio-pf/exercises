package college.exercicios.condicionais;

import java.util.Scanner;

public class exercise16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas maças deseja comprar?");
        int qntdMacas = scan.nextInt();
        double valorAPagar = 0;

        if (qntdMacas < 12 && qntdMacas > 1) {
             valorAPagar = qntdMacas * 0.3;
        }else if (qntdMacas >= 12) {
            valorAPagar = qntdMacas * 0.25;
        } else if (qntdMacas == 1) {
            System.out.println("Error!!!!!!!!!!!!!");
        }
        System.out.println("Valor a pagar: $" + valorAPagar);
    }
}
