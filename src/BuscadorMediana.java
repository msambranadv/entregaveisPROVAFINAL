import java.util.*;

public class BuscadorMediana {

    private PriorityQueue<Integer> metadeInferior;
    private PriorityQueue<Integer> metadeSuperior;

    public BuscadorMediana() {
        this.metadeInferior = new PriorityQueue<>(Collections.reverseOrder());
        this.metadeSuperior = new PriorityQueue<>();
    }

    public void adicionarNumero(int num) {
        metadeInferior.offer(num);

        if (!metadeInferior.isEmpty() && !metadeSuperior.isEmpty() &&
                metadeInferior.peek() > metadeSuperior.peek()) {
            int temp = metadeInferior.poll();
            metadeSuperior.offer(temp);
        }

        if (metadeInferior.size() > metadeSuperior.size() + 1) {
            metadeSuperior.offer(metadeInferior.poll());
        }

        if (metadeSuperior.size() > metadeInferior.size()) {
            metadeInferior.offer(metadeSuperior.poll());
        }
    }

    public double encontrarMediana() {
        if (metadeInferior.isEmpty() && metadeSuperior.isEmpty()) {
            return 0.0;
        }

        if (metadeInferior.size() == metadeSuperior.size()) {
            return (double) (metadeInferior.peek() + metadeSuperior.peek()) / 2;
        } else {
            return (double) metadeInferior.peek();
        }
    }

    public int obterContagem() {
        return metadeInferior.size() + metadeSuperior.size();
    }
}
