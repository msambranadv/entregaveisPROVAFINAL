import java.util.*;

public class MescladorKListas {

    private static class No {
        int valor;
        int indiceList;
        int indiceElemento;

        No(int valor, int indiceList, int indiceElemento) {
            this.valor = valor;
            this.indiceList = indiceList;
            this.indiceElemento = indiceElemento;
        }
    }

    public static List<Integer> mesclarKListas(List<List<Integer>> listas) {
        List<Integer> resultado = new ArrayList<>();

        if (listas == null || listas.isEmpty()) {
            return resultado;
        }

        PriorityQueue<No> minHeap = new PriorityQueue<>(
                Comparator.comparingInt(no -> no.valor)
        );

        for (int i = 0; i < listas.size(); i++) {
            List<Integer> lista = listas.get(i);
            if (!lista.isEmpty()) {
                minHeap.offer(new No(lista.get(0), i, 0));
            }
        }

        while (!minHeap.isEmpty()) {
            No atual = minHeap.poll();
            resultado.add(atual.valor);

            if (atual.indiceElemento + 1 < listas.get(atual.indiceList).size()) {
                int proximoValor = listas.get(atual.indiceList).get(atual.indiceElemento + 1);
                minHeap.offer(new No(proximoValor, atual.indiceList, atual.indiceElemento + 1));
            }
        }

        return resultado;
    }
}
