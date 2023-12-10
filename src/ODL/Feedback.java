package ODL;

import java.util.Scanner;

public class Feedback {
    Scanner scanner = new Scanner(System.in);

    void feedback() throws Exception {
        System.out.println("Thank you for using our Website..!");
        System.out.println("Please provide your feedback:");

        
        int rating;
        do {
            System.out.print("Rating (1 to 5): ");
            rating = scanner.nextInt();

            if (rating < 1 || rating > 5) {
                System.out.println("Invalid rating. Please enter a rating between 1 and 5.");
            }

        } while (rating < 1 || rating > 5);

        scanner.nextLine(); 

        System.out.print("Comments: ");
        String comments = scanner.nextLine();

        
        System.out.println("Feedback received. Thank you!");
    
        System.out.println("Enter 1 for Main Menu");
     	System.out.println("Enter Any Key to Exit");



        int choice=scanner.nextInt();
        if(choice==1) {
        	Registration reg=new Registration();
	    	reg.home();
            }
       else {
           System.out.println("Thank you....!");
           
           }
        }}
