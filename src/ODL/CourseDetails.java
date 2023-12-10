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
		System.out.println("4.cpp Course");
		System.out.println("----------------------------");
		System.out.println("Select a Course to see Title Curriculum");
		
		int select=sc.nextInt();
		
		CourseDescription CD=new CourseDescription();
		
		switch(select) {
		  case 1:
			    System.out.println("----------------------------");
			    System.out.println("Understand the Basics");
			    System.out.println("Learn Python DataTypes, Variables & Operators");
			    System.out.println("Learn Conditional & Flow Control Statements in Python");
			    System.out.println("Understand String, List & Dictionary Manipulations in Python");
			    System.out.println("Get Familiar With Python Functions & Modules");
			    System.out.println("Go through Python File Operations");
			    System.out.println("Understand the Object-Oriented Approach in Python");
			    System.out.println("----------------------------");
			    CD.CourseDescription1();
			    break;
		    
		  case 2:
		        System.out.println("----------------------------");
			    System.out.println("Introduction to JavaScript,Variables and data types,Operators,Expressions and statements");
			    System.out.println("Functions, Conditional statements, Loops.");
			    System.out.println("Arrays, Objects, Strings,DOM manipulation, Events, Forms.");
			    System.out.println("AJAX, JSON, Promises,Error handling, Debugging, Testing.");
			    System.out.println("Asynchronous programming, Callbacks, Promises.");
			    System.out.println("Performance optimization, Caching, Lazy loading.");
			    System.out.println("Accessibility, Internationalization, Localization.");
			    System.out.println("----------------------------");
			    CD.CourseDescription2();
			    break;
		    
		  case 3:
		        System.out.println("-----------------------------");
			    System.out.println("Start with the Fundamentals");
			    System.out.println("Learn DataTypes, Variables & Conditional Statements");
			    System.out.println("Understand Arrays & String Manipulation in JAVA");
			    System.out.println("Get Familiar with Classes, Objects & Methods");
			    System.out.println("Gear Up to the OOPs concepts");
			    System.out.println("Learn about Interfaces & Packages in JAVA");
			    System.out.println("Go Through Exception Handling, I/O Streams & Multithreading Concepts");
			    System.out.println("-----------------------------");
			    CD.CourseDescription3();
			    System.out.println("Enter 1 to Change Language");
			    System.out.println("Enter 2 for Main Menu");
			    break;
		    
		  case 4:
		       System.out.println("------------------------------");
			   System.out.println("Introduction to C++ Programming ");
			   System.out.println("Learn DataTypes, Variables & Operators");
			   System.out.println("Learn Conditional & Control Statements");
			   System.out.println("Understand Arrays, Strings & Pointers in C++ ");
			   System.out.println("Go Through Functions & OOPs Concepts in C++");
			   System.out.println("Learn I/O Streams, Dynamic Memory, & STL in C++ ");
			   System.out.println("Understand Exception Handling, Signal Handling & Multithreading in C++ ");
			   System.out.println("------------------------------"); 
			 
			   CD.CourseDescription4();
			    break;
		    
		    }
		
	}

}
