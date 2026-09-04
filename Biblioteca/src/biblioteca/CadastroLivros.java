/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

import java.util.ArrayList;

/**
 *
 * @author aline.fsprado1
 */
public class CadastroLivros {
        private static ArrayList<Livro> livro = new ArrayList<>();

    public static void adicionar(Livro u) {
        livro.add(u);
    }

    public static ArrayList<Livro> listar() {
        return livro;
    }
}
