package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Roberta");
        usuarios.put(2, "Manu");
        usuarios.put(3, "Eduarda");
        usuarios.put(4, "Vanessa");

        System.out.println(usuarios.size()); //Tamanho
        System.out.println(usuarios.isEmpty()); // Se tem elemento ou não

        System.out.println(usuarios.keySet()); // Vai retorna a chave
        System.out.println(usuarios.values()); // Vai retorna ao valor
        System.out.println(usuarios.entrySet()); // Vai retorna chave e valor

        System.out.println(usuarios.containsKey(20));
        System.out.println(usuarios.containsValue("Roberta"));

        System.out.println(usuarios.get(1));

        for (int chave : usuarios.keySet()) {
            System.out.println(chave);
        }

        for (String valor : usuarios.values()) {
            System.out.println(valor);
        }

        for (Map.Entry<Integer, String> registro : usuarios.entrySet()) {
            System.out.println(registro.getKey());
            System.out.println(registro.getValue());
        }
    }
}
