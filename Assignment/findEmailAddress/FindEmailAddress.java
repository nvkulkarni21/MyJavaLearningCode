/*        Find Email Addresses.
        Write a program where the user can input a filename (which is a text file)
        Read the text file specified by the user and all email the addresses in it
        and print those email addresses on the screen.

        Make reasonable assumptions about what constitutes an email address.

        Handle the most common errors, e.g. user specifies a non-existent file,
        or a file you cannot read (e.g. it's locked or otherwise inaccessible to you),
        and any other error conditions that you think are relevant.

        Java File Handling,

        Regular Expressions,

        Exceptions
*/

package assignment.findEmailAddress;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FindEmailAddress {

    public static void main(String[] args) {

        FindEmai();
    }
    public static void FindEmai(){

        Scanner inputScanner = null;
        Scanner searchScanner = null;
        inputScanner = new Scanner(System.in);

        System.out.println("Enter the file name you want to search email : ");
        String inputFileName = inputScanner.nextLine();

    //    /Users/nirajkulkarni/dev/JLC/src/assignment/findEmailAddress/emailaddresses
        System.out.println("Searching for " + inputFileName);

        try {
            //searchScanner = new Scanner(new FileReader(inputFileName));
            searchScanner = new Scanner(new FileReader("/Users/nirajkulkarni/dev/JLC/src/assignment/findEmailAddress/emailaddresses"));
            //searchScanner.useDelimiter(",");
            System.out.println("Email addresses in the file are ...\n");
            while(searchScanner.hasNextLine()){

                String emailAddress = searchScanner.nextLine();
                //searchScanner.skip(searchScanner.delimiter());

                System.out.println(emailAddress);
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        catch (NoSuchElementException ex){
            System.out.println(ex.getMessage());
        }
        finally {
            if (searchScanner!=null)
                searchScanner.close();
        }
    }
}
