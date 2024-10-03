package com.example.dio.generics.funcionalInterface;

import ch.qos.logback.core.encoder.JsonEscapeUtil;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperartor {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(12,45,87,3,56,78,9,7,1);

        //usando o BinaryOperator
        BinaryOperator<Integer> somar = (n1 , n2) -> n1 + n2;
        BinaryOperator<Integer> multipicar = (n1 , n2) -> n1 * n2;

        int resultado = numeros.stream().reduce(0,somar);
        int resultadox = numeros.stream().reduce(0,multipicar);

        int resultadomult = numeros.stream().reduce(0, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer1, Integer integer2) {//esse codigo está retornando 0 não sei porque.
                return integer1 * integer2;
            }
        });


        System.out.println(resultado);
        System.out.println(resultadox);
    }

}
