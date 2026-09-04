
package biblioteca;

import java.util.ArrayList;
import java.util.List;


public class CadastroFuncionario {

    private static List<Funcionario> funcionarios = new ArrayList<>();

    public static void adicionar(Funcionario f) {
        funcionarios.add(f);
    }

    public static List<Funcionario> listar() {
        return funcionarios;
    }
}
