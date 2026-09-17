/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;


public class Livro {

    // ---------------------------------------------
    // Classe Livro (concreta, com static)
    // ---------------------------------------------
    String titulo;
    String autor;
    boolean disponivel = true;

    // Atributo estático compartilhado entre todos os livros
    static int totalLivrosEmprestados = 0;

    // Construtor
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return titulo;
    }

    // Método para emprestar livro
    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            totalLivrosEmprestados++;
            System.out.println(titulo + " emprestado com sucesso!");
        } else {
            System.out.println(titulo + " não está disponível.");
        }
    }

    // Método para devolver livro
    public void devolver() {
        if (!disponivel) {
            disponivel = true;
            totalLivrosEmprestados--;
            System.out.println(titulo + " devolvido com sucesso!");
        } else {
            System.out.println(titulo + " já está disponível.");
        }
    }
}
