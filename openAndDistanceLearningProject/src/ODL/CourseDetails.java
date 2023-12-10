package ODL;

import java.util.Scanner;

public class CourseDetails {
	Scanner sc=new Scanner(System.in);

	public void CourseDetails1() throws Exception{
		// TODO Auto-generated method stub
		System.out.println("Select from Available Couses");
		System.out.println("----------------------------");
		System.out.println("1.Python Programming Course");
		System.out.println("2.JavaScript Course");
		System.out.println("3.Java Programming Course");
		System.out.println("4.HTML,CSS,Bootstrap Course");
		System.out.println("----------------------------");
		System.out.println("Select a Course to see Title Curriculum");
		
		int select=sc.nextInt();
		
		CourseDescription CD=new CourseDescription();
		
		switch(select) {
		  case 1:
			    System.out.println("----------------------------");
			    System.out.println("Input and Output in Python");
			    System.out.println("Python Object Oriented");
			    System.out.println("Python Regular Expressions");
			    System.out.println("Using Databases in Python");
			    System.out.println("Data Science Using Python");
			    System.out.println("----------------------------");
			    
			    CD.CourseDescription1();
			    break;
		    
		  case 2:
		        System.out.println("----------------------------");
			    System.out.println("Boolean logic");
			    System.out.println("Basic operators");
			    System.out.println("If/else statements");
			    System.out.println("Loop logic and iteration");
			    System.out.println("Functions as arguments");
			    System.out.println("-----------------------------");
			    CD.CourseDescription2();
			    break;
		    
		  case 3:
		        System.out.println("-----------------------------");
			    System.out.println("Basic Language Elements");
			    System.out.println("Object Oriented Programming");
			    System.out.println("Exception Handling");
			    System.out.println("Event Handling");
			    System.out.println("JDBC Connectivity");
			    System.out.println("-----------------------------");
			    CD.CourseDescription3();
			    System.out.println("Enter 1 to Change Language");
			    System.out.println("Enter 2 for Main Menu");
			    break;
		    
		  case 4:
		       System.out.println("------------------------------");
			   System.out.println("Basic Structure of WebPage");
			   System.out.println("HTML Embedding Videos");
			   System.out.println("CSS Color Names and Codes");
			   System.out.println("CSS Relative Positioning");
			   System.out.println("Embedding Bootstrap");
			   System.out.println("------------------------------");
			   CD.CourseDescription4();
			    break;
		    
		    }
		
	}

}
