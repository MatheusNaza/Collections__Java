package List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ordenacaoPessoas {

    private List<pessoas> pessoaslList;

    public ordenacaoPessoas() {
        this.pessoaslList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaslList.add(new pessoas(nome, idade, altura));
    }

    public List<pessoas> ordenarPorIdade() {
        List<pessoas> pessoasPorIdade = new ArrayList<>(pessoaslList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<pessoas> ordenarPorAltura() {
        List<pessoas> pessoasPorAltura = new ArrayList<>(pessoaslList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;

    }

    public static void main(String[] args) {

        ordenacaoPessoas ordenacaoPessoas = new ordenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("nome 1", 20, 1.56);
        ordenacaoPessoas.adicionarPessoa("nome 1", 24, 1.74);
        ordenacaoPessoas.adicionarPessoa("nome 1", 54, 1.82);
        ordenacaoPessoas.adicionarPessoa("nome 1", 30, 1.66);
        ordenacaoPessoas.adicionarPessoa("nome 1", 70, 1.40);

        System.out.println(ordenacaoPessoas.pessoaslList);
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
        System.out.println(ordenacaoPessoas.pessoaslList);
        System.out.println(ordenacaoPessoas.ordenarPorIdade());
    }

}
