package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    // atributo

    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados(Set<Convidado> convidadosSet) {
        this.convidadosSet = new HashSet<>();
    }
//adicionar um convidado
    public void adicionarConvidado(String nome, int codigoConvite) {

        convidadosSet.add(new Convidado(nome, codigoConvite));

    }
// remover um convidado pelo codigo
    public void removerConvidadoPorCodigoConvite(int codigoConvite) {

        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadosSet) {
            if (c.getCodigoConvite() == codigoConvite) { //definir que os codigos devem ser iguais para poder ser removido
                convidadoParaRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover);

    }
//contar o numero de convidados
    public int contarConvidados() {
        return convidadosSet.size();
    }
//imprimir todos os convidados
    public void exibirConvidados() {
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {

        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados(null);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do set de condidados");

        conjuntoConvidados.adicionarConvidado("convidado 1", 120);
        conjuntoConvidados.adicionarConvidado("convidado 2", 122);
        conjuntoConvidados.adicionarConvidado("convidado 3", 123);
        conjuntoConvidados.adicionarConvidado("convidado 4", 125);
        conjuntoConvidados.adicionarConvidado("convidado 5", 125);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do set de condidados");
        
        conjuntoConvidados.removerConvidadoPorCodigoConvite(122);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do set de condidados");

        conjuntoConvidados.exibirConvidados();

    }

}
