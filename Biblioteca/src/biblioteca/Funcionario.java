/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author aline.fsantos55
 */
// ---------------------------------------------
// Classe abstrata Funcionario
// ---------------------------------------------
abstract class Funcionario implements Pagamento {

    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Método abstrato
    abstract double calcularBonus();

    // Método concreto
    public void mostrarDados() {
        System.out.println("Nome: " + nome + ", Salário: R$ " + salario);
    }
}
