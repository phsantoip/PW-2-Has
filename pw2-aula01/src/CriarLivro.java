public class CriarLivro {
    public static void main(String[] args) {

        Autor autor= new Autor();
        autor.nome = "J K Rowling";
        autor.email= "autor@gmail.com";
        autor.foto = "IMG";
        autor.telefone = "11 90024922";


        Editora editora = new Editora();
        editora.nome = "Eh os D";
        editora.site = "editora dos D.com.br";

        Livro favorito = new Livro();
        favorito.titulo = "O Hobbit";
        favorito.autor = autor;
        favorito.editora = editora;
        favorito.preco = 69.45;
        favorito.paginas = 254;
        favorito.tipoCapa =  TipoCapaenum.COMUM;
        /*System.out.println(favorito.titulo + "do autor" +
          favorito.autor.nome + "eh meu Livro favorito!" + " eh distribuido pela edeitora" + favorito.editora.nome);
          */
        System.out.println(favorito.exibirDadosDoLivro()); favorito: Livro
        favorito.exibirDados();

        Livro primeirolivro = new Livro();



    }

}
