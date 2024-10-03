package com.example.dio.Stream_API_Lambidas;

import com.example.dio.generics.ordenacoes.Pessoa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class reference {
    private List<Pessoa> pessoaList;

    public reference() {
        this.pessoaList = new ArrayList<>();
    }
    public List<Pessoa> oredenarPorAlturaxxx(){
       if (!pessoaList.isEmpty()){
           List<Pessoa> pessoaPorAltura = new ArrayList<>();
           pessoaPorAltura.sort(Comparator.comparingDouble(Pessoa::getAltura));
           return pessoaPorAltura;
       }else {
           throw  new RuntimeException("a lista está vazia !!!");
       }
    }
}
