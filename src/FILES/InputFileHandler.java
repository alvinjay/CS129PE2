package FILES;

import java.util.ArrayList;

/**
 * Created by alvinjay on 3/26/15.
 */
public class InputFileHandler {
    private ArrayList<String> inputValues;

    /**
     * Checks whether a DFA file line is valid
     * @param inputLine
     * @return
     */
    public static boolean isInputLineValid(String inputLine) {
        //TODO raph check if input line is valid
        return true;
    }

    /* GETTER METHODS */

    public ArrayList<String> getInputValues() {
        return inputValues;
    }

    /* END GETTER METHODS */

    /* SETTER METHODS */

    public void setInputValues(ArrayList<String> inputValues) {
        this.inputValues = inputValues;
    }

    /* END SETTER METHODS */

}
