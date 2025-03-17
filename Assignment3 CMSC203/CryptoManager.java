/* 
 * Class: CMSC203  
 * Instructor: Khandan Monshi
 * Description: CryptoManager has methods that encrypt and decrypt caesar and bellaso ciphers.
 * Due: 3/17/25
 * Platform/compiler: Eclipse for Java
 * I pledge that I have completed the programming  assignment independently.  
*  I have not copied the code from a student or any source.  
*  I have not given my code to any student. 
*  Print your Name here: Sonse Ransibrahmanakul 
*/ 

public class CryptoManager{
	private static final char LOWER = ' ';
	private static final char UPPER = '_';
	private static final int RANGE = UPPER - LOWER + 1;
	
	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_RANGE and UPPER_RANGE characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean isStringInBounds (String plainText)
	{
		for (int x =0;x<plainText.length();x++)
		{
			if (plainText.charAt(x)<LOWER||plainText.charAt(x)>UPPER)
			{
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String caesarEncryption(String plainText, int key){
		
		String nothing = "";
		
		char character;
		if (isStringInBounds(plainText)==false)
		{
			return "The selected string is not in bounds, Try again.";
		}
		for (int x =0;x<plainText.length();x++)
		{
			character = (char)(plainText.charAt(x)+key);
			while(character>UPPER)
			{
				character -=RANGE;
			}
			
			nothing +=character;
		}
		
		return nothing;
	}
	
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String bellasoEncryption(String plainText, String bellasoStr){
		String out = "";
		String empty = "";
		char emptyCharacter;
		String key = "";
		if (isStringInBounds(plainText) ==false)
		{
			return "The selected string is not in bounds, Try again.";
		}
		
		
		while(empty.length()<plainText.length())
		{
			empty +=bellasoStr;
		}
		key = empty.substring(0, plainText.length());
		for (int x =0;x<plainText.length();x++)
		{
			
			emptyCharacter = (char) (plainText.charAt(x)+key.charAt(x));
			while(emptyCharacter>UPPER)
			{
				emptyCharacter -=RANGE;
			}
			out +=emptyCharacter;
		}
		return out;
		
		
	}
	
	
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String caesarDecryption(String encryptedText, int key){
		String empty = "";
		char emptyCharacter;
		if (isStringInBounds(encryptedText) ==false)
			
		{
			return "The selected string is not in bounds, Try again.";
		}
		for (int i =0;i<encryptedText.length();i++){
			emptyCharacter = (char) (encryptedText.charAt(i) -key);
			while(emptyCharacter>UPPER)
			{
				emptyCharacter -=RANGE;
			}
			while(emptyCharacter<LOWER){
				emptyCharacter +=RANGE;
			}
			empty +=emptyCharacter;
		}
		return empty;
		
	}
	
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String bellasoDecryption(String encryptedText, String bellasoStr){
		String out = "";
		String empty = "";
		
		
		char emptyCharacter;
		
		
		String key = "";
		if (isStringInBounds(encryptedText) ==false)
		{
			return "The selected string is not in bounds, Try again.";
		}
		
		while(empty.length() < encryptedText.length())
		{
			empty +=bellasoStr;
		}
		key = empty.substring(0, encryptedText.length());
		
		for (int x =0;x<encryptedText.length();x++)
		{
			emptyCharacter = (char) (encryptedText.charAt(x) -key.charAt(x));
			while(emptyCharacter >UPPER)
			{
				emptyCharacter -=RANGE;
			}
			while(emptyCharacter <LOWER){
				emptyCharacter +=RANGE;
			}
			out +=emptyCharacter;
		}
		return out;
	}
}