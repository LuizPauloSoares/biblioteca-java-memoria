
package biblioteca;

// ---------------------------------------------
// Subclasse Gerente
// ---------------------------------------------
class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    double calcularBonus() {
        double bonus = getSalario() * 0.2; // 20% do salário
        System.out.println(getNome() + " recebeu bônus de R$ " + bonus);
        return bonus;
    }

    @Override
    public double processarPagamento(double valor) {
        
        double valorTotal = getSalario() + calcularBonus();
        System.out.println("Pagamento processado para " + getNome() + ": R$ " + valorTotal);
        return valorTotal;
    }
}
