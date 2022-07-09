package Exercicio5;

import java.util.Scanner;

public class Inverter {

    private static Scanner in;

    public static void main(String[] args) {

        String palavra;
        String palavraInvertida = "";

        in = new Scanner(System.in);

        System.out.println("Digite uma palavra (string): ");
        palavra = in.next();


        for(int i=palavra.length() - 1; i >=0 ; i--)
        {
            palavraInvertida += palavra.charAt(i);

        }
        System.out.println(palavraInvertida);
    }


}
