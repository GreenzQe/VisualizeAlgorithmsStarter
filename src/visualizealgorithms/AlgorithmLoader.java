package visualizealgorithms;

//Project imports
import visualizealgorithms.bll.algorithm.IAlgorithm;
import visualizealgorithms.bll.algorithm.sorting.*;

//Java imports
import java.util.ArrayList;

/**
 * Convenience class that adds algorithms and handles inputs
 */
public class AlgorithmLoader {

    private String inputs = "";
    private ArrayList<IAlgorithm> algorithms = new ArrayList<>();

    public AlgorithmLoader() {
        //Modify default inputs - Default is: inputs = "1000;2000;4000;8000;16000;32000;64000";
        inputs = "1000;2000;4000;8000;16000;32000;64000;128000;256000;512000;1024000;2048000;4096000;8192000;16384000;32768000;65536000;131072000";

        //Add implemented/selected algorithms here..
        algorithms.add(new BubbleSort()); // O(n^2)
        algorithms.add(new RecombinantSort()); // O(n)
        algorithms.add(new QuickSort()); // O(n log n)
        algorithms.add(new InsertionSort()); // O(n^2)
        algorithms.add(new SelectionSort()); // O(n^2)

        //more algorithms here :)
    }

    public String getInputs() {
        return inputs;
    }

    public ArrayList<IAlgorithm> getAlgorithms() {
        return algorithms;
    }
}
