/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;



// ---------------------------------------------
// Classe Main para testar tudo
// ---------------------------------------------
public class Main {
    public static void main(String[] args) {
        /* ----------- Teste de Livro e Usuario -----------
        Livro livro1 = new Livro("Java Básico", "Autor A");
        Livro livro2 = new Livro("POO Avançado", "Autor B");

        Usuario usuario1 = new Usuario("Aline", 20);
        usuario1.apresentar();

        usuario1.pegarLivro(livro1);
        usuario1.pegarLivro(livro2);

        System.out.println("Total de livros emprestados: " + Livro.totalLivrosEmprestados);

        usuario1.devolverLivro(livro1);
        System.out.println("Total de livros emprestados: " + Livro.totalLivrosEmprestados);*/

        // ----------- Teste de Funcionario -----------
        Funcionario f1 = new Bibliotecario("Carlos", 2000);
        f1.mostrarDados();
        f1.calcularBonus();
        f1.processarPagamento(f1.getSalario());
        
        
        Funcionario f2 = new Gerente("Mariana", 5000);       
        f2.mostrarDados();        
        f2.calcularBonus();        
        f2.processarPagamento(f2.getSalario());

        // ----------- Teste de Constantes -----------
        System.out.println("Máximo de livros por usuário: " + Biblioteca.MAX_LIVROS_POR_USUARIO);
        System.out.println("Multa diária por atraso: R$ " + Biblioteca.MULTA_DIARIA);
    }
}
