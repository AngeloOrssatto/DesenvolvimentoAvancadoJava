package com.estudosjavaavancado.JavaAvancado.Threads;


// ideia de criar uma barra de carregamento enquanto o PFD esta sendo gerado
public class threadsSemAPI {

    public static void main(String[] args) {

        geradorPDF inicarPDF = new geradorPDF();
        barraCarregamento iniciarBarraCarregamento = new barraCarregamento(inicarPDF);

        inicarPDF.start();
        iniciarBarraCarregamento.start();
    }
}

//começa a gerar o pdf -> sleep é para demonstrar a "demora" para gerar o pdf
class geradorPDF extends Thread {

    @Override
    public void run(){
        System.out.println("Gerando PDF");
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("PDF gerado!");
    }

}

//a barra de carregamento vai ser executada enquanto a thread do gerador de pdf está ativa
class barraCarregamento extends Thread {

    private Thread iniciaPDF;

    public barraCarregamento(Thread iniciaPDF){
        this.iniciaPDF = iniciaPDF;
    }

    @Override
    public void run(){

        while (true){
            try{
                Thread.sleep(500);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            if (!iniciaPDF.isAlive()){
                break;
            }
            System.out.println("Loading ... ");
        }
    }

}
