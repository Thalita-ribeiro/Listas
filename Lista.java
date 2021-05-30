package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<Usuario> lista = new ArrayList<>();

        Usuario usuario = new Usuario("Ana");
        lista.add(usuario);
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Eduardo"));
        lista.add(new Usuario("Monica"));

        System.out.println(lista.get(3)); //Acessar pelo índice

        lista.remove(1);
        lista.remove(new Usuario(("Eduardo")));

        for (Usuario usuario1 : lista) {
            System.out.println(usuario1);
        }
    }
}
