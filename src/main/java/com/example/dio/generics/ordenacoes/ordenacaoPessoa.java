package com.example.dio.generics.ordenacoes;

import java.util.*;

public class ordenacaoPessoa {
    //atributo
    private List<Pessoa> pessoaList = new ArrayList<>();

    public ordenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    //metodo de adicionar pessoa
    public void adionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    //metodo de odenar por altura
    public List<Pessoa> ordenadoPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>();
        Collections.sort(pessoasPorIdade);// o sort serve para ordenar elementos numa lista;
        return pessoasPorIdade;
    }

    //metodo de odenar por altura
    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new comparatorPorAltura());
        return pessoasPorAltura;
    }

    class comparatorPorAltura implements Comparator<Pessoa> {

        @Override
        public int compare(Pessoa p1, Pessoa p2) {
            return Double.compare(p1.getAltura(), p2.getAltura());
        }
    }

    public static void main(String[] args) {
        ordenacaoPessoa ORD = new ordenacaoPessoa();

        ORD.adionarPessoa("Italo", 28,1.73);
        ORD.adionarPessoa("Rafael", 28,1.73);
        ORD.adionarPessoa("Anne", 17,1.68);
        ORD.adionarPessoa("Falkner", 48,1.70);

        System.out.println(ORD.ordenadoPorIdade());
        System.out.println(ORD.ordenarPorAltura());
    }
}
