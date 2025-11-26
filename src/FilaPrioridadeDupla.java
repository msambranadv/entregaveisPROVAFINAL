import java.util.*;

public class FilaPrioridadeDupla {

    private PriorityQueue<Integer> maxHeap;
    private PriorityQueue<Integer> minHeap;
    private Map<Integer, Integer> frequencia;

    public FilaPrioridadeDupla() {
        this.maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        this.minHeap = new PriorityQueue<>();
        this.frequencia = new HashMap<>();
    }

    public void inserir(int valor) {
        maxHeap.offer(valor);
        minHeap.offer(valor);
        frequencia.put(valor, frequencia.getOrDefault(valor, 0) + 1);
    }

    public Integer obterMaximo() {
        while (!maxHeap.isEmpty()) {
            int valor = maxHeap.peek();
            if (frequencia.getOrDefault(valor, 0) > 0) {
                return valor;
            }
            maxHeap.poll();
        }
        return null;
    }

    public Integer obterMinimo() {
        while (!minHeap.isEmpty()) {
            int valor = minHeap.peek();
            if (frequencia.getOrDefault(valor, 0) > 0) {
                return valor;
            }
            minHeap.poll();
        }
        return null;
    }

    public Integer removerMaximo() {
        while (!maxHeap.isEmpty()) {
            int valor = maxHeap.poll();
            if (frequencia.getOrDefault(valor, 0) > 0) {
                frequencia.put(valor, frequencia.get(valor) - 1);
                return valor;
            }
        }
        return null;
    }

    public Integer removerMinimo() {
        while (!minHeap.isEmpty()) {
            int valor = minHeap.poll();
            if (frequencia.getOrDefault(valor, 0) > 0) {
                frequencia.put(valor, frequencia.get(valor) - 1);
                return valor;
            }
        }
        return null;
    }

    public boolean estaVazia() {
        return frequencia.values().stream().mapToInt(Integer::intValue).sum() == 0;
    }
}
