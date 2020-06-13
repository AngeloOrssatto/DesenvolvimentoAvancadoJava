package com.estudosjavaavancado.JavaAvancado.Paradigmas;

import java.util.function.UnaryOperator;

public class paradigmaFuncional {

    public static void main(String[] args) {

        System.out.println("Define um comportamento, mesmo sem utiliza-lo");

        UnaryOperator<Integer> calculaValorVezesTres = valor -> valor*3;
        int valor = 10;
        System.out.println("o valor eh: " + valor + "\no resultado eh: " + calculaValorVezesTres.apply(valor));

    }

}
