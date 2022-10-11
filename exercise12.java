package college.exercicios.condicionais;

import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int canditato1 =0 , candidato2 = 0, candidato3 = 0, candidato4 = 0, votoNulo = 0, votoBranco = 0, opcao =0;

        do {

            System.out.println("=======================");
            System.out.println("      CANDIDATOS       ");
            System.out.println("=======================");
            System.out.println("1-Soaraia");
            System.out.println("2-Boi");
            System.out.println("3-Juquinha da quitanda");
            System.out.println("4-Pedra");
            System.out.println("=======================");
            System.out.println("      SEM CANDIDATOS       ");
            System.out.println("=======================");
            System.out.println("5-Voto nulo");
            System.out.println("6-Voto em branco");
            System.out.println("=======================");
            System.out.println("7-Total de votos");
            System.out.println("0-Para sair");
            opcao = scan.nextInt();

            switch (opcao){
                case 1:
                    canditato1++;
                    break;
                case 2:
                    candidato2++;
                    break;
                case 3:
                    candidato3++;
                    break;
                case 4:
                    candidato4++;
                    break;
                case 5:
                    votoNulo++;
                    break;
                case 6:
                    votoBranco++;
                    break;
                case 7:
                    System.out.println("       QUANTIDADE DE VOTOS       ");
                    System.out.println("Soraia: " + canditato1);
                    System.out.println("Boi: " + candidato2);
                    System.out.println("Juquinha da quitanda: " + candidato3);
                    System.out.println("Pedra: " + candidato4);
                    System.out.println("Votos nulos: " + votoNulo);
                    System.out.println("Votos em branco: " + votoBranco);
                    System.out.println("");
                    break;
                default:
            }
        }while (opcao !=0);



    }
}
