
package biblioteca;


import java.util.ArrayList;

public class CadastroUsuarios {

    private static ArrayList<Usuario> usuarios = new ArrayList<>();

    public static void adicionar(Usuario u) {
        usuarios.add(u);
    }

    public static ArrayList<Usuario> listar() {
        return usuarios;
    }
}