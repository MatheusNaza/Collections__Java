package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

import List.Ordenacao.pessoas;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {

        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {

        System.out.println(contatoSet);

    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {

                contatosPorNome.add(c);

            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet)
            if (c.getNome().equalsIgnoreCase(nome)) {

                c.setTelefone(novoNumero);
                contatoAtualizado = c;
                break;

            }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("matheus 1", 1243);
        agendaContatos.adicionarContato("matheus 2", 123);
        agendaContatos.adicionarContato("matheus 3", 143);
        agendaContatos.adicionarContato("matheus 3", 1253);
        agendaContatos.adicionarContato("matheus 4", 1143);
        agendaContatos.adicionarContato("matheus 5", 1263);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("matheus 1"));

        System.out.println("contato atualizado : " + agendaContatos.atualizarNumeroContato("matheus 1", 1342));
    }

}
