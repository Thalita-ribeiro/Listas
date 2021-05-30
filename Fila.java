package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // Offer e add -> Adicionam elementos na fila
        // A diferença é o comportamento quando a fila está cheia!

        fila.add("Ana");
        fila.offer("Bia");
        fila.offer("Carlos");
        fila.offer("Daniela");
        fila.offer("Rafaela");
        fila.offer("Geovana");

        // Peek e Element -> Obter  o próximo elemento da fila (Sem remover)
        // Diferença é o comportamento ocorre quando a fila está vazia!
        System.out.println(fila.peek()); // retorna false
        System.out.println(fila.element()); // Lança uma exceção


    }
}
