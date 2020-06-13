package com.estudosjavaavancado.JavaAvancado.Recursividade;

import java.util.HashMap;
import java.util.Map;

public class memorization {
    static Map<Integer, Integer> MAPA_FATORIAL = new HashMap<>();
    public static void main(String[] args) {
        long I = System.nanoTime();
        System.out.println(fatorialMemorization(15));
        long F = System.nanoTime();
        System.out.println("1a vez: " + (F-I));

        I = System.nanoTime();
        System.out.println(fatorialMemorization(15));
        F = System.nanoTime();
        System.out.println("2a vez: " + (F-I));
    }

    public static Integer fatorialMemorization(Integer value){

        if (value == 2) {
            return value;
        } else {
            if (MAPA_FATORIAL.containsKey(value)){
                return MAPA_FATORIAL.get(value);
            } else {
                Integer resultado = value * fatorialMemorization(value - 1);
                MAPA_FATORIAL.put(value, resultado);
                return resultado;
            }
        }
    }

}
