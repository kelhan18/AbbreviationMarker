//Keller Han
//Write a demo class that will create an object of the class AbreviationMarker and then run it. The class will process text from an 
//input file, and then write text to an output file

import java.io.IOException;

public class AbbreviationMarkerDemo {

	/*-------------------------------------------------------------
	|  Method: [Main]
	|
	|  Purpose:  [To create a demo where we test the AbreviationMarker() class and have the new output written to a user prompted outfile name.]
	|
	|  Pre-condition:  [The AbreviationMarker() class must contain all the methods necessary to read an input file, process text, and then write to an output file.]
	|
	|  Post-condition: [The output file will have the abreviations enclosed with < > brackets.
	|
	|  Parameters: [N/A]
	|
	|  Returns:  [N/A]
	*------------------------------------------------------------------*/
	
	public static void main(String[] args) throws IOException {
		AbreviationMarker demo = new AbreviationMarker();
		demo.processText();
	}

}
