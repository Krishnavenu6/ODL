package ODL;

import java.util.Scanner;

public class CourseDescription {
	Scanner sc=new Scanner(System.in);


	public void CourseDescription1() throws Exception {
				
//			System.out.println("Enter 1 for Python Description");
			
			System.out.println("Invented by Guido van Rossum in 1991.");
			System.out.println("High-level: Easy to learn, reads like plain English.");
			System.out.println("General-purpose: Used for web development, data science, machine learning, and more!");
			System.out.println("Free and Open-Source: Accessible to everyone, with plenty of support available.");
			System.out.println("Interpreted: Highly flexible, code changes are instantly reflected.");
			
			
			System.out.println("Enter 1 to Change Language");
		    System.out.println("Enter 2 for Main Menu");
		     int choice=sc.nextInt();
		     switch(choice) {
		     case 1:
		    	 CourseDetails cd=new CourseDetails();
		    	 cd.CourseDetails1();
		     case 2:
		    	 Registration r=new Registration();
		    	 r.home();
		     }
	}
	    
	 
	public void CourseDescription2() throws Exception {	  
//		    System.out.println("Enter 2 for JavaScript Description");
		    
		    System.out.println("Invented by Brendan Eich in 1995.");
		    System.out.println("Client-side scripting language: Adds interactivity and dynamic behavior to web pages.");
		    System.out.println("Interpreted: Code is executed line by line by a browser interpreter.");
		    System.out.println("Single-threaded: Only one task can be executed at a time.");
		    System.out.println("Widely used: Essential for modern web development, used by almost all websites.");
		    
		    System.out.println("Enter 1 to Change Language");
		    System.out.println("Enter 2 for Main Menu");
		     int choice=sc.nextInt();
		     switch(choice) {
		     case 1:
		    	 CourseDetails cd=new CourseDetails();
		    	 cd.CourseDetails1();
		     case 2:
		    	 Registration r=new Registration();
		    	 r.home();
		     }
	}
    public void CourseDescription3() throws Exception {	    
	
		  
//		    System.out.println("Enter 3 for java Description");
		    
		    System.out.println("Invented by James Gosling in 1995.");
		    System.out.println("Object-oriented: Focuses on building objects and their interactions.");
		    System.out.println("Platform-independent: \"Write once, run anywhere\" across different platforms.");
		    System.out.println("Robust and secure: Widely used for enterprise applications due to its stability.");
		    System.out.println("Large community and resources: Abundant support available for learning and development.");
		    
		    System.out.println("Enter 1 to Change Language");
		    System.out.println("Enter 2 for Main Menu");
		     int choice=sc.nextInt();
		     switch(choice) {
		     case 1:
		    	 CourseDetails cd=new CourseDetails();
		    	 cd.CourseDetails1();
		     case 2:
		    	 Registration r=new Registration();
		    	 r.home();
		     }
    }		    
    public void CourseDescription4() throws Exception {	  
//		      System.out.println("Enter 4 for cpp Description");
		      
			  System.out.println("C++ Invented by Bjarne Stroustrup in 1979.");
			  System.out.println("General-purpose programming language: Used for various applications like game development, system programming, and embedded systems.");
			  System.out.println("High performance: Offers better performance than interpreted languages like Python.");
			  System.out.println("Object-oriented: Supports concepts like classes, objects, and inheritance.");
			  System.out.println("Large and active community: Abundant resources and support available for learning and development.");
			  
			  System.out.println("Enter 1 to Change Language");
			    System.out.println("Enter 2 for Main Menu");
			     int choice=sc.nextInt();
			     switch(choice) {
			     case 1:
			    	 CourseDetails cd=new CourseDetails();
			    	 cd.CourseDetails1();
			     case 2:
			    	 Registration r=new Registration();
			    	 r.home();
			     }
		  
		
	}

}
