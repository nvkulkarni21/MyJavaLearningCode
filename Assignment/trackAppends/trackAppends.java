/*
* 120
Track Appends.
Write a program where the user can specify a filename (which is a text file).

The program should display the last 10 lines of the file and track the file so that
if additional text is appended to the file, it prints the additional text.

This should continue until the user terminates the program (e.g. by pressing Ctrl+C).

Ensure that you handle relevant errors.

Java File Handling,

Exceptions
*/
package assignment.trackAppends;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class trackAppends {

    public static void main(String[] args) {

        read();
    }

    public static void read(){

        Scanner scanner = null;
        Scanner inputScanner = null;
        int countLine = 0;

        // /Users/nirajkulkarni/dev/JLC/src/assignment/trackAppends/trackAppendFile
        try{
            inputScanner = new Scanner(System.in);
            System.out.println("Enter the file name which needs to be searched : ");
            String inputText = inputScanner.nextLine();

            scanner = new Scanner(new BufferedReader(new FileReader(inputText)));

            while (scanner.hasNextLine()){

                String text = scanner.nextLine();
                System.out.println(text);
            }

        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            scanner.close();
        }

    }

}
