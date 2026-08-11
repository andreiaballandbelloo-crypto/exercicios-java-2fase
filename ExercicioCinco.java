/*
Crie um programa de menu que oferece as seguintes opções: (1) Calcular área de um quadrado, 
(2) Calcular área de um círculo, (3) Calcular perímetro de um retângulo, (4) Sair. 
Utilize switch para controlar o fluxo, Scanner para entrada e try/catch para tratamento de erros.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExercicioCinco {
    
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int escolha = 0;

        do {

            try {
                System.out.println(" === MENU ===");
                System.out.println("(1) Calcular área de um quadrado");
                System.out.println("(2) Calcular área de um círculo");
                System.out.println("(3) Calcular perímetro de um retângulo");
                System.out.println("(4) Sair");
                System.out.println("Escolha uma opção: ");
                escolha = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida, informe um número.");
                scanner.nextLine();
                continue;
            }

            switch (escolha) {

                case 1:
                    System.out.println("Informe o lado do quadrado: ");
                    double lado = scanner.nextDouble();

                    System.out.println("Área:" + (lado * lado));

                break;

                case 2:
                    System.out.println("Informe o valor do raio: ");
                    double raio = scanner.nextDouble();

                    double pi = 3.14;

                    System.out.println("Área: " + (pi * (raio * raio)));

                break;

                case 3:
                    System.out.println("Informe a largura: ");
                    double l = scanner.nextDouble();

                    System.out.println("Informe a altura: ");
                    double w = scanner.nextDouble();

                    System.out.println("Perímetro do retângulo: " + (2 * (l + w)));

                    break;

                case 4:
                    System.out.println("Saída.");
                    break;

            default:
                    System.out.println("Opção inválida.");

            }   
       
        } while(escolha != 4);


        scanner.close();
    }
}
