package DATA;

/**
 * Created by alvinjay on 3/26/15.
 */
public class TransitionTableElement {
    private String type, label, zeroTransition, oneTransition;

    public TransitionTableElement(String type, String label, String zeroTransition, String oneTransition) {
        this.type = type;
        this.label = label;
        this.zeroTransition = zeroTransition;
        this.oneTransition = oneTransition;
    }

    /* GETTER METHODS */

    public String getType() {
        return type;
    }

    public String getLabel() {
        return label;
    }

    public String getZeroTransition() {
        return zeroTransition;
    }

    public String getOneTransition() {
        return oneTransition;
    }

    /* END GETTER METHODS */
}
