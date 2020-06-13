package com.estudosjavaavancado.JavaAvancado.Interfaces;

import java.util.function.Consumer;

public class interfaceConsumer {

    public static void main(String[] args) {

        Consumer<String> imprimirFraseSimp = System.out::println; //metodo de referencia - escondendo o parametro da funçao lambda
        Consumer<String> imprimirFraseLambda = frase -> System.out.println(frase);

        //metodo void accept
        imprimirFraseLambda.accept("Hello");
        imprimirFraseSimp.accept("World!");
    }
}
