package es.usj.libcalculos;

import java.util.ArrayList;
import java.util.List;

public class Calculos {

    public static String Sumar(int [] valores){
        int resultado =0;
        for (int valor: valores
                ) {
            resultado += valor;
        }
        return String.valueOf(resultado);
    }

    public static String Sumar(String [] valores){
        int resultado =0;
        for (String valor: valores
                ) {

            resultado += StringToInt(valor);
        }
        return String.valueOf(resultado);
    }

    public static String Restar(int [] valores){
        int resultado =valores[0];
        boolean primerValor = true;
        for (int valor: valores
                ) {
            if(!primerValor)
                resultado -= valor;
            else
                primerValor= false;
        }
        return String.valueOf(resultado);
    }

    public static String Restar(String [] valores){
        int resultado =StringToInt(valores[0]);

        boolean primerValor = true;
        for (String valor: valores
                ) {

            if(!primerValor)
                resultado -= StringToInt(valor);
            else
                primerValor= false;

        }
        return String.valueOf(resultado);
    }

    private List<Integer> StringArrayToIntList(String[] valores){
        List<Integer> intList = new ArrayList<Integer>();
        for (String valor: valores
             ) {
            intList.add(StringToInt(valor));
        }
        return intList;
    }

    private static int StringToInt(String valor){

        return valor.matches("\\d+(?:\\.\\d+)?") ? Integer.parseInt(valor): 0;
    }
}
