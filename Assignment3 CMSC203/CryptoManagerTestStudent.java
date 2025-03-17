/* 
 * Class: CMSC203  
 * Instructor: Khandan Monshi
 * Description: CryptoManagerTestStudent tests out CryptoManager.java to see if expected outputs are correct.
 * Due: 3/17/25
 * Platform/compiler: Eclipse for Java
 * I pledge that I have completed the programming  assignment independently.  
*  I have not copied the code from a student or any source.  
*  I have not given my code to any student. 
*  Print your Name here: Sonse Ransibrahmanakul 
*/ 

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class CryptoManagerTestStudent 
{
	
	
	CryptoManager cryptoManager;

	@BeforeEach
	public void setUp() throws Exception {
	}

	@AfterEach
	public void tearDown() throws Exception {
	}


	@Test
	public void testEncryptCaesar() {
		assertEquals("The selected string is not in bounds, Try again.", CryptoManager.caesarEncryption("bye", 3));
		assertEquals("W#ZUR*", CryptoManager.caesarEncryption("FRIDAY", 17));
		assertEquals("UNYY\\$RR[", CryptoManager.caesarEncryption("HALLOWEEN", 13));
		assertEquals("Q^^Z", CryptoManager.caesarEncryption("BOOK", 15));
		assertEquals("F>FFF", CryptoManager.caesarEncryption("WOWWW", 175));
		assertEquals("\\((%", CryptoManager.caesarEncryption("COOL", 25));
	}

	@Test
	public void testDecryptCaesar() {
		assertEquals("NOOO", CryptoManager.caesarDecryption("\\]]]", 14));
		assertEquals("COMEONNN", CryptoManager.caesarDecryption("R^\\T^]]]", 15));
		assertEquals("LAB", CryptoManager.caesarDecryption("%Z[", 89));
		assertEquals("DOGGY", CryptoManager.caesarDecryption(" +##5", 28));
	}

	@Test
	public void testEncryptBellaso() {
		assertEquals("UT [!K^OXT", CryptoManager.bellasoEncryption("MOTORCYCLE", "HELLO"));
		assertEquals("DIZ", CryptoManager.bellasoEncryption("CAR", "AHHH"));

	}

	@Test
	public void testDecryptBellaso() {
		assertEquals("PICTURE", CryptoManager.bellasoDecryption("SJPY'SH", "CAMERA"));
		assertEquals("PHOTOGRAPHY", CryptoManager.bellasoDecryption("SW^ RV!MSW(", "COOL"));
	}
	
	@Test
	public void testStringInBounds() {
		assertTrue(CryptoManager.isStringInBounds("MOZART"));
		assertTrue(CryptoManager.isStringInBounds("BEETHOVEN 1827"));
		assertFalse(CryptoManager.isStringInBounds("nineteenEightyFour"));
		assertFalse(CryptoManager.isStringInBounds("{BACH"));
		assertFalse(CryptoManager.isStringInBounds("\"SYMPHONY_NO_9\" {IS OUT OF BOUNDS"));
	}

}
