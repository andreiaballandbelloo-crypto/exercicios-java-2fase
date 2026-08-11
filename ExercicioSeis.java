/*
Implemente um programa que utilize um laço do/while para ler números do usuário e verificar se são pares ou ímpares. 
O programa deve continuar até que o usuário digite -1. Utilize o operador módulo (%) e try/catch para validação.
*/ //teste

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExercicioSeis {
    
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = 0;

        System.out.println(" === Verifica Par ou ímpar === ");

        do {
            System.out.println("Informe um número");

                try {
                    numero = scanner.nextInt();

                    if (numero == -1 ) {
                        System.out.println("Programa encerrado.");
                    } else if (numero % 2 == 0) {
                        System.out.println("O número é par.");
                    } else {
                        System.out.println("O número é ímpar.");
                }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida, informe um número.");
                    scanner.nextLine();
                    continue;
                }

        } while (numero != -1);

        scanner.close();

    }
}
