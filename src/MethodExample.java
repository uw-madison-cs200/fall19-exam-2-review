import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.InputMismatchException;


/**
 * Concepts:
 * exception handling for methods
 * multiple handlers
 *
 * @author Jack Truskowski
 */
public class MethodExample {


    public static void main(String[] args){

	try{
	    Scanner userIn = new Scanner(System.in);
	    System.out.print("Enter a filename: ");
	    printFileContents(userIn.nextLine());

	    System.out.print("\nEnter your favorite number: ");
	    System.out.println(userIn.nextInt());

	}catch(InputMismatchException e){
	    System.out.println("Not an integer.");

	}catch(FileNotFoundException e){
	    System.out.println("File not found!");
	}

    }

    public static void printFileContents(String filename) throws FileNotFoundException {

	File myFile = new File(filename);
	Scanner scnr = new Scanner(myFile);
	while(scnr.hasNextLine()){
	    System.out.println(scnr.nextLine());
	}
    }

}
