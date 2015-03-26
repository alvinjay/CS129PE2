package FILES;

import java.util.ArrayList;

/**
 * Created by alvinjay on 3/26/15.
 */
public class OutputFileHandler {
    private ArrayList<String> outputValues;

    public OutputFileHandler(ArrayList<String> outputValues) {
        this.outputValues = outputValues;
    }

    /* GETTER METHODS */

    public ArrayList<String> getOutputValues() {
        return outputValues;
    }

    /* END GETTER METHODS */
}
