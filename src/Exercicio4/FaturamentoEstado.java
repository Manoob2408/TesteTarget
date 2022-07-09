package Exercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FaturamentoEstado {

    private static Scanner in;

    public static void main(String[] args) {

        Double valorTotal = 0.0d;
        Double percentual = 0.0d;
        String estado;
        int i = 0;

        in = new Scanner(System.in);

        List<String> estados = new ArrayList<>();
        estados.add("SP");
        estados.add("RJ");
        estados.add("MG");
        estados.add("ES");
        estados.add("Outros");

        List<Double> faturamento = new ArrayList<>();
        faturamento.add(67836.43);
        faturamento.add(36678.66);
        faturamento.add(29229.88);
        faturamento.add(27165.48);
        faturamento.add(19849.53);

        //Se desejar inserir os estados e valores, descomentar o seguinte código:

        /*String continuar;
        do {
            System.out.println("Insira a sigla do Estado: ");
            estados.add(in.next());
            System.out.println("Insira o valor de faturamento: ");
            faturamento.add(in.nextDouble();
            System.out.println("Deseja continuar [S] [N]");
            continuar = in.next();
        }while(continuar == "S")*/

        for (Double valor: faturamento) {
            valorTotal += valor;
        }

        for (Double valor: faturamento) {

            percentual = (valor/valorTotal)*100;

            estado = estados.get(i);
            System.out.println("O percentual de participação de " + estado + " foi de: " + String.format("%.0f", percentual) + "%");

            i++;
        }


    }


}
