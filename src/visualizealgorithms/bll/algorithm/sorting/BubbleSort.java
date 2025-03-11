package visualizealgorithms.bll.algorithm.sorting;

import visualizealgorithms.bll.algorithm.AlgorithmType;
import visualizealgorithms.bll.algorithm.GenericAlgorithm;

public class BubbleSort extends GenericAlgorithm {

    public BubbleSort() {
        super("Bubble Sort", "Slow O(n^2) sorting algorithm", AlgorithmType.SORTING);
    }

    @Override
    public void doWork() {

        // O(n^2)
        int[]b = (int[]) super.getData();

        for (int i = 1; i < b.length; i++) { // O(n)
            for (int j = 0; j < b.length - i; j++) // O(n)
            { if (b[j] > b[j + 1])
                { int temp = b[j];
                b[j] = b[j + 1];
                b[j + 1] = temp;
                }
            }
        }
    }
}
