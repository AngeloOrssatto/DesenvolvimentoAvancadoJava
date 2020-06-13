package com.estudosjavaavancado.JavaAvancado.Interfaces;

import java.util.function.Predicate;

public class interfacePredicate {

    public static void main(String[] args) {
        Predicate<String> estaVazio = texto -> texto.isEmpty();
        //Predicate<String> estaVazio = String::isEmpty;

        System.out.println(estaVazio.test("")); //true
        System.out.println(estaVazio.test("Angelo")); //false
    }
}
