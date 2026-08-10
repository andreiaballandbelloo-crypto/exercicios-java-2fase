/*
Implemente um programa que leia um número inteiro do usuário e exiba a tabuada desse número (de 1 a 10) utilizando um laço for. 
Valide a entrada com try/catch e utilize operadores de multiplicação.
*/

import java.util.Scanner;

public class ExercicioTres {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" === TABUADA ===");
        System.out.println("Informe o número que deseja: ");
        int numero = scanner.nextInt();

        for (int i = 0; i < 11; i++) {
           System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }

}