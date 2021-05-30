package colecoes;

import java.util.Objects;

public class Usuario {
    String nome;

    Usuario(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Meu nome é " + nome + ".";
    }

    @Override
    public boolean equals(Object objeto) {
        if (this == objeto) return true;
        if (objeto == null || getClass() != objeto.getClass()) return false;
        Usuario usuario = (Usuario) objeto;
        return Objects.equals(nome, usuario.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
