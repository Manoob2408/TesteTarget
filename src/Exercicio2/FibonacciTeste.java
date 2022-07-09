package Exercicio2;

import java.util.*;

public class FibonacciTeste {
    private static Scanner in;

    public static void main(String args[]) {

        int i = 0, j = 0;
        in = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numero = in.nextInt();
        in.close();

        for(i=0; i< numero; i++){

            if(numero == Fibonacci.fibonacci(i))
            {
                System.out.println("O numero faz parte da sequência de Fibonacci!");
                j = 1;
                break;
            }
        }

        if(j == 0)
        {
            System.out.println("O numero faz parte da sequência de Fibonacci!");
        }

    }
}
