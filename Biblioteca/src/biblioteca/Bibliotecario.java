
package biblioteca;


// ---------------------------------------------
// Subclasse Bibliotecario
// ---------------------------------------------
class Bibliotecario extends Funcionario {

    public Bibliotecario(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    double calcularBonus() {
        double bonus = getSalario() * 0.1; // 10% do salário        
        return bonus;
    }

    @Override
    public double processarPagamento(double valor) {
        System.out.println(getNome() + " recebeu bônus de R$ " + calcularBonus());
        double valorTotal = valor + calcularBonus();
        System.out.println("Pagamento processado para " + getNome() + ": R$ " + valorTotal);
        return valorTotal;
    }

    

}
