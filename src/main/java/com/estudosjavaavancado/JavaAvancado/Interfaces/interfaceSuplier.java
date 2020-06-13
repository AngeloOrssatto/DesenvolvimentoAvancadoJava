package com.estudosjavaavancado.JavaAvancado.Interfaces;

import java.util.function.Supplier;

public class interfaceSuplier {

    public static void main(String[] args) {

        Supplier<Pessoa> instanciaPessoa = () -> new Pessoa();

        System.out.println(instanciaPessoa.get());
    }
}

class Pessoa{

    private String nome;
    private Integer idade;

    public Pessoa(){
        nome = "Angelo";
        idade = 20;
    }

    @Override
    public String toString(){
        return String.format("nome: %s\nIdade: %d", nome, idade);
    }

}
