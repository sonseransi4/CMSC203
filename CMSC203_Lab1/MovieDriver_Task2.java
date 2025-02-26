import java.util.Scanner;

public class MovieDriver_Task2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String continuing;

        do {
        	//Creates a movie object
            Movie newMovie = new Movie();

            //User inputs the name of the movie
            System.out.println("Enter the name of a movie:");
            String title = scanner.nextLine();
            newMovie.setTitle(title);

            //User inputs the rating of the movie
            System.out.println("Enter the rating of the movie:");
            String rating = scanner.nextLine();
            newMovie.setRating(rating);

            //User inputs tikets csold
            System.out.println("Enter the number of tickets sold for this movie:");
            int tickets = scanner.nextInt();
            newMovie.setSoldTickets(tickets);

            // Consume the leftover newline character
            scanner.nextLine();

            //toString Method Printing
            System.out.println(newMovie.toString());

            //Continue input
            System.out.println("Do you want to enter another? (y or n)");
            continuing = scanner.nextLine();

        } while (continuing.equals("y"));


        System.out.println("Goodbye");
        scanner.close();
    }
}
