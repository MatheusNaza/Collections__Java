package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    // atributo

    private List<Livro> livroslist;

    public CatalogoLivros(List<Livro> livroslist) {
        this.livroslist = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {

        livroslist.add(new Livro(titulo, autor, anoPublicacao));

    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroslist.isEmpty()) {

            for (Livro L : livroslist) {
                if (L.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(L);

                }
            }

        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {

        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroslist.isEmpty()) {
            for (Livro L : livroslist) {
                if (L.getAnoDePublicacao() >= anoInicial && L.getAnoDePublicacao() <= anoFinal) {

                    livrosPorIntervaloAnos.add(L);
                }
            }
        }

        return livrosPorIntervaloAnos;

    }

    public Livro pesquisarPorTitulo(String titulo) {

        Livro livroPorTitulo = null;
        if (!livroslist.isEmpty()) {
            for (Livro L : livroslist) {
                if (L.getTitulo().equals(titulo)) {
                    livroPorTitulo = L;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros(null);
        for (int i = 1; i <= 5; i++) {

            catalogoLivros.adicionarLivro("Título " + i, "Autor " + i, 2000 + i);
            
        }

        catalogoLivros.adicionarLivro("Título 1 " , "Autor 3" , 2002  );


        System.out.println(catalogoLivros.livroslist);
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 3"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2000, 2003));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Título 1 " ));
        
    }

}


