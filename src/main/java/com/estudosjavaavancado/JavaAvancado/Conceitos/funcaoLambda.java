package com.estudosjavaavancado.JavaAvancado.Conceitos;

public class funcaoLambda {

    public static void main(String[] args) {

        FuncaoGerar colocarPrefixoSr = valor -> "Sr. " + valor; //somente uma instrução na logica da lambda
        System.out.println(colocarPrefixoSr.gerar("Angelo"));


        FuncaoGerar colocarPrefixoExclamacao = valor -> {
            String valorPrefixo = "Sr. " + valor;
            String valorPosfixo = valorPrefixo + "!";
            return valorPosfixo;
        };//mais que uma instrução na logica da lambda, utilização de chaves
        System.out.println(colocarPrefixoExclamacao.gerar("Angelo"));
    }

    //interface funcional (pode ser em um arquivo separado)
    @FunctionalInterface
    interface FuncaoGerar {
        String gerar(String valor);
    }

}
