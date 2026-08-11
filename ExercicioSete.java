/*
Desenvolva um programa que converta temperaturas entre Celsius e Fahrenheit. Ofereça um menu com switch para escolher a conversão desejada. 
Utilize Scanner para entrada, operadores aritméticos para cálculo e try/catch para tratamento de exceções.

*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExercicioSete {
    
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int escolha = 0;

        System.out.println("=== Conversão de temperaturas ===");

        try {
            System.out.println("Escolha a conversão que deseja fazer: ");
            System.out.println("(1) Celsius para Fahrenheit ");
            System.out.println("(2) Fahrenheit para Celsius");
            escolha = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida, informe um número.");
            scanner.nextLine();
        }
      
        switch (escolha) {

            case 1:
                System.out.println("Informe a temperatura em Celsius: ");
                double celsius = scanner.nextDouble();

                System.out.println("Resultado: " + ((celsius * 9 / 5) + 32));

                break;

            case 2:
                System.out.println("Informe a temperatura em Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();

                System.out.println("Resultado: " + (fahrenheit - 32) * 5 / 9);

                break;

            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
