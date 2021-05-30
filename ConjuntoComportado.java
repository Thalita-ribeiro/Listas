package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        Set<String> listaAprovados = new HashSet<String>();

        listaAprovados.add("Ana");
        listaAprovados.add("Pedro");
        listaAprovados.add("Gabriel");
        listaAprovados.add("Caio");

        for (String candidato : listaAprovados) {
            System.out.println(candidato);
        }

        Set<String> lista2 = new TreeSet<String>();

        lista2.add("João");
        lista2.add("Viviam");
        lista2.add("Joana");
        lista2.add("Amanda");
        lista2.add("Victor");

        for (String l : lista2) {
            System.out.println(l);
        }

        Set<Integer> numeroInteiros = new HashSet<>();

        numeroInteiros.add(1);
        numeroInteiros.add(2);
        numeroInteiros.add(3);
        numeroInteiros.add(4);

        // numeroInteiro.get(1); Não é possível acessar pelo índice

        for (int numero : numeroInteiros) {
            System.out.println(numero);
        }
    }
}