package com.estudosjavaavancado.JavaAvancado.Conceitos;

import java.util.function.BiPredicate;

public class funcaoPura {

    public static void main(String[] args) {

        BiPredicate<Integer, Integer> verificaSeMaior = (parametro, valorComparacao) -> parametro > valorComparacao;

        System.out.println(verificaSeMaior.test(10,20)); //false
        System.out.println(verificaSeMaior.test(10,20)); //false
        System.out.println(verificaSeMaior.test(20,10)); //true

    }

}
