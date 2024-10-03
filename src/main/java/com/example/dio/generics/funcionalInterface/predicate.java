package com.example.dio.generics.funcionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class predicate {

    public static void main(String[] args) {
        //criando a lista de nomes
        List<String> nomes = Arrays.asList("italo","rafael","Amicia","carry","nog");
        List<Integer> nums = Arrays.asList(12,99,2331,1);

        Predicate<String> maisDe5Caracters = nome -> nome.length() > 5;
        Predicate<String> comecaComI = nome -> nome.startsWith("i");




        nomes.stream().filter(maisDe5Caracters).forEach(System.out:: println);
        System.out.println("-------------------------------------------------------------");
        nomes.stream().filter(comecaComI).forEach(System.out:: println);
        System.out.println("-------------------------------------------------------------");
        nomes.stream().filter(p -> p.contains("mi")).forEach(System.out::println);
        nums.stream().distinct().forEach(System.out::println);

    }
}
