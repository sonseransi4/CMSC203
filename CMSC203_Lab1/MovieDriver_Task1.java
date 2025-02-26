import java.util.Scanner;

public class MovieDriver_Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        //toString Method Printing
        System.out.println(newMovie.toString());

        System.out.println("Goodbye");
        scanner.close();
    }
}
