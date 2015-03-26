package FILES;

import DATA.TransitionTableElement;

import java.util.ArrayList;

/**
 * Created by alvinjay on 3/26/15.
 */
public class DFAFileHandler {
    private ArrayList<TransitionTableElement> transitionTableValues;

    public DFAFileHandler(ArrayList<TransitionTableElement> transitionTableValues) {
        this.transitionTableValues = transitionTableValues;
    }

    /**
     * Checks whether a DFA file line is valid
     * @param DFAFileLine
     * @return
     */
    public static boolean isDFAFileContentValid(String DFAFileLine) {
        //TODO check if line is valid
        return true;
    }

    /* GETTER METHODS */
    
    public ArrayList<TransitionTableElement> getTransitionTableValues() {
        return transitionTableValues;
    }

    /* END GETTER METHODS */
}
