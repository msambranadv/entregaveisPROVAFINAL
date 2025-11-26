import java.util.*;

public class Principal {

    public static void main(String[] args) {
        System.out.println("=== EXERCÍCIOS DE LISTA DE PRIORIDADE (HEAP) EM JAVA ===\n");

        testeExercicio1();
        testeExercicio2();
        testeExercicio3();
        testeExercicio4();
        testeExercicio5();
    }

    private static void testeExercicio1() {
        System.out.println("--- Exercício 1: K Maiores Elementos ---");

        int[] arr = {3, 2, 1, 5, 6, 4, 2, 7};
        int k = 3;

        List<Integer> resultado = KMaioresElementos.encontrarKMaiores(arr, k);
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("K = " + k);
        System.out.println("K Maiores: " + resultado);
        System.out.println("Esperado: [7, 6, 5]\n");
    }

    private static void testeExercicio2() {
        System.out.println("--- Exercício 2: Mesclagem de K Listas Ordenadas ---");

        List<List<Integer>> listas = new ArrayList<>();
        listas.add(Arrays.asList(1, 4, 5));
        listas.add(Arrays.asList(1, 3, 4));
        listas.add(Arrays.asList(2, 6));

        List<Integer> resultado = MescladorKListas.mesclarKListas(listas);

        System.out.println("Listas entrada:");
        for (int i = 0; i < listas.size(); i++) {
            System.out.println("  Lista " + (i + 1) + ": " + listas.get(i));
        }
        System.out.println("Resultado: " + resultado);
        System.out.println("Esperado: [1, 1, 2, 3, 4, 4, 5, 6]\n");
    }

    private static void testeExercicio3() {
        System.out.println("--- Exercício 3: Fila de Prioridade Dupla ---");

        FilaPrioridadeDupla dpq = new FilaPrioridadeDupla();

        int[] valores = {5, 10, 3, 8, 2, 7};
        System.out.println("Inserindo: " + Arrays.toString(valores));
        for (int v : valores) {
            dpq.inserir(v);
        }

        System.out.println("Máximo: " + dpq.obterMaximo() + " (esp: 10)");
        System.out.println("Mínimo: " + dpq.obterMinimo() + " (esp: 2)");
        System.out.println("Remove máx: " + dpq.removerMaximo() + " (esp: 10)");
        System.out.println("Novo máx: " + dpq.obterMaximo() + " (esp: 8)");
        System.out.println("Remove mín: " + dpq.removerMinimo() + " (esp: 2)");
        System.out.println("Novo mín: " + dpq.obterMinimo() + " (esp: 3)\n");
    }

    private static void testeExercicio4() {
        System.out.println("--- Exercício 4: Validação Min-Heap ---");

        int[] heapValido = {1, 2, 3, 4, 5, 6, 7};
        int[] heapInvalido = {1, 3, 2, 4, 5, 6, 7};

        System.out.println("Array válido: " + Arrays.toString(heapValido));
        System.out.println("É Min-Heap? " + ValidadorMinHeap.ehMinHeap(heapValido) + " (esp: true)");

        System.out.println("\nArray inválido: " + Arrays.toString(heapInvalido));
        System.out.println("É Min-Heap? " + ValidadorMinHeap.ehMinHeap(heapInvalido) + " (esp: false)");

        int[] arrayDesordenado = {10, 5, 20, 2, 8, 15};
        System.out.println("\nArray desordenado: " + Arrays.toString(arrayDesordenado));
        ValidadorMinHeap.organizarHeap(arrayDesordenado);
        System.out.println("Após organizar: " + Arrays.toString(arrayDesordenado));
        System.out.println("É Min-Heap? " + ValidadorMinHeap.ehMinHeap(arrayDesordenado) + " (esp: true)\n");
    }

    private static void testeExercicio5() {
        System.out.println("--- Exercício 5: Mediana em Fluxo de Dados ---");

        BuscadorMediana bm = new BuscadorMediana();

        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println("Adicionando: " + Arrays.toString(numeros));

        for (int num : numeros) {
            bm.adicionarNumero(num);
            System.out.println("  +"+num + ": mediana = " + bm.encontrarMediana());
        }

        System.out.println("\nCom números desordenados:");
        BuscadorMediana bm2 = new BuscadorMediana();
        int[] desordenados = {5, 15, 1, 3, 8};

        for (int num : desordenados) {
            bm2.adicionarNumero(num);
            System.out.println("  +"+num + ": mediana = " + bm2.encontrarMediana());
        }
    }
}
