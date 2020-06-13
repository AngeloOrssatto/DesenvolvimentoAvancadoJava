package com.estudosjavaavancado.JavaAvancado.Conceitos;

public class funcaoAltaOrdem {

    public static void main(String[] args) {

        //funçao lambda
        Calculo SOMA = (a, b) -> a + b;
        Calculo SUBTRACAO = (a, b) -> a - b;
        Calculo MULTIPLICACAO = (a, b) -> a * b;
        Calculo DIVISAO = (a, b) -> a / b;


        System.out.println(executarOperacao(SOMA, 1, 3));
        System.out.println(executarOperacao(SUBTRACAO, 4, 3));
        System.out.println(executarOperacao(MULTIPLICACAO, 5, 3));
        System.out.println(executarOperacao(DIVISAO, 9, 3));
    }

    //funcao de alta ordem
    public static int executarOperacao(Calculo calculo, int a, int b){
        return calculo.calcular(a, b);
    }
}

//interface abstrata para a funçao lambda
@FunctionalInterface
interface Calculo{
    public int calcular(int a, int b);
}