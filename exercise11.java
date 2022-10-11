package college.exercicios.condicionais;

import java.util.Scanner;

public class exercise11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int opcao = 0;

        do {
            System.out.println("=======================");
            System.out.println("        TABUADA");
            System.out.println("=======================");

            System.out.println("Digite 1 para continuar ou 0 para sair: ");
            opcao = scan.nextInt();
            if (opcao == 0){
                break;
            }

            System.out.println("Digite o número que deseja saber a tabuada:");
            int numTabuada = scan.nextInt();



            int resultadoMultiplicacao = 0;
            for (int i = 1; i <=10; i++){
                resultadoMultiplicacao = numTabuada * i;

                System.out.println(numTabuada + "X"+i+"= " + resultadoMultiplicacao);
            }

            System.out.println("=======================");
            System.out.println("        TABUADA");
            System.out.println("        INVERTIDA!!!");
            System.out.println("=======================");

            for (int j = 10; j >=1; j--) {
                int resultadoMultiplicacaoinvetida = 0;
                resultadoMultiplicacaoinvetida = numTabuada * j;
                System.out.println(numTabuada + "X"+j+"= " + resultadoMultiplicacaoinvetida);

            }

        }while (opcao != 0);
    }
}
