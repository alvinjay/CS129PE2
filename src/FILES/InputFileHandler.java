package FILES;

import java.util.ArrayList;

/**
 * Created by alvinjay on 3/26/15.
 */
public class InputFileHandler {
    private ArrayList<String> inputValues;

    public InputFileHandler() {
        this.inputValues = new ArrayList<String>();
    }

    /**
     * Checks whether a DFA file line is valid
     * @param inputLine
     * @return
     */
    public static boolean isInputLineValid(String inputLine) {
        //TODO check if input line is valid
        return true;
    }

    /* GETTER METHODS */

    public ArrayList<String> getInputValues() {
        return inputValues;
    }

    /* END GETTER METHODS */
}
