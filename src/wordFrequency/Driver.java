//*******************************************
// Author: Elizabeth Hobbs
//*******************************************

package wordFrequency;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		File file = new File("./src/creationStory.txt");
		Scanner fileScanner = new Scanner(file);
		WordFrequency words = new WordFrequency();
		
		int index = 0;
		ArrayList<String> wordList = new ArrayList<String>();
		ArrayList<Integer> countList = new ArrayList<Integer>();
		
		String wholeFile = words.words(fileScanner);
		wholeFile = wholeFile.replace(",", "");
		wholeFile = wholeFile.replace(".", "");
		wholeFile = wholeFile.replace("\"", "");
		wholeFile = wholeFile.replace("?", "");
		wholeFile = wholeFile.toLowerCase();
		
		Scanner wholeScan = new Scanner(wholeFile);
		
		while (wholeScan.hasNext())
		{
			String word = wholeScan.nextLine();
			
			if (wordList.contains(word))
			{
				index = wordList.indexOf(word);
				countList.add(index, countList.get(index) + 1);
			}
				
			else
			{
				wordList.add(word);
				index = wordList.indexOf(word);
				countList.add(index, 1);
			}
			
			for (int x = 0; x < wordList.size(); x++)
			{
				System.out.println("Word: " + wordList.get(x) + "\t\tCount: " + countList.get(x) + "\n");
			}		
		}

		wholeScan.close();
	}
}
