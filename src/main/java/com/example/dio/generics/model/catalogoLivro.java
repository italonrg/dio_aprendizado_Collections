package com.example.dio.generics.model;

import java.util.ArrayList;
import java.util.List;

public class catalogoLivro {
    //nessa classe será passada uma lista como atributo;

    private List<livro> livroList;




    public catalogoLivro() {
        this.livroList = new ArrayList<>();// nisso quando for instaciado um livro ja cria um lista vazia;

    }
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new livro(titulo , autor , anoPublicacao));
    }
    public List <livro> pesquisarPorAutor (String autor){

        List <livro> listaPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    listaPorAutor.add(l);

                }

            }
        }return listaPorAutor;

    }
    public List<livro> pequisaPorIntervaloDeAno(int anoInicial, int anoFinal){
        List<livro> livroPorIntervaloDeAno = new ArrayList<>();
        if (livroList.isEmpty()){
            for (livro l : livroPorIntervaloDeAno){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livroPorIntervaloDeAno.add(l);
                }
            }
        }
        return livroPorIntervaloDeAno;
    }
    public String mostralista(){
        return livroList.toString();
    }
    public livro pesquisaPorTitulo(String titulo){
        livro livroPortitulo = null;
        if (livroList.isEmpty()){
            for (livro l : livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPortitulo = l;
                    break;
                }
            }
    }return livroPortitulo;
    }

    public static void main(String[] args) {
        catalogoLivro CatalogoLivro = new catalogoLivro();
        CatalogoLivro.adicionarLivro("A volta dos que não foram", "Manolo", 1888);
        CatalogoLivro.adicionarLivro("A trança do vei careca", "Manolo", 1890);
        CatalogoLivro.adicionarLivro("No balanço da canoa", "Baltcan", 1999);
        CatalogoLivro.adicionarLivro("Depois do amanhã", "Michigan", 2002);
        CatalogoLivro.adicionarLivro("Now we are free", "manitoba", 2012);

        System.out.println(CatalogoLivro.pesquisarPorAutor("Manolo"));
        System.out.println(CatalogoLivro.pequisaPorIntervaloDeAno(1890, 2002));
        System.out.println(CatalogoLivro.mostralista());
        System.out.println(CatalogoLivro.pesquisaPorTitulo("Depois do amanhã"));
    }
}
