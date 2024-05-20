package tests;

import model.*;
import model.enums.TipoCapaEnum;

public class CriarLivro {
    public static void main(String[] args) {
        Editora editora = new Editora();
        editora.nome = "Rocco";
        editora.site = "rocco.com.br";

        Editora editoraFTD = new Editora();
        editoraFTD.nome = "FTD";
        editoraFTD.site = "ftd.com.br";

        Autor autor = new Autor();
        autor.setNome("J K Rowling");
        autor.setTelefone("85938494");
        autor.setEmail("jkr@gmail.com");

        LivroImpresso favorito = new LivroImpresso();
        favorito.setTitulo("Harry Potter");
        favorito.setAutor(autor);
        favorito.setEditora(editora);
        favorito.setPreco(69.45);
        favorito.setPaginas(254);
         //favorito.setTipoCapa(TipoCapaEnum.COMUM);
       /* System.out.println(favorito.titulo + " do autor " +
                favorito.autor.nome + " é meu livro favorito!" +
                " é distribuido pela editora " + favorito.editora.nome
        );*/
        System.out.println(favorito.exibirDadosDoLivro());
        favorito.exibirDados();
      //  model.Livro primeiroLivro = new model.Livro();

        System.out.println("------------model.Kindle-----------------");
        Kindle kindle = new Kindle();
        kindle.setAutor(autor);
        kindle.setEditora(editora);
        kindle.setTitulo("Aprendizagem ");
        kindle.setMarcaDAgua("Teste");
        kindle.exibirDados();

        SacolaCompras carrinho = new SacolaCompras();
        carrinho.adicionar(kindle);
        carrinho.adicionar(favorito);

    }
}
