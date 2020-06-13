package com.estudosjavaavancado.JavaAvancado.Recursividade;

public class recursividade {

    public static void main(String[] args) {
        System.out.println(fatorial(5));
    }

    public static int fatorial(int value){
        if (value == 0) return 1;
        if (value == 2){
            return value;
        } else {
            return value * fatorial(value - 1);
        }
    }
}
