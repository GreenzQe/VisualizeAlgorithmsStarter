package visualizealgorithms.bll.algorithm.sorting;

import visualizealgorithms.bll.algorithm.AlgorithmType;
import visualizealgorithms.bll.algorithm.GenericAlgorithm;

public class RecombinantSort extends GenericAlgorithm {

    public RecombinantSort() {
        super("Recombinant Sort", "O(n) N-Dimensional Cartesian Spaced Algorithm", AlgorithmType.SORTING);
    }

    @Override
    public void doWork() {
        int[] data = (int[]) super.getData();
        recombinantSort(data, 0, data.length - 1);
    }

    private void recombinantSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            recombinantSort(array, left, mid);
            recombinantSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    private void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        System.arraycopy(array, left, leftArray, 0, n1);
        System.arraycopy(array, mid + 1, rightArray, 0, n2);

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}