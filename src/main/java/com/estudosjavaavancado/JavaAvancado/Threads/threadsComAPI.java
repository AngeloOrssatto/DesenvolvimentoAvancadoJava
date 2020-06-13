package com.estudosjavaavancado.JavaAvancado.Threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

//Casa com afazeres
public class threadsComAPI {

    private static final ExecutorService pessoasParaExceutar = Executors.newFixedThreadPool(3);
    //estabiliza 3 treads para a pool

    public static void main(String[] args) {
        casa casa = new casa(new quarto());


        casa.obterAfazeresCasa().stream().map(atividades -> pessoasParaExceutar.submit(atividades::realizar))
                .collect(Collectors.toList());
        pessoasParaExceutar.shutdown(); //encerra a pool

    }
}


interface atividades {
    void realizar();
}

abstract class Comodo {
    abstract List<atividades> obterAfazeresComodo();
}

class casa {
    private List<Comodo> comodos;

    casa(Comodo... comodos){
        this.comodos = Arrays.asList(comodos);
    }

    List<atividades> obterAfazeresCasa() {
        return this.comodos.stream().map(Comodo::obterAfazeresComodo)
                .reduce(new ArrayList<atividades>(), (pivo, atividades) -> {
                    pivo.addAll(atividades);
                    return pivo;
                });
    }
}

class quarto extends Comodo {
    @Override
    List<atividades> obterAfazeresComodo() {
        return Arrays.asList(
                this::arrumarCama,
                this::varrerQuarto,
                this::arrumarGuardaRoupa
        );
    }

    private void arrumarCama() {
        System.out.println("Arrumando a cama");
    }

    private void varrerQuarto(){
        System.out.println("Varrendo o quarto");
    }

    private void arrumarGuardaRoupa(){
        System.out.println("Arrumando o guarda roupa");
    }
}