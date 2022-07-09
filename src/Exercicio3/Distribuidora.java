package Exercicio3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class Distribuidora {

    public static void main(String[] args) throws Exception{

        JSONParser parser = new JSONParser();
        Double menorValor = 0.0d;
        Double maiorValor = 0.0d;
        Double todoValor = 0.0d;
        Double media = 0.0d;
        int i = 0, j = 0;
        Long menorDia = 0l, maiorDia = 0l;

        JSONArray a = (JSONArray) parser.parse(new FileReader("dados.json"));

        for (Object o : a)
        {
            JSONObject person = (JSONObject) o;

            Long dia = (Long) person.get("dia");
            System.out.println(dia);

            Double valor = (Double) person.get("valor");
            System.out.println(valor);

            if(i == 0 || valor < menorValor)
            {
                menorValor = valor;
                menorDia = dia;
            }

            if( i==0 || valor > maiorValor)
            {
                maiorValor = valor;
                maiorDia = dia;
            }
            todoValor += valor;
            i++;

        }

        media = todoValor/i;

        for (Object o : a)
        {
            JSONObject person = (JSONObject) o;

            Long dia = (Long) person.get("dia");
            System.out.println(dia);

            Double valor = (Double) person.get("valor");
            System.out.println(valor);

            if(valor > media)
            {
                j++;
            }

        }

        System.out.println("O maior valor foi de: " + maiorValor + " no dia " + maiorDia);
        System.out.println("O menor valor foi de: " + menorValor + " no dia " + menorDia);
        System.out.println("A media de faturamento foi de: " + media + "\nA quantidade de dias acima da" +
                " média foi de: " + j);

    }

}
