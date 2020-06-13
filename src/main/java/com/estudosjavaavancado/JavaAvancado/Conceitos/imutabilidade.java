package com.estudosjavaavancado.JavaAvancado.Conceitos;

import java.util.function.UnaryOperator;

public class imutabilidade {

    public static void main(String[] args) {

        int valor = 20;
        UnaryOperator<Integer> retronarDobro = v -> v * 2;

        System.out.println("valor original: " + valor);
        System.out.println("valor da operacao: " + retronarDobro.apply(valor));

    }

}
