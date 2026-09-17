
package biblioteca;

import java.util.ArrayList;

public class CadastroLivros {
        private static ArrayList<Livro> livro = new ArrayList<>();

    public static void adicionar(Livro u) {
        livro.add(u);
    }

    public static ArrayList<Livro> listar() {
        return livro;
    }
}
