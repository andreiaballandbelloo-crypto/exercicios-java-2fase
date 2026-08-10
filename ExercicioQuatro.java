/*
Desenvolva um programa que leia números inteiros do usuário em um laço while até que ele digite 0 (zero). 
Ao final, exiba a soma de todos os números digitados. Utilize try/catch para tratar entradas inválidas.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExercicioQuatro {
    
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int numero = 0;

        System.out.println("Digite um número inteiro: ");

        do {

            try {
                numero = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida, informe um número.");
            }

            soma += numero;
            
        } while(numero != 0);
        
        System.out.println("Soma : " + soma);

    }
}


