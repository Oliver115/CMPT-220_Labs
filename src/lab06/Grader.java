package lab06;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Grader {
    private File fileO;
    private ArrayList<Integer> grades = new ArrayList<Integer>();

    /** Constructors */
    Grader() {
    }

    Grader(File file) throws FileNotFoundException {
        if (file.exists()) {
            System.out.println(file + " -> File exists");
            fileO = file;
        }
        else {
            throw new FileNotFoundException(String.valueOf(file));
        }
    }

    Grader(String path) throws FileNotFoundException {
        File localFile = new File(path);
        fileO = localFile;
        if (localFile.exists()) {
            System.out.println(path + " -> File exists");
        }
        else {
            throw new FileNotFoundException(String.valueOf(localFile));
        }
    }

    /** Different File setters and getters */
    public File getFile() {
        return fileO;
    }

    public void setFile(File file) throws FileNotFoundException {
        if (file.exists()) {
            System.out.println(file + " -> File exists");
            fileO = file;
        }
        else {
            throw new FileNotFoundException(String.valueOf(file));
        }
    }

    public void setFile(String path) throws FileNotFoundException {
        File localFile = new File(path);
        if (localFile.exists()) {
            System.out.println(path + " -> File exists");
            fileO = localFile;
        }
        else {
            throw new FileNotFoundException(String.valueOf(localFile));
        }
    }

    /** Grade getters and setters */
    private void setGrades() throws FileNotFoundException {

        try {
            Scanner input = new Scanner(fileO);

            while (input.hasNextInt()) {
                int number = input.nextInt();
                grades.add(number);
            }
        }
        catch (FileNotFoundException ex) {
            throw ex;
        }
    }

    public void getGrades() throws FileNotFoundException {
        setGrades();
        System.out.println("Current Grades are: " + grades);
    }

    /** Calculate Average method */
    public void calculateAverage() throws FileNotFoundException {
        setGrades();
        int sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        System.out.println("Grade Average: " + sum / (double)(grades.size()) + "\n");
    }
}

class TestGrader {
    public static void main(String[] args) throws FileNotFoundException {

         try {
             java.io.File localFile =
                     new java.io.File("c:/Users/olive/IdeaProjects/CMPT220_Labs/src/lab06/grades2.txt");
             Grader fileOne = new Grader(localFile);
             fileOne.getGrades();
             fileOne.calculateAverage();

             Grader fileTwo = new Grader ("c:/Users/olive/IdeaProjects/CMPT220_Labs/src/lab06/grades1.txt");
             fileTwo.getGrades();
             fileTwo.calculateAverage();
       }
        catch (FileNotFoundException ex) {
            System.out.println("File does not exist!");
        }
    }
}
