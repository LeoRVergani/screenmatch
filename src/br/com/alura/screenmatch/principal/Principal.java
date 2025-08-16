package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        Filme favorito = new Filme("The Matrix", 1999);
        //favorito.setAnoDeLancamento(1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);
        favorito.setAnoDeLancamento(2023);

        favorito.exibeFichaTecnica();
        favorito.avalia(9);
        favorito.avalia(8);
        favorito.avalia(9);

        System.out.println("Média de avaliações do filme: " +favorito.pegaMedia());

        Serie lost = new Serie("Seinfeld", 1996);
        //lost.setNome("Seinfeld");
        //lost.setAnoDeLancamento(1996);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodioPorTemporada(10);
        lost.setMinutosPorEpisodio(50);

        System.out.println(lost.getNome());
        System.out.println(lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2000);
        //outroFilme.setAnoDeLancamento(2000);
        outroFilme.setDuracaoEmMinutos(250);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(favorito);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filra(favorito);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filra(episodio);

        var filmeDoPaulo = new Filme("Dogville", 2003);
        //filmeDoPaulo.setNome("Dogville");
        //filmeDoPaulo.setAnoDeLancamento(2003);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listDeFilmes = new ArrayList<>();
        listDeFilmes.add(filmeDoPaulo);
        listDeFilmes.add(outroFilme);
        listDeFilmes.add(favorito);
        System.out.println("Tamanho da lista é de " + listDeFilmes.size());
        System.out.println("Primeiro filme é " + listDeFilmes.get(0).getNome());
        System.out.println(listDeFilmes);




    }

}