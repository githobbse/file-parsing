//*******************************************
// Author: Elizabeth Hobbs
//*******************************************

package wordFrequency;

import java.util.Scanner;

public class WordFrequency 
{
	// Recursive method which reads in the file
	public String words(Scanner fileScanner)
	{
		String word = "";
		
		// If the fileScanner DOES NOT have a next string, return nothing.
		if (!fileScanner.hasNext())
		{
			return "";
		}
		
		else
		{
			word = fileScanner.next() + "\n" + words(fileScanner);
			return word;
		}
	}
}
