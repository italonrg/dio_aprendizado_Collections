package com.example.dio.generics.funcionalInterface;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class supplier {
    public static void main(String[] args) {
        Supplier<String> saudaçao = () -> "Oi";
        List<String> ListSaudacao = Stream.generate(saudaçao).limit(10).toList();
        /*explicação : Veja que essa linha vc pode usar um for para gerar o texto da saudação, mas dessa forma vc já gera o
        texto passando o "saudação como argumento e o .limit para limitar a ação e o .toList que já joga tudo numa lista.
         */
        ListSaudacao.forEach(System.out ::println);
    }
}
