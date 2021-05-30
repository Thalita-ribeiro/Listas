package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        conjunto.add(1.2); // double -> Double
        conjunto.add(true); // boolean -> Boolean
        conjunto.add("Teste"); // String
        conjunto.add(1);

        System.out.println("Tamanho é " + conjunto.size());
        System.out.println("Tamanho é " + conjunto.remove("Teste"));
        System.out.println("Tamanho é " + conjunto.size());
        System.out.println(conjunto.contains("Teste"));

        Set numero = new HashSet();
        numero.add(1);
        numero.add(2);
        numero.add(3);

        System.out.println(numero);
        System.out.println(conjunto);

        // conjunto.add(numero); // União entre dois conjuntos
        conjunto.retainAll(numero);
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);
    }
}
