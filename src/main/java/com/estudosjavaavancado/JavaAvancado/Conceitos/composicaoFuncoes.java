package com.estudosjavaavancado.JavaAvancado.Conceitos;

import java.util.Arrays;

public class composicaoFuncoes {

    public static void main(String[] args) {

        int[] valores = {1,2,3,4};

        //funcional
        Arrays.stream(valores)
                .filter(numero -> numero % 2 == 0) //filtrar os numeros que tiverem resto de 2 = 0
                .map(numero -> numero * 2) // transformar esses numeros multiplicando por 2
                .forEach(numero -> System.out.println(numero)); // printar na tela os numeros


        //imperativa
        for (int i = 0; i < valores.length; i++){
            int temp = 0;
            if (valores[i] % 2 == 0){
                temp = valores[i] * 2;
                if (temp != 0){
                    System.out.println(temp);
                }
            }
        }

    }
}
