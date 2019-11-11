import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Concepts:
 * checked vs. unchecked exceptions
 * exception handling constructs (try, catch, finally)
 *
 * @author Jack Truskowski
 */
public class SimpleExample {

    public static void main(String[] args){

	//checked (compile-time) exception
	try{
	    File myFile = new File("not_a_real_file.txt");
	    Scanner scnr = new Scanner(myFile);
	    while(scnr.hasNextLine()){
		System.out.println(scnr.nextLine());
	    }

	}catch(FileNotFoundException e){
	    System.out.println("Not a real file!");
	}finally{
	    System.out.println("Finally block executed");
	}

	//unchecked (runtime) exception
	int a = 10;
	int b = 0;
	if(b != 0) System.out.println(a/b);
	else System.out.println("Denominator is 0!");


    }

}
