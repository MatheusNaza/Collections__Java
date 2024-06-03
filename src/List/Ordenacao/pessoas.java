package List.Ordenacao;

import java.util.Comparator;


public class pessoas implements Comparable<pessoas> {

    // atributos

    private String nome;

    private int idade;

    private double altura;

    public pessoas(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "ordenacaoPessoas [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
    }

    @Override
    public int compareTo(pessoas p) {
        // TODO Auto-generated method stub
        return Integer.compare(this.idade, p.getIdade());
    }

}

class ComparatorPorAltura implements Comparator<pessoas> {

    @Override
    public int compare(pessoas p1, pessoas p2) {
        // TODO Auto-generated method stub
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
   }

