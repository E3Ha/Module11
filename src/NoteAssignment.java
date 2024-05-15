import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import java.util.Scanner;
import java.util.Random;

public class NoteAssignment {
    public static void main(String[] args) {

        Scanner in;
        File selectedFile;
        JFileChooser chooser = new JFileChooser();
        Scanner scan = new Scanner(System.in);


        int rangedInt = SafeInput.jOptionRangedInt("Int 1-10: ", 1, 10);

        JOptionPane.showMessageDialog(null, "Your Input: " + rangedInt);










    }
}
