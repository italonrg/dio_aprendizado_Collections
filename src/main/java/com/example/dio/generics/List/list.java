package com.example.dio.generics.List;

import java.util.ArrayList;
import java.util.List;

public class list {

    public static void main(String[] args) {
        List<String> lista_de_generics = new ArrayList<>();
        lista_de_generics.add("fumo");
        lista_de_generics.add("corda");
        lista_de_generics.add("fall");
        lista_de_generics.add("node");

        for (String elemento : lista_de_generics){
            System.out.printf(elemento);// basicamente o generics ele serve para tipar melhor os dados impedindo que se tenha o
        }
    }


    }

