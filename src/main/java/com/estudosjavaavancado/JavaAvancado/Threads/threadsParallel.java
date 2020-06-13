package com.estudosjavaavancado.JavaAvancado.Threads;

import java.util.stream.IntStream;

public class threadsParallel {

    public static void main(String[] args) {

        long inicio = System.currentTimeMillis();
        IntStream.range(1,100000).forEach(num -> fatorial(num));
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execucao serial :: " + (fim-inicio));

        inicio = System.currentTimeMillis();
        IntStream.range(1,100000).parallel().forEach(num -> fatorial(num));
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execucao paralelo :: " + (fim-inicio));

    }

    public static long fatorial(long num) {
        long fat = 1;

        for(long i = 2; i <= num; i++) {
            fat*=i;
        }
        return fat;
    }
}
