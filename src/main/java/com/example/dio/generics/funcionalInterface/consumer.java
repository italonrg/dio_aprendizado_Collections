package com.example.dio.generics.funcionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class consumer {
    public static void main(String[] args) {
        //criando uma lista de inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 22, 432, 32, 4, 11, 93, 5, 3, 2, 1, 45, 77, 5, 76, 24, 3, 24, 32, 56, 4, 99, 677, 786, 3, 56, 2, 111);

        //Usando o consumer com uma lambida para imprimir todos os numeros pares
        Consumer<Integer> iprimirNumeroPar = numero -> {
            if (numero % 2 != 0) {
                System.out.println(numero);
            }
        };
        numeros.stream().forEach(iprimirNumeroPar);
    }
}
