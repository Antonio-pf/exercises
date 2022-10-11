package college.exercicios.condicionais;

import java.util.Scanner;

public class exercise19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String opcao = "sim";

        do {
            System.out.println("=======================");
            System.out.println("        TABUADA");
            System.out.println("=======================");

            System.out.println("Digite Sim para iniciar ou Não para sair: ");
            opcao = scan.next();
            if (opcao.equalsIgnoreCase("NAO")){
                break;
            }

            System.out.println("Digite o número que deseja saber a tabuada:");
            int numTabuada = scan.nextInt();


            int resultadoMultiplicacao = 0;
            for (int i = 1; i <=10; i++){
                resultadoMultiplicacao = numTabuada * i;

                System.out.println(numTabuada + "X"+i+"= " + resultadoMultiplicacao);
            }

        }while (opcao != "sim");
    }
}


