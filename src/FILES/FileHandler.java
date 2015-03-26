package FILES;

/**
 * Created by alvinjay on 3/26/15.
 */
public class FileHandler {
    private DFAFileHandler dfaFileHandler;
    private InputFileHandler inputFileHandler;
    private OutputFileHandler outputFileHandler;

    public FileHandler() {
        this.dfaFileHandler = new DFAFileHandler();
        this.inputFileHandler = new InputFileHandler();
        this.outputFileHandler = new OutputFileHandler();
    }

    /**
     * Opens file chooser and decides whether file was input or DFA file
     */
    public void openFile() {
        //TODO open file chooser
        //TODO check what type of file
            //if input file then call loadInputFile()
            //else call loadDFAFile
    }
    /**
     * Loads an input file
     */
    public void loadInputFile() {
        //TODO
    }

    /**
     * Loads a DFA file
     */
    public void loadDFAFile() {
        //TODO
    }

    /**
     * Writes output values to output file
     */
    public void writeOutputFile() {
        //TODO
    }


}
