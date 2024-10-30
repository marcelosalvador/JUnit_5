package junit;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefas {

    private List<String> tarefas;

    public ListaDeTarefas() {
        tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String tarefa) {
        if (tarefa == null || tarefa.isEmpty()) {
            throw new IllegalArgumentException("A tarefa não pode ser nula ou vazia");
        }
        tarefas.add(tarefa);
    }

    public void removerTarefa(String tarefa) {
        if (!tarefas.contains(tarefa)) {
            throw new IllegalArgumentException("Tarefa não encontrada na lista");
        }
        tarefas.remove(tarefa);
    }

    public List<String> listarTarefas() {
        return new ArrayList<>(tarefas);
    }

    public int contarTarefas() {
        return tarefas.size();
    }
}

