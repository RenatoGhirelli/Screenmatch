package br.com.alura.screenmatch.calculadora;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel) {

        String varel1 = "teste";

        if (classificavel.getClassificao() >= 4) {
            System.out.println("Está entre os preferidos do momento");
        } else if (classificavel.getClassificao() >= 2) {
            System.out.println("Muito bem avaliado no momento!");
        } else {
            System.out.println("Coloque na sua lista para assisitr depois");
        }
    }
}
