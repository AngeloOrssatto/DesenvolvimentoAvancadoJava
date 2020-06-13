package com.estudosjavaavancado.JavaAvancado.Interfaces;

import java.util.function.Function;

public class interfaceFunctions {

    public static void main(String[] args) {

        Function<String, String> retornaStringContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String, Integer> retornaTamanhoString = texto -> texto.length();

        System.out.println(retornaStringContrario.apply("Angelo")); //loegnA
        System.out.println(retornaTamanhoString.apply("Angelo"));//6
    }

}
