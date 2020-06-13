package com.estudosjavaavancado.JavaAvancado.Recursividade;

public class tailCall {

    public static void main(String[] args) {
        System.out.println(fatorialAux(5));
    }

    public static int fatorialAux(int valor){
        return fatorialTailCall(valor, 1);
    }

    public static int fatorialTailCall(int valor, int aux){
        if (valor == 0) return aux;
        return fatorialTailCall(valor - 1, valor * aux);
    }

}
