//*******************************************
// Author: Elizabeth Hobbs
//*******************************************

package wordEncryption;

import java.util.Scanner;

public class Message 
{
	public String encrypt(Scanner fileScanner)
	{
		String word = "";
		String encryptedWord = "";
		int key = 5;
		
		// If the fileScanner DOES NOT have a next string, return nothing.
		if (!fileScanner.hasNext())
		{
			return "";
		}
		
		else
		{
			word = fileScanner.next() + " " + encrypt(fileScanner);
			
			for (int i = 0; i < word.length(); i++)
			{
				int charNum = word.charAt(i);
				
				if (Character.isUpperCase(charNum))
				{
					charNum += (key % 26);
					
					if (charNum > 'Z')
					{
						charNum = charNum - 26;
					}
				}
				
				else if (Character.isLowerCase(charNum))
				{
					charNum += (key % 26);
					
					if (charNum > 'z')
					{
						charNum = charNum - 26;
					}
				}
				
				encryptedWord += (char) charNum;
			}
			
			return encryptedWord;
		}
	}
	
	public String decrypt(Scanner fileScanner2)
	{
		{
			String word = "";
			String decryptedWord = "";
			int key = 5;
			
			// If the fileScanner DOES NOT have a next string, return nothing.
			if (!fileScanner2.hasNext())
			{
				return "";
			}
			
			else
			{
				word = fileScanner2.next() + " " + decrypt(fileScanner2);
				
				for (int i = 0; i < word.length(); i++)
				{
					int charNum = word.charAt(i);
					
					if (Character.isUpperCase(charNum))
					{
						charNum = charNum - (key % 26);
						
						if (charNum < 'A')
						{
							charNum = charNum + 26;
						}
					}
					
					else if (Character.isLowerCase(charNum))
					{
						charNum = charNum - (key % 26);
						
						if (charNum < 'a')
						{
							charNum = charNum + 26;
						}
					}
					
					decryptedWord += (char) charNum;
				}
				
				return decryptedWord;
			}
		}
	}
}
