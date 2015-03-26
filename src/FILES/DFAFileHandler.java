package FILES;

import DATA.TransitionTableElement;

import java.util.ArrayList;

/**
 * Created by alvinjay on 3/26/15.
 */
public class DFAFileHandler {
    private ArrayList<TransitionTableElement> transitionTableValues;

    /**
     * Checks whether a DFA file line is valid
     * @param dfaLine
     * @return
     */
    public static boolean isDFALineValid(String dfaLine) {
        //TODO gab check if line is valid
        return true;
    }

    /* GETTER METHODS */
    
    public ArrayList<TransitionTableElement> getTransitionTableValues() {
        return transitionTableValues;
    }

    /* END GETTER METHODS */

    /* SETTER METHODS */
    
    public void setTransitionTableValues(ArrayList<String> transitionTableLines) {
        //TODO gab extract values per line then make TransitionTableElement
        //for each transitionTableLine split by ","
        //transitionTableValues.add(new TransitionTableElement(put extracted values here: refer to TransitionTableElement.java))
    }
    
    /* END SETTER METHODS */
}
