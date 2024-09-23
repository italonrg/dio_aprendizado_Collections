package com.example.dio.generics.List.exercicioDaLista;
import java.util.ArrayList;
import java.util.List;

public class listaTarefa {

    //meu atributo pode ser um lista
    private List<tarefas> tarefaListe;

    //criar um construtor para que quando for instanciado, criar uma lista vazia por padrão;
    public listaTarefa() {
        this.tarefaListe = new ArrayList<>();// isso aqui eu crio uma lista vazia;
    }
    //adcionando os metodos
    //esse metodo adiciona uma tarefa
    public void adicionarTarefa (String descricao) {
        tarefaListe.add(new tarefas(descricao));
    }
    //removendo uma tarefa
    //nisso aqui temos a seguinte situação: cria uma lista vazia onde verifica se a descrição e igual se sim adiciona na lista tarefas para remover;
    public void removeTarefa(String descricao){
        List<tarefas> tarefasParaRemover = new ArrayList<>();
        for (tarefas t : tarefaListe){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
            tarefaListe.removeAll(tarefasParaRemover);
        }

    }
    //criandoum metodo que conta o numero de tarefas;
    public int obterNumeroDeTarefas (){
        return tarefaListe.size();
    }
    //obtendo as descrições das tarefas
    public void obterDescricao (){
        System.out.println(tarefaListe.toString());
    }

    @Override
    public String toString() {
        return "listaTarefa{" +
                "tarefaListe=" + tarefaListe +
                '}';
    }

    public static void main(String[] args) {


        listaTarefa ListaTarefa = new listaTarefa();
        ListaTarefa.adicionarTarefa("primeira tarefa");
        ListaTarefa.adicionarTarefa("segunda tarefa");
        ListaTarefa.adicionarTarefa("terceira tarefa");
        ListaTarefa.adicionarTarefa("quarta tarefa");
        ListaTarefa.adicionarTarefa("quarta tarefa");

        System.out.println(" O numeto total de tarefas e : " + ListaTarefa.obterNumeroDeTarefas()  );

        ListaTarefa.removeTarefa("quarta tarefa");
        ListaTarefa.obterDescricao();



    }
}
