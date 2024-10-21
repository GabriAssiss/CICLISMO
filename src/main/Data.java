package main;
import java.util.HashMap;
import java.util.Map;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano){
        if(validarData(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
        else{
            throw new IllegalArgumentException("Número de dia, mes ou ano inválido!");
        }
    }

    private boolean validarData(int dia, int mes, int ano){
        Map<Integer, Integer> mapaMeses = new HashMap<Integer, Integer>();
        mapaMeses.put(1, 31);
        if(ano % 4 != 0 && ano % 100 == 0 || ano % 400 == 0){
            mapaMeses.put(2, 28);
        }
        else {
            mapaMeses.put(2, 29);
        }
        mapaMeses.put(3, 31);
        mapaMeses.put(4, 30);
        mapaMeses.put(5, 31);
        mapaMeses.put(6, 30);
        mapaMeses.put(7, 31);
        mapaMeses.put(8, 31);
        mapaMeses.put(9, 30);
        mapaMeses.put(10, 31);
        mapaMeses.put(11, 30);
        mapaMeses.put(12, 31);
        if(mes < 1 || mes > 12 || ano < 1 || dia > mapaMeses.get(mes) || dia < 0) return false;
        else return true;
    }
}
