//Keller Han
//AbreviationMarker class contains all the methods necessary to allow user to input input and output file names, read the file, and write 
//a new output to the output file

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AbbreviationMarker {
	
	/*-------------------------------------------------------------
	|  Method: [processText()]
	|
	|  Purpose:  [This method, if called, will ask the user the for input file name. A scanner will then read the input file and add "<" ">" brackets to surround
				an abbreviation. The new output will then be written into an output file with a user input-name. 
	|
	|  Pre-condition:  [N/A]
	|
	|  Post-condition: [A new output file will store the newly written text.]
	|
	|  Parameters:
	|      fileName - the name of input file
			frontBracket - "<" symbol
			endBracket - ">" symbol
			outputName - the name of output file
	|
	|  Returns:  [N/A]
	*------------------------------------------------------------------*/
	public void processText() throws IOException
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What is the file to read from?: ");
		String fileName = input.nextLine();
		Scanner textFile = new Scanner(new File(fileName)); 
		String frontBracket = "<";
		String endBracket = ">";
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the name of the output file? Please name it as a .txt: ");
		String outputName = keyboard.nextLine();
		File outputFile = new File(outputName);
		PrintWriter writer = new PrintWriter(new FileWriter(outputFile));
		while (textFile.hasNextLine())
		{
			String line = textFile.nextLine();
			String newString = frontBracket + line + endBracket;
			writer.println(newString);
			System.out.println(newString);
		}
		writer.close();
		System.out.println("The new output is displayed above. ");
		System.out.println("It has also been written into the file " + outputName);
	}
}
