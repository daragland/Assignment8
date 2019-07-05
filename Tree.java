//*********************************************************************************************************************************//
//Tree.java 				Author: Debra Ragland 				CPSC50100													   //
//																																   //
//Driver class using methods in StringTree.java and Node.java 																			   //
//*********************************************************************************************************************************//

import java.util.Scanner;
import java.io.*;

public class Tree {

	public static void main(String[] args) throws IOException // throw default exception if no file can be found
	{
		Scanner fileScan = new Scanner(new File("FruitsAndVegetables.txt")); //import file to be ordered using StringTree.java
		StringTree text  = new StringTree(); //Read in the file
		String read;
		
		while(fileScan.hasNext()) 
		{
			read = fileScan.nextLine();
			text.addString(read);
			
		} // while the lines of the file are being read use the addString method to start ordering the text in the file.
		
		text.printTree(); // print the tree in alphabetical order
		fileScan.close(); //close the scanner
	}

}
