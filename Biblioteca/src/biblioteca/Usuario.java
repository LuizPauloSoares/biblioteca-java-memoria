package biblioteca;

public class Usuario {

    private String nome;
    private int idade;
    int livrosEmprestados = 0;

    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return nome;
    }

    public int getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(int livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }

    public void pegarLivro(Livro livro) {
        if (livrosEmprestados < Biblioteca.MAX_LIVROS_POR_USUARIO) {
            livro.emprestar();
            livrosEmprestados++;
        } else {
            System.out.println(nome + " atingiu o limite de livros emprestados!");
        }
    }

    public void devolverLivro(Livro livro) {
        livro.devolver();
        if (livrosEmprestados > 0) {
            livrosEmprestados--;
        }
    }
}
