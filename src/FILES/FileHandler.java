package FILES;

import INTERFACE.GUI;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by alvinjay on 3/26/15.
 */
public class FileHandler {
    private DFAFileHandler dfaFileHandler;
    private InputFileHandler inputFileHandler;
    private OutputFileHandler outputFileHandler;

    private GUI gui;

    public FileHandler(GUI gui) {
        this.dfaFileHandler = new DFAFileHandler();
        this.inputFileHandler = new InputFileHandler();
        this.outputFileHandler = new OutputFileHandler();

        this.gui = gui;
    }

    /**
     * Opens file chooser and decides whether file was input or DFA file
     */
    public void openFile() {
        // Open file chooser
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(fileChooser.FILES_ONLY);

        IMPORTS.FileFilter filter = new IMPORTS.FileFilter();
        filter.addExtension("inp");
        filter.addExtension("dfa");
        filter.setDescription("Input and DFA Files");
        fileChooser.setFileFilter(filter);

        int res = fileChooser.showOpenDialog(gui);
        if(res == fileChooser.APPROVE_OPTION)
        {
            File f = fileChooser.getSelectedFile();
            String filename = f.getName();
            
            // Check what type of file
            if  (filename.matches("[a-zA-Z0-9]*.inp")) {
                if(!loadInputFile(f))
                    System.out.println("input file invalid content");
            }
            else {
                if(!loadDFAFile(f))
                    System.out.println("dfa file invalid content");
            }
        }

    }

    /**
     * Loads an input file
     */
    private boolean loadInputFile(File inputFile) {
        try
        {
            FileReader fr = new FileReader(inputFile);
            BufferedReader br = new BufferedReader(fr);

            //read input string from file
            ArrayList<String> inputLines = new ArrayList<String>();
            String line;

            while( (line=br.readLine()) != null)
            {
                if (!InputFileHandler.isInputLineValid(line))
                    return false;

                inputLines.add(line);
            }


            inputFileHandler.setInputValues(inputLines);

            br.close();
            fr.close();
            return true;
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog
                    (
                            gui, e.getMessage(), "File Open Error",
                            JOptionPane.ERROR_MESSAGE
                    );
            return false;
        }
    }

    /**
     * Loads a DFA file
     */
    private boolean loadDFAFile(File dfaFile) {
        try
        {
            FileReader fr = new FileReader(dfaFile);
            BufferedReader br = new BufferedReader(fr);

            //read input string from file
            ArrayList<String> dfaLines = new ArrayList<String>();
            String line;

            while( (line=br.readLine()) != null)
            {
                if (!DFAFileHandler.isDFALineValid(line))
                    return false;

                dfaLines.add(line);
            }


            dfaFileHandler.setTransitionTableValues(dfaLines);

            br.close();
            fr.close();
            return true;
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog
                    (
                            gui, e.getMessage(), "File Open Error",
                            JOptionPane.ERROR_MESSAGE
                    );
            return false;
        }
    }

    /**
     * Writes output values to output file
     */
    public void writeOutputFile() {
        //TODO
    }


}
