package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    // atributo
    private List<Tarefa> ListaTarefa;

    public ListaTarefa() {

        this.ListaTarefa = new ArrayList<>();

    }

    public void adicionarTarefa(String descricao) {

        ListaTarefa.add(new Tarefa(descricao));

    }

    public void removerTarefa(String descricao) {

        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : ListaTarefa)
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }

            ListaTarefa.removeAll(tarefasParaRemover);

    }

    public int obterNumeroTotalTarefas() {

        return ListaTarefa.size();

    }

    public void obterDescricoesTarefas() {

        System.out.println(ListaTarefa);

    }

    public static void main(String[] args) {
        
ListaTarefa listaTarefa = new ListaTarefa();

listaTarefa.adicionarTarefa("Tarefa 1");
listaTarefa.adicionarTarefa("Tarefa 2");
listaTarefa.adicionarTarefa("Tarefa 1");

listaTarefa.obterDescricoesTarefas();

listaTarefa.removerTarefa("Tarefa 1");

System.out.println(listaTarefa.obterNumeroTotalTarefas());

listaTarefa.obterDescricoesTarefas();

    }

}
