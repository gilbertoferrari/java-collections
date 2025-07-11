public class Main {
    public static void main(String[] args) throws Exception {

        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("Total de tarefas na lista : " + listaTarefa.obterNumeroTotalTarefas());

        // cria novas tarefas
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1"); // elemento repetido
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");

        System.out.println("Total de tarefas na lista : " + listaTarefa.obterNumeroTotalTarefas());

        // remove elementos repetidos
        listaTarefa.removeTarefa("Tarefa 1");

        System.out.println("Total de tarefas na lista : " + listaTarefa.obterNumeroTotalTarefas());

        // obtem as descricoes das tarefas
        listaTarefa.obterDescricoesTarefas();

    }// main

}// class
