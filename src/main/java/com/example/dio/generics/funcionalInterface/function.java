package com.example.dio.generics.funcionalInterface;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class function {

    public static void main(String[] args) {
        List<Integer> nume = Arrays.asList(1,2,356,99,7,4,1,12);

        Function<Integer ,Integer> dobrar = num -> num * 2;

        List<Integer> numerosDobrados = nume.stream().map(dobrar).collect(Collectors.toList());

        numerosDobrados.forEach(System.out::println);
    }

}
