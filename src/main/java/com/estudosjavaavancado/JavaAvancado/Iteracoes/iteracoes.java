package com.estudosjavaavancado.JavaAvancado.Iteracoes;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class iteracoes {

    public static void main(String[] args) {

        String[] nomes = {"Joao", "Paulo", "Angelo", "Maria"};
        Integer[] numeros = {1, 2, 3, 4, 5};
        imprimirNomesFiltrados(nomes);
        imprimirTodosNomes(nomes);
        imprimirDobro(numeros);
    }

    public static void imprimirNomesFiltrados(String... nomes){

        String nomesParaImprimir = Stream.of(nomes)
                .filter(nome -> nome.equals("Angelo")) //utilizando predicate
                .collect(Collectors.joining()); //utilizando collectors

        System.out.println(nomesParaImprimir);
    }

    public static void imprimirTodosNomes(String... nomes){

        Stream.of(nomes)
                .forEach(nome -> System.out.println(nome));//utilizando consumer
    }

    public static void imprimirDobro(Integer... numeros){

        Stream.of(numeros)
                .map(numero -> numero * 2)
                .forEach(numero -> System.out.println(numero));
    }
}
