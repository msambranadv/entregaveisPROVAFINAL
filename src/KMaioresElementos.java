import java.util.*;

public class KMaioresElementos {

    public static List<Integer> encontrarKMaiores(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k <= 0) {
            return new ArrayList<>();
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < Math.min(k, arr.length); i++) {
            minHeap.offer(arr[i]);
        }

        for (int i = k; i < arr.length; i++) {
            if (arr[i] > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(arr[i]);
            }
        }

        List<Integer> resultado = new ArrayList<>(minHeap);
        Collections.sort(resultado, Collections.reverseOrder());
        return resultado;
    }

    public static int encontrarKesimoMaior(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k <= 0 || k > arr.length) {
            throw new IllegalArgumentException("K inválido");
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < Math.min(k, arr.length); i++) {
            minHeap.offer(arr[i]);
        }

        for (int i = k; i < arr.length; i++) {
            if (arr[i] > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(arr[i]);
            }
        }

        return minHeap.peek();
    }
}
