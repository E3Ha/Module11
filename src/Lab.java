import java.util.*;
import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import java.util.Scanner;

public class Lab {
    public static void main(String[] args) {
        //Always have this
        Scanner scan;
        File selectedFile;
        JFileChooser chooser = new JFileChooser();
        int count = 0;

        //Always have a try
        try{
            //Always create the beginning directory
            File workingDirectory = new File(System.getProperty("user.dir"));
            chooser.setCurrentDirectory(workingDirectory);
            //Always choose a file to examine
            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
                //Set file to examine
                selectedFile = chooser.getSelectedFile();
                //Dump contents into scanner
                scan = new Scanner(selectedFile);
                //Examine line by line, so long as another line exists
                boolean found = false;
                while(scan.hasNextLine()){
                    String line = scan.nextLine(); //Entire line = string
                    String words[] = line.split(" ");

                    for(int i = 0; i < words.length; i ++) {
                        if (words[i].equalsIgnoreCase("talawanda")) {
                            found = true;
                            count ++;
                        }
                    }
                }
                //If found/not found, output to user
                if (found == true){
                    JOptionPane.showMessageDialog(null, "Word Found " + count + " time(s)");
                }
                else{
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
