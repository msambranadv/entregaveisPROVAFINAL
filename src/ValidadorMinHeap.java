public class ValidadorMinHeap {

    public static boolean ehMinHeap(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return true;
        }

        for (int i = 0; i < arr.length; i++) {
            int indiceEsquerdo = 2 * i + 1;
            int indiceDireito = 2 * i + 2;

            if (indiceEsquerdo < arr.length && arr[i] > arr[indiceEsquerdo]) {
                return false;
            }

            if (indiceDireito < arr.length && arr[i] > arr[indiceDireito]) {
                return false;
            }
        }

        return true;
    }

    public static boolean ehMinHeapRecursivo(int[] arr, int indice) {
        if (arr == null || arr.length == 0) {
            return true;
        }

        int indiceEsquerdo = 2 * indice + 1;
        int indiceDireito = 2 * indice + 2;

        if (indiceEsquerdo < arr.length) {
            if (arr[indice] > arr[indiceEsquerdo]) {
                return false;
            }
            if (!ehMinHeapRecursivo(arr, indiceEsquerdo)) {
                return false;
            }
        }

        if (indiceDireito < arr.length) {
            if (arr[indice] > arr[indiceDireito]) {
                return false;
            }
            if (!ehMinHeapRecursivo(arr, indiceDireito)) {
                return false;
            }
        }

        return true;
    }

    public static int[] organizarHeap(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }

        for (int i = (arr.length - 2) / 2; i >= 0; i--) {
            descerHeap(arr, i);
        }

        return arr;
    }

    private static void descerHeap(int[] arr, int indice) {
        int menor = indice;
        int indiceEsquerdo = 2 * indice + 1;
        int indiceDireito = 2 * indice + 2;

        if (indiceEsquerdo < arr.length && arr[indiceEsquerdo] < arr[menor]) {
            menor = indiceEsquerdo;
        }

        if (indiceDireito < arr.length && arr[indiceDireito] < arr[menor]) {
            menor = indiceDireito;
        }

        if (menor != indice) {
            int temp = arr[indice];
            arr[indice] = arr[menor];
            arr[menor] = temp;
            descerHeap(arr, menor);
        }
    }
}
