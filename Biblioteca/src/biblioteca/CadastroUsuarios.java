/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author aline.fsprado1
 */
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