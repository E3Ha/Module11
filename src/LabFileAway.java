import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import java.util.Scanner;

public class LabFileAway {
    public static void main(String[] args) {
        //Always have this
        Scanner scan;
        File selectedFile;
        JFileChooser chooser = new JFileChooser();
        int count = 0;
        int numOfWords = 0;
        int characters = 0;
        int lines = 0;
        String fileName = "";

        //Always have a try
        try{
            //Always create the beginning directory
            File workingDirectory = new File(System.getProperty("user.dir"));
            chooser.setCurrentDirectory(workingDirectory);
            //Always choose a file to examine
            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                //Set file to examine
                selectedFile = chooser.getSelectedFile();
                fileName = chooser.getName(selectedFile);
                //Dump contents into scanner
                scan = new Scanner(selectedFile);
                boolean found = false;
                String[] words = new String[0];
                //Examine line by line, so long as another line exists
                while (scan.hasNextLine()) {
                    String line = scan.nextLine(); //Entire line = string
                    //Calculate amount of characters and lines
                    characters = characters + line.length();
                    lines++;
                    //Split file into individual words && count number of words
                    words = line.split(" ");
                    numOfWords = numOfWords + words.length;
                    //Check for how many times specified word occurs
                    for (int i = 0; i < words.length; i++) {
                        if (words[i].equalsIgnoreCase("talawanda")) {
                            found = true;
                            count++;
                        }

                    }
                }
                //If found/not found, output to user
                if (found == true) {
                    JOptionPane.showMessageDialog(null, "File: " + fileName + "\nTalawanda found " + count + " time(s)\nLines: " + lines + "\nWords: " + numOfWords + "\nCharacters: " + characters);
                } else {
                    JOptionPane.showMessageDialog(null, "Word not Found");

                }
            }
        }
        //Always have a catch for file not found
        catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, "File not Found");
            System.exit(0);
        }

    }
}
