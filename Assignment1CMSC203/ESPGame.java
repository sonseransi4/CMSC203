/* 
* Class: CMSC203  
* Instructor: Khandan Monshi
* Description: (Give a brief description for each Class) 
* Due: 2/11/25
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment  
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student. 
* Print your Name here: Sonse Ransibrahmanakul
*/ 

import java.io.*;
import java.util.*;

public class ESPGame {
    public static void main(String[] args) 
    {
    
    
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        boolean playAgain = true;
    
        while (playAgain) {
            System.out.println("CMSC203 Assignment1: Test your ESP skills!");
            System.out.println("Welcome to ESP - extrasensory perception!");
            System.out.println("Would you please choose one of the 4 options from the menu:");
            System.out.println("\n1- read and display on the screen first 16 names of colors from a file colors.txt, so the player can select one of them names of colors.");
            System.out.println("2- read and display on the screen first 10 names of colors from a file colors.txt, so the player can select one of them names of colors.");
            System.out.println("3- read and display on the screen first 5 names of colors from a file colors.txt, so the player can select one of them names of colors.");
            System.out.println("4- Exit form a program");
            System.out.print("\nEnter the option: ");
            
            int option = input.nextInt();
            input.nextLine();
            
            if (option == 4) 
            {
                System.out.println("\nExit form a program");
                break;
            }
            
        int colorCount;
if (option == 1) 
{
    colorCount = 16;
}
else if (option == 2) 
{
    colorCount = 10;
} else
{
    colorCount = 5;
}
            String[] cols = new String[colorCount];
            try
            {
                File fil = new File("colors.txt");
                Scanner fileReader = new Scanner(fil);
                int temp = 0;
                while (fileReader.hasNextLine() && temp < cols.length) {
                    cols[temp] = fileReader.nextLine();
                    temp++;
                }
                fileReader.close();
            } 
            catch (FileNotFoundException e) 
            {
                System.out.println("The file was not found");
                return;
            }
            
            System.out.println("\nThere are sixteen colors from a file:");
            for (int x = 0; x < cols.length; x++) 
            {
                System.out.println((x + 1) + " " + cols[x]);
            }
            
            int correctg = 0;
            for (int iteration = 1; iteration <= 3; iteration++) 
            {
                System.out.println("\nRound " + iteration);
                int randocolind = rand.nextInt(colorCount);
                String colfile = cols[randocolind];
                System.out.println("I am thinking of a color.");
                System.out.println("Is it one of list of colors above?");  
                System.out.print("Enter your guess: ");
                String inputg = input.nextLine().trim();
                
                System.out.println("\nI was thinking of " + colfile + ".");
                if (inputg.equalsIgnoreCase(colfile)) 
                {
                    correctg++;
                }
            }
            
            System.out.println("\nGame Over");
            System.out.println("You guessed " + correctg + " out of 3 colors correctly.");
            //User info
            System.out.print("\nEnter your name: ");
            String name = input.nextLine();
            System.out.print("Describe yourself: ");
            String descr = input.nextLine();
            System.out.print("Enter Due Date: ");
            String due = input.nextLine();
            //try and catch for exception
            try 
            {
                FileWriter writer = new FileWriter("EspGameResults.txt", true);
                BufferedWriter buffer = new BufferedWriter(writer);
                PrintWriter out = new PrintWriter(buffer);
                out.println("Game Over");
                out.println("You guessed " + correctg + " out of 3 colors correctly.");
                out.println("Due Date: " + due);
                out.println("Username: " + name);
                out.println("User Description: " + descr);
                out.println();
                out.close();
            }
            catch (IOException e) 
            {
                System.out.println("could not write to the file");
            }
            //prints repeat message
            System.out.println("\nWould you like to continue a Game? Type Yes/No");
            String response = input.nextLine();
            if (response.equals("Yes") || response.equals("yes")) {
    playAgain = true;
} else {
    playAgain = false;
}
        }
        input.close();
    }
}
