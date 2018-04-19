//*******************************************
// Author: Elizabeth Hobbs
//*******************************************

package wordEncryption;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File file = new File("./src/creationStory.txt");
		Scanner fileScanner = new Scanner(file);

		Message message = new Message();
		System.out.println("Encrypted message: " + message.encrypt(fileScanner) + "\n");
		
		File encryptedFile = new File("./src/encryptedCreationStory.txt");
		Scanner fileScanner2 = new Scanner(encryptedFile);
		
		System.out.println("Decrypted message: " + message.decrypt(fileScanner2));
		
		fileScanner.close();
		fileScanner2.close();
	}
}
